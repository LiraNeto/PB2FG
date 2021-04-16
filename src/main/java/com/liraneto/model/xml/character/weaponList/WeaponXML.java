package com.liraneto.model.xml.character.weaponList;

import com.liraneto.model.xml.elementosType.ElementoNumber;
import com.liraneto.model.xml.elementosType.ElementoString;
import com.liraneto.model.xml.elementosType.ElementoWindowReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
public class WeaponXML {

    private ElementoNumber ammo;

    private ElementoNumber attacks;

    @XmlElement(name = "attackstat")
    private ElementoString attackStat;

    private ElementoNumber bonus;

    private ElementoNumber carried;

    @XmlElement(name = "critatkrange")
    private ElementoNumber critAtkRange;

    @XmlElement(name = "damagelist")
    private DamageList damageList;

    @XmlElement(name = "isidentified")
    private ElementoNumber isIdentified;

    @XmlElement(name = "maxammo")
    private ElementoNumber maxAmmo;

    private ElementoString name;

    private ElementoNumber prof;

    @XmlElement(name = "proflevel")
    private ElementoString profLevel;

    private ElementoWindowReference shortcut;

    private ElementoString traits;

    private ElementoNumber type;

    public WeaponXML(Object ammo, Object attacks, Object attackStat, Object bonus, Object carried, Object critAtkRange,
                     DamageList damageList, Object isIdentified, Object maxAmmo, Object name, Object prof,
                     Object profLevel, ElementoWindowReference shortcut, Object traits, Object type) {
        if (ammo != null) this.ammo = new ElementoNumber(ammo);
        if (attacks != null) this.attacks = new ElementoNumber(attacks);
        if (attackStat != null) this.attackStat = new ElementoString(attackStat);
        if (bonus != null) this.bonus = new ElementoNumber(bonus);
        if (carried != null) this.carried = new ElementoNumber(carried);
        if (critAtkRange != null) this.critAtkRange = new ElementoNumber(critAtkRange);
        this.damageList = damageList;
        if (isIdentified != null) this.isIdentified = new ElementoNumber(isIdentified);
        if (maxAmmo != null) this.maxAmmo = new ElementoNumber(maxAmmo);
        if (name != null) this.name = new ElementoString(name);
        if (prof != null) this.prof = new ElementoNumber(prof);
        if (profLevel != null) this.profLevel = new ElementoString(profLevel);
        this.shortcut = shortcut;
        if (traits != null) this.traits = new ElementoString(traits);
        if (type != null) this.type = new ElementoNumber(type);
    }
}
