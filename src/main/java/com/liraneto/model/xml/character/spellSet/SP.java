package com.liraneto.model.xml.character.spellSet;

import com.liraneto.model.xml.elementosType.ElementoNumber;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
public class SP {
    private ElementoNumber base;

    private ElementoNumber item;

    private ElementoNumber misc;

    @XmlElement(name = "tempmod")
    private ElementoNumber tempMod;

    private ElementoNumber total;

    public SP(Object base, Object item, Object misc, Object tempMod, Object total) {
        if (base != null) this.base = new ElementoNumber(base);
        if (item != null) this.item = new ElementoNumber(item);
        if (misc != null) this.misc = new ElementoNumber(misc);
        if (tempMod != null) this.tempMod = new ElementoNumber(tempMod);
        if (total != null) this.total = new ElementoNumber(total);
    }

    @Override
    public String toString() {
        return "new SP( " +
                base + ", " +
                item + ", " +
                misc + ", " +
                tempMod + ", " +
                total +
                ");";
    }
}
