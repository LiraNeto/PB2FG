package com.liraneto.model.xml.character.weaponList;

import com.liraneto.model.xml.elementosType.ElementoDice;
import com.liraneto.model.xml.elementosType.ElementoNumber;
import com.liraneto.model.xml.elementosType.ElementoString;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@NoArgsConstructor
public class Damage {
    private ElementoNumber bonus;

    @XmlElement(name = "critmult")
    private ElementoNumber critMult;

    private ElementoDice dice;

    private ElementoString stat;

    private ElementoString type;

    public Damage(Object bonus, Object critMult, Object dice, Object stat, Object type) {
        if (bonus != null) this.bonus = new ElementoNumber(bonus);
        if (critMult != null) this.critMult = new ElementoNumber(critMult);
        if (dice != null) this.dice = new ElementoDice(dice);
        if (stat != null) this.stat = new ElementoString(stat);
        if (type != null) this.type = new ElementoString(type);
    }
}