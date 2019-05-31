package com.shubham.rastogi;
import java.util.Scanner;

import com.shubham.rastogi.dto.TicTacToe;
import com.shubham.rastogi.service.GameService;
import com.shubham.rastogi.service.GameServiceImpl;


public class Main  {

	public static void main(String[] args) {
		TicTacToe t = new TicTacToe();
		Scanner s = new Scanner(System.in);
		int x=0,y=0;
		GameService service =new GameServiceImpl();
		do
		{
			System.out.println(t.getPlayer()==1?"Player X turn":"Player O turn");
			System.out.println("Enter x and y places");
			x=s.nextInt();
			y=s.nextInt();
			service.putSign(t,x,y);
			System.out.println(t.toString());
			service.displayWinner(t);
			System.out.println("_____________________________");
		}while(t.isEmpty());
	}
}