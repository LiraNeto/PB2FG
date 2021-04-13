package com.liraneto.model.xml.character.inventoryList;

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
public class InventoryList {

    @XmlTransient
    private Integer id = 1;

    @XmlAnyElement
    List<JAXBElement<Item>> itemList = new ArrayList<>();

    public void putEntry(Item value){
        String key = "id-" + String.format("%05d", id++);
        itemList.add(new JAXBElement<Item>(new QName(key), Item.class, value));
    }
}
