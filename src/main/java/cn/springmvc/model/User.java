package cn.springmvc.model;

import java.sql.Date;

/**
 * 用户表
 * @author fenghaifeng
 * 2014年2月11日
 */
public class User {

	private int id;
	private String code;
	private String name;
	private String phone;
	private Date createTime;
	private String createCode;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	
	public Date getCreateTime() {
		return createTime;
	}
	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	public String getCreateCode() {
		return createCode;
	}
	public void setCreateCode(String createCode) {
		this.createCode = createCode;
	}
	@Override
    public String toString() {
        return this.name+","+this.phone+","+this.createTime;
    }
}
