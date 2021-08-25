package com.bridgelabz.gamblingsimulation;

public class GamblingSimulator {
	public static final int INITIAL_STAKE_EVERYDAY = 100;
	public static final int BET_EVERYGAME = 1;
	public static final int WIN=1;
	public static final int Lose=0;
	public static final int minStake = (INITIAL_STAKE_EVERYDAY)-(50*INITIAL_STAKE_EVERYDAY/100);
	public static final int maxStake = (INITIAL_STAKE_EVERYDAY)+(50*INITIAL_STAKE_EVERYDAY/100);
	
	public static int play(int stake) {
		int option=(int)Math.floor(Math.random()*10)%2;
		if(option==WIN)
			stake++;
		else
			stake--;
		return stake;
	}
	public static int calculativeGambler() {
		int balance=INITIAL_STAKE_EVERYDAY;
		while(balance>minStake && balance<maxStake) {
			balance=play(balance);
		}
		return balance;
		
	}
    public static void main(String[] args) {
	
    	int finalStake=calculativeGambler();
    	System.out.println(finalStake);
}
}