package io.github.Raphda;

public class TripletOfDice {

	private int die1;
	private int die2;
	private int die3;
	private int numberOfSides;
	
	public TripletOfDice() {
		numberOfSides=6;
	}

	public TripletOfDice(int sides) {
		if(sides<=0) throw new IllegalArgumentException("Erreur, il ne peut pas avoir un nombre de face négative : " + sides);
		numberOfSides=sides;
	}
	
	public int getFirstDie() {
		return die1;
	}
	
	public int getSecondDie() {
		return die2;
	}
	
	public int getThirdDie() {
		return die3;
	}
	
	public void rollAllDice() {
		die1 = (int)(Math.random()*numberOfSides) + 1;
		die2 = (int)(Math.random()*numberOfSides) + 1;
		die3 = (int)(Math.random()*numberOfSides) + 1;
	}
	
	public void rollOneDie(int dieNumber) {
		if((dieNumber<1) || (dieNumber>3)) {
			throw new IllegalArgumentException("L'argument doit être compris entre 1 et 3, erreur :" + dieNumber);
		}
		if(dieNumber==1) {
			die1 = (int)(Math.random()*numberOfSides) + 1;
		}
		if(dieNumber==2) {
			die2 = (int)(Math.random()*numberOfSides) + 1;
		}
		if(dieNumber==3) {
			die3 = (int)(Math.random()*numberOfSides) + 1;
		}
	}

}
