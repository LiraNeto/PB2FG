package com.liraneto.model.xml.character.classes;

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
public class ClassesList {

    @XmlTransient
    private Integer id = 1;

    @XmlAnyElement
    List<JAXBElement<Classe>> classesList = new ArrayList<>();

    public void putEntry(Classe value){
        String key = "id-" + String.format("%05d", id++);
        classesList.add(new JAXBElement<Classe>(new QName(key), Classe.class, value));
    }
}
