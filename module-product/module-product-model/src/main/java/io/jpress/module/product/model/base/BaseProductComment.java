package io.jpress.module.product.model.base;

import com.jfinal.plugin.activerecord.IBean;
import io.jboot.db.model.JbootModel;

/**
 * Generated by JPress, do not modify this file.
 */
@SuppressWarnings("serial")
public abstract class BaseProductComment<M extends BaseProductComment<M>> extends JbootModel<M> implements IBean {

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

	public void setProductId(java.lang.Long productId) {
		set("product_id", productId);
	}
	
	public java.lang.Long getProductId() {
		return getLong("product_id");
	}

	public void setUserId(java.lang.Long userId) {
		set("user_id", userId);
	}
	
	public java.lang.Long getUserId() {
		return getLong("user_id");
	}

	public void setAuthor(java.lang.String author) {
		set("author", author);
	}
	
	public java.lang.String getAuthor() {
		return getStr("author");
	}

	public void setContent(java.lang.String content) {
		set("content", content);
	}
	
	public java.lang.String getContent() {
		return getStr("content");
	}

	public void setReplyCount(java.lang.Long replyCount) {
		set("reply_count", replyCount);
	}
	
	public java.lang.Long getReplyCount() {
		return getLong("reply_count");
	}

	public void setOrderNumber(java.lang.Integer orderNumber) {
		set("order_number", orderNumber);
	}
	
	public java.lang.Integer getOrderNumber() {
		return getInt("order_number");
	}

	public void setVoteUp(java.lang.Long voteUp) {
		set("vote_up", voteUp);
	}
	
	public java.lang.Long getVoteUp() {
		return getLong("vote_up");
	}

	public void setVoteDown(java.lang.Long voteDown) {
		set("vote_down", voteDown);
	}
	
	public java.lang.Long getVoteDown() {
		return getLong("vote_down");
	}

	public void setStatus(java.lang.Integer status) {
		set("status", status);
	}
	
	public java.lang.Integer getStatus() {
		return getInt("status");
	}

	public void setCreated(java.util.Date created) {
		set("created", created);
	}
	
	public java.util.Date getCreated() {
		return get("created");
	}

}
