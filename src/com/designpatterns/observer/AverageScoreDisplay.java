package com.designpatterns.observer;

public class AverageScoreDisplay implements Observer{

	private int predictedScore;
	private float runRate;
	@Override
	public void update(int runs, int wickets, float overs) {
		this.runRate = (float)runs/overs;
		this.predictedScore = (int)runRate*50;
		displayStats();
	}

	public void displayStats(){
		 System.out.println("\nAverage Score Display: \n"
                 + "Run Rate: " + runRate +
                 "\nPredictedScore: " +
                 predictedScore);
	}

}
