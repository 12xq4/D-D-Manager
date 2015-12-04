package com.dungeonsanddragonsmanager.BackEnd.Background;

import com.dungeonsanddragonsmanager.BackEnd.Skills;

import java.util.ArrayList;

/**
 * Created by jackqiao on 11/29/2015.
 */
public class Criminal extends Background {
    public Criminal(){
        name = "Criminal";
        feature = "Criminal Contact \nYou have a reliable and trustworthy contact who acts as" +
                  "your liaison to a network of other criminals. You know how to get messages to " +
                  "and from your contact, even over great distances; specifically, you know the " +
                  "local messengers, corrupt caravan masters, and seedy sailors who can deliver " +
                  "messages for you.";
        skillset = new ArrayList<>();
        language = new ArrayList<>();
        equipment= new ArrayList<>();
        setLanguage();
        setEquipments();
        setSkills();
    }

    @Override
    void setSkills() {
        skillset.add(new Skills("Skill Proficiency", "Deception, Stealth"));
    }

    @Override
    void setEquipments() {
        equipment.add("a crowbar");
        equipment.add("a set of dark common clothes including a hood");
        equipment.add("15 gp");
    }

    @Override
    void setLanguage() {
        language.add("Common");
    }
}
