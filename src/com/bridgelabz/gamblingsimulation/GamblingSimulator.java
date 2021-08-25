package com.bridgelabz.gamblingsimulation;

public class GamblingSimulator {
	public static final int INITIAL_STAKE_EVERYDAY = 100;
	public static final int BET_EVERYGAME = 1;
	public static final int WIN=1;
	public static final int Lose=0;
	public static final int minStake = (INITIAL_STAKE_EVERYDAY)-(50*INITIAL_STAKE_EVERYDAY/100);
	public static final int maxStake = (INITIAL_STAKE_EVERYDAY)+(50*INITIAL_STAKE_EVERYDAY/100);
	public static final int NUMBER_OF_DAYS=20;
	
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
	public static int netReturn() {
		int netAmount=0;
		for(int day=1;day<=NUMBER_OF_DAYS;day++) {
    		int balance=calculativeGambler();
			if(balance>INITIAL_STAKE_EVERYDAY) {
				netAmount+=balance-INITIAL_STAKE_EVERYDAY;
			}
			else {
				netAmount-=INITIAL_STAKE_EVERYDAY-balance;
			}
	     }
	    	return netAmount;
	}
    public static void main(String[] args) {
	    int netAmount=netReturn();
    	if(netAmount>0)
    		System.out.println("Player win amount = "+netAmount);
    	else
        	System.out.println("Player lose amount = "+Math.abs(netAmount));
    		
}
}

