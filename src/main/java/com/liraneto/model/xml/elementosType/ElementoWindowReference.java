package com.liraneto.model.xml.elementosType;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.*;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "shortcut")
@NoArgsConstructor
@Data
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
