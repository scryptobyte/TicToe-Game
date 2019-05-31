package com.shubham.rastogi.service;

import com.shubham.rastogi.dto.TicTacToe;

public class GameServiceImpl implements GameService {
	public void putSign(TicTacToe t,int x,int y) {
		if(x<0 || x>2 || y<0 || y>2) {
			System.out.println("Please Insert a valid board position");
			return;
		}
		if(t.getBoard()[x][y]!=0) {
			System.out.println("Possition is filled already");
			return;
		}
		t.getBoard()[x][y] = t.getPlayer();	
		t.setPlayer(-t.getPlayer());
	}
	public boolean isWin(TicTacToe t,int player)
	{
		return ((t.getBoard()[0][0] + t.getBoard()[0][1] + t.getBoard()[0][2] == player*3) ||
				(t.getBoard()[1][0] + t.getBoard()[1][1] + t.getBoard()[1][2] == player*3) ||
				(t.getBoard()[2][0] + t.getBoard()[2][1] + t.getBoard()[2][2] == player*3) ||
				(t.getBoard()[0][0] + t.getBoard()[1][0] + t.getBoard()[2][0] == player*3) ||
				(t.getBoard()[0][1] + t.getBoard()[1][1] + t.getBoard()[2][1] == player*3) ||
				(t.getBoard()[0][2] + t.getBoard()[1][2] + t.getBoard()[2][2] == player*3) ||
				(t.getBoard()[0][0] + t.getBoard()[1][1] + t.getBoard()[2][2] == player*3) ||
				(t.getBoard()[2][0] + t.getBoard()[1][1] + t.getBoard()[0][2] == player*3));
	}
	
	public void displayWinner(TicTacToe t)
	{	
		if(isWin(t,1))
		{
			System.out.println("\n X wins...!!");
			t.setEmpty(false);
		}
		else if(isWin(t,-1))
		{
			System.out.println("\n O wins...!!");
			t.setEmpty(false);
		}
		else
		{
			if(!t.isEmpty())
			{
				System.out.println("its a tie");
			}
			
		}
	}
}
