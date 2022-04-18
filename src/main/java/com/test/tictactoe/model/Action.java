package com.test.tictactoe.model;

public class Action {
	private int xpos;
	private int ypos;
	
	public Action() {
		// TODO Auto-generated constructor stub
	}
	public Action(int xpos, int ypos) {
		// TODO Auto-generated constructor stub
		setXpos(xpos);
		setYpos(ypos);
	}
	public int getXpos() {
		return xpos;
	}
	public void setXpos(int xpos) {
		this.xpos = xpos;
	}
	public int getYpos() {
		return ypos;
	}
	public void setYpos(int ypos) {
		this.ypos = ypos;
	}
	@Override
	public String toString() {
		return "Action [xpos=" + xpos + ", ypos=" + ypos + "]";
	}
	
	
}
