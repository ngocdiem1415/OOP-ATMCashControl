package model;

import view.Observer;

import java.util.ArrayList;

public abstract class Observerable {
    ArrayList<Observer> list = new ArrayList<>();

    public void addObs( Observer obs){
        list.add(obs);
    }

    public void remove( Observer obs){
        list.remove(obs);
    }

    public void notifyObs( ){
        for (Observer obs: list ) {
            obs.update();
        }
    }
}
