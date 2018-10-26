package com.app.entity;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection="Emp")
public class Employee 
{
@Id
private int eid;
private String ename;
private String address;
private int esal;
private int empage;
@Override
public String toString() {
	return "Employee [eid=" + eid + ", ename=" + ename + ", address=" + address + ", esal=" + esal + ", empage="
			+ empage + "]";
}
public int getEid() {
	return eid;
}
public void setEid(int eid)
{
	this.eid = eid;
}
public String getEname() {
	return ename;
}
public void setEname(String ename) {
	this.ename = ename;
}
public int getEsal() {
	return esal;
}
public void setEsal(int esal) {
	this.esal = esal;
}
public String getAddress() {
	return address;
}
public void setAddress(String address) {
	this.address = address;
}
public int getEmpage() {
	return empage;
}
public void setEmpage(int empage) {
	this.empage = empage;
}

}
