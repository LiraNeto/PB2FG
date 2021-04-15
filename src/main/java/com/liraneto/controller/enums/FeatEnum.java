package com.liraneto.controller.enums;

import com.liraneto.model.xml.character.featList.Feat;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum FeatEnum {
    HOBNOBBER(null, "<p>You are skilled at learning information through conversation. The Gather " +
            "Information exploration activity takes you half as long as normal (typically reducing the time to 1 " +
            "hour). If you're a master in Diplomacy and you Gather Information at the normal speed, when you attempt " +
            "to do so and roll a critical failure, you get a failure instead. There is still no guarantee that a rumor " +
            "you learn with Gather Information is accurate.</p>", "corerules", 1, 1, 1,
            "Hobnobber", "trained in Diplomacy", "Gather Information rapidly",
            "GENERAL SKILL", null),

    SHIELD_BLOCK("reaction", "<p>You snap your shield in place to ward off a blow. Your shield " +
            "prevents you from taking an amount of damage up to the shield's Hardness. You and the shield each take " +
            "any remaining damage, possibly breaking or destroying the shield.</p>", "corerules", 1,
            1, 1, "Shield Block", null, "Ward off a blow with your shield",
            "GENERAL", "While you have your shield raised, you would take damage from a physical attack."),

    FEAT_NOT_FOUND()

    ;

    private String action;

    private String effectsBenefits;

    private String filterCategory;

    private int level;

    private int levelApplied;

    private int locked;

    private String name;

    private String preRequisites;

    private String shortBenefits;

    private String traits;

    private String trigger;

    public Feat getFeat(){
        return new Feat(action, effectsBenefits, filterCategory, level, levelApplied, locked, name, preRequisites,
                shortBenefits, traits, trigger);
    }

    public static FeatEnum getFeatEnum(String name){
        for (FeatEnum featEnum : FeatEnum.values()){
            if (featEnum.getName().equals(name))
                return featEnum;
        }

        return FEAT_NOT_FOUND;
    }
}
