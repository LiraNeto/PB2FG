package com.liraneto.model.xml.character.inventoryList;

import com.liraneto.model.xml.elementosType.ElementoFormattedText;
import com.liraneto.model.xml.elementosType.ElementoNumber;
import com.liraneto.model.xml.elementosType.ElementoString;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
@XmlRootElement(name = "item")
@NoArgsConstructor
public class Item {

    private ElementoNumber ac;

    @XmlElement(name = "acspecial")
    private ElementoNumber acSpecial;

    @XmlElement(name = "armorstrength")
    private ElementoNumber armorStrength;

    private ElementoNumber bonus;

    private ElementoString bulk;

    private ElementoNumber carried;

    @XmlElement(name = "checkpenalty")
    private ElementoNumber checkPenalty;

    private ElementoString cost;

    private ElementoNumber count;

    private ElementoString damage;

    @XmlElement(name = "damagetype")
    private ElementoString damageType;

    private ElementoFormattedText description;

    @XmlElement(name = "gmnotes")
    private ElementoFormattedText gmNotes;

    private ElementoString group;

    private ElementoString hands;

    private ElementoNumber hardness;

    @XmlElement(name = "isidentified")
    private ElementoNumber isIdentified;

    @XmlElement(name = "itembt")
    private ElementoNumber itemBT;

    @XmlElement(name = "itemhp")
    private ElementoNumber itemHP;

    private ElementoNumber level;

    private ElementoNumber locked;

    @XmlElement(name = "maxstatbonus")
    private ElementoNumber maxStatBonus;

    private ElementoString name;

    @XmlElement(name = "pfslegal")
    private ElementoString pfsLegal;

    private ElementoNumber range;

    private ElementoNumber reload;

    @XmlElement(name = "showonminisheet")
    private ElementoNumber showOnMiniSheet;

    @XmlElement(name = "speedpenalty")
    private ElementoNumber speedPenalty;

    @XmlElement(name = "subtype")
    private ElementoString subType;

    private ElementoString traits;

    private ElementoString type;

    private ElementoNumber weight;

    public Item(Object ac, Object acSpecial, Object armorStrength, Object bonus, Object bulk, Object carried, Object checkPenalty,
                Object cost, Object count, Object damage, Object damageType, Object description, Object gmNotes,
                Object group, Object hands, Object hardness, Object isIdentified, Object itemBT, Object itemHP, Object level,
                Object locked, Object maxStatBonus, Object name, Object pfsLegal, Object range, Object reload, Object showOnMiniSheet,
                Object speedPenalty, Object subType, Object traits, Object type, Object weight) {
        if (ac != null) this.ac = new ElementoNumber(ac);
        if (acSpecial != null) this.acSpecial = new ElementoNumber(acSpecial);
        if (armorStrength != null) this.armorStrength = new ElementoNumber(armorStrength);
        if (bonus != null) this.bonus = new ElementoNumber(bonus);
        if (bulk != null) this.bulk = new ElementoString(bulk);
        if (carried != null) this.carried = new ElementoNumber(carried);
        if (checkPenalty != null) this.checkPenalty = new ElementoNumber(checkPenalty);
        if (cost != null) this.cost = new ElementoString(cost);
        if (count != null) this.count = new ElementoNumber(count);
        if (damage != null) this.damage = new ElementoString(damage);
        if (damageType != null) this.damageType = new ElementoString(damageType);
        if (description != null) this.description = new ElementoFormattedText(description);
        if (gmNotes != null) this.gmNotes = new ElementoFormattedText(gmNotes);
        if (group != null) this.group = new ElementoString(group);
        if (hands != null) this.hands = new ElementoString(hands);
        if (hardness != null) this.hardness = new ElementoNumber(hardness);
        if (isIdentified != null) this.isIdentified = new ElementoNumber(isIdentified);
        if (itemBT != null) this.itemBT = new ElementoNumber(itemBT);
        if (itemHP != null) this.itemHP = new ElementoNumber(itemHP);
        if (level != null) this.level = new ElementoNumber(level);
        if (locked != null) this.locked = new ElementoNumber(locked);
        if (maxStatBonus != null) this.maxStatBonus = new ElementoNumber(maxStatBonus);
        if (name != null) this.name = new ElementoString(name);
        if (pfsLegal != null) this.pfsLegal = new ElementoString(pfsLegal);
        if (range != null) this.range = new ElementoNumber(range);
        if (reload != null) this.reload = new ElementoNumber(reload);
        if (showOnMiniSheet != null) this.showOnMiniSheet = new ElementoNumber(showOnMiniSheet);
        if (speedPenalty != null) this.speedPenalty = new ElementoNumber(speedPenalty);
        if (subType != null) this.subType = new ElementoString(subType);
        if (traits != null) this.traits = new ElementoString(traits);
        if (type != null) this.type = new ElementoString(type);
        if (weight != null) this.weight = new ElementoNumber(weight);
    }

    @Override
    public String toString() {
        return name.toString()
                .toUpperCase()
                .replace("\"", "")
                .replace(" ", "_")
                .replace("'", "") + "(" +
                ac + ", " +
                acSpecial + ", " +
                armorStrength + ", " +
                bonus + ", " +
                bulk + ", " +
                carried + ", " +
                checkPenalty + ", " +
                cost + ", " +
                count + ", " +
                damage + ", " +
                damageType + ", " +
                description + ", " +
                gmNotes + ", " +
                group + ", " +
                hands + ", " +
                hardness + ", " +
                isIdentified + ", " +
                itemBT + ", " +
                itemHP + ", " +
                level + ", " +
                locked + ", " +
                maxStatBonus + ", " +
                name + ", " +
                pfsLegal + ", " +
                range + ", " +
                reload + ", " +
                showOnMiniSheet + ", " +
                speedPenalty + ", " +
                subType + ", " +
                traits + ", " +
                type + ", " +
                weight +
                "),\n";
    }
}
