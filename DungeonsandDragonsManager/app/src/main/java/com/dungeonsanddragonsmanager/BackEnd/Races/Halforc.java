package com.dungeonsanddragonsmanager.BackEnd.Races;

import com.dungeonsanddragonsmanager.BackEnd.Skills;
import com.dungeonsanddragonsmanager.BackEnd.Stat;

import java.util.ArrayList;

public class Halforc extends Race {

    public Halforc(Stat stat) {
        name = "Half-Orc";
        this.stat = stat;
        speed = 30;
        this.stat.addStr(2);
        this.stat.addCons(1);
        language = new ArrayList<>();
        skillset = new ArrayList<>();
        setLanguage();
        setSkills();
    }

    void setLanguage(){
        language.add("Common");
        language.add("Orc");
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
        skillset.add(new Skills("Menacing", "You gain proficiency in the Intimidation skill."));
        skillset.add(new Skills("Relentless Endurance", "When you are reduced to 0 hit points " +
                "but not killed outright, you can drop to 1 hit point instead. You can’t use " +
                "this feature again until you finish a long rest."));
        skillset.add(new Skills("Savage Attacks", "When you score a critical hit with a melee " +
                "weapon attack, you can roll one of the weapon’s damage dice one additional " +
                "time and add it to the extra damage of the critical hit."));
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
