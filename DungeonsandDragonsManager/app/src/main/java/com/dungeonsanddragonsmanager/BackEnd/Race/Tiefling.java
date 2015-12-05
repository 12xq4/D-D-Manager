package com.dungeonsanddragonsmanager.BackEnd.Race;

import com.dungeonsanddragonsmanager.BackEnd.Skills;
import com.dungeonsanddragonsmanager.BackEnd.Stat;

import java.util.ArrayList;

public class Tiefling extends Race {

    public Tiefling(Stat stat) {
        name = "Tiefling";
        this.stat = stat;
        speed = 30;
        this.stat.addIntel(1);
        this.stat.addChar(2);
        language = new ArrayList<>();
        skillset = new ArrayList<>();
        setLanguage();
        setSkills();
    }

    void setLanguage(){
        language.add("Common");
        language.add("Infernal");
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
        skillset.add(new Skills("Hellish Resistance", "You have resistance to fire damage."));
        skillset.add(new Skills("Infernal Legacy", "You know the thaumaturgy cantrip. Once you " +
                "reach 3rd level, you can cast the hellish rebuke spell once per day as a " +
                "2nd-level spell. Once you reach 5th level, you can also cast the darkness " +
                "spell once per day. Charisma is your spellcasting ability for these spells."));
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
