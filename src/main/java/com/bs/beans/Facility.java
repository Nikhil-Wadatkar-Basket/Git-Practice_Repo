package com.bs.beans;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table
public class Facility {
	@Id
	private Integer facilityId;
	private Integer userId;
	private String onlinePayemntFlag;
	private String TransactionFlag;
	private String deviceFlag;
	private String userFlag;

	public Facility() {
		// TODO Auto-generated constructor stub
	}

	public Facility(Integer facilityId, Integer userId, String onlinePayemntFlag, String transactionFlag,
			String deviceFlag, String userFlag) {
		super();
		this.facilityId = facilityId;
		this.userId = userId;
		this.onlinePayemntFlag = onlinePayemntFlag;
		TransactionFlag = transactionFlag;
		this.deviceFlag = deviceFlag;
		this.userFlag = userFlag;
	}

	public Integer getFacilityId() {
		return facilityId;
	}

	public void setFacilityId(Integer facilityId) {
		this.facilityId = facilityId;
	}

	public Integer getUserId() {
		return userId;
	}

	public void setUserId(Integer userId) {
		this.userId = userId;
	}

	public String getOnlinePayemntFlag() {
		return onlinePayemntFlag;
	}

	public void setOnlinePayemntFlag(String onlinePayemntFlag) {
		this.onlinePayemntFlag = onlinePayemntFlag;
	}

	public String getTransactionFlag() {
		return TransactionFlag;
	}

	public void setTransactionFlag(String transactionFlag) {
		TransactionFlag = transactionFlag;
	}

	public String getDeviceFlag() {
		return deviceFlag;
	}

	public void setDeviceFlag(String deviceFlag) {
		this.deviceFlag = deviceFlag;
	}

	public String getUserFlag() {
		return userFlag;
	}

	public void setUserFlag(String userFlag) {
		this.userFlag = userFlag;
	}

	@Override
	public String toString() {
		return "Facility [facilityId=" + facilityId + ", userId=" + userId + ", onlinePayemntFlag=" + onlinePayemntFlag
				+ ", TransactionFlag=" + TransactionFlag + ", deviceFlag=" + deviceFlag + ", userFlag=" + userFlag
				+ "]";
	}

}
