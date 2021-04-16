package com.liraneto.controller.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ClasseEnum {

    FIGHTER("Fighter", "reference.classes.fighter@Pathfinder Second Edition Core Rules"),

    CLASSE_NOT_FOUND (null, null);

    ;

    private String name;

    private String shortcut;

    public static ClasseEnum getClasseEnum (String name){
        for (ClasseEnum classeEnum : ClasseEnum.values()){
            if (classeEnum.getName().equalsIgnoreCase(name))
                return classeEnum;
        }
        return CLASSE_NOT_FOUND;
    }
}
