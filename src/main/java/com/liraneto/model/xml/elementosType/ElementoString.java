package com.liraneto.model.xml.elementosType;

import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@NoArgsConstructor
public class ElementoString extends Elemento {

    public ElementoString (String conteudo)
    {
        this.type = "string";
        this.conteudo = conteudo;
    }

    public ElementoString (Object conteudo)
    {
        this.type = "string";
        if (conteudo.getClass() == String.class)
            this.conteudo = (String) conteudo;
    }
}
