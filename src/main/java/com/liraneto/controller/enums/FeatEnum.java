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
            "you learn with Gather Information is accurate.</p>", "corerules", "1", "1", "1",
            "Hobnobber", "trained in Diplomacy", "Gather Information rapidly",
            "GENERAL SKILL", null),

    SHIELD_BLOCK("reaction", "<p>You snap your shield in place to ward off a blow. Your shield " +
            "prevents you from taking an amount of damage up to the shield's Hardness. You and the shield each take " +
            "any remaining damage, possibly breaking or destroying the shield.</p>", "corerules", "1",
            "1", "1", "Shield Block", null, "Ward off a blow with your shield",
            "GENERAL", "While you have your shield raised, you would take damage from a physical attack."),

    GENERAL_TRAINING(null, "<p>Your adaptability manifests in your mastery of a range of useful" +
            " abilities. You gain a 1st-level general feat. You must meet the feat's prerequisites, but if you select" +
            " this feat during character creation, you can select the feat later in the process in order to determine" +
            " which prerequisites you meet.</p><p><b>Special </b>You can select this feat multiple times, choosing a" +
            " different feat each time.</p>", "coreruleshuman", "1", "1", "1",
            "General Training", null, null, "HUMAN", null),

    ALCHEMICAL_CRAFTING(null, "<p>You can use the Craft activity to create alchemical items." +
            " When you select this feat, you immediately add the formulas for four common 1st-level alchemical items" +
            " to your formula book.</p>", "corerules", "1", "1", "1",
            "Alchemical Crafting", "trained in Crafting", "Craft alchemical items",
            "GENERAL SKILL", null),

    DOUBLE_SLICE("2actions", "<p>You lash out at your foe with both weapons. Make two Strikes," +
            " one with each of your two melee weapons, each using your current multiple attack penalty. Both Strikes" +
            " must have the same target. If the second Strike is made with a weapon that doesn't have the agile trait," +
            " it takes a -2 penalty.</p><p>If both attacks hit, combine their damage, and then add any other applicable" +
            " effects from both weapons. You add any precision damage only once, to the attack of your choice. Combine" +
            " the damage from both Strikes and apply resistances and weaknesses only once. This counts as two attacks" +
            " when calculating your multiple attack penalty.</p>", "corerulesfighter", "1",
            "1", "1", "Double Slice", null, null,
            "FIGHTER", null),

    FEAT_NOT_FOUND("")

    ;

    private String action;

    private String effectsBenefits;

    private String filterCategory;

    private String level;

    private String levelApplied;

    private String locked;

    private String name;

    private String preRequisites;

    private String shortBenefits;

    private String traits;

    private String trigger;

    public Feat getFeat(){
        if (this != FEAT_NOT_FOUND) {
            return new Feat(action, effectsBenefits, filterCategory, level, levelApplied, locked, name, preRequisites,
                    shortBenefits, traits, trigger);
        } else {
            return null;

        }
    }

    public static FeatEnum getFeatEnum(String name){
        for (FeatEnum featEnum : FeatEnum.values()){
            if (featEnum.getName().equals(name))
                return featEnum;
        }

        return FEAT_NOT_FOUND;
    }

    private FeatEnum (String name){
        this.name = name;
    }
}
