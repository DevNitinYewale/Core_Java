package com.chg.exmp;

import java.util.Scanner;

public class Problem1 {

	public static void main(String[] args) {
		// Scanner object
		Scanner in = new Scanner(System.in);
		//Players win count
		int p1WinCnt = 0, p2WinCnt = 0, gameCnt = 1;
		//Scores in game
		int scores = in.nextInt();

		//display winner of the round
		for (int i = 0; i < scores; i += 2) {
			int score1 = in.nextInt();
			int score2 = in.nextInt();
			if (score1 > score2) {
				p1WinCnt++;
				System.out.println("Player 1. Wins Game " + gameCnt);
			} else if (score1 < score2) {
				p2WinCnt++;
				System.out.println("Player 2 Wins Game " + gameCnt);
			} else {
				System.out.println("Game " + gameCnt + " is a draw");
			}
			gameCnt++;
		}
		//Display total details
		System.out.println("Total games won by each player:");
		System.out.println("Player 1: " + p1WinCnt);
		System.out.println("Player 2: " + p2WinCnt);
	}
}
