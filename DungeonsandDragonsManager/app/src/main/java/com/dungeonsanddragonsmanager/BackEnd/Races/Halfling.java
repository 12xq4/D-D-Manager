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

public class Halfling extends Race {

    public Halfling (Stat stat) {
        name = "Halfling";
        this.stat = stat;
        speed = 25;
        this.stat.addDex(2);
        language = new ArrayList<>();
        skillset = new ArrayList<>();
        setLanguage();
        setSkills();
    }

    void setLanguage(){
        language.add("Common");
        language.add("Halfling");
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
        skillset.add(new Skills("Lucky", "When you roll a 1 on an attack roll, ability check, " +
                "or saving throw, you can reroll the die and must use the new roll."));
        skillset.add(new Skills("Brave", "You have advantage on saving throws against being " +
                "frightened."));
        skillset.add(new Skills("Halfling Nimbleness", "You can move through the space of any " +
                "creature that is of a size larger than yours."));
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
