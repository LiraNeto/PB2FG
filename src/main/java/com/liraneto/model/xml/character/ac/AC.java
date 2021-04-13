package com.liraneto.model.xml.character.ac;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@NoArgsConstructor
@Data
public class AC {

    private Sources sources;
    private Totals totals;

    public AC(Sources sources, Totals totals) {
        this.sources = sources;
        this.totals = totals;
    }
}
