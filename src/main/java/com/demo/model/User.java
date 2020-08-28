package com.demo.model;

import org.bson.codecs.pojo.annotations.BsonId;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Scope(scopeName = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
@Document(collection = "users")
public class User {
	
	String userName;
	@BsonId
	String _id;
	String phone;
	
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getUserId() {
		return _id;
	}
	public void setUserId(String userId) {
		this._id = userId;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	@Override
	public String toString() {
		return "User [userName=" + userName + ", userId=" + _id + ", phone=" + phone + "]";
	}
}
