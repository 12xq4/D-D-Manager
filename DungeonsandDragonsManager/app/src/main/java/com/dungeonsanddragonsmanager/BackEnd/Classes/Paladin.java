package com.dungeonsanddragonsmanager.BackEnd.Classes;

import com.dungeonsanddragonsmanager.BackEnd.Skills;
import com.dungeonsanddragonsmanager.BackEnd.Stat;

import java.util.ArrayList;

/**
 * Created by jackqiao on 11/29/2015.
 */
public class Paladin extends Role{
    public Paladin(Stat stat){
        name = "Paladin";
        this.stat = stat;
        hitDice = "one 10-sided dice";
        hitPoint = 10 + this.stat.returnModifier(stat.getConstitution());
        skillset = new ArrayList<>();
        equipment = new ArrayList<>();
        setEquipments();
        setSkills();
    }

    void setSkills() {
        skillset.add(new Skills("Armor and Weapon Proficiencies", "All armor, shields, simple weapons, martial weapons."));
        skillset.add(new Skills("Saving throw proficiencies", "Wisdom, Charisma."));
        skillset.add(new Skills("Divine Sense", "When use this ability, detect location of any celestial, fiend, or undead within 60 feet of you that is not behind total cover." +
                "You can detect the type of that being but not the exact identity. Within the same radius, you also detect the presence of any place or object that has been consecrated or desecrated." +
                "You can use this feature"+ (1+ stat.returnModifier(stat.getCharisma())) +" times. When you finish a long rest, you regain all expended uses."));
        skillset.add(new Skills("Lay On Hands", "You have a pool of healing power that replenishes when you take a long rest. With that pool, you can restore a total number of hit points equal to your paladin level x5" +
                "As an action, you can touch a creature and draw power from the pool to restore a number of hit points to that creature, up to the maximum amount remaining in your pool." +
                "Alternatively, you can expend 5 hit points from your pool of healing to cure the target of one disease or neutralize one poison affecting it. You can cure multiple diseases and neutralize multiple poisons with a single use of Lay on Hands, expending hit points separately for each one." +
                "This feature has no effect on undead and constructs."));
        skillset.add(new Skills("Bonus", "Choose two from Athletics, Insight, Intimidation, Medicine, Persuasion, and Religion."));
    }

    void setEquipments(){
        equipment.add("a martial weapon and a shield or two martial weapons.");
        equipment.add("five javelins or any simple melee weapon.");
        equipment.add("a priest's pack or an explorer's pack.");
        equipment.add("a chain mail.");
        equipment.add("a holy symbol.");
    }
}
