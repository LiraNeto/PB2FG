package com.liraneto.controller;

import com.liraneto.controller.enums.AncestryEnum;
import com.liraneto.controller.enums.ProficiencyLevelEnum;
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
import com.liraneto.model.xml.elementosType.ElementoNumber;
import com.liraneto.model.xml.elementosType.ElementoString;

import java.util.List;

public class JSON2XML {

    public static void fichaXMLConvertAbilities (FichaXML fichaXML, FichaJSON fichaJSON){
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

    public static void fichaXMLConvertAC (FichaXML fichaXML, FichaJSON fichaJSON){
        if (fichaXML != null && fichaJSON != null
                && fichaJSON.getBuild() != null
                && fichaJSON.getBuild().getAcTotal() != null){
            if (fichaXML.getCharacter() == null){
                fichaXML.setCharacter(new Character());
            }

            int abilityMod = fichaJSON.getBuild().getAbilities().getDex();
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
                    .getSize();
            int temporary = 0;

            Sources sources = new Sources(abilityMod, acItem, acMisc, acShieldActive, armor, prof, profLevel,
                    shield, shieldRaised, size, temporary);
            Totals totals = new Totals(fichaJSON.getBuild().getAcTotal().getAcTotal());
            AC ac = new AC(sources, totals);

            fichaXML.getCharacter().setAc(ac);
        }
    }

    public static void fichaXMLConvertBackground (FichaXML fichaXML, FichaJSON fichaJSON){
        if (fichaXML != null && fichaJSON != null
                && fichaJSON.getBuild() != null
                && fichaJSON.getBuild().getBackground() != null){
            if (fichaXML.getCharacter() == null){
                fichaXML.setCharacter(new Character());
            }

            ElementoString background = new ElementoString(fichaJSON.getBuild().getBackground());
            fichaXML.getCharacter().setBackground(background);
        }
    }

    public static void fichaXMLConvertClassLevel (FichaXML fichaXML, FichaJSON fichaJSON){
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



    public static void fichaXMLConvertCharGenTracker (FichaXML fichaXML, FichaJSON fichaJSON){
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

    public static void fichaXMLConvertLevel (FichaXML fichaXML, FichaJSON fichaJSON){
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

    public static void fichaXMLConvertName (FichaXML fichaXML, FichaJSON fichaJSON){
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

    public static void fichaXMLConvertRace (FichaXML fichaXML, FichaJSON fichaJSON){
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
}
