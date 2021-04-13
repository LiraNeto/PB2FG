package com.liraneto.model.xml.character.specialAbilityList;

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
public class SpecialAbilityList {

    @XmlTransient
    private Integer id = 1;

    @XmlAnyElement
    List<JAXBElement<SpecialAbility>> specialAbilityList = new ArrayList<>();

    public void putEntry(SpecialAbility value){
        String key = "id-" + String.format("%05d", id++);
        specialAbilityList.add(new JAXBElement<SpecialAbility>(new QName(key), SpecialAbility.class, value));
    }
}
