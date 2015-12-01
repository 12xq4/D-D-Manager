package com.dungeonsanddragonsmanager.BackEnd.Background;

import java.util.ArrayList;

/**
 * Created by jackqiao on 11/29/2015.
 */
public class Sailor extends Background {
    public Sailor(){
        name = "Sailor";
        feature = "Ship's Passage \n When you need to, you can secure free passage on a sailing ship for yourself and your companions.  You might sail on the ship you served on, or another ship you have good relations with.  Because you're calling in a favor, you can't be certain of a schedule or route that will meet your every need.  Your DM will determine how long it takes to get where you need to go. In return for free passage, you and your companions are expected to assist the crew during the voyage";
        skillset = new ArrayList<>();
        language = new ArrayList<>();
        equipment= new ArrayList<>();
        setLanguage();
        setEquipments();
        setSkills();
    }

    @Override
    void setSkills() {
        skillset.add(new Skills("Skill Proficiency", "Athletics, Perception"));
    }

    @Override
    void setEquipments() {
        equipment.add("a belaying pin (club)");
        equipment.add("50 feet of silk rope");
        equipment.add("a lucky charm (rabbit foot or small stone with a hole in the center");
        equipment.add("a set of common clothes");
        equipment.add("10 gold");
    }

    @Override
    void setLanguage() {
        language.add("Common")
    }
}
