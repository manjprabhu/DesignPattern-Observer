package com.example.observerdesignpattern;

import java.util.ArrayList;
import java.util.List;

public class Subject {

    List<MagazineObserver> observers = new ArrayList<>();

    public void Subscribe(MagazineObserver magazineObserver) {
        observers.add(magazineObserver);
    }

    public void unSubscribe(MagazineObserver magazineObserver) {
        observers.remove(magazineObserver);
    }

    public void issueNewSubscription() {
        for (MagazineObserver observer : observers) {
            observer.update("New edition is dispatched");
        }
    }
}
