package com.liraneto.model.xml.character.wealth;

import com.liraneto.model.xml.elementosType.ElementoNumber;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@NoArgsConstructor
public class Wealth {
    private ElementoNumber copper;

    private ElementoNumber gold;

    private ElementoNumber platinum;

    private ElementoNumber silver;

    public Wealth(Object copper, Object gold, Object platinum, Object silver) {
        if (copper != null) this.copper = new ElementoNumber(copper);
        if (gold != null) this.gold = new ElementoNumber(gold);
        if (platinum != null) this.platinum = new ElementoNumber(platinum);
        if (silver != null) this.silver = new ElementoNumber(silver);
    }
}
