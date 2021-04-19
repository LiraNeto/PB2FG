package com.liraneto.model.xml.character.spellSet.SpellPerLevel.actionsList;

import com.liraneto.model.xml.elementosType.ElementoDice;
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
public class Action {
    private ElementoNumber bonus;

    private ElementoDice dice;

    @XmlElement(name = "dicestat")
    private ElementoString diceStat;

    @XmlElement(name = "dicestatmax")
    private ElementoNumber diceStatMax;

    @XmlElement(name = "statmax")
    private ElementoNumber statMax;

    @XmlElement(name = "statmult")
    private ElementoNumber statMult;

    private ElementoString type;

    public Action(Object bonus, Object dice, Object stat, Object diceStatMax, Object statMax, Object statMult, Object type) {
        if (bonus != null) this.bonus = new ElementoNumber(bonus);
        if (dice != null) this.dice = new ElementoDice(dice);
        if (stat != null) this.diceStat = new ElementoString(stat);
        if (diceStatMax != null) this.diceStatMax = new ElementoNumber(diceStatMax);
        if (statMax != null) this.statMax = new ElementoNumber(statMax);
        if (statMult != null) this.statMult = new ElementoNumber(statMult);
        if (type != null) this.type = new ElementoString(type);
    }

    @Override
    public String toString() {
        return "new Action(" +
                bonus + ", " +
                dice + ", " +
                diceStat + ", " +
                diceStatMax + ", " +
                statMax + ", " +
                statMult + ", " +
                "), ";
    }
}
