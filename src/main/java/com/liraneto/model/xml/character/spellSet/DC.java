package com.liraneto.model.xml.character.spellSet;

import com.liraneto.model.xml.elementosType.ElementoNumber;
import com.liraneto.model.xml.elementosType.ElementoString;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
public class DC {
    private ElementoString ability;

    @XmlElement(name = "abilitymod")
    private ElementoNumber abilityMod;
    
    private ElementoNumber item;
    
    private ElementoNumber misc;
    
    private ElementoNumber prof;

    @XmlElement(name = "proflevel")
    private ElementoString profLevel;
    
    private ElementoNumber roll;

    @XmlElement(name = "rolltempmod")
    private ElementoNumber rollTempMod;

    @XmlElement(name = "tempmod")
    private ElementoNumber tempMod;
    
    private ElementoNumber total;

    public DC(Object ability, Object abilityMod, Object item, Object misc, Object prof, Object roll, Object rollTempMod,
              Object tempMod, Object total) {
        if (ability != null) this.ability = new ElementoString(ability);
        if (abilityMod != null) this.abilityMod = new ElementoNumber(abilityMod);
        if (item != null) this.item = new ElementoNumber(item);
        if (misc != null) this.misc = new ElementoNumber(misc);
        if (prof != null) this.prof = new ElementoNumber(prof);
        if (profLevel != null) this.profLevel = new ElementoString(profLevel);
        if (roll != null) this.roll = new ElementoNumber(roll);
        if (rollTempMod != null) this.rollTempMod = new ElementoNumber(rollTempMod);
        if (tempMod != null) this.tempMod = new ElementoNumber(tempMod);
        if (total != null) this.total = new ElementoNumber(total);
    }

    @Override
    public String toString() {
        return "new DC( " +
                ability + ", " +
                abilityMod + ", " +
                item + ", " +
                misc + ", " +
                prof + ", " +
                profLevel + ", " +
                roll + ", " +
                rollTempMod + ", " +
                tempMod + ", " +
                total +
                ");";
    }
}
