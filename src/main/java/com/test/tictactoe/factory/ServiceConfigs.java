package com.test.tictactoe.factory;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.test.tictactoe.service.TicTacToeProcessService;
import com.test.tictactoe.service.TicTacToeProcessServiceImpl;

@Configuration
public class ServiceConfigs {

	@Bean
	public TicTacToeProcessService ticTacToeProcessService() {
		return new TicTacToeProcessServiceImpl();
	}
}
