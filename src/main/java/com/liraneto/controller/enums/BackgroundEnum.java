package com.liraneto.controller.enums;

import com.liraneto.model.xml.elementosType.ElementoWindowReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum BackgroundEnum {

    BARKEEP("Barkeep", new ElementoWindowReference("reference_background", "reference.backgrounds.barkeep@Pathfinder Second Edition Core Rules")),

    BACKGROUND_NOT_FOUND()

    ;

    private String name;

    private ElementoWindowReference windowReference;

    public static BackgroundEnum getBackgoundEnum (String name){
        for (BackgroundEnum backgroundEnum : BackgroundEnum.values()){
            if (backgroundEnum.getName().equalsIgnoreCase(name))
                return backgroundEnum;
        }

        return BACKGROUND_NOT_FOUND;
    }
}
