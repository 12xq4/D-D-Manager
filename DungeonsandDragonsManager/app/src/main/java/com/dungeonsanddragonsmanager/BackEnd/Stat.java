package com.dungeonsanddragonsmanager.BackEnd;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jackqiao
 */

public class Stat {
    int strength;
    int dexterity;
    int constitution;
    int intelligence;
    int wisdom;
    int charisma;

    public Stat(int str, int dex, int cons, int intel, int wis, int cha) {
        addStr(str);
        addDex(dex);
        addCons(cons);
        addIntel(intel);
        addWis(wis);
        addChar(cha);
    }
    public int getStrength(){return strength;}
    public void addStr(int str){
        strength += str;
    }
    public int getDexterity(){return dexterity;}
    public void addDex(int dex){
        dexterity += dex;
    }
    public int getConstitution(){return constitution;}
    public void addCons(int con){
        constitution += con;
    }
    public int getIntelligence(){return intelligence;}
    public void addIntel(int inte){
        intelligence += inte;
    }
    public int getWisdom(){return wisdom;}
    public void addWis(int wis){
        wisdom += wis;
    }
    public int getCharisma(){return charisma;}
    public void addChar(int chari){
        charisma += chari;
    }
    
    public int returnModifier(int stat) {
        switch (stat){
            case 1:
                return -5;
            case 2:
            case 3:
                return -4;
            case 4:
            case 5:
                return -3;
            case 6:
            case 7:
                return -2;
            case 8:
            case 9:
                return -1;
            case 10:
            case 11:
                return 0;
            case 12:
            case 13:
                return 1;
            case 14:
            case 15:
                return 2;
            case 16:
            case 17:
                return 3;
            case 18:
            case 19:
                return 4;
            case 20:
            case 21:
                return 5;
            case 22:
            case 23:
                return 6;
            case 24:
            case 25:
                return 7;
            case 26:
            case 27:
                return 8;
            case 28:
            case 29:
                return 9;
            case 30:
                return 10;
            default:
                return 0;
        }
    }
    public String toString() {
        return "Strength:        " + strength + "    Dexterity:    " + dexterity + "\n" +
                "Consitution:    " + constitution + "    Intelligence:    " + intelligence + "\n" +
                "Wisdom:         " + wisdom + "    Charisma:    " + charisma + "\n";
    }
}
