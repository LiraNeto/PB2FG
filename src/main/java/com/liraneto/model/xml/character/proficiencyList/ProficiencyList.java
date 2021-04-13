package com.liraneto.model.xml.character.proficiencyList;

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
public class ProficiencyList {
    @XmlTransient
    private Integer id = 1;

    @XmlAnyElement
    List<JAXBElement<Proficiency>> proficiencyList = new ArrayList<>();

    public void putEntry(Proficiency value){
        String key = "id-" + String.format("%05d", id++);
        proficiencyList.add(new JAXBElement<Proficiency>(new QName(key), Proficiency.class, value));
    }
}
