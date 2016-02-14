package com.rabbit.dto.order;

import java.io.Serializable;

public class OrderStatus implements Serializable {
	private static final long serialVersionUID = -3819352940527660827L;
	private Integer iid;
	private String cname;
	private Integer iorder;

	public Integer getIid() {
		return iid;
	}

	public void setIid(Integer iid) {
		this.iid = iid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public Integer getIorder() {
		return iorder;
	}

	public void setIorder(Integer iorder) {
		this.iorder = iorder;
	}

}
