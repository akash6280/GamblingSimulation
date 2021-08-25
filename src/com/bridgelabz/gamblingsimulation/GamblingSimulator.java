package com.bridgelabz.gamblingsimulation;

public class GamblingSimulator {
	public static final int INITIAL_STAKE_EVERYDAY = 100;
	public static final int BET_EVERYGAME = 1;
	public static final int WIN=1;
	public static final int lose=0;
	
	public static int play(int stake) {
		int option=(int)Math.floor(Math.random()*10)%2;
		if(option==WIN)
			stake++;
		else
			stake--;
		return stake;
	}
    public static void main(String[] args) {
	
    	int finalStake=play(INITIAL_STAKE_EVERYDAY);
    	System.out.println(finalStake);
}
}