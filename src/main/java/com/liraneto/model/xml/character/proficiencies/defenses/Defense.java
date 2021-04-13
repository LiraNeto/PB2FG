package com.liraneto.model.xml.character.proficiencies.defenses;

import com.liraneto.model.xml.elementosType.ElementoNumber;
import com.liraneto.model.xml.elementosType.ElementoString;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
public class Defense {
    private ElementoString name;

    private ElementoNumber prof;

    @XmlElement(name = "proflevel")
    private ElementoString profLevel;

    public Defense(String name, String prof, String profLevel) {
        if (name != null) this.name = new ElementoString(name);
        if (prof != null) this.prof = new ElementoNumber(prof);
        if (profLevel != null) this.profLevel = new ElementoString(profLevel);
    }
}
