package com.test.tictactoe.service;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.test.tictactoe.model.Board;
import com.test.tictactoe.model.Match;
import com.test.tictactoe.model.Player;
import com.test.tictactoe.model.Turn;
import com.test.tictactoe.utils.TicTacToeConstants;

@Service
public class TicTacToeProcessServiceImpl implements TicTacToeProcessService{

	@Override
	public Match submitDataStartGame(String player1Id, String player1Name, String player2Id, String player2Name,
			String player2Type, String boardType) {
		// TODO Auto-generated method stub
		Match newMatch = new Match();
		newMatch.setId(UUID.randomUUID().toString());
		Board board = new Board();
		board.setSize(Integer.parseInt(boardType));
		newMatch.setBoard(board);
		Player player1 = new Player();
		player1.setPlayerId(player1Id);
		player1.setPlayerName(player1Name);
		player1.setPlayerType(TicTacToeConstants.PLAYER_TYPE_HUMAN);
		newMatch.setPlayer1(player1);
		Player player2 = new Player();
		player2.setPlayerId(player2Id);
		player2.setPlayerName(player2Name);
		player2.setPlayerType(player2Type);
		newMatch.setPlayer2(player2);
		
		return newMatch;
	}

	@Override
	public boolean confirmTurn(String playerId, int xpos, int ypos, Match currentMatch) {
		// TODO Auto-generated method stub
		Board currentBoard = currentMatch.getBoard();
		int boardSize = currentBoard.getSize();
		Turn[] playerTurns = null;
		if(playerId.equals(TicTacToeConstants.PLAYER_1)) {
			playerTurns = currentMatch.getPlayer1Turns();
			Turn playerTurn = new Turn();
			playerTurn.setPlayerId(playerId);
			playerTurn.setXpos(xpos);
			playerTurn.setYpos(ypos);
			playerTurns[playerTurns.length] = playerTurn;
			currentMatch.setPlayer1Turns(playerTurns);
		}
		else {
			playerTurns = currentMatch.getPlayer2Turns();
			Turn playerTurn = new Turn();
			playerTurn.setPlayerId(playerId);
			playerTurn.setXpos(xpos);
			playerTurn.setYpos(ypos);
			playerTurns[playerTurns.length] = playerTurn;
			currentMatch.setPlayer2Turns(playerTurns);
		}
		int countx = 0;
		int county = 0;
		int countv = 0;
		
		for(int i=0; i<playerTurns.length; i++) {
			Turn turn = playerTurns[i];
			if(xpos == ypos) {
				if(turn.getXpos() == turn.getYpos()) {
					countv++;
				}
			}
			else {
				if(turn.getXpos() == xpos) {
					countx++;
				}
				if(turn.getYpos() == ypos) {
					county++;
				}
			}
		}
		if(countx >= boardSize || county >= boardSize || countv >= boardSize) {
			return true;
		}
		return false;
	}

	@Override
	public void endMatch(String matchId) {
		// TODO Auto-generated method stub
		
	}

}
