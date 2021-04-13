package com.liraneto.model.xml.character.attackBonus;

import com.liraneto.model.xml.elementosType.ElementoNumber;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
public class AttackType {
    @XmlElement(name = "abilitymod ")
    private ElementoNumber abilityMod;

    private ElementoNumber misc;

    private ElementoNumber size;

    private ElementoNumber temporary;

    private ElementoNumber total;

    public AttackType(Object abilityMod, Object misc, Object size, Object temporary, Object total) {
        if (abilityMod != null) this.abilityMod = new ElementoNumber(abilityMod);
        if (misc != null) this.misc = new ElementoNumber(misc);
        if (size != null) this.size = new ElementoNumber(size);
        if (temporary != null) this.temporary = new ElementoNumber(temporary);
        if (total != null) this.total = new ElementoNumber(total);
    }
}
