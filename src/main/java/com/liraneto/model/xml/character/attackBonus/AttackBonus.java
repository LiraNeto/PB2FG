package com.liraneto.model.xml.character.attackBonus;

import com.liraneto.model.xml.elementosType.ElementoNumber;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
public class AttackBonus {
    private ElementoNumber base;

    private AttackType grapple;

    private AttackType melee;

    private AttackType ranged;

    public AttackBonus(Object base, AttackType grapple, AttackType melee, AttackType ranged) {
        if (base != null) this.base = new ElementoNumber(base);
        this.grapple = grapple;
        this.melee = melee;
        this.ranged = ranged;
    }
}
