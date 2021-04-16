package com.liraneto.model.xml.character.traitList;

import com.liraneto.model.xml.elementosType.ElementoFormattedText;
import com.liraneto.model.xml.elementosType.ElementoNumber;
import com.liraneto.model.xml.elementosType.ElementoString;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "trait")
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

    @Override
    public String toString() {
        return name.toString()
                .toUpperCase()
                .replace("\"", "")
                .replace(" ", "_")
                .replace("'", "")
                .replace("HERITAGE_-_", "") + "(" +
                levelApplied + ", " +
                locked + ", " +
                name + ", " +
                source + ", " +
                text +
                "),\n";
    }
}
