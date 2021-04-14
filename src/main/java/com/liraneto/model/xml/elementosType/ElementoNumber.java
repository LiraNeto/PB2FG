package com.liraneto.model.xml.elementosType;

import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlTransient;

@XmlAccessorType(XmlAccessType.FIELD)
@NoArgsConstructor
@Getter
public class ElementoNumber extends Elemento {

    @XmlTransient
    private int conteudoInt;

    public ElementoNumber (int conteudoInt) {
        type = "number";
        this.conteudoInt = conteudoInt;
        this.conteudo = String.valueOf(conteudoInt);
    }

    public ElementoNumber (String conteudo) {
        type = "number";
        this.conteudo = conteudo;

        if (conteudo != null) {
            this.conteudoInt = Integer.parseInt(conteudo);
        }
    }

    public ElementoNumber (Object conteudo) {
        type = "number";


        if (conteudo != null) {
            if (conteudo.getClass() == String.class) {
                this.conteudo = (String) conteudo;
                this.conteudoInt = Integer.parseInt((String) conteudo);
            } else if (conteudo.getClass() == Integer.class) {
                this.conteudoInt = (int) conteudo;
                this.conteudo = String.valueOf((int) conteudo);
            }

        }
    }

    public void setConteudoInt (int conteudoInt) {
        this.conteudoInt = conteudoInt;
        this.conteudo = String.valueOf(conteudoInt);
    }

    public static ElementoNumber elementoNumberZero (){
        return new ElementoNumber(0);
    }

    public static ElementoNumber elementoNumberDez (){
        return new ElementoNumber(10);
    }
}
