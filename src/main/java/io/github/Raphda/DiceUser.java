package io.github.Raphda;

public class DiceUser {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TripletOfDice result=rollOnce();
		System.out.println("The die number 1 is a "+ result.getFirstDie());
		System.out.println("The die number 2 is a "+ result.getSecondDie());
		System.out.println("The die number 3 is a "+ result.getThirdDie());
		
	}

	public static TripletOfDice rollOnce() {
		TripletOfDice triplet = new TripletOfDice();
		triplet.rollAllDice();
		return triplet;
	}
}
