package com.liraneto.controller.enums;

import com.liraneto.controller.enums.ItemEnum.ItemEnum;
import com.liraneto.model.xml.character.inventoryList.Item;
import com.liraneto.model.xml.character.specialAbilityList.SpecialAbility;
import com.liraneto.model.xml.elementosType.ElementoFormattedText;
import com.liraneto.model.xml.elementosType.ElementoNumber;
import com.liraneto.model.xml.elementosType.ElementoString;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlElement;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum ClassAbilitiyEnum {
    ATTACK_OF_OPPORTUNITY("Fighter", "1", "1", "1", "Attack Of Opportunity", "<p></p>", "Fighter", "<p>Ever watchful for weaknesses, you can quickly attack foes that leave an opening in their defenses. You gain the Attack of Opportunity reaction.</p><p><b>Attack of Opportunity </b></p><p><b>Trigger </b>A creature within your reach uses a manipulate action or a move action, makes a ranged attack, or leaves a square during a move action it's using.</p><p>You lash out at a foe that leaves an opening. Make a melee Strike against the triggering creature. If your attack is a critical hit and the trigger was a manipulate action, you disrupt that action. This Strike doesn't count toward your multiple attack penalty, and your multiple attack penalty doesn't apply to this Strike.</p>"),

    CLASS_ABILITIY_NOT_FOUND()

    ;

    private String className;

    private String level;

    private String levelApplied;

    private String locked;

    private String name = "";

    private String requirements;

    private String source;

    private String text;

    public SpecialAbility getSpecialAbility(){
        if (this != CLASS_ABILITIY_NOT_FOUND) {
            return new SpecialAbility(className, level, levelApplied, locked, name, requirements, source, text);
        } else {
            return null;
        }
    }

    public static ClassAbilitiyEnum getClassAbilitiyEnum(String name){
        for (ClassAbilitiyEnum classAbilitiyEnum : ClassAbilitiyEnum.values()){
            if (classAbilitiyEnum.getName().equalsIgnoreCase(name))
                return classAbilitiyEnum;
        }
        return CLASS_ABILITIY_NOT_FOUND;
    }
}
