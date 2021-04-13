package com.liraneto.model.xml.character.ac;

import com.liraneto.model.xml.elementosType.ElementoNumber;
import com.liraneto.model.xml.elementosType.ElementoString;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
@NoArgsConstructor
@Data
public class Sources {
    @XmlElement(name = "abilitymod")
    private ElementoNumber abilityMod;

    @XmlElement(name = "acitem")
    private ElementoNumber acItem;

    @XmlElement(name = "acmisc")
    private ElementoNumber acMisc;

    @XmlElement(name = "acshieldactive")
    private ElementoNumber acShieldActive;

    private ElementoNumber armor;

    private ElementoNumber prof;

    @XmlElement(name = "proflevel")
    private ElementoString profLevel;

    private ElementoNumber shield;

    @XmlElement(name = "shieldraised")
    private ElementoNumber shieldRaised;

    private ElementoNumber size;

    private ElementoNumber temporary;

    public Sources(Object abilityMod, Object acItem, Object acMisc, Object acShieldActive, Object armor, Object prof, Object profLevel,
                   Object shield, Object shieldRaised, Object size, Object temporary) {
        if (abilityMod != null) this.abilityMod = new ElementoNumber(abilityMod);
        if (acItem != null) this.acItem = new ElementoNumber(acItem);
        if (acMisc != null) this.acMisc = new ElementoNumber(acMisc);
        if (acShieldActive != null) this.acShieldActive = new ElementoNumber(acShieldActive);
        if (armor != null) this.armor = new ElementoNumber(armor);
        if (prof != null) this.prof = new ElementoNumber(prof);
        if (profLevel != null) this.profLevel = new ElementoString(profLevel);
        if (shield != null) this.shield = new ElementoNumber(shield);
        if (shieldRaised != null) this.shieldRaised = new ElementoNumber(shieldRaised);
        if (size != null) this.size = new ElementoNumber(size);
        if (temporary != null) this.temporary = new ElementoNumber(temporary);
    }
}
