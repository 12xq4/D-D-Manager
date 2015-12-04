package com.dungeonsanddragonsmanager.BackEnd.Classes;

import com.dungeonsanddragonsmanager.BackEnd.Skills;
import com.dungeonsanddragonsmanager.BackEnd.Stat;

import java.util.ArrayList;

/**
 * Created by jackqiao on 11/25/2015.
 */
public class Cleric extends Role {
    public Cleric(Stat stat){
        name = "Cleric";
        this.stat = stat;
        hitDice = "one 8-sided dice";
        hitPoint = 8 + this.stat.returnModifier(stat.getConstitution());
        skillset = new ArrayList<>();
        equipment = new ArrayList<>();
        setEquipments();
        setSkills();
    }

    void setSkills() {
        skillset.add(new Skills("Armor and Weapon Proficiencies","Light armor, medium armor, shield, all simple weapons."));
        skillset.add(new Skills("Saving throw proficiencies","Wisdom, Charisma"));
        skillset.add(new Skills("Spell casting", "You have the ability to cast spells."));
        skillset.add(new Skills("Divine Domain", "Choose one domain related to your deity: Knowledge, Life, Light, Nature, Tempest, Trickery, or War." +
                "Your choice grants you domain spells and other features."));
        skillset.add(new Skills("Bonus", "Choose two from History, Insight, Medicine, Persuasion, and Religion"));

    }

    void setEquipments(){
        equipment.add("a mace or a warhammer (if proficient).");
        equipment.add("scale armor, leather armor, or chain mail (if proficient).");
        equipment.add("a light crossbow and 20 bolts or any simple weapon.");
        equipment.add("a priest's pack or an explorer's pack.");
        equipment.add("a shield");
        equipment.add("a holy symbol");
    }
}
