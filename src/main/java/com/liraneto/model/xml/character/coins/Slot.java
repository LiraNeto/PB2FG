package com.liraneto.model.xml.character.coins;

import com.liraneto.model.xml.elementosType.ElementoNumber;
import com.liraneto.model.xml.elementosType.ElementoString;
import lombok.Getter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@Getter
public class Slot {

    private ElementoNumber amount = ElementoNumber.elementoNumberZero();

    private ElementoString name;

    public Slot (int amount, String name){
        this.amount = new ElementoNumber(amount);
        this.name = new ElementoString(name);
    }


}
