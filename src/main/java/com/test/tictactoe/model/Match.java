package com.test.tictactoe.model;

import java.util.Arrays;

public class Match {
	public String id;
	public Board board;
	public Player player1;
	public Player player2;
	public Player playerWon;
	public Turn[] player1Turns;
	public Turn[] player2Turns;	
	public boolean isFinished;
	
	public Match() {
		// TODO Auto-generated constructor stub
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public Board getBoard() {
		return board;
	}

	public void setBoard(Board board) {
		this.board = board;
	}

	public Player getPlayer1() {
		return player1;
	}

	public void setPlayer1(Player player1) {
		this.player1 = player1;
	}

	public Player getPlayer2() {
		return player2;
	}

	public void setPlayer2(Player player2) {
		this.player2 = player2;
	}

	public Player getPlayerWon() {
		return playerWon;
	}

	public void setPlayerWon(Player playerWon) {
		this.playerWon = playerWon;
	}

	public Turn[] getPlayer1Turns() {
		return player1Turns;
	}

	public void setPlayer1Turns(Turn[] player1Turns) {
		this.player1Turns = player1Turns;
	}

	public Turn[] getPlayer2Turns() {
		return player2Turns;
	}

	public void setPlayer2Turns(Turn[] player2Turns) {
		this.player2Turns = player2Turns;
	}

	public boolean isFinished() {
		return isFinished;
	}

	public void setFinished(boolean isFinished) {
		this.isFinished = isFinished;
	}

	@Override
	public String toString() {
		return "Match [board=" + board + ", player1=" + player1 + ", player2=" + player2 + ", playerWon=" + playerWon
				+ ", player1Turns=" + Arrays.toString(player1Turns) + ", player2Turns=" + Arrays.toString(player2Turns)
				+ "]";
	}
	
	public void setPlayer1Turn(Turn player1Turn) {
		int size = getPlayer1Turns().length;
		player1Turns[size] = player1Turn;
	}
	
	public void setPlayer2Turn(Turn player2Turn) {
		int size = getPlayer2Turns().length;
		player2Turns[size] = player2Turn;
	}
	
}
