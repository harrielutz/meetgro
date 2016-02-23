package com.example.ruben.myfirstapp;

import java.util.ArrayList;

/**
 * Created by Ruben on 23/02/2016.
 */
public abstract class Quest {
    private String name;
    private ArrayList<Landmark> landmarks, visitedLandmarks;
    private boolean isUserGenerated;
    private int progress;

    public Quest(String name, boolean isUserGenerated){
        this.name = name;
        this.isUserGenerated = isUserGenerated;
    }



    //Adding landmarks by object now, could be changed to adding(creating) by name?

    public void addLandmark(Landmark landmark){
        this.landmarks.add(landmark);
    }

    public void isCompleted(Landmark landmark){
        this.landmarks.add(landmark);
    }
}
