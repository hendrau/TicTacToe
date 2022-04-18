package com.test.tictactoe.model;

public class Turn extends Action{
	
	private String playerId;
	private boolean isWin;
	public Turn() {
		// TODO Auto-generated constructor stub
	}
	public String getPlayerId() {
		return playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public boolean getIsWin() {
		return isWin;
	}
	public void setIsWin(boolean isWin) {
		this.isWin = isWin;
	}
	@Override
	public String toString() {
		return "Turn [playerId=" + playerId + ", isWin=" + isWin + ", getXpos()=" + getXpos()
				+ ", getYpos()=" + getYpos() + "]";
	}
	
}
