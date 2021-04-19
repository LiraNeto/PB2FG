package com.liraneto.model.xml.character.spellSet;

import com.liraneto.model.xml.character.spellSet.SpellPerLevel.SpellPerLevel;
import com.liraneto.model.xml.elementosType.ElementoNumber;
import com.liraneto.model.xml.elementosType.ElementoString;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@NoArgsConstructor
public class SpellSet {

    @XmlElement(name = "availablelevel0")
    private ElementoNumber availableLevel0;

    @XmlElement(name = "availablelevel1")
    private ElementoNumber availableLevel1;

    @XmlElement(name = "availablelevel10")
    private ElementoNumber availableLevel10;

    @XmlElement(name = "availablelevel2")
    private ElementoNumber availableLevel2;

    @XmlElement(name = "availablelevel3")
    private ElementoNumber availableLevel3;

    @XmlElement(name = "availablelevel4")
    private ElementoNumber availableLevel4;

    @XmlElement(name = "availablelevel5")
    private ElementoNumber availableLevel5;

    @XmlElement(name = "availablelevel6")
    private ElementoNumber availableLevel6;

    @XmlElement(name = "availablelevel7")
    private ElementoNumber availableLevel7;

    @XmlElement(name = "availablelevel8")
    private ElementoNumber availableLevel8;

    @XmlElement(name = "availablelevel9")
    private ElementoNumber availableLevel9;

    @XmlElement(name = "castertype")
    private ElementoString casterType;

    private ElementoNumber cl;

    private DC dc;

    private ElementoString label;

    @XmlTransient
    private Integer id = 1;

    @XmlAnyElement
    List<JAXBElement<SpellPerLevel>> levels = new ArrayList<>();

    @XmlElement(name = "pointsused")
    private ElementoNumber pointsUsed;

    @XmlElement(name = "powerclass")
    private ElementoNumber powerClass;

    private SP sp;

    @XmlElement(name = "spellatkbonus")
    private ElementoNumber spellAtkBonus;

    private ElementoString tradition;

    public void putEntry(SpellPerLevel value){
        String key = "level" + id++;
        levels.add(new JAXBElement<SpellPerLevel>(new QName(key), SpellPerLevel.class, value));
    }

    public SpellSet(Object availableLevel0, Object availableLevel1, Object availableLevel10, Object availableLevel2,
                    Object availableLevel3, Object availableLevel4, Object availableLevel5, Object availableLevel6,
                    Object availableLevel7, Object availableLevel8, Object availableLevel9, Object casterType,
                    Object cl, DC dc, Object label, Object pointsUsed, Object powerClass, SP sp, Object spellAtkBonus,
                    Object tradition) {
        if (availableLevel0 != null) this.availableLevel0 = new ElementoNumber(availableLevel0);
        if (availableLevel1 != null) this.availableLevel1 = new ElementoNumber(availableLevel1);
        if (availableLevel10 != null) this.availableLevel10 = new ElementoNumber(availableLevel10);
        if (availableLevel2 != null) this.availableLevel2 = new ElementoNumber(availableLevel2);
        if (availableLevel3 != null) this.availableLevel3 = new ElementoNumber(availableLevel3);
        if (availableLevel4 != null) this.availableLevel4 = new ElementoNumber(availableLevel4);
        if (availableLevel5 != null) this.availableLevel5 = new ElementoNumber(availableLevel5);
        if (availableLevel6 != null) this.availableLevel6 = new ElementoNumber(availableLevel6);
        if (availableLevel7 != null) this.availableLevel7 = new ElementoNumber(availableLevel7);
        if (availableLevel8 != null) this.availableLevel8 = new ElementoNumber(availableLevel8);
        if (availableLevel9 != null) this.availableLevel9 = new ElementoNumber(availableLevel9);
        if (casterType != null) this.casterType = new ElementoString (casterType);
        if (cl != null) this.cl = new ElementoNumber(cl);
        if (dc != null) this.dc = dc;
        if (label != null) this.label = new ElementoString (label);
        if (pointsUsed != null) this.pointsUsed = new ElementoNumber(pointsUsed);
        if (powerClass != null) this.powerClass = new ElementoNumber(powerClass);
        if (sp != null) this.sp = sp;
        if (spellAtkBonus != null) this.spellAtkBonus = new ElementoNumber(spellAtkBonus);
        if (tradition != null) this.tradition = new ElementoString (tradition);
    }

    @Override
    public String toString() {
        return  label.toString()
                .toUpperCase()
                .replace("\"", "")
                .replace(" ", "_")
                .replace("'", "") + "(" +
                availableLevel0 + ", " +
                availableLevel1 + ", " +
                availableLevel10 + ", " +
                availableLevel2 + ", " +
                availableLevel3 + ", " +
                availableLevel4 + ", " +
                availableLevel5 + ", " +
                availableLevel6 + ", " +
                availableLevel7 + ", " +
                availableLevel8 + ", " +
                availableLevel9 + ", " +
                casterType + ", " +
                cl + ", " +
                dc + ", " +
                label + ", " +
                id + ", " +
                levels + ", " +
                pointsUsed + ", " +
                powerClass + ", " +
                sp + ", " +
                spellAtkBonus + ", " +
                tradition + ", " +
                ");";
    }
}
