package com.dungeonsanddragonsmanager.BackEnd.Background;

import java.util.ArrayList;

/**
 * Created by jackqiao on 11/29/2015.
 */
public class Outlander extends Background {
    public Outlander(){
        name = "Outlander";
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