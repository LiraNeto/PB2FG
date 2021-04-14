package com.liraneto.controller.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

import java.util.Arrays;
import java.util.List;

@Getter
@AllArgsConstructor
public enum AncestryEnum {

    HUMAN ("Human", 0, Arrays.asList("Human", "Humanoid")),

    ANCESTRY_NOT_FOUND ("ANCESTRY_NOT_FOUND", 0, null);

    private String name;

    private int size;

    private List<String> traits;

    public static AncestryEnum getAncestry (String name){
        for (AncestryEnum ancestryEnum : AncestryEnum.values()){
            if (ancestryEnum.getName().equals(name))
                return ancestryEnum;
        }
        return ANCESTRY_NOT_FOUND;
    }
}
