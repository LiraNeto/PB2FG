package com.liraneto.model.xml.traitList;

import com.liraneto.model.xml.elementosType.ElementoFormattedText;
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
public class Trait {
    @XmlElement(name = "level_applied")
    private ElementoNumber levelApplied;

    private ElementoNumber locked;

    private ElementoString name;

    private ElementoString source;

    private ElementoFormattedText text;

    public Trait(Object levelApplied, Object locked, Object name, Object source, Object text) {
        if (levelApplied != null) this.levelApplied = new ElementoNumber(levelApplied);
        if (locked != null) this.locked = new ElementoNumber(locked);
        if (name != null) this.name = new ElementoString(name);
        if (source != null) this.source = new ElementoString(source);
        if (text != null) this.text = new ElementoFormattedText(text);
    }
}
