package com.liraneto.model.xml.elementosType;

import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@NoArgsConstructor
public class ElementoFormattedText extends Elemento {

    public ElementoFormattedText (String conteudo)
    {
        this.type = "formattedtext";
        this.conteudo = conteudo;
    }

    public ElementoFormattedText (Object conteudo)
    {
        this.type = "formattedtext";
        if (conteudo.getClass() == String.class)
            this.conteudo = (String) conteudo;
    }


}
