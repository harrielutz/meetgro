<<<<<<< HEAD
package com.example.ruben.softwareengeneering20;

import java.io.Serializable;
import java.util.ArrayList;

/**
 * Created by Ruben on 23/02/2016.
 */
public class User implements Serializable {

    private int userID, points;
    private String name;

    private ArrayList<Achievement> achievements;
    private ArrayList<Quest> quests, solvedquests;
    private Quest activeQuest;

    public void addQuest(Quest q) { this.quests.add(q);    }

}
=======
package com.example.ruben.myfirstapp;

import java.util.ArrayList;

/**
 * Created by Ruben on 23/02/2016.
 */
public class User {

    private int userID, points;
    private String name;

    private ArrayList<Achievement> achievements;
    private ArrayList<Quest> quests, solvedquests;
    private Quest activeQuest;

}
>>>>>>> 4c3fa21289fce02d56a89a4bf4d29c0aaeb89011
