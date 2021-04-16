package com.liraneto.controller.enums;

import com.liraneto.model.xml.character.specialAbilityList.SpecialAbility;
import com.liraneto.model.xml.character.traitList.Trait;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum HeritageAbilityEnum {
    SKILLED_HERITAGE("1", "1", "Heritage - Skilled Heritage", "Human",
            "<p>Your ingenuity allows you to train in a wide variety of skills.</p><p>You become trained in one" +
                    " skill of your choice.At 5th level, you become an expert in the chosen skill.</p>"),

    HERITAGE_ABILITY_NOT_FOUND();

    private String levelApplied;

    private String locked;

    private String name = "";

    private String source;

    private String text;

    public Trait getTrait(){
        if (this != HERITAGE_ABILITY_NOT_FOUND) {
            return new Trait(levelApplied, locked, name, source, text);
        } else {
            return null;
        }
    }

    public static HeritageAbilityEnum getHeritageAbilityEnum(String name){
        for (HeritageAbilityEnum heritageAbilityEnum : HeritageAbilityEnum.values()){
            if (heritageAbilityEnum.getName().equalsIgnoreCase("Heritage - " + name))
                return heritageAbilityEnum;
        }
        return HERITAGE_ABILITY_NOT_FOUND;
    }
}
