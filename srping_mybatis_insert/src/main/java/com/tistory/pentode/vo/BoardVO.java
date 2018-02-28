package com.tistory.pentode.vo;


public class BoardVO {
	private Integer num;
	private String name;
	private String title;
	private String content;
	private int mynum;
	private Integer readCount;
	private String writeDate;
	private Integer page;
	private Integer pageShowRecod;
	private Integer reple;
	
	
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
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public Integer getReadCount() {
		return readCount;
	}
	public void setReadCount(Integer readCount) {
		this.readCount = readCount;
	}
	public String getWriteDate() {
		return writeDate;
	}
	public void setWriteDate(String writeDate) {
		this.writeDate = writeDate;
	}
	
	public Integer getPage() {
		return page;
	}
	public void setPage(Integer page) {
		this.page = page;
	}
	
	@Override
	public String toString() {
		return "BoardVO [num=" + num + ", name=" + name + ", title=" + title + ", content=" + content.toString() + ", readCount="
				+ readCount + ", writeDate=" + writeDate + "]";
	}
	public Integer getPageShowRecod() {
		return pageShowRecod;
	}
	public void setPageShowRecod(Integer pageShowRecod) {
		this.pageShowRecod = pageShowRecod;
	}
	public int getMynum() {
		return mynum;
	}
	public void setMynum(int mynum) {
		this.mynum = mynum;
	}
	public Integer getReple() {
		return reple;
	}
	public void setReple(Integer reple) {
		this.reple = reple;
	}


}
