package com.dungeonsanddragonsmanager.BackEnd.Background;

import java.util.ArrayList;

/**
 * Created by jackqiao on 11/29/2015.
 */
public class Entertainer extends Background {
    public Entertainer(){
        name = "Entertainer";
        feature = "By Popular Demand\n You can always find a place to perform, usually in an
inn or tavern but possibly with a circus, at a theater, or
even in a noble’s court. At such a place, you receive free
lodging and food of a modest or comfortable standard
(depending on the quality of the establishment), as
long as you perform each night. In addition, your
performance makes you something of a local figure.
When strangers recognize you in a town where you have
performed, they typically take a liking to you."
        skillset = new ArrayList<>();
        language = new ArrayList<>();
        equipment= new ArrayList<>();
        setLanguage();
        setEquipments();
        setSkills();
    }

    @Override
    void setSkills() {
        skillset.add(new Skills("Skill Proficiency", "Acrobatics, Performance"));
    }

    @Override
    void setEquipments() {
        equipment.add("musical instrument of your choice");
        equipment.add("the favor of an admirer (love letter, lock of hair, or trinket)");
        equipment.add("a costume");
        equipment.add("15 gold");
    }

    @Override
    void setLanguage() {
        language.set("Common");
    }
}
