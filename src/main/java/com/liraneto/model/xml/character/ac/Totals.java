package com.liraneto.model.xml.character.ac;

import com.liraneto.model.xml.elementosType.ElementoNumber;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@NoArgsConstructor
@Data
public class Totals {
    private ElementoNumber general = ElementoNumber.elementoNumberDez();

    public Totals(Object general) {
        if (general != null) this.general = new ElementoNumber(general);
    }
}
