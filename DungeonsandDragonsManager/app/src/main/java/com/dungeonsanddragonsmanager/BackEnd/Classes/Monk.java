package com.dungeonsanddragonsmanager.BackEnd.Classes;

import com.dungeonsanddragonsmanager.BackEnd.Skills;
import com.dungeonsanddragonsmanager.BackEnd.Stat;

import java.util.ArrayList;

/**
 * Created by jackqiao on 11/26/2015.
 */
public class Monk extends Role {
    public Monk(Stat stat){
        name = "Monk";
        this.stat = stat;
        hitDice = "one 8-sided dice";
        hitPoint = 8 + this.stat.returnModifier(stat.getConstitution());
        skillset = new ArrayList<>();
        equipment = new ArrayList<>();
        setEquipments();
        setSkills();
    }

    void setSkills() {
        skillset.add(new Skills("Armor and Weapon Proficiencies", "Simple weapons, shortswords."));
        skillset.add(new Skills("Saving throw proficiencies", "Strength, Dexterity."));
        skillset.add(new Skills("Unarmored Defense", "While not wearing any armor or use any shield, your armor class equals to 10 + " +
        stat.returnModifier(stat.getDexterity()) + " + " + stat.returnModifier(stat.getWisdom()) + "."));
        skillset.add(new Skills("Martial Art", "Gain following beneift when unarmed or wielding only monk weapons (Shortsword, or simple melee weapons that don't have two-handed or heavy property) " +
                "and you aren't wearing armor or wielding a shield.\n" +
        "   - can use Dexterity instead of Strength for attack and damage roll. \n" +
        "   - can roll a 4 sided dice in place of a normal damage of your unarmed strike or monk weapon. \n " +
        "   - when you perform an attack action with unarmed strike or a monk weapon this turn, you could perform one additional unarmed strike."));
        skillset.add(new Skills("Bonus", "Choose two from Acrobatics, Athletics, History, Insight, Religion, and Stealth."));
    }

    void setEquipments(){
        equipment.add("a shortsword or any simple weapon.");
        equipment.add("a dungeoneer’s pack or an explorer’s pack.");
        equipment.add("10 darts.");
    }
}
