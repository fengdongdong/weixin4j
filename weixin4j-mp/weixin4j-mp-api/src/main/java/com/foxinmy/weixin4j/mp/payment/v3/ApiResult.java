package com.foxinmy.weixin4j.mp.payment.v3;

import org.apache.commons.lang3.StringUtils;

import com.alibaba.fastjson.annotation.JSONField;
import com.foxinmy.weixin4j.http.XmlResult;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 调用V3.x接口返回的公用字段
 * 
 * @className ApiResult
 * @author jy
 * @date 2014年10月21日
 * @since JDK 1.7
 * @see
 */
public class ApiResult extends XmlResult {

	private static final long serialVersionUID = -8430005768959715444L;

	/**
	 * 微信分配的公众账号 ID商户号 非空
	 */
	@XStreamAlias("appid")
	@JSONField(name = "appid")
	private String appId;
	/**
	 * 微信支付分配的商户号 非空
	 */
	@XStreamAlias("mch_id")
	@JSONField(name = "mch_id")
	private String mchId;
	/**
	 * 代理模式下分配的商户号 可能为空
	 */
	@XStreamAlias("sub_mch_id")
	@JSONField(name = "sub_mch_id")
	private String subMchId;
	/**
	 * 随机字符串 非空
	 */
	@XStreamAlias("nonce_str")
	@JSONField(name = "nonce_str")
	private String nonceStr;
	/**
	 * 签名 <font color="red">调用者无需关心</font>
	 */
	private String sign;
	/**
	 * 微信支付分配的终端设备号 可能为空
	 */
	@XStreamAlias("device_info")
	@JSONField(name = "device_info")
	private String deviceInfo;
	/**
	 * 是否需要继续调用接口 Y- 需要,N-不需要
	 */
	private String recall;

	public ApiResult() {

	}

	public ApiResult(String returnCode, String returnMsg) {
		super(returnCode, returnMsg);
	}

	public String getAppId() {
		return appId;
	}

	public void setAppId(String appId) {
		this.appId = appId;
	}

	public String getMchId() {
		return mchId;
	}

	public void setMchId(String mchId) {
		this.mchId = mchId;
	}

	public String getSubMchId() {
		return StringUtils.isNotBlank(subMchId) ? subMchId : null;
	}

	public void setSubMchId(String subMchId) {
		this.subMchId = subMchId;
	}

	public String getNonceStr() {
		return nonceStr;
	}

	public void setNonceStr(String nonceStr) {
		this.nonceStr = nonceStr;
	}

	public String getSign() {
		return sign;
	}

	public void setSign(String sign) {
		this.sign = sign;
	}

	public String getDeviceInfo() {
		return deviceInfo;
	}

	public void setDeviceInfo(String deviceInfo) {
		this.deviceInfo = deviceInfo;
	}

	public String getRecall() {
		return recall;
	}

	public String setRecall() {
		return recall;
	}

	@JSONField(deserialize = false, serialize = false)
	public boolean getFormatRecall() {
		return recall != null && recall.equalsIgnoreCase("y");
	}

	@Override
	public String toString() {
		return "appId=" + appId + ", mchId=" + mchId + ", subMchId=" + subMchId
				+ ", nonceStr=" + nonceStr + ", sign=" + sign + ", deviceInfo="
				+ deviceInfo + ", recall=" + getFormatRecall() + ", "
				+ super.toString();
	}
}
