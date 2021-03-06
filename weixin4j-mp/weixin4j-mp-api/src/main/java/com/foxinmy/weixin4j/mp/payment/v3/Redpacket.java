package com.foxinmy.weixin4j.mp.payment.v3;

import java.io.Serializable;

import com.alibaba.fastjson.annotation.JSONField;
import com.foxinmy.weixin4j.util.DateUtil;
import com.thoughtworks.xstream.annotations.XStreamAlias;

/**
 * 红包
 * 
 * @className Redpacket
 * @author jy
 * @date 2015年3月28日
 * @since JDK 1.7
 * @see <a
 *      href="http://pay.weixin.qq.com/wiki/doc/api/cash_coupon.php?chapter=13_1">红包简介</a>
 */
public class Redpacket implements Serializable {

	private static final long serialVersionUID = -7021352305575714281L;
	/**
	 * 商户订单号（每个订单号必须唯一） 组成： mch_id+yyyymmdd+10位一天内不能重复的数字。
	 */
	@XStreamAlias("mch_billno")
	@JSONField(name = "mch_billno")
	private String outTradeNo;
	/**
	 * 提供方名称 必填
	 */
	@XStreamAlias("nick_name")
	@JSONField(name = "nick_name")
	private String nickName;
	/**
	 * 红包发送者名称 必填
	 */
	@XStreamAlias("send_name")
	@JSONField(name = "send_name")
	private String sendName;
	/**
	 * 接收红包的用户的openid
	 */
	@XStreamAlias("re_openid")
	@JSONField(name = "re_openid")
	private String openid;
	/**
	 * 付款金额，单位分
	 */
	@XStreamAlias("total_amount")
	@JSONField(name = "total_amount")
	private String totalAmount;
	/**
	 * 最小红包金额，单位分
	 */
	@XStreamAlias("min_value")
	@JSONField(name = "min_value")
	private String minValue;
	/**
	 * 最大红包金额，单位分（ 最小金额等于最大金额： min_value=max_value =total_amount）
	 */
	@XStreamAlias("max_value")
	@JSONField(name = "max_value")
	private String maxValue;
	/**
	 * 红包发放总人数
	 */
	@XStreamAlias("total_num")
	@JSONField(name = "total_num")
	private int totalNum;
	/**
	 * 红包祝福语
	 */
	private String wishing;
	/**
	 * ip地址
	 */
	@XStreamAlias("client_ip")
	@JSONField(name = "client_ip")
	private String clientIp;
	/**
	 * 活动名称
	 */
	@XStreamAlias("act_name")
	@JSONField(name = "act_name")
	private String actName;
	/**
	 * 备注
	 */
	private String remark;
	/**
	 * 商户logo的url 非必填
	 */
	@XStreamAlias("logo_imgurl")
	@JSONField(name = "logo_imgurl")
	private String logoUrl;
	/**
	 * 分享文案 非必填
	 */
	@XStreamAlias("share_content")
	@JSONField(name = "share_content")
	private String shareContent;
	/**
	 * 分享链接 非必填
	 */
	@XStreamAlias("share_url")
	@JSONField(name = "share_url")
	private String shareUrl;
	/**
	 * 分享的图片 非必填
	 */
	@XStreamAlias("share_imgurl")
	@JSONField(name = "share_imgurl")
	private String shareImageUrl;

	public String getOutTradeNo() {
		return outTradeNo;
	}

	public void setOutTradeNo(String outTradeNo) {
		this.outTradeNo = outTradeNo;
	}

	public String getNickName() {
		return nickName;
	}

	public void setNickName(String nickName) {
		this.nickName = nickName;
	}

	public String getSendName() {
		return sendName;
	}

	public void setSendName(String sendName) {
		this.sendName = sendName;
	}

	public String getOpenid() {
		return openid;
	}

	public void setOpenid(String openid) {
		this.openid = openid;
	}

	public String getTotalAmount() {
		return totalAmount;
	}

	/**
	 * <font color="red">单位为元,自动格式化为分</font>
	 * 
	 * @param totalAmount
	 *            付款金额 单位为元
	 */
	public void setTotalAmount(double totalAmount) {
		this.totalAmount = DateUtil.formaFee2Fen(totalAmount);
	}

	public String getMinValue() {
		return minValue;
	}

	/**
	 * <font color="red">单位为元,自动格式化为分</font>
	 * 
	 * @param minValue
	 *           最小红包 单位为元
	 */
	public void setMinValue(double minValue) {
		this.minValue = DateUtil.formaFee2Fen(minValue);
	}

	public String getMaxValue() {
		return maxValue;
	}

	/**
	 * <font color="red">单位为元,自动格式化为分</font>
	 * 
	 * @param minValue
	 *           最大红包 单位为元
	 */
	public void setMaxValue(double maxValue) {
		this.maxValue = DateUtil.formaFee2Fen(maxValue);
	}

	public int getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(int totalNum) {
		this.totalNum = totalNum;
	}

	public String getWishing() {
		return wishing;
	}

	public void setWishing(String wishing) {
		this.wishing = wishing;
	}

	public String getClientIp() {
		return clientIp;
	}

	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}

	public String getActName() {
		return actName;
	}

	public void setActName(String actName) {
		this.actName = actName;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getLogoUrl() {
		return logoUrl;
	}

	public void setLogoUrl(String logoUrl) {
		this.logoUrl = logoUrl;
	}

	public String getShareContent() {
		return shareContent;
	}

	public void setShareContent(String shareContent) {
		this.shareContent = shareContent;
	}

	public String getShareUrl() {
		return shareUrl;
	}

	public void setShareUrl(String shareUrl) {
		this.shareUrl = shareUrl;
	}

	public String getShareImageUrl() {
		return shareImageUrl;
	}

	public void setShareImageUrl(String shareImageUrl) {
		this.shareImageUrl = shareImageUrl;
	}

	@Override
	public String toString() {
		return "Redpacket [ nickName=" + nickName
				+ ", sendName=" + sendName + ", openid=" + openid
				+ ", totalAmount=" + totalAmount + ", minValue=" + minValue
				+ ", maxValue=" + maxValue + ", totalNum=" + totalNum
				+ ", wishing=" + wishing + ", clientIp=" + clientIp
				+ ", actName=" + actName + ", remark=" + remark + ", logoUrl="
				+ logoUrl + ", shareContent=" + shareContent + ", shareUrl="
				+ shareUrl + ", shareImageUrl=" + shareImageUrl + "]";
	}
}
