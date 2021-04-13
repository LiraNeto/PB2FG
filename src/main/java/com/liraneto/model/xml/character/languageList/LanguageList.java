package com.liraneto.model.xml.character.languageList;

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
public class LanguageList {

    @XmlTransient
    private Integer id = 1;

    @XmlAnyElement
    List<JAXBElement<Language>> languageList = new ArrayList<>();

    public void putEntry(Language value){
        String key = "id-" + String.format("%05d", id++);
        languageList.add(new JAXBElement<Language>(new QName(key), Language.class, value));
    }
}
