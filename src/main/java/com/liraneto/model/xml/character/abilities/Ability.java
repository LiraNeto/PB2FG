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

    private ElementoNumber bonus;

    @XmlElement(name = "bonusmodifier")
    private ElementoNumber bonusModifier;

    @XmlElement(name = "chargen")
    private ElementoNumber charGen;

    private ElementoNumber damage;

    @XmlElement(name = "miscmod")
    private ElementoNumber miscMod;

    private ElementoNumber score;

    @XmlElement(name = "tempmod")
    private ElementoNumber tempMod;

    public Ability (int score){
        this.bonus = new ElementoNumber((score-10)/2);
        this.bonusModifier = ElementoNumber.elementoNumberZero();
        this.charGen = new ElementoNumber(score);
        this.damage = ElementoNumber.elementoNumberZero();
        this.miscMod = ElementoNumber.elementoNumberZero();
        this.score = new ElementoNumber(score);
        this.tempMod = ElementoNumber.elementoNumberZero();
    }
}
