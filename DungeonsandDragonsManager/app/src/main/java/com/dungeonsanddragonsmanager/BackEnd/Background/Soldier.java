package com.dungeonsanddragonsmanager.BackEnd.Background;

import com.dungeonsanddragonsmanager.BackEnd.Skills;

import java.util.ArrayList;

/**
 * Created by jackqiao on 11/29/2015.
 */
public class Soldier extends Background {
    public Soldier(){
        name = "Soldier";
        feature = "Military Rank \n You have a military rank from your career as a soldier. " +
                "Soldiers loyal to your former military organization still recognize your " +
                "authority and influence, and they defer to you if they are of a lower rank. You " +
                "can invoke your rank to exert influence over other soldiers and requisition " +
                "simple equipment or horses for temporary use. You can also usually gain access " +
                "to friendly military encampments and fortresses where your rank is recognized.";
        skillset = new ArrayList<>();
        language = new ArrayList<>();
        equipment= new ArrayList<>();
        setLanguage();
        setEquipments();
        setSkills();
    }

    @Override
    void setSkills() {
        skillset.add(new Skills("Skill Proficiency", "Athletics, Intimidation"));
    }

    @Override
    void setEquipments() {
        equipment.add("an insignia of rank");
        equipment.add("a trophy taken from a fallen enemy (dagger, broken blade, or a piece of a banner)");
        equipment.add("a set of bone dice or deck of cards");
        equipment.add("a set of common clothes");
        equipment.add("10 gold");
    }

    @Override
    void setLanguage() {
        language.add("Common");
    }
}
