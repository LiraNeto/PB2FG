package com.liraneto.model.xml.character.classes;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
public class Shortcut {

    @XmlAttribute
    private String type = "windowreference";

    @XmlElement(name="class")
    private String classe = "referenceclass";

    @XmlElement(name="recordname")
    private String recordName;
}
