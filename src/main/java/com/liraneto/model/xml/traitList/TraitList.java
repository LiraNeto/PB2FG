package com.liraneto.model.xml.traitList;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlTransient;
import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

public class TraitList {

    @XmlTransient
    private Integer id = 1;

    @XmlAnyElement
    List<JAXBElement<Trait>> traitList = new ArrayList<>();

    public void putEntry(Trait value){
        String key = "id-" + String.format("%05d", id++);
        traitList.add(new JAXBElement<Trait>(new QName(key), Trait.class, value));
    }
}
