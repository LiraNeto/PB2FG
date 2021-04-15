package com.liraneto;

import com.liraneto.controller.JSON;
import com.liraneto.controller.JSON2XML;
import com.liraneto.controller.XML;
import com.liraneto.model.json.FichaJSON;
import com.liraneto.model.xml.FichaXML;
import com.liraneto.model.xml.character.Character;
import com.liraneto.model.xml.character.abilities.Abilities;
import com.liraneto.model.xml.character.ac.AC;
import com.liraneto.model.xml.character.ac.Sources;
import com.liraneto.model.xml.character.ac.Totals;
import com.liraneto.model.xml.character.attackBonus.AttackBonus;
import com.liraneto.model.xml.character.attackBonus.AttackType;
import com.liraneto.model.xml.character.classes.Classe;
import com.liraneto.model.xml.character.classes.ClassesList;
import com.liraneto.model.xml.character.coins.Coins;
import com.liraneto.model.xml.character.coins.Slot;
import com.liraneto.model.xml.character.encumbrance.Encumbrance;
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
import com.liraneto.model.xml.character.specialAbilityList.SpecialAbility;
import com.liraneto.model.xml.character.specialAbilityList.SpecialAbilityList;
import com.liraneto.model.xml.character.speed.Speed;
import com.liraneto.model.xml.character.spellSet.SpellSet;
import com.liraneto.model.xml.character.temp.Temp;
import com.liraneto.model.xml.character.traitList.Trait;
import com.liraneto.model.xml.character.traitList.TraitList;
import com.liraneto.model.xml.character.wealth.Wealth;
import com.liraneto.model.xml.character.weaponList.Damage;
import com.liraneto.model.xml.character.weaponList.DamageList;
import com.liraneto.model.xml.character.weaponList.WeaponList;
import com.liraneto.model.xml.elementosType.ElementoNumber;
import com.liraneto.model.xml.elementosType.ElementoString;
import com.liraneto.model.xml.elementosType.ElementoToken;
import com.liraneto.model.xml.elementosType.ElementoWindowReference;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;
import java.io.StringReader;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        //generateItemConstructor();

        FichaJSON fichaJSON = JSON.getFichaJSONFromFile("D:\\Documentos\\Git\\1.json");

        JSON2XML conversor = new JSON2XML();
        conversor.setFichaJSON(fichaJSON);
        conversor.ConverterJSON2XML();

        FichaXML fichaXml = conversor.getFichaXML();

        XML xml = new XML(fichaXml);
        xml.jaxbObjectToXML();
    }

    public static Character generateCharacter(){
        Character character = new Character();
        character.setName(new ElementoString("Teste"));
        character.setLevel(new ElementoNumber(1));
        character.setToken(new ElementoToken());

        character.setAbilities(new Abilities());

        Sources sources = new Sources(0,0, 0, 0, 5, 3,
                "trained", 0, 0, 0, 0);
        Totals totals = new Totals(18);
        AC ac = new AC(sources, totals);
        character.setAc(ac);

        AttackType grapple = new AttackType(null, null, 0, null, null);
        AttackType melee = new AttackType(0, 0, 0, 0, 0);
        AttackType ranged = new AttackType(0, 0, 0, 0, 0);
        AttackBonus attackBonus = new AttackBonus(0, grapple, melee, ranged);
        character.setAttackBonus(attackBonus);

        character.setBackground(new ElementoString("BARKEEP"));

        character.setBackgroundLink(new ElementoWindowReference("reference_background",
                "reference.backgrounds.barkeep@Pathfinder Second Edition Core Rules"));

        Classe classe = new Classe(1, "Fighter",
                "reference.classes.fighter@Pathfinder Second Edition Core Rules");

        ClassesList classesList = new ClassesList();
        classesList.putEntry(classe);
        character.setClasses(classesList);

        character.setClasslevel(new ElementoString("Fighter 1"));

        Slot slot1 = new Slot(0, "PP");
        Slot slot2 = new Slot(0, "GP");
        Slot slot3 = new Slot(150, "SP");
        Slot slot4 = new Slot(0, "CP");

        Coins coins = new Coins();

        coins.putEntry(slot1);
        coins.putEntry(slot2);
        coins.putEntry(slot3);
        coins.putEntry(slot4);
        character.setCoins(coins);

        Encumbrance encumbrance = new Encumbrance(-3, 1, 1,
                10, 0, 5, -10);
        character.setEncumbrance(encumbrance);

        character.setExp(ElementoNumber.elementoNumberZero());
        character.setExpNeeded(ElementoNumber.elementoNumberZero());

        String a = "<p>You are skilled at learning information through conversation. The Gather Information exploration activity takes you half as long as normal (typically reducing the time to 1 hour). If you're a master in Diplomacy and you Gather Information at the normal speed, when you attempt to do so and roll a critical failure, you get a failure instead. There is still no guarantee that a rumor you learn with Gather Information is accurate.</p>";
        String b = "<p>You snap your shield in place to ward off a blow. Your shield prevents you from taking an amount of damage up to the shield's Hardness. You and the shield each take any remaining damage, possibly breaking or destroying the shield.</p>";
        Feat feat1 = new Feat(null, a, "corerules", 1, 1, 1, "Hobnobber",
                "trained in Diplomacy", "Gather Information rapidly", "GENERAL SKILL", null);
        Feat feat2 = new Feat("reaction", b, "corerules", 1, 1, 1,
                "Shield Block", null, "Ward off a blow with your shield", "GENERAL",
                "While you have your shield raised, you would take damage from a physical attack.");

        FeatList featList = new FeatList();
        featList.putEntry(feat1);
        featList.putEntry(feat2);
        character.setFeatList(featList);

        character.setHero(new ElementoNumber(0));

        HP hp = new HP(8, 0, 10, 10, 18, 0, 0, 0,
                0, 18, 0, 0);
        character.setHp(hp);

        Initiative initiative = new Initiative(0, 5, 0, 5, 0,
                0, 0);
        character.setInitiative(initiative);

        Item item2 = new Item( "5", "0", "16", "0", "3", "2", "-3",
                "180 sp", "1", null, null, "<p></p>", "<p></p>",
                "Plate", null, "0", "1", "0", "0", "0", "1",
                "1", "Half Plate (level 1)", "False", null, null,
                "1", "-10", "Heavy", null, "Armor", "0");
        Item item1 = new Item( null, null, null, "0", "1", "2",
                null, "10 sp", "1", "1d8", "slashing",
                "<p>Longswords can be one-edged or two-edged swords. Their blades are heavy and they're " +
                        "between 3 and 4 feet in length.</p>", "<p></p>", "Sword", "1",
                null, "1", null, null, "0", "1", null,
                "Longsword", "False", "0", "0", "1", null,
                "Martial Melee", "Versatile P", "Weapon", "0");

        InventoryList inventoryList = new InventoryList();
        inventoryList.putEntry(item1);
        inventoryList.putEntry(item2);
        character.setInventoryList(inventoryList);

        Language language1 = new Language("Common");
        LanguageList languageList = new LanguageList();
        languageList.putEntry(language1);
        character.setLanguageList(languageList);

        Defense defense1 = new Defense("Light armor", "3", "trained");
        DefensesList defensesList = new DefensesList();
        defensesList.putEntry(defense1);
        Proficiencies proficiencies = new Proficiencies();
        proficiencies.setDefensesList(defensesList);
        character.setProficiencies(proficiencies);

        Proficiency proficiency1 = new Proficiency("Weapon: Expert in simple weapons. Expert in martial weapons. " +
                "Trained in advanced weapons. Expert in unarmed attacks.");

        ProficiencyList proficiencyList = new ProficiencyList();
        proficiencyList.putEntry(proficiency1);
        character.setProficiencyList(proficiencyList);

        character.setRace(new ElementoString("Human"));

        character.setRaceLink (new ElementoWindowReference("referencerace",
                "reference.ancestries.human@Pathfinder Second Edition Core Rules"));

        character.setReactionUsed(new ElementoNumber(0));

        SaveType fortitude = new SaveType(0, 5,0, "expert", "0", "5");
        SaveType reflex = new SaveType(0, 5, 0, "expert", "0", "5");
        SaveType will = new SaveType(0, 3, 0, "trained", "0", "5");
        Saves saves = new Saves(fortitude, reflex, will);
        character.setSaves(saves);

        character.setSize(new ElementoString("Medium"));

        Skill skill1 = new Skill(0, "Arcana", 0, 0, null, 1,
                0, 0, "intelligence", null, 0);
        Skill skill2 = new Skill(0, "Lore", 0, 0, "trained", 1,
                0, 1, "intelligence", "Alcohol", 3);
        SkillList skillList = new SkillList();
        skillList.putEntry(skill1);
        skillList.putEntry(skill2);
        character.setSkillList(skillList);

        SkillPoints skillPoints = new SkillPoints(0);
        character.setSkillPoints(skillPoints);

        SpecialAbility specialAbility1 = new SpecialAbility("Fighter", 1, 1, 1, "Attack Of Opportunity", "<p></p>",
                "Fighter", "<p>Ever watchful for weaknesses, you can quickly attack foes that leave an " +
                "opening in their defenses. You gain the Attack of Opportunity reaction.</p>" +
                "<p><b>Attack of Opportunity &#157;</b></p>" +
                "<p><b>Trigger </b>A creature within your reach uses a manipulate action or a move action, makes a " +
                "ranged attack, or leaves a square during a move action it's using.</p>" +
                "<p>You lash out at a foe that leaves an opening. Make a melee Strike against the triggering creature. " +
                "If your attack is a critical hit and the trigger was a manipulate action, you disrupt that action. " +
                "This Strike doesn't count toward your multiple attack penalty, and your multiple attack penalty " +
                "doesn't apply to this Strike.</p>");
        SpecialAbilityList specialAbilityList = new SpecialAbilityList();
        specialAbilityList.putEntry(specialAbility1);
        character.setSpecialAbilityList(specialAbilityList);

        Speed speed = new Speed(-10, 25, 15, 0, 0, 25);
        character.setSpeed(speed);

        character.setSpellSet(new SpellSet());
        character.setTemp(new Temp());

        Trait trait1 = new Trait(1, 1, "Bonus Languages", "Human",
                "<p>Additional languages equal to 1 + your Intelligence modifier (if it's positive). Choose from " +
                        "the list of common languages and any other languages to which you have access (such as the " +
                        "languages prevalent in your region).</p>");
        Trait trait2 = new Trait(1, 1, "Ancestry Feats", "Human",
                "<p>At 1st level, you gain one ancestry feat, and you gain an additional ancestry feat every 4 " +
                        "levels thereafter (at 5th, 9th, 13th, and 17th level). As a human, you choose from ancestry " +
                        "feats with a &quot;Human&quot; trait.</p>");
        TraitList traitList = new TraitList();
        traitList.putEntry(trait1);
        traitList.putEntry(trait2);
        character.setTraitList(traitList);

        character.setTraits(new ElementoString("Human, Humanoid"));

        Wealth wealth = new Wealth(0, 0, 0, 190);
        character.setWealth(wealth);

        Damage damage1 = new Damage(0, 2, "d8", "strength", "slashing");
        DamageList damageList = new DamageList();
        damageList.putEntry(damage1);
        com.liraneto.model.xml.character.weaponList.Weapon weapon1 = new com.liraneto.model.xml.character.weaponList.Weapon(3, 0, 20, damageList, 1, "Longsword",
                new ElementoWindowReference("item", "....inventorylist.id-00001"), "Versatile P", 0);
        WeaponList weaponList = new WeaponList();
        weaponList.putEntry(weapon1);
        character.setWeaponList(weaponList);

        return character;
    }

    public static void generateItemConstructor(){
        String xmlString = "<item>" +
                "<bonus type=\"number\">0</bonus>" +
                "<bulk type=\"string\">1</bulk>" +
                "<carried type=\"number\">2</carried>" +
                "<cost type=\"string\">10 sp</cost>" +
                "<count type=\"number\">1</count>" +
                "<damage type=\"string\">1d8</damage>" +
                "<damagetype type=\"string\">slashing</damagetype>" +
                "<description type=\"formattedtext\">" +
                "&lt;p&gt;Longswords can be one-edged or two-edged swords. Their blades are heavy and they're between 3 and 4 feet in length.&lt;/p&gt;" +
                "</description>" +
                "<gmnotes type=\"formattedtext\">" +
                "&lt;p&gt;&lt;/p&gt;" +
                "</gmnotes>" +
                "<group type=\"string\">Sword</group>" +
                "<hands type=\"string\">1</hands>" +
                "<isidentified type=\"number\">1</isidentified>" +
                "<level type=\"number\">0</level>" +
                "<locked type=\"number\">1</locked>" +
                "<name type=\"string\">Longsword</name>" +
                "<pfslegal type=\"string\">False</pfslegal>" +
                "<range type=\"number\">0</range>" +
                "<reload type=\"number\">0</reload>" +
                "<showonminisheet type=\"number\">1</showonminisheet>" +
                "<subtype type=\"string\">Martial Melee</subtype>" +
                "<traits type=\"string\">Versatile P</traits>" +
                "<type type=\"string\">Weapon</type>" +
                "<weight type=\"number\">0</weight>" +
                "</item>";

        JAXBContext jaxbContext;
        try
        {
            jaxbContext = JAXBContext.newInstance(Item.class);

            Unmarshaller jaxbUnmarshaller = jaxbContext.createUnmarshaller();

            Item item = (Item) jaxbUnmarshaller.unmarshal(new StringReader(xmlString));

            System.out.println(item.toString());
        }
        catch (JAXBException e)
        {
            e.printStackTrace();
        }
    }
}
