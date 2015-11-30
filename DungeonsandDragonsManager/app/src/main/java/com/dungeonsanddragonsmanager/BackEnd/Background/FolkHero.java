package com.dungeonsanddragonsmanager.BackEnd.Background;

import java.util.ArrayList;

/**
 * Created by jackqiao on 11/29/2015.
 */
public class FolkHero extends Background {
    public FolkHero(){
        name = "FolkHero";
        feature = "Rustic Hospitality\nSince you come from the ranks of the common folk,
you fit in among them with ease. You can find a place
to hide, rest, or recuperate among other commoners,
unless you have shown yourself to be a danger to
them. They will shield you from the law or anyone
else searching for you, though they w ill not risk
their lives for you."

        skillset = new ArrayList<>();
        language = new ArrayList<>();
        equipment= new ArrayList<>();
        setLanguage();
        setEquipments();
        setSkills();
    }

    @Override
    void setSkills() {
        skillset.add(new Skills("Skill Proficiency", "Animal Handling, Survival")
    }

    @Override
    void setEquipments() {
        equipment.add("a set of artisan's tools (one of your choice)");
        equipment.add("a shovel");
        equipment.add("an iron pot");
        equipment.add("a set of common clothes");
        equipment.add("15 gold");
    }

    @Override
    void setLanguage() {
        language.add("Common");
    }
}
