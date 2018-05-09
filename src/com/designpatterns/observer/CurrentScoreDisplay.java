package com.designpatterns.observer;

public class CurrentScoreDisplay implements Observer{

	int runs;
	float overs;
	int wickets;

	@Override
	public void update(int runs, int wickets, float overs) {
		this.runs = runs;
        this.wickets = wickets;
        this.overs = overs;
        display();

	}
	 public void display()
	    {
	        System.out.println("\nCurrent Score Display:\n"
	                           + "Runs: " + runs +
	                           "\nWickets:" + wickets +
	                           "\nOvers: " + overs );
	    }

}
