package com.liraneto.model.xml.character.abilities;

import com.liraneto.model.xml.elementosType.ElementoNumber;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
@NoArgsConstructor
@Data
public class Ability {

    private ElementoNumber bonus = ElementoNumber.elementoNumberZero();

    @XmlElement(name = "bonusmodifier")
    private ElementoNumber bonusModifier = ElementoNumber.elementoNumberZero();

    @XmlElement(name = "chargen")
    private ElementoNumber charGen = ElementoNumber.elementoNumberDez();

    private ElementoNumber damage = ElementoNumber.elementoNumberZero();

    @XmlElement(name = "miscmod")
    private ElementoNumber miscMod = ElementoNumber.elementoNumberZero();

    private ElementoNumber score = ElementoNumber.elementoNumberDez();

    @XmlElement(name = "tempmod")
    private ElementoNumber tempMod = ElementoNumber.elementoNumberZero();
}
