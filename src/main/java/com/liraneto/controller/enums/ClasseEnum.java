package com.liraneto.controller.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ClasseEnum {
    // -----------------------------------------------------------CLASSES-CORE-------------------------------------------------------
    ALCHEMIST("Alchemist", "reference.classes.alchemist@Pathfinder Second Edition Core Rules"),

    BARBARIAN("Barbarian", "reference.classes.barbarian@Pathfinder Second Edition Core Rules"),

    BARD("Bard", "reference.classes.bard@Pathfinder Second Edition Core Rules"),

    CHAMPION("Champion", "reference.classes.champion@Pathfinder Second Edition Core Rules"),

    CLERIC("Cleric", "reference.classes.cleric@Pathfinder Second Edition Core Rules"),

    DRUID("Druid", "reference.classes.druid@Pathfinder Second Edition Core Rules"),

    FIGHTER("Fighter", "reference.classes.fighter@Pathfinder Second Edition Core Rules"),

    MONK("Monk", "reference.classes.monk@Pathfinder Second Edition Core Rules"),

    RANGER("Ranger", "reference.classes.ranger@Pathfinder Second Edition Core Rules"),

    ROGUE("Rogue", "reference.classes.rogue@Pathfinder Second Edition Core Rules"),

    SORCERER("Sorcerer", "reference.classes.sorcerer@Pathfinder Second Edition Core Rules"),

    WIZARD("Wizard", "reference.classes.wizard@Pathfinder Second Edition Core Rules"),
    // -----------------------------------------------------------CLASSES-CORE-------------------------------------------------------

    CLASSE_NOT_FOUND ("", null)

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
