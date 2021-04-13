package com.liraneto.model.xml.character.coins;

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
public class Coins {
    @XmlTransient
    private Integer id = 1;

    @XmlAnyElement
    List<JAXBElement<Slot>> slotsList = new ArrayList<>();

    public void putEntry(Slot value){
        String key = "slot" + id.toString();
        slotsList.add(new JAXBElement<Slot>(new QName(key), Slot.class, value));

        id++;
    }
}
