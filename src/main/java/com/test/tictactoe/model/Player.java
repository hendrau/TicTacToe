package com.test.tictactoe.model;

public class Player {
	private String playerId;
	private String playerName;
	private String playerType;
	public String getPlayerId() {
		return playerId;
	}
	public void setPlayerId(String playerId) {
		this.playerId = playerId;
	}
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getPlayerType() {
		return playerType;
	}
	public void setPlayerType(String playerType) {
		this.playerType = playerType;
	}
	@Override
	public String toString() {
		return "Player [playerId=" + playerId + ", playerName=" + playerName + ", playerType=" + playerType + "]";
	}
	
	
}
