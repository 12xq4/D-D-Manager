package com.dungeonsanddragonsmanager.BackEnd.Classes;

import com.dungeonsanddragonsmanager.BackEnd.Skills;
import com.dungeonsanddragonsmanager.BackEnd.Stat;

import java.util.ArrayList;

/**
 * Created by jackqiao on 11/25/2015.
 */
public class Druid extends Role {
    public Druid (Stat stat){
        name = "Druid";
        this.stat = stat;
        hitDice = "one 8-sided dice";
        hitPoint = 8 + this.stat.returnModifier(stat.getConstitution());
        skillset = new ArrayList<>();
        equipment = new ArrayList<>();
        setEquipments();
        setSkills();
    }

    void setSkills() {
        skillset.add(new Skills("Armor and Weapon Proficiencies","Light armor, medium armor, shield (Druid will not wear armor or shield made of metal), " +
                "Clubs, daggers, darts, javelins, maces, quarterstaffs, scimitars, sickles, slings, spears ."));
        skillset.add(new Skills("Saving throw proficiencies", "Intelligence, Wisdom"));

        skillset.add(new Skills("Bonus", "Choose two from Arcana, Animal Handling, Insight, Medicine, Nature, Perception, Religion, and Survival"));
    }

    void setEquipments(){
        equipment.add("a wooden shield or any simple weapon.");
        equipment.add("a scimitar or any simple melee weapon.");
        equipment.add("Leather armor.");
        equipment.add("an explorer’s pack.");
        equipment.add("a druidic focus");
    }
}
