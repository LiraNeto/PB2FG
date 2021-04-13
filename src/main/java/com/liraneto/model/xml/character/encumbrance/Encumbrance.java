package com.liraneto.model.xml.character.encumbrance;

import com.liraneto.model.xml.elementosType.ElementoNumber;
import lombok.Getter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
@Getter
public class Encumbrance {

    @XmlElement(name="armorcheckpenalty")
    private ElementoNumber armorCheckPenalty;

    @XmlElement(name="armormaxstatbonus")
    private ElementoNumber armorMaxStatBonus;

    @XmlElement(name="armormaxstatbonusactive")
    private ElementoNumber armorMaxStatBonusActive;

    private ElementoNumber limit;

    private ElementoNumber load;

    @XmlElement(name="nopenalty")
    private ElementoNumber noPenalty;

    @XmlElement(name="speedpenalty")
    private ElementoNumber speedPenalty;

    public Encumbrance(Object armorCheckPenalty, Object armorMaxStatBonus, Object armorMaxStatBonusActive, Object limit,
                       Object load, Object noPenalty, Object speedPenalty) {

        if (armorCheckPenalty != null) this.armorCheckPenalty = new ElementoNumber (armorCheckPenalty);
        if (armorMaxStatBonus != null) this.armorMaxStatBonus = new ElementoNumber (armorMaxStatBonus);
        if (armorMaxStatBonusActive != null) this.armorMaxStatBonusActive = new ElementoNumber (armorMaxStatBonusActive);
        if (limit != null) this.limit = new ElementoNumber (limit);
        if (load != null) this.load = new ElementoNumber (load);
        if (noPenalty != null) this.noPenalty = new ElementoNumber (noPenalty);
        if (speedPenalty != null) this.speedPenalty = new ElementoNumber (speedPenalty);
    }
}
