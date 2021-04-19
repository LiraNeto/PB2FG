package com.liraneto.model.xml.character.spellSet.SpellPerLevel.actionsList;

import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
public class HealDamageList {

    @XmlTransient
    private Integer id = 1;

    @XmlAnyElement
    List<JAXBElement<HealDamage>> healDamageList = new ArrayList<>();

    @XmlElement(name = "id")
    List<HealDamage> healDamageLista = new ArrayList<>();

    public void putEntry(HealDamage value){
        String key = "id-" + String.format("%05d", id++);
        healDamageList.add(new JAXBElement<HealDamage>(new QName(key), HealDamage.class, value));
    }

    public HealDamageList(List<HealDamage> healDamageList){
        for (HealDamage damage : healDamageList)
            this.putEntry(damage);
    }

    @Override
    public String toString(){
        String returnString = "Arrays.asList(";

        for (HealDamage healDamage : healDamageLista){
            returnString = returnString.concat(healDamage.toString());
        }

        returnString = StringUtils.removeEnd(returnString, ", ");

        return returnString.concat(")");
    }
}
