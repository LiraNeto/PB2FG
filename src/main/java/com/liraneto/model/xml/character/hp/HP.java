package com.liraneto.model.xml.character.hp;

import com.liraneto.model.xml.elementosType.ElementoNumber;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@NoArgsConstructor
public class HP {
    private ElementoNumber ancestry;

    @XmlElement(name = "ancestrytemp")
    private ElementoNumber ancestryTemp;

    @XmlElement(name = "classperlevel")
    private ElementoNumber classPerLevel;

    @XmlElement(name = "classtotal")
    private ElementoNumber classTotal;

    private ElementoNumber current;

    private ElementoNumber dying;

    @XmlElement(name = "miscmod")
    private ElementoNumber miscMod;

    @XmlElement(name = "tempmod")
    private ElementoNumber tempMod;

    private ElementoNumber temporary;

    private ElementoNumber total;

    private ElementoNumber wounded;

    private ElementoNumber wounds;

    public HP(int ancestry, int ancestrytemp, int classperlevel, int classtotal, int current, int dying, int miscmod,
              int tempmod, int temporary, int total, int wounded, int wounds) {
        this.ancestry = new ElementoNumber(ancestry);
        this.ancestryTemp = new ElementoNumber(ancestrytemp);
        this.classPerLevel = new ElementoNumber(classperlevel);
        this.classTotal = new ElementoNumber(classtotal);
        this.current = new ElementoNumber(current);
        this.dying = new ElementoNumber(dying);
        this.miscMod = new ElementoNumber(miscmod);
        this.tempMod = new ElementoNumber(tempmod);
        this.temporary = new ElementoNumber(temporary);
        this.total = new ElementoNumber(total);
        this.wounded = new ElementoNumber(wounded);
        this.wounds = new ElementoNumber(wounds);
    }
}
