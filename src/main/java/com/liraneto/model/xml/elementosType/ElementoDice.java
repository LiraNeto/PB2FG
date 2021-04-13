package com.liraneto.model.xml.elementosType;

import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@NoArgsConstructor
public class ElementoDice extends Elemento {

    public ElementoDice (String conteudo)
    {
        this.type = "dice";
        this.conteudo = conteudo;
    }

    public ElementoDice (Object conteudo)
    {
        this.type = "dice";
        if (conteudo.getClass() == String.class)
            this.conteudo = (String) conteudo;
    }
}
