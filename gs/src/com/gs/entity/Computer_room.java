package com.gs.entity;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import org.springframework.stereotype.Repository;

@Entity
@Table
public class Computer_room {
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO) 
	@Column(name="id")
	int id;       						//机房ID    	required
	@Column(name="name",nullable=false)
	String name;  					//机房名		required
	@Column(name="room_code",nullable=false)
	String room_code;  			 //机房编码	required
	@Column(name="location",nullable=false)
	String location; 				   //位置		required
	@Column(name="area",nullable=false)
	int area;							//面积			required
	int region_id;					//区域ID
	String Region_name;			//区域名称
	@Column(name="manager_id",nullable=false)
	int manager_id;					//管理者id		required
	@Column(name="manager_name",nullable=false)
	String manager_name;		//管理者姓名	required
	@Column(name="manager_mobile",nullable=false)
	String manager_mobile;	//联系手机		required
	String Created_id;				//创建者ID
	String Created_name;		//创建人名
	String Created_date;			//创建日期
	int modify_id;					//创建者ID
	String modify_name;			//创建人名
	Date modify_date;			//创建日期
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getRoom_code() {
		return room_code;
	}
	public void setRoom_code(String room_code) {
		this.room_code = room_code;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public int getArea() {
		return area;
	}
	public void setArea(int area) {
		this.area = area;
	}
	public int getRegion_id() {
		return region_id;
	}
	public void setRegion_id(int region_id) {
		this.region_id = region_id;
	}
	public String getRegion_name() {
		return Region_name;
	}
	public void setRegion_name(String region_name) {
		Region_name = region_name;
	}
	public int getManager_id() {
		return manager_id;
	}
	public void setManager_id(int manager_id) {
		this.manager_id = manager_id;
	}
	public String getManager_name() {
		return manager_name;
	}
	public void setManager_name(String manager_name) {
		this.manager_name = manager_name;
	}
	public String getManager_mobile() {
		return manager_mobile;
	}
	public void setManager_mobile(String manager_mobile) {
		this.manager_mobile = manager_mobile;
	}
	public String getCreated_id() {
		return Created_id;
	}
	public void setCreated_id(String created_id) {
		Created_id = created_id;
	}
	public String getCreated_name() {
		return Created_name;
	}
	public void setCreated_name(String created_name) {
		Created_name = created_name;
	}
	public String getCreated_date() {
		return Created_date;
	}
	public void setCreated_date(String created_date) {
		Created_date = created_date;
	}
	public int getModify_id() {
		return modify_id;
	}
	public void setModify_id(int modify_id) {
		this.modify_id = modify_id;
	}
	public String getModify_name() {
		return modify_name;
	}
	public void setModify_name(String modify_name) {
		this.modify_name = modify_name;
	}
	public Date getModify_date() {
		return modify_date;
	}
	public void setModify_date(Date modify_date) {
		this.modify_date = modify_date;
	}
	
	
	
	
}
