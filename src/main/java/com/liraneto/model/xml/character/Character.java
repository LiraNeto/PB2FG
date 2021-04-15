package com.liraneto.model.xml.character;

import com.liraneto.model.xml.character.abilities.Abilities;
import com.liraneto.model.xml.character.ac.AC;
import com.liraneto.model.xml.character.attackBonus.AttackBonus;
import com.liraneto.model.xml.character.charGenTracker.CharGenTracker;
import com.liraneto.model.xml.character.classes.ClassesList;
import com.liraneto.model.xml.character.coins.Coins;
import com.liraneto.model.xml.character.encumbrance.Encumbrance;
import com.liraneto.model.xml.character.featList.FeatList;
import com.liraneto.model.xml.character.hp.HP;
import com.liraneto.model.xml.character.initiative.Initiative;
import com.liraneto.model.xml.character.inventoryList.InventoryList;
import com.liraneto.model.xml.character.languageList.LanguageList;
import com.liraneto.model.xml.character.proficiencies.Proficiencies;
import com.liraneto.model.xml.character.proficiencyList.ProficiencyList;
import com.liraneto.model.xml.character.saves.Saves;
import com.liraneto.model.xml.character.skillList.SkillList;
import com.liraneto.model.xml.character.skillPoints.SkillPoints;
import com.liraneto.model.xml.character.specialAbilityList.SpecialAbilityList;
import com.liraneto.model.xml.character.speed.Speed;
import com.liraneto.model.xml.character.spellSet.SpellSet;
import com.liraneto.model.xml.character.temp.Temp;
import com.liraneto.model.xml.character.traitList.TraitList;
import com.liraneto.model.xml.character.wealth.Wealth;
import com.liraneto.model.xml.character.weaponList.WeaponList;
import com.liraneto.model.xml.elementosType.ElementoNumber;
import com.liraneto.model.xml.elementosType.ElementoString;
import com.liraneto.model.xml.elementosType.ElementoToken;
import com.liraneto.model.xml.elementosType.ElementoWindowReference;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.FIELD)
@Data
@NoArgsConstructor
public class Character {

    private Abilities abilities;

    private AC ac;

    @XmlElement(name="attackbonus")
    private AttackBonus attackBonus;

    private ElementoString background;

    @XmlElement(name="backgroundlink")
    private ElementoWindowReference backgroundLink;

    @XmlElement(name = "chargentracker")
    private CharGenTracker charGenTracker;

    private ClassesList classes;

    private ElementoString classlevel;

    private Coins coins;

    private String defenses = "";

    @XmlElement(name = "deitylink")
    private ElementoWindowReference deityLink = new ElementoWindowReference("", "");

    private Encumbrance encumbrance;

    private ElementoNumber exp;

    @XmlElement(name = "expneeded")
    private ElementoNumber expNeeded;

    @XmlElement(name = "featlist")
    private FeatList featList;

    private ElementoNumber hero;

    private HP hp;

    private Initiative initiative;

    @XmlElement(name = "inventorylist")
    private InventoryList inventoryList;

    @XmlElement(name = "languagelist")
    private LanguageList languageList;

    private ElementoNumber level;

    private ElementoString name;

    private Proficiencies proficiencies;

    @XmlElement(name = "proficiencylist")
    private ProficiencyList proficiencyList;

    private ElementoString race;

    @XmlElement(name="racelink")
    private ElementoWindowReference raceLink;

    @XmlElement(name = "reactionused")
    private ElementoNumber reactionUsed;

    private Saves saves;

    private ElementoString size;

    @XmlElement(name = "skilllist")
    private SkillList skillList;

    @XmlElement(name = "skillpoints")
    private SkillPoints skillPoints;

    @XmlElement(name = "specialabilitylist")
    private SpecialAbilityList specialAbilityList;

    private Speed speed;

    private SpellSet spellSet;

    private Temp temp;

    private ElementoToken token;

    @XmlElement(name = "traitlist")
    private TraitList traitList;

    private ElementoString traits;

    private Wealth wealth;

    @XmlElement(name = "weaponlist")
    private WeaponList weaponList;

}
