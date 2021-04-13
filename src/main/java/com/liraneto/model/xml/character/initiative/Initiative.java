package com.liraneto.model.xml.character.initiative;

import com.liraneto.model.xml.elementosType.ElementoNumber;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@NoArgsConstructor
public class Initiative {

    private ElementoNumber misc;

    private ElementoNumber perception;

    @XmlElement(name = "perceptiontemp")
    private ElementoNumber perceptionTemp;

    @XmlElement(name = "perceptiontotal")
    private ElementoNumber perceptionTotal;

    private ElementoNumber stealth;

    @XmlElement(name = "stealthtempmod")
    private ElementoNumber stealthTempMod;

    @XmlElement(name = "stealthttoal")
    private ElementoNumber stealthtTotal;

    public Initiative(int misc, int perception, int perceptionTemp, int perceptionTotal, int stealth,
                      int stealthTempMod, int stealthtTotal) {
        this.misc = new ElementoNumber(misc);
        this.perception = new ElementoNumber(perception);
        this.perceptionTemp = new ElementoNumber(perceptionTemp);
        this.perceptionTotal = new ElementoNumber(perceptionTotal);
        this.stealth = new ElementoNumber(stealth);
        this.stealthTempMod = new ElementoNumber(stealthTempMod);
        this.stealthtTotal = new ElementoNumber(stealthtTotal);
    }
}
