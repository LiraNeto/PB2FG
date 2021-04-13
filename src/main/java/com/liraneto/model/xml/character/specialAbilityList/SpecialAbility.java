package com.liraneto.model.xml.character.specialAbilityList;

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
public class SpecialAbility {
    @XmlElement(name = "classname")
    private ElementoString className;

    private ElementoNumber level;

    @XmlElement(name = "level_applied")
    private ElementoNumber levelApplied;

    private ElementoNumber locked;

    private ElementoString name;

    private ElementoFormattedText requirements;

    private ElementoString source;

    private ElementoFormattedText text;

    public SpecialAbility(Object className, Object level, Object levelApplied, Object locked, Object name,
                          Object requirements, Object source, Object text) {
        if (className != null) this.className = new ElementoString(className);
        if (level != null) this.level = new ElementoNumber(level);
        if (levelApplied != null) this.levelApplied = new ElementoNumber(levelApplied);
        if (locked != null) this.locked = new ElementoNumber(locked);
        if (name != null) this.name = new ElementoString(name);
        if (requirements != null) this.requirements = new ElementoFormattedText(requirements);
        if (source != null) this.source = new ElementoString(source);
        if (text != null) this.text = new ElementoFormattedText(text);
    }
}
