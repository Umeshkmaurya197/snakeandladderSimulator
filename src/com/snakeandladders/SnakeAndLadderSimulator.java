package com.snakeandladders;

public class SnakeAndLadderSimulator {

	public static void main(String[] args) {
		System.out.println(" ----Welcome to Snake & Ladder Simulator---- ");

		int start = 0;
		int visited = start;
		int rolldice = 0;
		int opening = 0;

		while (opening != 1) {
			opening = (int) (1 + Math.floor(Math.random() * 10) % 6);         //to get chance to entry in game 
			visited = opening;
			System.out.println("\n     Opening chance : " + opening);
		}
			    
				rolldice = (int) (1 + Math.floor(Math.random() * 10) % 6);   // to get the dice roll number
				visited = visited + rolldice;                                // to get the new position

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

				System.out.println("\n     Current position is  : " + visited + " ,     Rolldice value : " + rolldice);
				
		

	}
}
