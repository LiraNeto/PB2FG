package com.liraneto.model.xml.character.featList;

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
public class FeatList {

    @XmlTransient
    private Integer id = 1;

    @XmlAnyElement
    List<JAXBElement<Feat>> featList = new ArrayList<>();

    public void putEntry(Feat value){
        String key = "id-" + String.format("%05d", id++);
        featList.add(new JAXBElement<Feat>(new QName(key), Feat.class, value));
    }
}
