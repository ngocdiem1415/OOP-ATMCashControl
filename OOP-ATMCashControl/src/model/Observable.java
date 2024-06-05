package model;

import view.Observer;

import java.util.ArrayList;

public abstract class Observable {
    ArrayList<Observer> list = new ArrayList<>();

    public void addObs( Observer obs){
        list.add(obs);
        System.out.println("moi add tuc thi");
    }

    public void remove( Observer obs){
        list.remove(obs);
    }

    public void notifyObs( ){
        System.out.println("notifyobs");
        for (Observer obs: list ) {
            obs.updata();
        }
    }

    public int countObs() {
        return list.size();
    }
}
