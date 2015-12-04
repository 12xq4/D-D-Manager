package com.dungeonsanddragonsmanager.BackEnd.Background;

import com.dungeonsanddragonsmanager.BackEnd.Skills;

import java.util.ArrayList;

/**
 * Created by jackqiao on 11/29/2015.
 */
public class Urchin extends Background {
    public Urchin(){
        name = "Urchin";
        feature = "City Secrets \n You know the secret patterns and flow to cities and can find " +
                "passages through the urban sprawl that others would miss.  When you are not in " +
                "combat, you (and companions you lead) can travel between any two locations in the " +
                "city twice as fast as your speed would normally allow.";
        skillset = new ArrayList<>();
        language = new ArrayList<>();
        equipment= new ArrayList<>();
        setLanguage();
        setEquipments();
        setSkills();
    }

    @Override
    void setSkills() {
        skillset.add(new Skills("Skill Proficiency", "Sleight of Hand, Stealth"));
    }

    @Override
    void setEquipments() {
        equipment.add("a small knife");
        equipment.add("a map of the city you grew up in");
        equipment.add("a pet mouse");
        equipment.add("a token to remember your parents by");
        equipment.add("a set of common clothes");
        equipment.add("10 gp");
    }

    @Override
    void setLanguage() {
        language.add("Common");
    }
}
