package com.liraneto.model.xml.character.skillList;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@Getter
@NoArgsConstructor
public class SkillList {

    @XmlTransient
    private Integer id = 1;

    @XmlAnyElement
    List<JAXBElement<Skill>> skillList = new ArrayList<>();

    public void putEntry(Skill value){
        String key = "id-" + String.format("%05d", id++);
        skillList.add(new JAXBElement<Skill>(new QName(key), Skill.class, value));
    }
}
