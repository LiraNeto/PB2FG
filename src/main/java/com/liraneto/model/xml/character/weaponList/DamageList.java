package com.liraneto.model.xml.character.weaponList;

import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "damagelist")
@Data
@NoArgsConstructor
public class DamageList {

    @XmlTransient
    private Integer id = 1;

    @XmlAnyElement
    List<JAXBElement<Damage>> damageList = new ArrayList<>();

    @XmlElement(name = "damage")
    List<Damage> damageLista = new ArrayList<>();

    public void putEntry(Damage value){
        String key = "id-" + String.format("%05d", id++);
        damageList.add(new JAXBElement<Damage>(new QName(key), Damage.class, value));
    }

    public DamageList (List<Damage> damageList){
        for (Damage damage : damageList)
            this.putEntry(damage);
    }

    @Override
    public String toString(){
        String returnString = "Arrays.asList(";

        for (Damage damage : damageLista){
            returnString = returnString.concat(damage.toString());
        }

        returnString = StringUtils.removeEnd(returnString, ",");

        return returnString.concat(")");
    }
}
