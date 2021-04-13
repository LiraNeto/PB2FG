package com.liraneto.model.xml.character.skillPoints;

import com.liraneto.model.xml.elementosType.ElementoNumber;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@NoArgsConstructor
public class SkillPoints {

    private ElementoNumber spent;

    public SkillPoints(Object spent) {
        if (this.spent != null) this.spent = new ElementoNumber(spent);
    }
}
