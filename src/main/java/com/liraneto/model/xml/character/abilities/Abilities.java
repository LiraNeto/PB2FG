package com.liraneto.model.xml.character.abilities;

import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;

@XmlAccessorType(XmlAccessType.FIELD)
@NoArgsConstructor
@Data
public class Abilities {
    private Ability charisma = new Ability();
    private Ability constitution = new Ability();
    private Ability dexterity = new Ability();
    private Ability intelligence = new Ability();
    private Ability strength = new Ability();
    private Ability wisdom = new Ability();
}
