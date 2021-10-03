package com.example.observerdesignpattern;

import android.util.Log;

public class ConcreteObserverOne implements MagazineObserver {

    @Override
    public void update(String message) {
        Log.v(this.getClass().getName(), "===>>> " + message);

    }
}
