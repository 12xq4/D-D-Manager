package com.dungeonsanddragonsmanager.BackEnd.Race;
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

public class Dragonborn extends Race {

    String[] ancestry = {"Dragon      Damage Type      Breath Weapon\n",
                         "Black       Acid             5 by 30 ft. line (Dex. save)\n",
                         "Blue        Lightning        5 by 30 ft. line (Dex. save)\n",
                         "Brass       Fire             5 by 30 ft. line (Dex. save)\n",
                         "Bronze      Lightning        5 by 30 ft. line (Dex. save)\n",
                         "Copper      Acid             5 by 30 ft. line (Dex. save)\n",
                         "Cold        Fire             15 ft. cone (Dex. save)\n",
                         "Green       Poison           15 ft. cone (Con. save)\n",
                         "Red         Fire             15 ft. cone (Dex. save)\n",
                         "Silver      Cold             15 ft. cone (Con. save)\n",
                         "White       Cold             15 ft. cone (Con. save)\n"};
    public Dragonborn(Stat stat) {
        name = "Dragonborn";
        this.stat = stat;
        speed = 30;
        this.stat.addStr(2);
        this.stat.addChar(1);
        language = new ArrayList<>();
        skillset = new ArrayList<>();
        setLanguage();
        setSkills();
    }

    void setLanguage(){
        language.add("Common");
        language.add("Draconic");
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
        skillset.add(new Skills("Draconic Ancestry", "You have draconic ancestry. Choose one" +
                " type of dragon from the Draconic Ancestry table. Your breath weapon and damage " +
                "restistance are determined by the dragon type, as shown in the table.\n" +
                "\nDraconic Ancestry\n" + ancestry[0] + ancestry[1] + ancestry[2] + ancestry[3]
                + ancestry[4] + ancestry[5] + ancestry[6] + ancestry[7] + ancestry[8] + ancestry[9]
                + ancestry[10]));
        skillset.add(new Skills("Breath Weapon", "You can use your action to exhale destructive " +
                "energy. Your draconic ancestry determines the size, shape, and damage type of the" +
                "exhalation. When you use your breath w eapon, each creature in the area of the " +
                "exhalation must make a saving throw, the type o f which is determined by your " +
                "draconic ancestry. The DC for this saving throw equals 8 your Constitution " +
                "modifier + your proficiency bonus. A creature takes 2d6 damage on a failed save, " +
                "and half as much damage on a successful one. The damage increases to 3d6 at 6th " +
                "level, 4d6 at 11th level, and 5d6 at 16th level. After you use your breath weapon" +
                ", you can’t use it again until you complete a short or long rest."));
        skillset.add(new Skills("Damage Resistance", "You have resistance to the damage type " +
                "associated with your draconic ancestry."));
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
