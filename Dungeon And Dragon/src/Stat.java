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
    
    public Stat() {
        strength = 0;
        dexterity = 0;
        constitution = 0;
        intelligence = 0;
        wisdom = 0;
        charisma = 0;
    }
    
    /**
    public void addStat(int str, int dex, int cons, int intel, int wis, int cha) {
        addStr(str);
        addDex(dex);
        addCons(cons);
        addIntel(intel);
        addWis(wis);
        addChar(cha);
    }
    **/
    
    public void addStr(int str){
        strength += str;
    }
    
    public void addDex(int dex){
        dexterity += dex;
    }
     
    public void addCons(int con){
        constitution = con;
    }
    
    public void addIntel(int inte){
        intelligence += inte;
    }
    
    public void addWis(int wis){
        wisdom += wis;
    }
    
    public void addChar(int chari){
        charisma += chari;
    }
    
}
