package com.liraneto.model.xml.character.proficiencies;

import com.liraneto.model.xml.character.proficiencies.defenses.DefensesList;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
public class Proficiencies {
    @XmlElement(name = "defenses")
    private DefensesList defensesList;
}
