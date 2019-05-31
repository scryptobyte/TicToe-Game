package com.shubham.rastogi.dto;

public class TicTacToe {
	private int player;
	private int[][] board;
	private boolean isEmpty;
	public int getPlayer() {
		return player;
	}
	public void setPlayer(int player) {
		this.player = player;
	}
	public int[][] getBoard() {
		return board;
	}
	public void setBoard(int[][] board) {
		this.board = board;
	}
	
	public boolean isEmpty() {
		return isEmpty;
	}
	public void setEmpty(boolean isEmpty) {
		this.isEmpty = isEmpty;
	}
	public TicTacToe() {
		this.player = 1;
		this.board = new int[3][3];
		this.isEmpty = false;
	}
	@Override
	public String toString()
	{
		StringBuilder s = new StringBuilder();
		isEmpty = false;
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				switch(board[i][j])
				{
				case 1: 
					s.append(" X ");
					break;
				case -1: 
					s.append(" O ");
					break;
				case 0: 
					s.append("   ");
					isEmpty=true;
					break;
				}
				if(j<2)
				{
					s.append("|");
				}
				
			}
			if(i<2)
			{
				s.append("\n-----------\n");
			}
		}
		return s.toString();
	}
}
