package com.tistory.pentode.vo;

public class LittleReView {
	private Integer num;
	private Integer mynum;
	private String name;
	private String writedate;
	private String writetime;
	private String content;
	private Integer totalrecod;
	
	public Integer getNum() {
		return num;
	}
	public void setNum(Integer num) {
		this.num = num;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getMynum() {
		return mynum;
	}
	public void setMynum(Integer mynum) {
		this.mynum = mynum;
	}

	
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getWritedate() {
		return writedate;
	}
	public void setWritedate(String writedate) {
		this.writedate = writedate;
	}
	public Integer getTotalrecod() {
		return totalrecod;
	}
	public void setTotalrecod(Integer totalrecod) {
		this.totalrecod = totalrecod;
	}
	public String getWritetime() {
		return writetime;
	}
	public void setWritetime(String writetime) {
		this.writetime = writetime;
	}
	
	@Override
	public String toString() {
		return "\"replelist\": [{\"num\":\"" + num + "\", \"name\":\"" + name + "\", \"mynum\":\"" + mynum + "\", \"content\":\""
					+ content.toString() + "\", \"writedate\":\"" + writedate + "\"}]";
	}
	
}
