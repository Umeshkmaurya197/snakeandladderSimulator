package com.snakeandladders;

public class SnakeAndLadderSimulator {

	public static void main (String [] args)
	{
		System.out.println(" ----Welcome to Snake & Ladder Simulator---- ");
		
		int position[] = new int[100];
	    int start=0;
	    int visited=0;
	    int end=100;
	    position[start]=visited;
	    System.out.println("\n Your current position is  : "+position[start]);	
	   
	    while(start<=10)
	    	{
	    	int rolldice =(int) (1 + Math.floor(Math.random()*10) % 6) ;
	    	System.out.println("dice value: "+rolldice);
	    	start++;
	    	}
	}
}
