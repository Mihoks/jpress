package io.jpress.module.product.model.base;

import com.jfinal.plugin.activerecord.IBean;
import io.jboot.db.model.JbootModel;

/**
 * Generated by JPress, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseProductCategory<M extends BaseProductCategory<M>> extends JbootModel<M> implements IBean {

    private static final long serialVersionUID = 1L;

	public void setId(java.lang.Long id) {
		set("id", id);
	}
	
	public java.lang.Long getId() {
		return getLong("id");
	}

	public void setPid(java.lang.Long pid) {
		set("pid", pid);
	}
	
	public java.lang.Long getPid() {
		return getLong("pid");
	}

	public void setUserId(java.lang.Long userId) {
		set("user_id", userId);
	}
	
	public java.lang.Long getUserId() {
		return getLong("user_id");
	}

	public void setSlug(java.lang.String slug) {
		set("slug", slug);
	}
	
	public java.lang.String getSlug() {
		return getStr("slug");
	}

	public void setTitle(java.lang.String title) {
		set("title", title);
	}
	
	public java.lang.String getTitle() {
		return getStr("title");
	}

	public void setContent(java.lang.String content) {
		set("content", content);
	}
	
	public java.lang.String getContent() {
		return getStr("content");
	}

	public void setSummary(java.lang.String summary) {
		set("summary", summary);
	}
	
	public java.lang.String getSummary() {
		return getStr("summary");
	}

	public void setStyle(java.lang.String style) {
		set("style", style);
	}
	
	public java.lang.String getStyle() {
		return getStr("style");
	}

	public void setType(java.lang.String type) {
		set("type", type);
	}
	
	public java.lang.String getType() {
		return getStr("type");
	}

	public void setIcon(java.lang.String icon) {
		set("icon", icon);
	}
	
	public java.lang.String getIcon() {
		return getStr("icon");
	}

	public void setCount(java.lang.Long count) {
		set("count", count);
	}
	
	public java.lang.Long getCount() {
		return getLong("count");
	}

	public void setOrderNumber(java.lang.Integer orderNumber) {
		set("order_number", orderNumber);
	}
	
	public java.lang.Integer getOrderNumber() {
		return getInt("order_number");
	}

	public void setFlag(java.lang.String flag) {
		set("flag", flag);
	}
	
	public java.lang.String getFlag() {
		return getStr("flag");
	}

	public void setMetaKeywords(java.lang.String metaKeywords) {
		set("meta_keywords", metaKeywords);
	}
	
	public java.lang.String getMetaKeywords() {
		return getStr("meta_keywords");
	}

	public void setMetaDescription(java.lang.String metaDescription) {
		set("meta_description", metaDescription);
	}
	
	public java.lang.String getMetaDescription() {
		return getStr("meta_description");
	}

	public void setCreated(java.util.Date created) {
		set("created", created);
	}
	
	public java.util.Date getCreated() {
		return get("created");
	}

	public void setModified(java.util.Date modified) {
		set("modified", modified);
	}
	
	public java.util.Date getModified() {
		return get("modified");
	}

}
