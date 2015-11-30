package com.dungeonsanddragonsmanager.BackEnd.Races;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jackqiao
 */
import com.dungeonsanddragonsmanager.BackEnd.Skills;
import com.dungeonsanddragonsmanager.BackEnd.Stat;

import java.util.ArrayList;

public class Gnome extends Race {

    public Gnome(Stat stat) {
        name = "Gnome";
        this.stat = stat;
        speed = 25;
        this.stat.addIntel(2);
        language = new ArrayList<>();
        skillset = new ArrayList<>();
        setLanguage();
        setSkills();
    }

    void setLanguage(){
        language.add("Common");
        language.add("Gnomish");
    }

    @Override
    String displayLanguage() {
        String result = "Language:   ";
        for (String lan:language) {
            result += lan + "    ";
        }
        return result;
    }

    ArrayList<String> getLanguage() {
        return language;
    }

    void setSkills(){
        skillset.add(new Skills("Darkvision", "You can see in dim light within 60 feet of you " +
                "as if it were bright light, and in darkness as if it were dim light."));
        skillset.add(new Skills("Gnome Cunning", "You have advantage on all Intelligence, Wisdom, " +
                "and Charisma saving throws against magic."));
    }

    @Override
    String displaySkills() {
        String result = "Skills: \n";
        for (Skills skill: skillset){
            result += skill + "\n";
        }
        return result;
    }

    ArrayList<Skills> getSkillSet() {
        return skillset;
    }

}
