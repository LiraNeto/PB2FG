package com.liraneto.model.xml.elementosType;

import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAttribute;

@NoArgsConstructor
public class ElementoToken {
    @XmlAttribute
    private String type = "token";

}
