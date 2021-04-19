package com.liraneto.model.xml.elementosType;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlValue;

public class Elemento {
    @XmlAttribute
    protected String type;

    @XmlValue
    protected String conteudo;

    public String toString(){
        if (conteudo == null){
            return "null";
        } else {
            return "\"" + conteudo + "\"";
        }
    }
}
