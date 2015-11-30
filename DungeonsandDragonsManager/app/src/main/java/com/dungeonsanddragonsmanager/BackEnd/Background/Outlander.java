package com.dungeonsanddragonsmanager.BackEnd.Background;

import java.util.ArrayList;

/**
 * Created by jackqiao on 11/29/2015.
 */
public class Outlander extends Background {
    public Outlander(){
        name = "Outlander";
        feature = "Wanderer \n 
        You have an excellent memory for maps and geography, and you can always recall the general layout of terrain, settlements, and other features around you.  
        In addition, you can find food and fresh water for yourself and up to five other people each day, provided the land offers berries, small game, water, etc."
        skillset = new ArrayList<>();
        language = new ArrayList<>();
        equipment= new ArrayList<>();
        setLanguage();
        setEquipments();
        setSkills();
    }

    @Override
    void setSkills() {
        skillset.add(new Skills("Skill Proficiency", "Athletics, Survival"));
    }

    @Override
    void setEquipments() {
        equipment.add("a staff");
        equipment.add("a hunting trap");
        equipment.add("a trophy from an animal you killed");
        equipment.add("a set of common clothes");
    }

    @Override
    void setLanguage() {
        language.add("Common");
        language.add("One of your choice");
    }
}
