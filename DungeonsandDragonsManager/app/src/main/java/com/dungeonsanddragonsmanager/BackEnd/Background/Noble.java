package com.dungeonsanddragonsmanager.BackEnd.Background;

import com.dungeonsanddragonsmanager.BackEnd.Skills;

import java.util.ArrayList;

/**
 * Created by jackqiao on 11/29/2015.
 */
public class Noble extends Background {
    public Noble(){
        name = "Noble";
        feature = "Position of Privilege \n Thanks to your noble birth, people are inclined to " +
                "think the best of you. You are welcome in high society, and people assume you " +
                "have the right to be wherever you are. The common folk make every effort to " +
                "accommodate you and avoid your displeasure, and other people of high birth treat" +
                " you as a member of the same social sphere. You can secure an audience with a " +
                "local noble if you need to.";
        skillset = new ArrayList<>();
        language = new ArrayList<>();
        equipment= new ArrayList<>();
        setLanguage();
        setEquipments();
        setSkills();
    }

    @Override
    void setSkills() {
        skillset.add(new Skills("Skill Proficiency", "History, Persuasion"));
    }

    @Override
    void setEquipments() {
        equipment.add("a set of fine clothes");
        equipment.add("a signet ring");
        equipment.add("a scroll of pedigree");
        equipment.add("25 gold");
    }

    @Override
    void setLanguage() {
        language.add("Common");
        language.add("One of your choice");
    }
}
