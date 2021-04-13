package com.liraneto.model.xml.character.weaponList;

import com.liraneto.model.xml.character.specialAbilityList.SpecialAbility;
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
public class DamageList {

    @XmlTransient
    private Integer id = 1;

    @XmlAnyElement
    List<JAXBElement<Damage>> damageList = new ArrayList<>();

    public void putEntry(Damage value){
        String key = "id-" + String.format("%05d", id++);
        damageList.add(new JAXBElement<Damage>(new QName(key), Damage.class, value));
    }
}
