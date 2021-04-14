package com.liraneto.controller;


import com.liraneto.model.xml.FichaXML;
import com.liraneto.model.xml.character.classes.Classe;
import com.liraneto.model.xml.character.coins.Slot;
import com.liraneto.model.xml.character.featList.Feat;
import com.liraneto.model.xml.character.inventoryList.Item;
import com.liraneto.model.xml.character.languageList.Language;
import com.liraneto.model.xml.character.proficiencies.defenses.Defense;
import com.liraneto.model.xml.character.proficiencyList.Proficiency;
import com.liraneto.model.xml.character.skillList.Skill;
import com.liraneto.model.xml.character.specialAbilityList.SpecialAbility;
import com.liraneto.model.xml.character.weaponList.Damage;
import com.liraneto.model.xml.character.weaponList.Weapon;
import com.liraneto.model.xml.character.traitList.Trait;
import com.sun.xml.bind.marshaller.CharacterEscapeHandler;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;

@NoArgsConstructor
@AllArgsConstructor
public class XML {
    FichaXML fichaXML;

    public void jaxbObjectToXML()
    {
        try
        {
            //Create JAXB Context
            JAXBContext jaxbContext = JAXBContext.newInstance(FichaXML.class, Classe.class, Slot.class, Feat.class,
                    Item.class, Language.class, Defense.class, Proficiency.class, Skill.class, SpecialAbility.class,
                    Trait.class, Weapon.class, Damage.class);

            //Create Marshaller
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            //Required formatting??
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");
            jaxbMarshaller.setProperty("com.sun.xml.bind.characterEscapeHandler", new CharacterEscapeHandler() {
                @Override
                public void escape(char[] ch, int start, int length, boolean isAttVal,
                                   Writer out) throws IOException {
                    out.write(ch, start, length);
                }
            });

            //Print XML String to Console
            StringWriter sw = new StringWriter();

            //Write XML to StringWriter
            jaxbMarshaller.marshal(fichaXML, sw);

            //Verify XML Content
            String xmlContent = sw.toString();
            System.out.println( xmlContent );

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    public void jaxbObjectToXML(String nomeArquivo)
    {
        try
        {
            //Create JAXB Context
            JAXBContext jaxbContext = JAXBContext.newInstance(FichaXML.class);

            //Create Marshaller
            Marshaller jaxbMarshaller = jaxbContext.createMarshaller();

            //Required formatting??
            jaxbMarshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            jaxbMarshaller.setProperty(Marshaller.JAXB_ENCODING, "ISO-8859-1");

            //Print XML String to Console
            //Store XML to File
            File file = new File(nomeArquivo);

            //Writes XML file to file-system
            jaxbMarshaller.marshal(fichaXML, file);

        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

}
