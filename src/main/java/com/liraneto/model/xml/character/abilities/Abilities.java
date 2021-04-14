package com.liraneto.model.xml.character.abilities;

import com.liraneto.model.xml.elementosType.ElementoNumber;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@NoArgsConstructor
@AllArgsConstructor
@Data
public class Abilities {
    private Ability charisma;

    private Ability constitution;

    private Ability dexterity;

    private Ability intelligence;

    private Ability strength;

    private Ability wisdom;

    public List<String> getBoosts(){
        List<String> boosts = new ArrayList<String>();

        int charisma_bonus = this.charisma.getBonus().getConteudoInt();
        if (charisma_bonus > 0)
            boosts.addAll(Collections.nCopies(charisma_bonus, "charisma"));

        int constitution_bonus = this.constitution.getBonus().getConteudoInt();
        if (constitution_bonus > 0)
            boosts.addAll(Collections.nCopies(constitution_bonus, "constitution"));

        int dexterity_bonus = this.dexterity.getBonus().getConteudoInt();
        if (dexterity_bonus > 0)
            boosts.addAll(Collections.nCopies(dexterity_bonus, "dexterity"));

        int intelligence_bonus = this.intelligence.getBonus().getConteudoInt();
        if (intelligence_bonus > 0)
            boosts.addAll(Collections.nCopies(intelligence_bonus, "intelligence"));

        int strength_bonus = this.strength.getBonus().getConteudoInt();
        if (strength_bonus > 0)
            boosts.addAll(Collections.nCopies(strength_bonus, "strength"));

        int wisdom_bonus = this.wisdom.getBonus().getConteudoInt();
        if (wisdom_bonus > 0)
            boosts.addAll(Collections.nCopies(wisdom_bonus, "wisdom"));

        return boosts;
    }

    public String getFlaw() {
        String flaw = null;

        int charisma_bonus = this.charisma.getBonus().getConteudoInt();
        if (charisma_bonus < 0){
            if (flaw == null) {
                flaw = "charisma";
            } else {
                this.charisma.setTempMod(new ElementoNumber(-2));
            }

        }

        int constitution_bonus = this.constitution.getBonus().getConteudoInt();
        if (constitution_bonus < 0){
            if (flaw == null) {
                flaw = "constitution";
            } else {
                this.constitution.setTempMod(new ElementoNumber(-2));
            }

        }

        int dexterity_bonus = this.dexterity.getBonus().getConteudoInt();
        if (dexterity_bonus < 0) {
            if (flaw == null) {
                flaw = "dexterity";
            } else {
                this.dexterity.setTempMod(new ElementoNumber(-2));
            }

        }

        int intelligence_bonus = this.intelligence.getBonus().getConteudoInt();
        if (intelligence_bonus < 0){
            if (flaw == null) {
                flaw = "intelligence";
            } else {
                this.intelligence.setTempMod(new ElementoNumber(-2));
            }

        }

        int strength_bonus = this.strength.getBonus().getConteudoInt();
        if (strength_bonus < 0){
            if (flaw == null) {
                flaw = "strength";
            } else {
                this.strength.setTempMod(new ElementoNumber(-2));
            }

        }

        int wisdom_bonus = this.wisdom.getBonus().getConteudoInt();
        if (wisdom_bonus < 0){
            if (flaw == null) {
                flaw = "wisdom";
            } else {
                this.wisdom.setTempMod(new ElementoNumber(-2));
            }

        }

        return flaw;
    }

}
