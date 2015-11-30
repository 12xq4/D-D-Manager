package com.dungeonsanddragonsmanager.BackEnd.Background;

import java.util.ArrayList;

/**
 * Created by jackqiao on 11/29/2015.
 */
public class FolkHero extends Background {
    public FolkHero(){
        name = "FolkHero";
        skillset = new ArrayList<>();
        language = new ArrayList<>();
        equipment= new ArrayList<>();
        setLanguage();
        setEquipments();
        setSkills();
    }

    @Override
    void setSkills() {

    }

    @Override
    void setEquipments() {

    }

    @Override
    void setLanguage() {

    }
}
