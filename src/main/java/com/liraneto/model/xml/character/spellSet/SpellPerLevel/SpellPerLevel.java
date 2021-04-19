package com.liraneto.model.xml.character.spellSet.SpellPerLevel;

import com.liraneto.model.xml.elementosType.ElementoNumber;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
public class SpellPerLevel {
    private ElementoNumber level;

    @XmlElement(name = "maxprepared")
    private ElementoNumber maxPrepared;

    @XmlTransient
    private Integer id = 1;

    @XmlAnyElement
    List<JAXBElement<Spells>> spellsList = new ArrayList<>();

    @XmlElement(name = "totalcast")
    private ElementoNumber totalCast;

    @XmlElement(name = "totalprepared")
    private ElementoNumber totalPrepared;

    public SpellPerLevel(Object level, Object maxPrepared, List<Spells> spellsList, Object totalCast, Object totalPrepared) {
        if (level != null) this.level = new ElementoNumber(level);
        if (maxPrepared != null) this.maxPrepared = new ElementoNumber(maxPrepared);
        if (spellsList != null && !spellsList.isEmpty()) this.putEntry(spellsList);
        if (totalCast != null) this.totalCast = new ElementoNumber(totalCast);
        if (totalPrepared != null) this.totalPrepared = new ElementoNumber(totalPrepared);

    }

    public void putEntry(Spells value){
        String key = "id-" + String.format("%05d", id++);
        spellsList.add(new JAXBElement<Spells>(new QName(key), Spells.class, value));
    }

    public void putEntry(List<Spells> spellsList){
        for (Spells spell : spellsList)
            this.putEntry(spell);
    }
}
