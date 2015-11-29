package com.dungeonsanddragonsmanager.BackEnd;

/**
 * Created by Dylan on 2015-11-23.
 */

import com.dungeonsanddragonsmanager.BackEnd.Race;
import com.dungeonsanddragonsmanager.BackEnd.Skills;
import com.dungeonsanddragonsmanager.BackEnd.Stat;

import java.util.ArrayList;

public class Elf extends Race {

    public Elf (Stat stat) {
        name = "Elf";
        this.stat = stat;
        speed = 30;
        this.stat.addDex(2);
        language = new ArrayList<>();
        skillset = new ArrayList<>();
        setLanguage();
        setSkills();
    }

    void setLanguage(){
        language.add("Common");
        language.add("Elvish");
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
        skillset.add(new Skills("Keen Senses", "You have proficiency in the Perception skill."));
        skillset.add(new Skills("Fey Ancestry", "You have advantage on saving throws against" +
                " being charmed, and magic can't put you to sleep."));
        skillset.add(new Skills("Trance", "Elves don't need to sleep. Instead, they meditate " +
                "deeply, remaining semiconscious, for 4 hours a day. While meditating, you can" +
                "dream after a fashion; such dreams are actually mental exercises that have " +
                "become reflexive through years of practice. After resting in this way, you gain" +
                "the same benefit that a human does from 8 hours of sleep."));
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

