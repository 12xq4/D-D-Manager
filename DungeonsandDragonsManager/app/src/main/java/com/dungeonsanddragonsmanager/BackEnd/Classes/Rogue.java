package com.dungeonsanddragonsmanager.BackEnd.Classes;

import com.dungeonsanddragonsmanager.BackEnd.Skills;
import com.dungeonsanddragonsmanager.BackEnd.Stat;

import java.util.ArrayList;

/**
 * Created by jackqiao on 11/29/2015.
 */
public class Rogue extends Role {
    public Rogue(Stat stat){
        name = "Rogue";
        this.stat = stat;
        hitDice = "one 8-sided dice";
        hitPoint = 8 + this.stat.returnModifier(stat.getConstitution());
        skillset = new ArrayList<>();
        equipment = new ArrayList<>();
        setEquipments();
        setSkills();
    }
    void setSkills() {
        skillset.add(new Skills("Armor and Weapon Proficiencies", "Light armor, simple weapons, hand crossbows, longswords, rapiers, shortswords."));
        skillset.add(new Skills("Saving throw proficiencies", "Dexterity, Intelligence."));
        skillset.add(new Skills("Expertise", ", choose two of your skill proficiencies, or one of your skill proficiencies and your proficiency with thieves� tools. Your proficiency bonus is doubled for any ability check you make that uses either of the chosen proficiencies." +
                "At 6th level, you can choose two more of your proficiencies to gain this benefit."));
        skillset.add(new Skills("Sneak Attack", " Once per turn, you can add an extra one 6-sided dice to damage to one creature you hit with an attack if you have advantage on the attack roll. The attack must use a finesse or a ranged weapon. " +
                "You don't need advantage on the attack roll if another enemy of the target is within 5 feet of it, that enemy isn�t incapacitated, and you don�t have disadvantage on the attack roll. " +
                ""));
        skillset.add(new Skills("Thieves' Cant", ": a secret mix of dialect, jargon, and code that allows you to hide messages in seemingly normal conversation. Only another creature that knows thieves� cant understands such messages. " +
                "It takes four times longer to convey such a message than it does to speak the same idea plainly. In addition, you understand a set of secret signs and symbols used to convey short, simple messages, such as whether an area is dangerous or the territory of a thieves� guild, whether loot is nearby, or whether the" +
                "people in an area are easy marks or will provide a safe house for thieves on the run."));
        skillset.add(new Skills("Bonus", "Choose four from Acrobatics, Athletics, Deception. Insight, Intimidation, Investigation, Perception, Performance. Persuasion, Sleight of Hand, and Stealth."));
    }

    void setEquipments(){
        equipment.add("a rapier or a shortsword.");
        equipment.add("a shortbow and quiver of 20 arrows or a shortsword.");
        equipment.add("a burglar's pack, a dungeoneer's pack, or an explorer's pack.");
        equipment.add("Leather armor.");
        equipment.add("two daggers.");
        equipment.add("thieves' tools");

    }
}
