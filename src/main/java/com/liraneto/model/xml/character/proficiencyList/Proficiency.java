package com.liraneto.model.xml.character.proficiencyList;

import com.liraneto.model.xml.elementosType.ElementoString;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
public class Proficiency {
    private ElementoString name;

    public Proficiency(String name) {
        if (name != null) this.name = new ElementoString(name);
    }
}
