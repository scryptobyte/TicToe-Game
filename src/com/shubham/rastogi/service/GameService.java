package com.shubham.rastogi.service;

import com.shubham.rastogi.dto.TicTacToe;

public interface GameService {

	void putSign(TicTacToe t, int x, int y);

	void displayWinner(TicTacToe t);

}
