package com.snakeandladders;

public class SnakeAndLadderSimulator {

	public static void main(String[] args) {
		System.out.println(" ----Welcome to Snake & Ladder Simulator---- ");

		int start = 0;
		int visited = start;
		int rolldice = 0;
		int opening = 0;
		int end = 100;
		int count = 0;
		while (opening != 1) {
			opening = (int) (1 + Math.floor(Math.random() * 10) % 6); // to get chance to entry in game
			visited = opening;
			System.out.println("    Opening chance : " + opening);
		}
		if (opening == 1) {
			while (visited != end) {
				rolldice = (int) (1 + Math.floor(Math.random() * 10) % 6); // roll the the dice to get number
				visited = visited + rolldice;
				count++;
				if (visited < end) {

					// Ladders starts from here
					if (visited == 2)
						visited = 23;
					else if (visited == 6)
						visited = 28;
					else if (visited == 32)
						visited = 51;
					else if (visited == 41)
						visited = 61;
					else if (visited == 65)
						visited = 87;
					else if (visited == 89)
						visited = 95;
					else if (visited == 15)
						visited = 4;
					// snakes start from here
					else if (visited == 21)
						visited = 7;
					else if (visited == 56)
						visited = 13;
					else if (visited == 49)
						visited = 19;
					else if (visited == 63)
						visited = 44;
					else if (visited == 85)
						visited = 38;
					else if (visited == 31)
						visited = 12;
					else if (visited == 99)
						visited = 35;

				} else if (visited > end) {
					visited = visited - rolldice;
					System.out.println("  Skip Step");
				}
				System.out.println("  Current position is  : " + visited + " ,     Rolldice value : " + rolldice);
			}
			System.out.println("\n  Game Report : you have played " + count + " times to win this game .");
		} else {
			visited = start;
			System.out.println(" You have to roll the dice for entry in game ");
		}

	}
}
