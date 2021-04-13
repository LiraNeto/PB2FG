package com.liraneto.model.xml.character.proficiencies.defenses;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@NoArgsConstructor
public class DefensesList {
    @XmlTransient
    private Integer id = 1;

    @XmlAnyElement
    List<JAXBElement<Defense>> defenseList = new ArrayList<>();

    public void putEntry(Defense value){
        String key = "id-" + String.format("%05d", id++);
        defenseList.add(new JAXBElement<Defense>(new QName(key), Defense.class, value));
    }
}
