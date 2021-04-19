package com.liraneto.model.xml.character.spellSet.SpellPerLevel.actionsList;

import com.liraneto.model.xml.elementosType.ElementoDice;
import com.liraneto.model.xml.elementosType.ElementoNumber;
import com.liraneto.model.xml.elementosType.ElementoString;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;


@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "id")
@Data
@NoArgsConstructor
public class Action {
    @XmlElement(name = "dmaxstat")
    private ElementoNumber atkMod;

    @XmlElement(name = "damagelist")
    private HealDamageList damageList;

    @XmlElement(name = "dmaxstat")
    private ElementoNumber dMaxStat;

    @XmlElement(name = "dmgnotspell")
    private ElementoNumber dmgNotSpell;

	@XmlElement(name = "durdice")
    private ElementoDice durDice;

	@XmlElement(name = "durdicestatmax")
    private ElementoNumber durDiceStatMax;

	@XmlElement(name = "durmod")
    private ElementoNumber durMod;

	@XmlElement(name = "durmult")
    private ElementoString durMult;

	@XmlElement(name = "durunit")
    private ElementoString durUnit;

    @XmlElement(name = "heallist")
    private HealDamageList healList;

    private ElementoString label;

    @XmlElement(name = "onmissdamage")
    private ElementoString onMissDamage;

    @XmlElement(name = "savedcmod")
    private ElementoNumber savedCMod;

    @XmlElement(name = "savetype")
    private ElementoString saveType;

    private ElementoString targeting;

    private ElementoString type;

    public Action(Object atkMod, List<HealDamage> damageList, Object dMaxStat, Object dmgNotSpell, Object durDice, Object durDiceStatMax,
                  Object durMod, Object durMult, Object durUnit, List<HealDamage> healList, Object label, Object onMissDamage, Object savedCMod,
                  Object saveType, Object targeting, Object type) {
        if (atkMod != null) this.atkMod = new ElementoNumber(atkMod);
        if (damageList != null && !damageList.isEmpty()) this.damageList = new HealDamageList(damageList);
        if (dMaxStat != null) this.dMaxStat = new ElementoNumber(dMaxStat);
        if (dmgNotSpell != null) this.dmgNotSpell = new ElementoNumber(dmgNotSpell);
        if (durDice != null) this.durDice = new ElementoDice(durDice);
        if (durDiceStatMax != null) this.durDiceStatMax = new ElementoNumber(durDiceStatMax);
        if (durMod != null) this.durMod = new ElementoNumber(durMod);
        if (durMult != null) this.durMult = new ElementoString(durMult);
        if (durUnit != null) this.durUnit = new ElementoString(durUnit);
        if (healList != null && !healList.isEmpty()) this.healList = new HealDamageList(healList);
        if (label != null) this.label = new ElementoString(label);
        if (onMissDamage != null) this.onMissDamage = new ElementoString(onMissDamage);
        if (savedCMod != null) this.savedCMod = new ElementoNumber(savedCMod);
        if (saveType != null) this.saveType = new ElementoString(saveType);
        if (targeting != null) this.targeting = new ElementoString(targeting);
        if (type != null) this.type = new ElementoString(type);
    }

    public void damageListPutEntry (HealDamage entry){
        if (this.damageList == null){
            this.damageList = new HealDamageList();
        }

        this.damageList.putEntry(entry);
    }

    public void healListPutEntry (HealDamage entry){
        if (this.healList == null){
            this.healList = new HealDamageList();
        }

        this.healList.putEntry(entry);
    }

    @Override
    public String toString() {
        return "new Action( " +
                atkMod + ", " +
                damageList + ", " +
                dMaxStat + ", " +
                dmgNotSpell + ", " +
                durDice + ", " +
                durDiceStatMax + ", " +
                durMod + ", " +
                durMult + ", " +
                durUnit + ", " +
                healList + ", " +
                label + ", " +
                onMissDamage + ", " +
                savedCMod + ", " +
                saveType + ", " +
                targeting + ", " +
                type +
                "), ";
    }
}
