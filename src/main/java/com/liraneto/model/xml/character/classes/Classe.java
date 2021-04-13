package com.liraneto.model.xml.character.classes;

import com.liraneto.model.xml.elementosType.ElementoNumber;
import com.liraneto.model.xml.elementosType.ElementoString;
import com.liraneto.model.xml.elementosType.ElementoWindowReference;
import lombok.Getter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@Getter
public class Classe {

    private ElementoNumber level;
    private ElementoString name;
    private ElementoWindowReference shortcut;

    public Classe(int level, String name, String shortcut) {
        this.level = new ElementoNumber(level);
        this.name = new ElementoString(name);
        this.shortcut = new ElementoWindowReference("referenceclass", shortcut);
    }
}
