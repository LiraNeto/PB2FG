package com.liraneto.model.xml.character.weaponList;

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
public class WeaponList {

    @XmlTransient
    private Integer id = 1;

    @XmlAnyElement
    List<JAXBElement<Weapon>> weaponList = new ArrayList<>();

    public void putEntry(Weapon value){
        String key = "id-" + String.format("%05d", id++);
        weaponList.add(new JAXBElement<Weapon>(new QName(key), Weapon.class, value));
    }
}
