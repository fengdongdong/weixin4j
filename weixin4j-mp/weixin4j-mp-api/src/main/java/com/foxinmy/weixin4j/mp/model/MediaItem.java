package com.foxinmy.weixin4j.mp.model;

import java.io.Serializable;
import java.util.Date;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;
import com.foxinmy.weixin4j.msg.model.MpArticle;

/**
 * 媒体素材信息
 * 
 * @className MediaItem
 * @author jy
 * @date 2015年3月22日
 * @since JDK 1.7
 * @see
 */
public class MediaItem implements Serializable {

	private static final long serialVersionUID = -2923028664954250134L;

	/**
	 * 媒体素材ID
	 */
	@JSONField(name = "media_id")
	private String mediaId;
	/**
	 * 媒体素材名称
	 */
	private String name;
	/**
	 * 媒体素材最后更新时间
	 */
	@JSONField(name = "update_time")
	private Date updateTime;
	/**
	 * 图文素材列表
	 */
	@JSONField(name = "news_item")
	private List<MpArticle> articles;

	public String getMediaId() {
		return mediaId;
	}

	public void setMediaId(String mediaId) {
		this.mediaId = mediaId;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Date getUpdateTime() {
		return updateTime;
	}

	public void setUpdateTime(Date updateTime) {
		this.updateTime = updateTime;
	}

	public List<MpArticle> getArticles() {
		return articles;
	}

	public void setArticles(List<MpArticle> articles) {
		this.articles = articles;
	}

	@Override
	public String toString() {
		return "MediaItem [mediaId=" + mediaId + ", name=" + name
				+ ", updateTime=" + updateTime + ", articles=" + articles + "]";
	}
}
