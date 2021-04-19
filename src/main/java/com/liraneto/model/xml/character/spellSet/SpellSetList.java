package com.liraneto.model.xml.character.spellSet;

import com.liraneto.model.xml.character.spellSet.SpellPerLevel.actionsList.Action;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.commons.lang3.StringUtils;

import javax.xml.bind.JAXBElement;
import javax.xml.bind.annotation.*;
import javax.xml.namespace.QName;
import java.util.ArrayList;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
public class SpellSetList {

    @XmlTransient
    private Integer id = 1;

    @XmlAnyElement
    List<JAXBElement<SpellSet>> spellSetList = new ArrayList<>();

    List<SpellSet> spellSetLista = new ArrayList<>();

    public void putEntry(SpellSet value){
        String key = "id-" + String.format("%05d", id++);
        spellSetList.add(new JAXBElement<SpellSet>(new QName(key), SpellSet.class, value));
    }

    public SpellSetList(List<SpellSet> spellSetList){
        for (SpellSet spellSet : spellSetList)
            this.putEntry(spellSet);
    }

    @Override
    public String toString(){
        String returnString = "Arrays.asList(";

        for (SpellSet spellSet : spellSetLista){
            returnString = returnString.concat(spellSet.toString());
        }

        returnString = StringUtils.removeEnd(returnString, ",");

        return returnString.concat(")");
    }
}
