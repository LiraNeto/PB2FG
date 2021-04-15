package com.liraneto.controller;

import com.liraneto.controller.enums.*;
import com.liraneto.model.json.Build.Armor;
import com.liraneto.model.json.Build.Weapon;
import com.liraneto.model.json.FichaJSON;
import com.liraneto.model.xml.FichaXML;
import com.liraneto.model.xml.character.Character;
import com.liraneto.model.xml.character.abilities.Abilities;
import com.liraneto.model.xml.character.abilities.Ability;
import com.liraneto.model.xml.character.ac.AC;
import com.liraneto.model.xml.character.ac.Sources;
import com.liraneto.model.xml.character.ac.Totals;
import com.liraneto.model.xml.character.charGenTracker.CharGenTracker;
import com.liraneto.model.xml.character.charGenTracker.CharGenTrackerAbilities;
import com.liraneto.model.xml.character.classes.Classe;
import com.liraneto.model.xml.character.classes.ClassesList;
import com.liraneto.model.xml.character.coins.Coins;
import com.liraneto.model.xml.character.coins.Slot;
import com.liraneto.model.xml.character.featList.Feat;
import com.liraneto.model.xml.character.featList.FeatList;
import com.liraneto.model.xml.character.hp.HP;
import com.liraneto.model.xml.character.initiative.Initiative;
import com.liraneto.model.xml.character.inventoryList.InventoryList;
import com.liraneto.model.xml.character.inventoryList.Item;
import com.liraneto.model.xml.character.languageList.Language;
import com.liraneto.model.xml.character.languageList.LanguageList;
import com.liraneto.model.xml.character.proficiencies.Proficiencies;
import com.liraneto.model.xml.character.proficiencies.defenses.Defense;
import com.liraneto.model.xml.character.proficiencies.defenses.DefensesList;
import com.liraneto.model.xml.character.proficiencyList.Proficiency;
import com.liraneto.model.xml.character.proficiencyList.ProficiencyList;
import com.liraneto.model.xml.character.saves.SaveType;
import com.liraneto.model.xml.character.saves.Saves;
import com.liraneto.model.xml.character.skillList.Skill;
import com.liraneto.model.xml.character.skillList.SkillList;
import com.liraneto.model.xml.character.skillPoints.SkillPoints;
import com.liraneto.model.xml.character.speed.Speed;
import com.liraneto.model.xml.elementosType.ElementoNumber;
import com.liraneto.model.xml.elementosType.ElementoString;
import com.liraneto.model.xml.elementosType.ElementoWindowReference;
import lombok.Data;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;

@Data
public class JSON2XML {

    FichaXML fichaXML = new FichaXML();
    FichaJSON fichaJSON;

    public void ConverterJSON2XML(){
        fichaXMLConvertAbilities();
        fichaXMLConvertAC();
        fichaXMLConvertBackground();
        fichaXMLConvertBackgroundLink();
        fichaXMLConvertCharGenTracker();
        fichaXMLConverterClassesList();
        fichaXMLConvertClassLevel();
        fichaXMLConverterCoins();
        fichaXMLConverterDefenses();
        fichaXMLConvertDeityLink();
        fichaXMLConvertEncumbrance();
        fichaXMLConvertExp();
        fichaXMLConvertExpNeeded();
        fichaXMLConvertFeatList();
        fichaXMLConvertHero();
        fichaXMLConvertHp();
        fichaXMLConvertInitiative();
        fichaXMLConvertInventoryList();
        fichaXMLConvertLanguageList();
        fichaXMLConvertLevel();
        fichaXMLConvertName();
        fichaXMLConvertProficiencies();
        fichaXMLConvertProficiencyList();
        fichaXMLConvertRace();
        fichaXMLConvertRaceLink();
        fichaXMLConvertReactionUsed();
        fichaXMLConvertSaves();
        fichaXMLConvertSize();
        fichaXMLConvertSkillList();
        fichaXMLConvertSkillPoints();
        fichaXMLConvertSpecialAbilityList();
        fichaXMLConvertSpeed();
        fichaXMLConvertSpellSet();
        fichaXMLConvertTemp();
        fichaXMLConvertToken();
        fichaXMLConvertTraitList();
        fichaXMLConvertTraits();
        fichaXMLConvertWealth();
        fichaXMLConvertWeaponList();
    }

    public void fichaXMLConvertAbilities(){
        if (fichaXML != null && fichaJSON != null
                && fichaJSON.getBuild() != null
                && fichaJSON.getBuild().getAbilities() != null){
            if (fichaXML.getCharacter() == null){
                fichaXML.setCharacter(new Character());
            }

            Ability charisma = new Ability(fichaJSON.getBuild().getAbilities().getCha());
            Ability constitution = new Ability(fichaJSON.getBuild().getAbilities().getCon());
            Ability dexterity = new Ability(fichaJSON.getBuild().getAbilities().getDex());
            Ability intelligence = new Ability(fichaJSON.getBuild().getAbilities().getIntelligence());
            Ability strength = new Ability(fichaJSON.getBuild().getAbilities().getStr());
            Ability wisdom = new Ability(fichaJSON.getBuild().getAbilities().getWis());

            Abilities abilitiesXML = new Abilities(charisma, constitution, dexterity, intelligence, strength, wisdom);
            fichaXML.getCharacter().setAbilities(abilitiesXML);
        }
    }

    public void fichaXMLConvertAC(){
        if (fichaXML != null && fichaJSON != null
                && fichaJSON.getBuild() != null
                && fichaJSON.getBuild().getAcTotal() != null){
            if (fichaXML.getCharacter() == null){
                fichaXML.setCharacter(new Character());
            }

            int abilityMod = (fichaJSON.getBuild().getAbilities().getDex() - 10) / 2;
            int acItem = 0;
            int acMisc = 0;
            int acShieldActive = 0;
            int armor = fichaJSON.getBuild().getAcTotal().getAcItemBonus();
            int prof = fichaJSON.getBuild().getAcTotal().getAcProfBonus();
            String profLevel = ProficiencyLevelEnum
                    .getProficiencyLevelEnum(fichaJSON.getBuild().getLevel(), prof)
                    .getName();
            int shield = 0;
            int shieldRaised = 0;
            int size = AncestryEnum
                    .getAncestry(fichaJSON.getBuild().getAncestry())
                    .getSizeInt();
            int temporary = 0;

            Sources sources = new Sources(abilityMod, acItem, acMisc, acShieldActive, armor, prof, profLevel,
                    shield, shieldRaised, size, temporary);
            Totals totals = new Totals(fichaJSON.getBuild().getAcTotal().getAcTotal());
            AC ac = new AC(sources, totals);

            fichaXML.getCharacter().setAc(ac);
        }
    }

    public void fichaXMLConvertBackground(){
        if (fichaXML != null && fichaJSON != null
                && fichaJSON.getBuild() != null
                && fichaJSON.getBuild().getBackground() != null){
            if (fichaXML.getCharacter() == null){
                fichaXML.setCharacter(new Character());
            }

            ElementoString background = new ElementoString(fichaJSON.getBuild().getBackground().toUpperCase());
            fichaXML.getCharacter().setBackground(background);
        }
    }

    public void fichaXMLConvertBackgroundLink(){
        if (fichaXML != null && fichaJSON != null
                && fichaJSON.getBuild() != null
                && fichaJSON.getBuild().getBackground() != null){
            if (fichaXML.getCharacter() == null){
                fichaXML.setCharacter(new Character());
            }

            ElementoWindowReference backgroundLink = BackgroundEnum
                    .getBackgoundEnum(fichaJSON.getBuild().getBackground())
                    .getWindowReference();

            fichaXML.getCharacter().setBackgroundLink(backgroundLink);
        }
    }

    public void fichaXMLConvertClassLevel(){
        if (fichaXML != null && fichaJSON != null
                && fichaJSON.getBuild() != null
                && fichaJSON.getBuild().getClasse() != null
                && fichaJSON.getBuild().getLevel() != 0){
            if (fichaXML.getCharacter() == null){
                fichaXML.setCharacter(new Character());
            }

            String classe = fichaJSON.getBuild().getClasse();
            int level = fichaJSON.getBuild().getLevel();

            ElementoString ClassLevel = new ElementoString(classe + " " + String.valueOf(level));

            fichaXML.getCharacter().setClasslevel(ClassLevel);
        }
    }

    public void fichaXMLConvertCharGenTracker(){
        if (fichaXML != null && fichaJSON != null
                && fichaJSON.getBuild() != null
                && fichaJSON.getBuild().getAbilities() != null){
            if (fichaXML.getCharacter() == null){
                fichaXML.setCharacter(new Character());
            }
            if (fichaXML.getCharacter().getAbilities() == null){
                return;
            }

            List<String> boosts = fichaXML.getCharacter().getAbilities().getBoosts();
            String flaw = fichaXML.getCharacter().getAbilities().getFlaw();

            CharGenTrackerAbilities abilities = new CharGenTrackerAbilities(boosts, flaw);
            CharGenTracker charGenTracker = new CharGenTracker(abilities);

            fichaXML.getCharacter().setCharGenTracker(charGenTracker);
        }
    }

    public void fichaXMLConverterClassesList(){
        if (fichaXML != null && fichaJSON != null
                && fichaJSON.getBuild() != null
                && fichaJSON.getBuild().getClasse() != null
                && fichaJSON.getBuild().getLevel() != 0) {
            if (fichaXML.getCharacter() == null) {
                fichaXML.setCharacter(new Character());
            }

            ClasseEnum classeEnum = ClasseEnum.getClasseEnum(fichaJSON.getBuild().getClasse());

            Classe classe = new Classe(fichaJSON.getBuild().getLevel(), classeEnum.getName(), classeEnum.getShortcut());
            ClassesList classesList = new ClassesList();
            classesList.putEntry(classe);

            fichaXML.getCharacter().setClasses(classesList);
        }

    }

    public void fichaXMLConverterCoins(){
        if (fichaXML != null && fichaJSON != null
                && fichaJSON.getBuild() != null
                && fichaJSON.getBuild().getMoney() != null) {
            if (fichaXML.getCharacter() == null) {
                fichaXML.setCharacter(new Character());
            }

            Slot CP, SP, GP, PP;
            CP = new Slot(fichaJSON.getBuild().getMoney().getCp(), "CP");
            SP = new Slot(fichaJSON.getBuild().getMoney().getSp(), "SP");
            GP = new Slot(fichaJSON.getBuild().getMoney().getGp(), "GP");
            PP = new Slot(fichaJSON.getBuild().getMoney().getPp(), "PP");

            Coins coins = new Coins();
            coins.putEntry(CP);
            coins.putEntry(SP);
            coins.putEntry(GP);
            coins.putEntry(PP);

            fichaXML.getCharacter().setCoins(coins);
        }
    }

    public void fichaXMLConverterDefenses(){
        if (fichaXML.getCharacter() == null) {
            fichaXML.setCharacter(new Character());
        }

        fichaXML.getCharacter().setDefenses("");
    }

    public void fichaXMLConvertDeityLink(){
        if (fichaXML.getCharacter() == null) {
            fichaXML.setCharacter(new Character());
        }

        fichaXML.getCharacter().setDeityLink(new ElementoWindowReference("",""));

    }

    public void fichaXMLConvertEncumbrance(){
        if (fichaXML.getCharacter() == null) {
            fichaXML.setCharacter(new Character());
        }

        fichaXML.getCharacter().setEncumbrance(null);

    }

    public void fichaXMLConvertExp(){
        if (fichaXML.getCharacter() == null) {
            fichaXML.setCharacter(new Character());
        }

        fichaXML.getCharacter().setExp(null);

    }

    public void fichaXMLConvertExpNeeded(){
        if (fichaXML.getCharacter() == null) {
            fichaXML.setCharacter(new Character());
        }

        fichaXML.getCharacter().setExpNeeded(null);

    }

    public void fichaXMLConvertFeatList(){
        if (fichaXML != null && fichaJSON != null
                && fichaJSON.getBuild() != null
                && fichaJSON.getBuild().getFeats() != null) {
            if (fichaXML.getCharacter() == null) {
                fichaXML.setCharacter(new Character());
            }

            FeatList featList = new FeatList();

            for (List<String> featJSON : fichaJSON.getBuild().getFeats()){
                String featName = featJSON.get(0);

                Feat featXML = FeatEnum.getFeatEnum(featName).getFeat();
                featList.putEntry(featXML);
            }

            fichaXML.getCharacter().setFeatList(featList);
        }
    }

    public void fichaXMLConvertHero(){
        if (fichaXML.getCharacter() == null){
            fichaXML.setCharacter(new Character());
        }

        fichaXML.getCharacter().setHero(new ElementoNumber(1));
    }

    public void fichaXMLConvertHp(){
        if (fichaXML != null && fichaJSON != null
                && fichaJSON.getBuild() != null
                && fichaJSON.getBuild().getAttributes() != null
                && fichaJSON.getBuild().getAbilities() != null
                && fichaJSON.getBuild().getLevel() != 0) {
            if (fichaXML.getCharacter() == null) {
                fichaXML.setCharacter(new Character());
            }

            int ancestry = fichaJSON.getBuild().getAttributes().getAncestryHp();
            int classPerLevel = fichaJSON.getBuild().getAttributes().getClassHp()
                    + fichaJSON.getBuild().getAttributes().getBonusHpPerLevel();
            int classTotal = classPerLevel * fichaJSON.getBuild().getLevel();
            int miscMod = fichaJSON.getBuild().getAttributes().getBonusHp();
            int total = ancestry + classTotal + miscMod;

            HP hp = new HP(ancestry, 0, classPerLevel, classTotal, total, 0, miscMod, 0,
                    0, total, 0, 0);

            fichaXML.getCharacter().setHp(hp);
        }
    }

    public void fichaXMLConvertInitiative(){
        if (fichaXML != null && fichaJSON != null
                && fichaJSON.getBuild() != null
                && fichaJSON.getBuild().getProficiencies() != null) {
            if (fichaXML.getCharacter() == null) {
                fichaXML.setCharacter(new Character());
            }
            if (fichaXML.getCharacter().getAbilities() == null){
                this.fichaXMLConvertAbilities();
            }

            int perception = fichaJSON.getBuild().getLevel()
                    + fichaJSON.getBuild().getProficiencies().getPerception()
                    + fichaXML.getCharacter().getAbilities().getWisdom().getBonus().getConteudoInt();
            int stealth = fichaJSON.getBuild().getLevel()
                    + fichaJSON.getBuild().getProficiencies().getStealth()
                    + fichaXML.getCharacter().getAbilities().getDexterity().getBonus().getConteudoInt();

            Initiative initiative = new Initiative(0, perception, 0, perception, stealth,
                    0, stealth);

            fichaXML.getCharacter().setInitiative(initiative);
        }
    }

    public void fichaXMLConvertInventoryList(){
        if (fichaXML != null && fichaJSON != null
                && fichaJSON.getBuild() != null
                && fichaJSON.getBuild().getEquipment() != null
                && fichaJSON.getBuild().getWeapons() != null
                && fichaJSON.getBuild().getArmor() != null) {
            if (fichaXML.getCharacter() == null) {
                fichaXML.setCharacter(new Character());
            }

            InventoryList inventoryList = new InventoryList();

            for (List<String> featJSON : fichaJSON.getBuild().getEquipment()){
                String itemName = featJSON.get(0);
                int qtd = Integer.parseInt(featJSON.get(1));

                Item itemXML = ItemEnum.getItemEnum(itemName).getItem(qtd);
                inventoryList.putEntry(itemXML);
            }

            for (Weapon weapon : fichaJSON.getBuild().getWeapons()){
                String itemName = weapon.getName();
                int qtd = weapon.getQty();
                String die = weapon.getDie();

                if (die != null && die.substring(0, 1).equals("d"))
                    die = "1".concat(die);

                Item itemXML = ItemEnum.getItemEnum(itemName).getItem(qtd);
                itemXML.setDamage(new ElementoString(die));

                inventoryList.putEntry(itemXML);
            }

            for (Armor armor : fichaJSON.getBuild().getArmor()){
                String itemName = armor.getName();
                int qtd = armor.getQty();

                Item itemXML = ItemEnum.getItemEnum(itemName).getItem(qtd);

                inventoryList.putEntry(itemXML);
            }

            fichaXML.getCharacter().setInventoryList(inventoryList);
        }
    }

    public void fichaXMLConvertLanguageList(){
        if (fichaXML != null && fichaJSON != null
                && fichaJSON.getBuild() != null
                && fichaJSON.getBuild().getLanguages() != null) {
            if (fichaXML.getCharacter() == null) {
                fichaXML.setCharacter(new Character());
            }

            LanguageList languageList = new LanguageList();

            for (String languageJSON : fichaJSON.getBuild().getLanguages()){
                Language languageXML = new Language(languageJSON);

                languageList.putEntry(languageXML);
            }

            fichaXML.getCharacter().setLanguageList(languageList);
        }
    }

    public void fichaXMLConvertLevel(){
        if (fichaXML != null && fichaJSON != null
                && fichaJSON.getBuild() != null
                && fichaJSON.getBuild().getLevel() != 0){
            if (fichaXML.getCharacter() == null){
                fichaXML.setCharacter(new Character());
            }

            ElementoNumber level = new ElementoNumber(fichaJSON.getBuild().getLevel());
            fichaXML.getCharacter().setLevel(level);
        }
    }

    public void fichaXMLConvertName(){
        if (fichaXML != null && fichaJSON != null
                && fichaJSON.getBuild() != null
                && fichaJSON.getBuild().getName() != null){
            if (fichaXML.getCharacter() == null){
                fichaXML.setCharacter(new Character());
            }

            ElementoString name = new ElementoString(fichaJSON.getBuild().getName());
            fichaXML.getCharacter().setName(name);
        }
    }

    public void fichaXMLConvertProficiencies(){
        if (fichaXML != null && fichaJSON != null
                && fichaJSON.getBuild() != null
                && fichaJSON.getBuild().getProficiencies() != null
                && fichaJSON.getBuild().getLevel() != 0) {
            if (fichaXML.getCharacter() == null) {
                fichaXML.setCharacter(new Character());
            }

            int lightArmorProfBonus = fichaJSON.getBuild().getProficiencies().getLight();
            ProficiencyLevelEnum lightArmorProfLevel = ProficiencyLevelEnum.getProficiencyLevelEnum(lightArmorProfBonus);
            Defense defenseLight = new Defense("Light armor",
                    lightArmorProfBonus + fichaJSON.getBuild().getLevel(), lightArmorProfLevel.getName());

            int mediumArmorProfBonus = fichaJSON.getBuild().getProficiencies().getMedium();
            ProficiencyLevelEnum mediumArmorProfLevel = ProficiencyLevelEnum.getProficiencyLevelEnum(mediumArmorProfBonus);
            Defense defenseMedium = new Defense("Medium armor",
                    mediumArmorProfBonus + fichaJSON.getBuild().getLevel(), mediumArmorProfLevel.getName());

            int heavyArmorProfBonus = fichaJSON.getBuild().getProficiencies().getHeavy();
            ProficiencyLevelEnum heavyArmorProfLevel = ProficiencyLevelEnum.getProficiencyLevelEnum(heavyArmorProfBonus);
            Defense defenseHeavy = new Defense("Heavy armor",
                    heavyArmorProfBonus + fichaJSON.getBuild().getLevel(), heavyArmorProfLevel.getName());

            int unarmoredArmorProfBonus = fichaJSON.getBuild().getProficiencies().getUnarmored();
            ProficiencyLevelEnum unarmoredArmorProfLevel = ProficiencyLevelEnum.getProficiencyLevelEnum(unarmoredArmorProfBonus);
            Defense defenseUnarmored = new Defense("Unarmored",
                    unarmoredArmorProfBonus + fichaJSON.getBuild().getLevel(), unarmoredArmorProfLevel.getName());

            DefensesList defensesList = new DefensesList();
            defensesList.putEntry(defenseLight);
            defensesList.putEntry(defenseMedium);
            defensesList.putEntry(defenseHeavy);
            defensesList.putEntry(defenseUnarmored);

            Proficiencies proficiencies = new Proficiencies();
            proficiencies.setDefensesList(defensesList);

            fichaXML.getCharacter().setProficiencies(proficiencies);
        }
    }

    public void fichaXMLConvertProficiencyList(){
        if (fichaXML != null && fichaJSON != null
                && fichaJSON.getBuild() != null
                && fichaJSON.getBuild().getProficiencies() != null) {
            if (fichaXML.getCharacter() == null) {
                fichaXML.setCharacter(new Character());
            }

            String proficiencyWeaponString = "Weapons:";

            ProficiencyLevelEnum simpleProfLevel = ProficiencyLevelEnum
                    .getProficiencyLevelEnum(fichaJSON.getBuild().getProficiencies().getSimple());
            String simpleProfLevelName = simpleProfLevel.getName().substring(0, 1).toUpperCase()
                    + simpleProfLevel.getName().substring(1);
            proficiencyWeaponString = proficiencyWeaponString.concat(" " + simpleProfLevelName + " in simple weapons.");

            ProficiencyLevelEnum martialProfLevel = ProficiencyLevelEnum
                    .getProficiencyLevelEnum(fichaJSON.getBuild().getProficiencies().getMartial());
            String martialProfLevelName = simpleProfLevel.getName().substring(0, 1).toUpperCase()
                    + simpleProfLevel.getName().substring(1);
            proficiencyWeaponString = proficiencyWeaponString.concat(" " + martialProfLevelName + " in martial weapons.");

            ProficiencyLevelEnum advancedProfLevel = ProficiencyLevelEnum
                    .getProficiencyLevelEnum(fichaJSON.getBuild().getProficiencies().getAdvanced());
            String advancedProfLevelName = simpleProfLevel.getName().substring(0, 1).toUpperCase()
                    + simpleProfLevel.getName().substring(1);
            proficiencyWeaponString = proficiencyWeaponString.concat(" " + advancedProfLevelName + " in advanced weapons.");

            ProficiencyLevelEnum unarmedProfLevel = ProficiencyLevelEnum
                    .getProficiencyLevelEnum(fichaJSON.getBuild().getProficiencies().getUnarmed());
            String unarmedProfLevelName = simpleProfLevel.getName().substring(0, 1).toUpperCase()
                    + simpleProfLevel.getName().substring(1);
            proficiencyWeaponString = proficiencyWeaponString.concat(" " + unarmedProfLevelName + " in unarmed weapons.");

            Proficiency proficiencyWeapon = new Proficiency(proficiencyWeaponString);

            ProficiencyList proficiencyList = new ProficiencyList();
            proficiencyList.putEntry(proficiencyWeapon);

            fichaXML.getCharacter().setProficiencyList(proficiencyList);
        }
    }

    public void fichaXMLConvertRace(){
        if (fichaXML != null && fichaJSON != null
                && fichaJSON.getBuild() != null
                && fichaJSON.getBuild().getAncestry() != null){
            if (fichaXML.getCharacter() == null){
                fichaXML.setCharacter(new Character());
            }

            ElementoString race = new ElementoString(fichaJSON.getBuild().getAncestry());
            fichaXML.getCharacter().setRace(race);
        }
    }

    public void fichaXMLConvertRaceLink(){
        if (fichaXML != null && fichaJSON != null
                && fichaJSON.getBuild() != null
                && fichaJSON.getBuild().getAncestry() != null) {
            if (fichaXML.getCharacter() == null) {
                fichaXML.setCharacter(new Character());
            }

            ElementoWindowReference raceLink = AncestryEnum
                    .getAncestry(fichaJSON.getBuild().getAncestry())
                    .getRaceLink();

            fichaXML.getCharacter().setRaceLink(raceLink);
        }
    }

    public void fichaXMLConvertReactionUsed(){
        if (fichaXML.getCharacter() == null) {
            fichaXML.setCharacter(new Character());
        }

        fichaXML.getCharacter().setReactionUsed(ElementoNumber.elementoNumberZero());

    }

    public void fichaXMLConvertSaves(){
        if (fichaXML != null && fichaJSON != null
                && fichaJSON.getBuild() != null
                && fichaJSON.getBuild().getProficiencies() != null
                && fichaJSON.getBuild().getLevel() != 0){
            if (fichaXML.getCharacter() == null){
                fichaXML.setCharacter(new Character());
            }
            if (fichaXML.getCharacter().getAbilities() == null){
                this.fichaXMLConvertAbilities();
            }

            int abilityModFort = fichaXML.getCharacter().getAbilities().getConstitution().getBonus().getConteudoInt();
            int baseFort = fichaJSON.getBuild().getLevel() + fichaJSON.getBuild().getProficiencies().getFortitude();
            String profLevelFort = ProficiencyLevelEnum
                    .getProficiencyLevelEnum(fichaJSON.getBuild().getProficiencies().getFortitude())
                    .getName();
            int totalFort = abilityModFort + baseFort;
            SaveType fortitude = new SaveType(abilityModFort, baseFort, 0, profLevelFort, 0, totalFort);

            int abilityModRef = fichaXML.getCharacter().getAbilities().getConstitution().getBonus().getConteudoInt();
            int baseRef = fichaJSON.getBuild().getLevel() + fichaJSON.getBuild().getProficiencies().getFortitude();
            String profLevelRef = ProficiencyLevelEnum
                    .getProficiencyLevelEnum(fichaJSON.getBuild().getProficiencies().getFortitude())
                    .getName();
            int totalRef = abilityModRef + baseRef;
            SaveType reflex = new SaveType(abilityModRef, baseRef, 0, profLevelRef, 0, totalRef);

            int abilityModWill = fichaXML.getCharacter().getAbilities().getWisdom().getBonus().getConteudoInt();
            int baseWill = fichaJSON.getBuild().getLevel() + fichaJSON.getBuild().getProficiencies().getWill();
            String profLevelWill = ProficiencyLevelEnum
                    .getProficiencyLevelEnum(fichaJSON.getBuild().getProficiencies().getWill())
                    .getName();
            int totalWill = abilityModWill + baseWill;
            SaveType will = new SaveType(abilityModWill, baseWill, 0, profLevelWill, 0, totalWill);

            Saves saves = new Saves(fortitude, reflex, will);

            fichaXML.getCharacter().setSaves(saves);
        }
    }

    public void fichaXMLConvertSize(){
        if (fichaXML != null && fichaJSON != null
                && fichaJSON.getBuild() != null
                && fichaJSON.getBuild().getAncestry() != null){
            if (fichaXML.getCharacter() == null){
                fichaXML.setCharacter(new Character());
            }

            String size = AncestryEnum
                    .getAncestry(fichaJSON.getBuild().getAncestry())
                    .getSize();

            fichaXML.getCharacter().setSize(new ElementoString(size));
        }
    }

    public void fichaXMLConvertSkillList(){
        if (fichaXML != null && fichaJSON != null
                && fichaJSON.getBuild() != null
                && fichaJSON.getBuild().getProficiencies() != null
                && fichaJSON.getBuild().getLevel() != 0){
            if (fichaXML.getCharacter() == null) {
                fichaXML.setCharacter(new Character());
            }

            int acrobaticsProfBonus = fichaJSON.getBuild().getLevel() + fichaJSON.getBuild().getProficiencies().getAcrobatics();
            String acrobaticsProfLevel = ProficiencyLevelEnum.getProficiencyLevelEnum(fichaJSON.getBuild().getProficiencies().getAcrobatics()).getName();
            int acrobaticsStat = fichaXML.getCharacter().getAbilities().getDexterity().getBonus().getConteudoInt();
            int acrobaticsTotal = acrobaticsProfBonus + acrobaticsStat;
            Skill acrobatics = new Skill(0, "Acrobatics", 0, acrobaticsProfBonus,
                    acrobaticsProfLevel, 1, acrobaticsStat, 0, "dexterity",
                    null, acrobaticsTotal);

            int arcanaProfBonus = fichaJSON.getBuild().getLevel() + fichaJSON.getBuild().getProficiencies().getArcana();
            String arcanaProfLevel = ProficiencyLevelEnum.getProficiencyLevelEnum(fichaJSON.getBuild().getProficiencies().getArcana()).getName();
            int arcanaStat  = fichaXML.getCharacter().getAbilities().getIntelligence().getBonus().getConteudoInt();
            int arcanaTotal = arcanaProfBonus + arcanaStat;
            Skill arcana = new Skill(0, "Arcana", 0, arcanaProfBonus,
                    arcanaProfLevel, 1, arcanaStat, 0, "intelligence",
                    null, arcanaTotal);

            int athleticsProfBonus = fichaJSON.getBuild().getLevel() + fichaJSON.getBuild().getProficiencies().getAthletics();
            String athleticsProfLevel = ProficiencyLevelEnum.getProficiencyLevelEnum(fichaJSON.getBuild().getProficiencies().getAthletics()).getName();
            int athleticsStat = fichaXML.getCharacter().getAbilities().getStrength().getBonus().getConteudoInt();
            int athleticsTotal = athleticsProfBonus + athleticsStat;
            Skill athletics = new Skill(0, "Athletics", 0, athleticsProfBonus,
                    athleticsProfLevel, 1, athleticsStat, 0, "strength",
                    null, athleticsTotal);

            int craftingProfBonus = fichaJSON.getBuild().getLevel() + fichaJSON.getBuild().getProficiencies().getCrafting();
            String craftingProfLevel = ProficiencyLevelEnum.getProficiencyLevelEnum(fichaJSON.getBuild().getProficiencies().getCrafting()).getName();
            int craftingStat = fichaXML.getCharacter().getAbilities().getIntelligence().getBonus().getConteudoInt();
            int craftingTotal = craftingProfBonus + craftingStat;
            Skill crafting = new Skill(0, "Crafting", 0, craftingProfBonus,
                    craftingProfLevel, 1, craftingStat, 0, "intelligence",
                    null, craftingTotal);

            int deceptionProfBonus = fichaJSON.getBuild().getLevel() + fichaJSON.getBuild().getProficiencies().getDeception();
            String deceptionProfLevel = ProficiencyLevelEnum.getProficiencyLevelEnum(fichaJSON.getBuild().getProficiencies().getDeception()).getName();
            int deceptionStat = fichaXML.getCharacter().getAbilities().getCharisma().getBonus().getConteudoInt();
            int deceptionTotal = deceptionProfBonus + deceptionStat;
            Skill deception = new Skill(0, "Deception", 0, deceptionProfBonus,
                    deceptionProfLevel, 1, deceptionStat, 0, "charisma",
                    null, deceptionTotal);

            int diplomacyProfBonus = fichaJSON.getBuild().getLevel() + fichaJSON.getBuild().getProficiencies().getDiplomacy();
            String diplomacyProfLevel = ProficiencyLevelEnum.getProficiencyLevelEnum(fichaJSON.getBuild().getProficiencies().getDiplomacy()).getName();
            int diplomacyStat = fichaXML.getCharacter().getAbilities().getCharisma().getBonus().getConteudoInt();
            int diplomacyTotal = diplomacyProfBonus + diplomacyStat;
            Skill diplomacy = new Skill(0, "Diplomacy", 0, diplomacyProfBonus,
                    diplomacyProfLevel, 1, diplomacyStat, 0, "charisma",
                    null, diplomacyTotal);

            int intimidationProfBonus = fichaJSON.getBuild().getLevel() + fichaJSON.getBuild().getProficiencies().getIntimidation();
            String intimidationProfLevel = ProficiencyLevelEnum.getProficiencyLevelEnum(fichaJSON.getBuild().getProficiencies().getIntimidation()).getName();
            int intimidationStat = fichaXML.getCharacter().getAbilities().getCharisma().getBonus().getConteudoInt();
            int intimidationTotal = intimidationProfBonus + intimidationStat;
            Skill intimidation = new Skill(0, "Intimidation", 0, intimidationProfBonus,
                    intimidationProfLevel, 1, intimidationStat, 0, "charisma",
                    null, intimidationTotal);

            int medicineProfBonus = fichaJSON.getBuild().getLevel() + fichaJSON.getBuild().getProficiencies().getMedicine();
            String medicineProfLevel = ProficiencyLevelEnum.getProficiencyLevelEnum(fichaJSON.getBuild().getProficiencies().getMedicine()).getName();
            int medicineStat = fichaXML.getCharacter().getAbilities().getWisdom().getBonus().getConteudoInt();
            int medicineTotal = medicineProfBonus + medicineStat;
            Skill medicine = new Skill(0, "Medicine", 0, medicineProfBonus,
                    medicineProfLevel, 1, medicineStat, 0, "wisdom",
                    null, medicineTotal);

            int natureProfBonus = fichaJSON.getBuild().getLevel() + fichaJSON.getBuild().getProficiencies().getNature();
            String natureProfLevel = ProficiencyLevelEnum.getProficiencyLevelEnum(fichaJSON.getBuild().getProficiencies().getNature()).getName();
            int natureStat  = fichaXML.getCharacter().getAbilities().getWisdom().getBonus().getConteudoInt();
            int natureTotal = natureProfBonus + natureStat;
            Skill nature = new Skill(0, "Nature", 0, natureProfBonus,
                    natureProfLevel, 1, natureStat, 0, "wisdom",
                    null, natureTotal);

            int occultismProfBonus = fichaJSON.getBuild().getLevel() + fichaJSON.getBuild().getProficiencies().getOccultism();
            String occultismProfLevel = ProficiencyLevelEnum.getProficiencyLevelEnum(fichaJSON.getBuild().getProficiencies().getOccultism()).getName();
            int occultismStat = fichaXML.getCharacter().getAbilities().getIntelligence().getBonus().getConteudoInt();
            int occultismTotal = occultismProfBonus + occultismStat;
            Skill occultism = new Skill(0, "Occultism", 0, occultismProfBonus,
                    occultismProfLevel, 1, occultismStat, 0, "intelligence",
                    null, occultismTotal);

            int perceptionProfBonus = fichaJSON.getBuild().getLevel() + fichaJSON.getBuild().getProficiencies().getPerception();
            String perceptionProfLevel = ProficiencyLevelEnum.getProficiencyLevelEnum(fichaJSON.getBuild().getProficiencies().getPerception()).getName();
            int perceptionStat = fichaXML.getCharacter().getAbilities().getWisdom().getBonus().getConteudoInt();
            int perceptionTotal = perceptionProfBonus + perceptionStat;
            Skill perception = new Skill(0, "Perception", 0, perceptionProfBonus,
                    perceptionProfLevel, 1, perceptionStat, 0, "wisdom",
                    null, perceptionTotal);

            int performanceProfBonus = fichaJSON.getBuild().getLevel() + fichaJSON.getBuild().getProficiencies().getPerformance();
            String performanceProfLevel = ProficiencyLevelEnum.getProficiencyLevelEnum(fichaJSON.getBuild().getProficiencies().getPerformance()).getName();
            int performanceStat = fichaXML.getCharacter().getAbilities().getCharisma().getBonus().getConteudoInt();
            int performanceTotal = performanceProfBonus + performanceStat;
            Skill performance = new Skill(0, "Performance", 0, performanceProfBonus,
                    performanceProfLevel, 1, performanceStat, 0, "charisma",
                    null, performanceTotal);

            int religionProfBonus = fichaJSON.getBuild().getLevel() + fichaJSON.getBuild().getProficiencies().getReligion();
            String religionProfLevel = ProficiencyLevelEnum.getProficiencyLevelEnum(fichaJSON.getBuild().getProficiencies().getReligion()).getName();
            int religionStat = fichaXML.getCharacter().getAbilities().getWisdom().getBonus().getConteudoInt();
            int religionTotal = religionProfBonus + religionStat;
            Skill religion = new Skill(0, "Religion", 0, religionProfBonus,
                    religionProfLevel, 1, religionStat, 0, "wisdom",
                    null, religionTotal);

            int societyProfBonus = fichaJSON.getBuild().getLevel() + fichaJSON.getBuild().getProficiencies().getSociety();
            String societyProfLevel = ProficiencyLevelEnum.getProficiencyLevelEnum(fichaJSON.getBuild().getProficiencies().getSociety()).getName();
            int societyStat = fichaXML.getCharacter().getAbilities().getIntelligence().getBonus().getConteudoInt();
            int societyTotal = societyProfBonus + societyStat;
            Skill society = new Skill(0, "Society", 0, societyProfBonus,
                    societyProfLevel, 1, societyStat, 0, "intelligence",
                    null, societyTotal);

            int stealthProfBonus = fichaJSON.getBuild().getLevel() + fichaJSON.getBuild().getProficiencies().getStealth();
            String stealthProfLevel = ProficiencyLevelEnum.getProficiencyLevelEnum(fichaJSON.getBuild().getProficiencies().getStealth()).getName();
            int stealthStat = fichaXML.getCharacter().getAbilities().getDexterity().getBonus().getConteudoInt();
            int stealthTotal = stealthProfBonus + stealthStat;
            Skill stealth = new Skill(0, "Stealth", 0, stealthProfBonus,
                    stealthProfLevel, 1, stealthStat, 0, "dexterity",
                    null, stealthTotal);

            int survivalProfBonus = fichaJSON.getBuild().getLevel() + fichaJSON.getBuild().getProficiencies().getSurvival();
            String survivalProfLevel = ProficiencyLevelEnum.getProficiencyLevelEnum(fichaJSON.getBuild().getProficiencies().getSurvival()).getName();
            int survivalStat = fichaXML.getCharacter().getAbilities().getWisdom().getBonus().getConteudoInt();
            int survivalTotal = survivalProfBonus + survivalStat;
            Skill survival = new Skill(0, "Survival", 0, survivalProfBonus,
                    survivalProfLevel, 1, survivalStat, 0, "wisdom",
                    null, survivalTotal);

            int thieveryProfBonus = fichaJSON.getBuild().getLevel() + fichaJSON.getBuild().getProficiencies().getThievery();
            String thieveryProfLevel = ProficiencyLevelEnum.getProficiencyLevelEnum(fichaJSON.getBuild().getProficiencies().getThievery()).getName();
            int thieveryStat = fichaXML.getCharacter().getAbilities().getDexterity().getBonus().getConteudoInt();
            int thieveryTotal = thieveryProfBonus + thieveryStat;
            Skill thievery = new Skill(0, "Thievery", 0, thieveryProfBonus,
                    thieveryProfLevel, 1, thieveryStat, 0, "dexterity",
                    null, thieveryTotal);

            SkillList skillList = new SkillList();
            skillList.putEntry(acrobatics);
            skillList.putEntry(arcana);
            skillList.putEntry(athletics);
            skillList.putEntry(crafting);
            skillList.putEntry(deception);
            skillList.putEntry(diplomacy);
            skillList.putEntry(intimidation);
            skillList.putEntry(medicine);
            skillList.putEntry(nature);
            skillList.putEntry(occultism);
            skillList.putEntry(perception);
            skillList.putEntry(performance);
            skillList.putEntry(religion);
            skillList.putEntry(society);
            skillList.putEntry(stealth);
            skillList.putEntry(survival);
            skillList.putEntry(thievery);

            int loreStat = fichaXML.getCharacter().getAbilities().getIntelligence().getBonus().getConteudoInt();
            for (List<String> loreJSON : fichaJSON.getBuild().getLores()){
                int loreProfBonus = Integer.parseInt(loreJSON.get(1));
                int loreProfBonusWithLevel = fichaJSON.getBuild().getLevel() + loreProfBonus;
                String loreProfLevel = ProficiencyLevelEnum.getProficiencyLevelEnum(loreProfBonus).getName();
                int loreTotal = loreProfBonusWithLevel + loreStat;

                Skill loreSkill = new Skill(0, "Lore", 0, loreProfBonusWithLevel,
                        loreProfLevel, 1, loreStat, 0, "intelligence",
                        loreJSON.get(0), loreTotal);

                skillList.putEntry(loreSkill);
            }

            fichaXML.getCharacter().setSkillList(skillList);
        }
    }

    public void fichaXMLConvertSkillPoints(){
        if (fichaXML.getCharacter() == null){
            fichaXML.setCharacter(new Character());
        }

        SkillPoints skillPoints = new SkillPoints(ElementoNumber.elementoNumberZero());

        fichaXML.getCharacter().setSkillPoints(skillPoints);
    }

    public void fichaXMLConvertSpecialAbilityList(){
        //TODO
        if (fichaXML.getCharacter() == null){
            fichaXML.setCharacter(new Character());
        }

        fichaXML.getCharacter().setSpecialAbilityList(null);
    }

    public void fichaXMLConvertSpeed(){
        if (fichaXML != null && fichaJSON != null
                && fichaJSON.getBuild() != null
                && fichaJSON.getBuild().getAttributes() != null){
            if (fichaXML.getCharacter() == null){
                fichaXML.setCharacter(new Character());
            }

            int speedInt = fichaJSON.getBuild().getAttributes().getSpeed();

            Speed speed = new Speed(0, speedInt, speedInt, 0, 0, speedInt);

            fichaXML.getCharacter().setSpeed(speed);
        }
    }

    public void fichaXMLConvertSpellSet(){
        //TODO
        if (fichaXML.getCharacter() == null){
            fichaXML.setCharacter(new Character());
        }

        fichaXML.getCharacter().setSpellSet(null);
    }

    public void fichaXMLConvertTemp(){
        //TODO
        if (fichaXML.getCharacter() == null){
            fichaXML.setCharacter(new Character());
        }

        fichaXML.getCharacter().setTemp(null);
    }

    public void fichaXMLConvertToken(){
        //TODO
        if (fichaXML.getCharacter() == null){
            fichaXML.setCharacter(new Character());
        }

        fichaXML.getCharacter().setToken(null);
    }

    public void fichaXMLConvertTraitList(){
        //TODO
        if (fichaXML.getCharacter() == null){
            fichaXML.setCharacter(new Character());
        }

        fichaXML.getCharacter().setTraitList(null);
    }

    public void fichaXMLConvertTraits(){
        if (fichaXML != null && fichaJSON != null
                && fichaJSON.getBuild() != null
                && fichaJSON.getBuild().getAcTotal() != null){
            if (fichaXML.getCharacter() == null){
                fichaXML.setCharacter(new Character());
            }

            List<String> traitsList = new ArrayList<String>();

            traitsList.addAll(AncestryEnum
                    .getAncestry(fichaJSON.getBuild().getAncestry())
                    .getTraits());

            String traits = StringUtils.join(traitsList, " ");

            fichaXML.getCharacter().setTraits(new ElementoString(traits));
        }
    }

    public void fichaXMLConvertWealth(){
        //TODO
        if (fichaXML.getCharacter() == null){
            fichaXML.setCharacter(new Character());
        }

        fichaXML.getCharacter().setWealth(null);
    }

    public void fichaXMLConvertWeaponList(){
        //TODO
        if (fichaXML.getCharacter() == null){
            fichaXML.setCharacter(new Character());
        }

        fichaXML.getCharacter().setWeaponList(null);
    }
}
