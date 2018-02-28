package com.tistory.pentode.vo;


public class BoardPage {
	private int totalRecod;
	private int totalPage;
	private int pageShowRecod;
	
	public int getPageShowRecod() {
		return pageShowRecod;
	}
	public void setPageShowRecod(Integer pageShowRecod) {
		this.pageShowRecod = pageShowRecod;
	}
	
	public int getTotalRecod() {
		return totalRecod;
	}

	public void setTotalRecod(Integer totalRecod) {
		this.totalRecod = totalRecod;
	}
	
	public int getTotalPage(int totalRecod, int pageShowRecod) {
		
		if(totalRecod % 15 == 0) {
			setTotalPage(totalRecod / pageShowRecod);
		}else {
			setTotalPage((totalRecod / pageShowRecod) + 1);
		}
		
		return totalPage;
	}

	public void setTotalPage(int totalPage) {
		this.totalPage = totalPage;
	}
	
	@Override
	public String toString() {
		return "BoardPage [totalRecod =" + totalRecod + "]";
	}
}
