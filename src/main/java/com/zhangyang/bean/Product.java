package com.zhangyang.bean;

public class Product {
  private Integer pid;
  private String pname;
  private String guige;
  private String Type;
  private int price;
  private int count;
  private int num;
public Integer getPid() {
	return pid;
}
public void setPid(Integer pid) {
	this.pid = pid;
}
public String getPname() {
	return pname;
}
public void setPname(String pname) {
	this.pname = pname;
}
public String getGuige() {
	return guige;
}
public void setGuige(String guige) {
	this.guige = guige;
}
public String getType() {
	return Type;
}
public void setType(String type) {
	Type = type;
}
public int getPrice() {
	return price;
}
public void setPrice(int price) {
	this.price = price;
}
public int getCount() {
	return count;
}
public void setCount(int count) {
	this.count = count;
}
public int getNum() {
	return num;
}
public void setNum(int num) {
	this.num = num;
}
public Product(Integer pid, String pname, String guige, String type, int price, int count, int num) {
	super();
	this.pid = pid;
	this.pname = pname;
	this.guige = guige;
	Type = type;
	this.price = price;
	this.count = count;
	this.num = num;
}
public Product() {
	super();
	// TODO Auto-generated constructor stub
}
@Override
public String toString() {
	return "Product [pid=" + pid + ", pname=" + pname + ", guige=" + guige + ", Type=" + Type + ", price=" + price
			+ ", count=" + count + ", num=" + num + "]";
}
  
  
}
