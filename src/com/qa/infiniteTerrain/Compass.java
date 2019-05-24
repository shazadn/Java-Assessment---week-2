package com.qa.infiniteTerrain;

abstract class Compass {
	private int xValue;
	private int yValue;
	
	
	public Compass(int xValue, int yValue) {
		this.xValue = xValue;
		this.yValue = yValue;
	}
	
	public int getXVal() {
		return xValue;
	}
	
	public void setXVal(int xValue) {
		this.xValue = xValue;
	}
	
	public int getYVal() {
		return yValue;
	}
	
	public void setYVal(int yValue) {
		this.yValue = yValue;
	}
	
	
	public int north() {
		return this.yValue++;
	}
	
	public int east() {
		return this.xValue++;
	}
	
	public int south() {
		return this.yValue--;
	}
	
	public int west() {
		return this.xValue--;
		
	}
}
