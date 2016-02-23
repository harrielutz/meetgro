package com.example.ruben.myfirstapp;

import java.util.ArrayList;

/**
 * Created by Ruben on 23/02/2016.
 */
public class Landmark {

    //locationName == streetName/neighbourhood
    private String name, locationName, information;
    private int points;
    private ArrayList<Question> questions;

    //this is probably wrong needs to be changed to the google maps marker/location object
    private location location;
}
