package com.test.tictactoe.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.test.tictactoe.service.TicTacToeProcessService;

@Controller

public class TicTacToeController {
	@Autowired
	TicTacToeProcessService ticTacToeProcessService;
	
	@RequestMapping(value="/home", method = RequestMethod.GET)
	public String homePage(ModelMap model) {
		return "home";
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String sendStartRequest(ModelMap model, @RequestParam String player1Id, @RequestParam String player1Name, 
			@RequestParam String player2Id, @RequestParam String player2Name, @RequestParam String player2Type, 
			@RequestParam String boardType) {
		ticTacToeProcessService.submitDataStartGame(player1Id, player1Name, player2Id, player2Name, player2Type, boardType);
		return "gamepage";
	}
	
	@RequestMapping(value = "/home", method = RequestMethod.POST)
	public String confirmTurn(ModelMap model, @RequestParam String playerId, @RequestParam int xpos, @RequestParam int ypos){
		return "gamepage";
	}
}
