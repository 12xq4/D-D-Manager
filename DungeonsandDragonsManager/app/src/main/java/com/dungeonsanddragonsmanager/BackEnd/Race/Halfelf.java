package com.dungeonsanddragonsmanager.BackEnd.Race;

import com.dungeonsanddragonsmanager.BackEnd.Skills;
import com.dungeonsanddragonsmanager.BackEnd.Stat;

import java.util.ArrayList;

public class Halfelf extends Race {

    public Halfelf(Stat stat) {
        name = "Half-Elf";
        this.stat = stat;
        speed = 30;
        this.stat.addChar(2);
        language = new ArrayList<>();
        skillset = new ArrayList<>();
        setLanguage();
        setSkills();
    }

    void setLanguage(){
        language.add("Common");
        language.add("Elvish");
        language.add("One extra language of your choice");
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
        skillset.add(new Skills("Ability Score Increase", "Two other ability scores of your" +
                " choice increase by 1."));
        skillset.add(new Skills("Darkvision", "You can see in dim light within 60 feet of you " +
                "as if it were bright light, and in darkness as if it were dim light."));
        skillset.add(new Skills("Fey Ancestry", "You have advantage on saving throws against" +
                " being charmed, and magic can't put you to sleep."));
        skillset.add(new Skills("Skill Versatility", "You gain proficiency in two skills " +
                "of your choice."));
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
