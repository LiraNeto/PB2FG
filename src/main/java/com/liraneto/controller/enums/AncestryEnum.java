package com.liraneto.controller.enums;

import com.liraneto.model.xml.elementosType.ElementoWindowReference;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
@AllArgsConstructor
public enum AncestryEnum {

    DWARF("Dwarf", "Medium", 0, Arrays.asList("Dwarf", "Humanoid"),
            new ElementoWindowReference("referencerace",
                    "reference.ancestries.dwarf@Pathfinder Second Edition Core Rules")),

    ELF("Elf", "Medium", 0, Arrays.asList("Elf", "Humanoid"),
            new ElementoWindowReference("referencerace",
                    "reference.ancestries.elf@Pathfinder Second Edition Core Rules")),

    GNOME("Gnome", "Medium", 0, Arrays.asList("Gnome", "Humanoid"),
            new ElementoWindowReference("referencerace",
                    "reference.ancestries.gnome@Pathfinder Second Edition Core Rules")),

    GOBLIN("Goblin", "Medium", 0, Arrays.asList("Goblin", "Humanoid"),
            new ElementoWindowReference("referencerace",
                    "reference.ancestries.goblin@Pathfinder Second Edition Core Rules")),

    HALFLING("Halfling", "Medium", 0, Arrays.asList("Halfling", "Humanoid"),
            new ElementoWindowReference("referencerace",
                    "reference.ancestries.halfling@Pathfinder Second Edition Core Rules")),

    HUMAN("Human", "Medium", 0, Arrays.asList("Human", "Humanoid"),
            new ElementoWindowReference("referencerace",
                    "reference.ancestries.human@Pathfinder Second Edition Core Rules")),

    ANCESTRY_NOT_FOUND ("ANCESTRY_NOT_FOUND", null, 0, null, null);

    private String name;

    private String size;

    private int sizeInt;

    private List<String> traits;

    private ElementoWindowReference raceLink;

    public static AncestryEnum getAncestry (String name){
        for (AncestryEnum ancestryEnum : AncestryEnum.values()){
            if (ancestryEnum.getName().equalsIgnoreCase(name))
                return ancestryEnum;
        }
        return ANCESTRY_NOT_FOUND;
    }
}
