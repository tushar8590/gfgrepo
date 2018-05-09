package com.designpatterns.observer;

import java.util.ArrayList;
import java.util.List;

public class CricketData implements Subject{

	private int runs;
	private int wickets;
	private float overs;
	private List<Observer> observers = new ArrayList<>();
	@Override
	public void registerObserver(Observer o) {
		observers.add(o);
	}

	@Override
	public void unRegisterObserver(Observer o) {
		observers.remove(observers.indexOf(o));
	}

	@Override
	public void notifyObservers() {
		observers.forEach(o -> {
			o.update(runs, wickets, overs);
		});

	}
	 // get latest runs from stadium
    private int getLatestRuns()
    {
        // return 90 for simplicity
        return 90;
    }

    // get latest wickets from stadium
    private int getLatestWickets()
    {
        // return 2 for simplicity
        return 2;
    }

    // get latest overs from stadium
    private float getLatestOvers()
    {
        // return 90 for simplicity
        return (float)10.2;
    }

    // This method is used update displays
    // when data changes
    public void dataChanged()
    {
        //get latest data
        runs = getLatestRuns();
        wickets = getLatestWickets();
        overs = getLatestOvers();

        notifyObservers();
    }

}
