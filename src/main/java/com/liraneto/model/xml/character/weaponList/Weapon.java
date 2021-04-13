package com.liraneto.model.xml.character.weaponList;

import com.liraneto.model.xml.elementosType.ElementoNumber;
import com.liraneto.model.xml.elementosType.ElementoString;
import com.liraneto.model.xml.elementosType.ElementoWindowReference;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@NoArgsConstructor
public class Weapon {

    private ElementoNumber attacks;

    private ElementoNumber bonus;

    @XmlElement(name = "critatkrange")
    private ElementoNumber critAtkRange;

    @XmlElement(name = "damagelist")
    private DamageList damageList;

    @XmlElement(name = "isidentified")
    private ElementoNumber isIdentified;

    private ElementoString name;

    private ElementoWindowReference shortcut;

    private ElementoString traits;

    private ElementoNumber type;

    public Weapon(Object attacks, Object bonus, Object critAtkRange, DamageList damageList, Object isIdentified,
                  Object name, ElementoWindowReference shortcut, Object traits, Object type) {
        if (attacks != null) this.attacks = new ElementoNumber(attacks);
        if (bonus != null) this.bonus = new ElementoNumber(bonus);
        if (critAtkRange != null) this.critAtkRange = new ElementoNumber(critAtkRange);
        this.damageList = damageList;
        if (isIdentified != null) this.isIdentified = new ElementoNumber(isIdentified);
        if (name != null) this.name = new ElementoString(name);
        this.shortcut = shortcut;
        if (traits != null) this.traits = new ElementoString(traits);
        if (type != null) this.type = new ElementoNumber(type);
    }
}
