package com.example.observerdesignpattern;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Subject subject = new Subject();

//        Create concrete subscriber.
        MagazineObserver observer1 = new ConcreteObserverOne();
        subject.Subscribe(observer1);
        MagazineObserver observer2 = new ConcreteObserverTwo();
        subject.Subscribe(observer2);

        subject.issueNewSubscription();

//         Observer two unsubscribed.
        subject.unSubscribe(observer2);

        subject.issueNewSubscription();

    }
}