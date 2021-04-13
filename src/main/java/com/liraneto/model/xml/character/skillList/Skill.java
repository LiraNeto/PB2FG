package com.liraneto.model.xml.character.skillList;

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
public class Skill {
    @XmlElement(name = "armorcheckmultiplier")
    private ElementoNumber armorCheckMultiplier;

    private ElementoString label;

    private ElementoNumber misc;

    private ElementoNumber prof;

    @XmlElement(name = "proflevel")
    private ElementoString profLevel;

    @XmlElement(name = "showonminisheet")
    private ElementoNumber showOnMiniSheet;

    private ElementoNumber stat;

    private ElementoNumber state;

    @XmlElement(name = "statname")
    private ElementoString statName;

    @XmlElement(name = "sublabel")
    private ElementoString subLabel;

    private ElementoNumber total;

    public Skill(Object armorCheckMultiplier, Object label, Object misc, Object prof,
                 Object profLevel, Object showOnMiniSheet, Object stat, Object state,
                 Object statName, Object subLabel, Object total) {
        if (armorCheckMultiplier != null) this.armorCheckMultiplier = new ElementoNumber(armorCheckMultiplier);
        if (label != null) this.label = new ElementoString(label);
        if (misc != null) this.misc = new ElementoNumber(misc);
        if (prof != null) this.prof = new ElementoNumber(prof);
        if (profLevel != null) this.profLevel = new ElementoString(profLevel);
        if (showOnMiniSheet != null) this.showOnMiniSheet = new ElementoNumber(showOnMiniSheet);
        if (stat != null) this.stat = new ElementoNumber(stat);
        if (state != null) this.state = new ElementoNumber(state);
        if (statName != null) this.statName = new ElementoString(statName);
        if (subLabel != null) this.subLabel = new ElementoString(subLabel);
        if (total != null) this.total = new ElementoNumber(total);
    }
}
