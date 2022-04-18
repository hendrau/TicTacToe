package com.test.tictactoe.service;

import com.test.tictactoe.model.Match;

public interface TicTacToeProcessService {
	public Match submitDataStartGame(String player1Id, String player1Name, String player2Id, String player2Name, String player2Type, String boardType);
	public boolean confirmTurn(String playerId, int xpos, int ypos, Match currentMatch);
	public void endMatch(String matchId);
}
