package com.liraneto.model.xml.elementosType;

import lombok.Getter;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
@Getter
public class ElementoWindowReference {

        @XmlAttribute
        private String type = "windowreference";

        @XmlElement(name="class")
        private String classe;

        @XmlElement(name="recordname")
        private String recordName;

        public ElementoWindowReference (String classe, String recordName){
            this.classe = classe;
            this.recordName = recordName;
        }
}
