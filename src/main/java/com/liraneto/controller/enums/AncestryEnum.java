package com.liraneto.controller.enums;

import com.liraneto.model.xml.elementosType.ElementoWindowReference;
import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
@AllArgsConstructor
public enum AncestryEnum {

    HUMAN ("Human", "Medium", 0, Arrays.asList("Human", "Humanoid"),
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
            if (ancestryEnum.getName().equals(name))
                return ancestryEnum;
        }
        return ANCESTRY_NOT_FOUND;
    }
}
