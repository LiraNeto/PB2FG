package com.liraneto.model.xml.character.spellSet.SpellPerLevel.actionsList;

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
public class ActionListType {

    @XmlTransient
    private Integer id = 1;

    @XmlAnyElement
    List<JAXBElement<Action>> actionList = new ArrayList<>();

    @XmlElement(name = "damage")
    List<Action> actionLista = new ArrayList<>();

    public void putEntry(Action value){
        String key = "id-" + String.format("%05d", id++);
        actionList.add(new JAXBElement<Action>(new QName(key), Action.class, value));
    }

    public ActionListType(List<Action> actionList){
        for (Action damage : actionList)
            this.putEntry(damage);
    }

    @Override
    public String toString(){
        String returnString = "Arrays.asList(";

        for (Action action : actionLista){
            returnString = returnString.concat(action.toString());
        }

        returnString = StringUtils.removeEnd(returnString, ",");

        return returnString.concat(")");
    }
}
