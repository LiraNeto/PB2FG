package com.liraneto.model.xml.character.speed;

import com.liraneto.model.xml.elementosType.ElementoNumber;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@NoArgsConstructor
public class Speed {

    private ElementoNumber armor;

    private ElementoNumber base;

    @XmlElement(name = "final")
    private ElementoNumber _final;

    private ElementoNumber misc;

    private ElementoNumber temporary;

    private ElementoNumber total;

    public Speed(Object armor, Object base, Object _final, Object misc, Object temporary, Object total) {
        if (armor != null) this.armor = new ElementoNumber(armor);
        if (base != null) this.base = new ElementoNumber(base);
        if (_final != null) this._final = new ElementoNumber(_final);
        if (misc != null) this.misc = new ElementoNumber(misc);
        if (temporary != null) this.temporary = new ElementoNumber(temporary);
        if (total != null) this.total = new ElementoNumber(total);
    }
}
