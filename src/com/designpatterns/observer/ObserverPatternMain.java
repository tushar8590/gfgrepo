package com.designpatterns.observer;

public class ObserverPatternMain {

	public static void main(String[] args) {
		AverageScoreDisplay averageScoreDisplay = new AverageScoreDisplay();
		CurrentScoreDisplay currentScoreDisplay = new CurrentScoreDisplay();

		// pass the displays to Cricket data
		CricketData cricketData = new CricketData();
		cricketData.registerObserver(currentScoreDisplay);
		cricketData.registerObserver(averageScoreDisplay);

		cricketData.dataChanged();

	}

}
