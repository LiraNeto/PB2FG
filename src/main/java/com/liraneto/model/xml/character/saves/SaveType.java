package com.liraneto.model.xml.character.saves;

import com.liraneto.model.xml.elementosType.ElementoNumber;
import com.liraneto.model.xml.elementosType.ElementoString;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
public class SaveType {

    @XmlElement(name = "abilitymod")
    private ElementoNumber abilityMod;

    private ElementoNumber base;

    private ElementoNumber misc;

    @XmlElement(name = "proflevel")
    private ElementoString profLevel;

    private ElementoNumber temporary;

    private ElementoNumber total;

    public SaveType(String abilityMod, String base, String misc, String profLevel,
                    String temporary, String total) {
        if (abilityMod != null) this.abilityMod = new ElementoNumber (abilityMod);
        if (base != null) this.base = new ElementoNumber (base);
        if (misc != null) this.misc = new ElementoNumber (misc);
        if (profLevel != null) this.profLevel = new ElementoString (profLevel);
        if (temporary != null) this.temporary = new ElementoNumber (temporary);
        if (total != null) this.total = new ElementoNumber (total);
    }

    public SaveType(Object abilityMod, Object base, Object misc, Object profLevel,
                    Object temporary, Object total) {

        if (abilityMod != null) this.abilityMod = new ElementoNumber (abilityMod);
        if (base != null) this.base = new ElementoNumber (base);
        if (misc != null) this.misc = new ElementoNumber (misc);
        if (profLevel != null) this.profLevel = new ElementoString (profLevel);
        if (temporary != null) this.temporary = new ElementoNumber (temporary);
        if (total != null) this.total = new ElementoNumber (total);
    }
}
