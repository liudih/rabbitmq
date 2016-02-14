package com.rabbit.dto.order;

import java.io.Serializable;
import java.util.Date;

public class OrderStatusHistory implements Serializable {
	private static final long serialVersionUID = 8767861093957278233L;
	private Integer iorderid;
	private Integer istatus;
	private Date dcreatedate;

	public Integer getIorderid() {
		return iorderid;
	}

	public void setIorderid(Integer iorderid) {
		this.iorderid = iorderid;
	}

	public Integer getIstatus() {
		return istatus;
	}

	public void setIstatus(Integer istatus) {
		this.istatus = istatus;
	}

	public Date getDcreatedate() {
		return dcreatedate;
	}

	public void setDcreatedate(Date dcreatedate) {
		this.dcreatedate = dcreatedate;
	}

}
