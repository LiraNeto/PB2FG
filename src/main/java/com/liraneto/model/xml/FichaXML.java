package com.liraneto.model.xml;

import com.liraneto.model.xml.character.Character;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlRootElement;


@XmlRootElement(name = "root")
@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
public class FichaXML {

    @XmlAttribute
    private String version = "3.3";

    @XmlAttribute
    private String release = "17|CoreRPG:4.1";

    private Character character;
}
