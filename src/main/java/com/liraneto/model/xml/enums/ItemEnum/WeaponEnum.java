package com.liraneto.model.xml.enums.ItemEnum;

import com.liraneto.model.xml.character.weaponList.Damage;
import com.liraneto.model.xml.character.weaponList.DamageList;
import com.liraneto.model.xml.character.weaponList.WeaponXML;
import com.liraneto.model.xml.elementosType.ElementoDice;
import com.liraneto.model.xml.elementosType.ElementoWindowReference;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.util.Arrays;
import java.util.List;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum WeaponEnum {
    // ----------------------------------------------------------- WEAPONS-CORE-------------------------------------------------------
    FIST(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d4", "strength", "bludgeoning, nonlethal")), "1", null, "Fist", null, null, new ElementoWindowReference("item", null), "Agile, finesse, nonlethal, unarmed", "0"),

    CLUB(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d6", "strength", "bludgeoning")), "1", null, "Club", null, null, new ElementoWindowReference("item", null), "Thrown 10 ft.", "0"),

    CLUB_T(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d6", "strength", "bludgeoning")), "1", null, "Club", null, null, new ElementoWindowReference("item", null), "Thrown 10 ft.", "1"),

    DAGGER(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d4", "strength", "piercing")), "1", null, "Dagger", null, null, new ElementoWindowReference("item", null), "Agile, finesse, thrown 10 ft., versatile S", "0"),

    DAGGER_T(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d4", "strength", "piercing")), "1", null, "Dagger", null, null, new ElementoWindowReference("item", null), "Agile, finesse, thrown 10 ft., versatile S", "1"),

    GAUNTLET(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d4", "strength", "bludgeoning")), "1", null, "Gauntlet", null, null, new ElementoWindowReference("item", null), "Agile, free-hand", "0"),

    LIGHT_MACE(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d4", "strength", "bludgeoning")), "1", null, "Light mace", null, null, new ElementoWindowReference("item", null), "Agile, finesse, shove", "0"),

    LONGSPEAR(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d8", "strength", "piercing")), "1", null, "Longspear", null, null, new ElementoWindowReference("item", null), "Reach", "0"),

    MACE(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d6", "strength", "bludgeoning")), "1", null, "Mace", null, null, new ElementoWindowReference("item", null), "Shove", "0"),

    MORNINGSTAR(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d6", "strength", "bludgeoning")), "1", null, "Morningstar", null, null, new ElementoWindowReference("item", null), "Versatile P", "0"),

    SICKLE(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d4", "strength", "slashing")), "1", null, "Sickle", null, null, new ElementoWindowReference("item", null), "Agile, finesse, trip", "0"),

    SPEAR(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d6", "strength", "piercing")), "1", null, "Spear", null, null, new ElementoWindowReference("item", null), "Thrown 20 ft.", "0"),

    SPEAR_T(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d6", "strength", "piercing")), "1", null, "Spear", null, null, new ElementoWindowReference("item", null), "Thrown 20 ft.", "1"),

    SPIKED_GAUNTLET(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d4", "strength", "piercing")), "1", null, "Spiked gauntlet", null, null, new ElementoWindowReference("item", null), "Agile, free-hand", "0"),

    STAFF(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d4", "strength", "bludgeoning")), "1", null, "Staff", null, null, new ElementoWindowReference("item", null), "Two-hand d8", "0"),

    CLAN_DAGGER(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d4", "strength", "piercing")), "1", null, "Clan dagger", null, null, new ElementoWindowReference("item", null), "Agile, dwarf, parry, versatile B", "0"),

    KATAR(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d4", "strength", "piercing")), "1", null, "Katar", null, null, new ElementoWindowReference("item", null), "Agile, deadly d6, monk", "0"),

    BASTARD_SWORD(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d8", "strength", "slashing")), "1", null, "Bastard Sword", null, null, new ElementoWindowReference("item", null), "Two-hand d12", "0"),

    BATTLE_AXE(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d8", "strength", "slashing")), "1", null, "Battle axe", null, null, new ElementoWindowReference("item", null), "Sweep", "0"),

    BO_STAFF(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d8", "strength", "bludgeoning")), "1", null, "Bo staff", null, null, new ElementoWindowReference("item", null), "Monk, parry, reach, trip", "0"),

    FALCHION(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d10", "strength", "slashing")), "1", null, "Falchion", null, null, new ElementoWindowReference("item", null), "Forceful, sweep", "0"),

    FLAIL(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d6", "strength", "bludgeoning")), "1", null, "Flail", null, null, new ElementoWindowReference("item", null), "Disarm, sweep, trip", "0"),

    GLAIVE(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d8", "strength", "slashing")), "1", null, "Glaive", null, null, new ElementoWindowReference("item", null), "Deadly d8, forceful, reach", "0"),

    GREATAXE(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d12", "strength", "slashing")), "1", null, "Greataxe", null, null, new ElementoWindowReference("item", null), "Sweep", "0"),

    GREATCLUB(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d10", "strength", "bludgeoning")), "1", null, "Greatclub", null, null, new ElementoWindowReference("item", null), "Backswing, shove", "0"),

    GREATPICK(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d10", "strength", "piercing")), "1", null, "Greatpick", null, null, new ElementoWindowReference("item", null), "Fatal d12", "0"),

    GREATSWORD(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d12", "strength", "slashing")), "1", null, "Greatsword", null, null, new ElementoWindowReference("item", null), "Versatile P", "0"),

    GUISARME(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d10", "strength", "slashing")), "1", null, "Guisarme", null, null, new ElementoWindowReference("item", null), "Reach, trip", "0"),

    HALBERD(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d10", "strength", "piercing")), "1", null, "Halberd", null, null, new ElementoWindowReference("item", null), "Reach, versatile S", "0"),

    HATCHET(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d6", "strength", "slashing")), "1", null, "Hatchet", null, null, new ElementoWindowReference("item", null), "Agile, sweep, thrown 10 ft.", "0"),

    LANCE(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d8", "strength", "piercing")), "1", null, "Lance", null, null, new ElementoWindowReference("item", null), "Deadly d8, jousting d6, reach", "0"),

    LIGHT_HAMMER(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d6", "strength", "bludgeoning")), "1", null, "Light hammer", null, null, new ElementoWindowReference("item", null), "Agile, thrown 20 ft.", "0"),

    LIGHT_HAMMER_T(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d6", "strength", "bludgeoning")), "1", null, "Light hammer", null, null, new ElementoWindowReference("item", null), "Agile, thrown 20 ft.", "1"),

    LIGHT_PICK(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d4", "strength", "piercing")), "1", null, "Light pick", null, null, new ElementoWindowReference("item", null), "Agile, fatal d8", "0"),

    LONGSWORD(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d8", "strength", "slashing")), "1", null, "Longsword", null, null, new ElementoWindowReference("item", null), "Versatile P", "0"),

    MAIN_GAUCHE(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d4", "strength", "piercing")), "1", null, "Main-gauche", null, null, new ElementoWindowReference("item", null), "Agile, disarm, finesse, parry, versatile S", "0"),

    MAUL(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d12", "strength", "bludgeoning")), "1", null, "Maul", null, null, new ElementoWindowReference("item", null), "Shove", "0"),

    PICK(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d6", "strength", "piercing")), "1", null, "Pick", null, null, new ElementoWindowReference("item", null), "Fatal d10", "0"),

    RANSEUR(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d10", "strength", "piercing")), "1", null, "Ranseur", null, null, new ElementoWindowReference("item", null), "Disarm, reach", "0"),

    RAPIER(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d6", "strength", "piercing")), "1", null, "Rapier", null, null, new ElementoWindowReference("item", null), "Deadly d8, disarm, finesse", "0"),

    SAP(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d6", "strength", "bludgeoning, nonlethal")), "1", null, "Sap", null, null, new ElementoWindowReference("item", null), "Agile, nonlethal", "0"),

    SCIMITAR(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d6", "strength", "slashing")), "1", null, "Scimitar", null, null, new ElementoWindowReference("item", null), "Forceful, sweep", "0"),

    SCYTHE(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d10", "strength", "slashing")), "1", null, "Scythe", null, null, new ElementoWindowReference("item", null), "Deadly d10, trip", "0"),

    SHIELD_BASH(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d4", "strength", "bludgeoning")), "1", null, "Shield bash", null, null, new ElementoWindowReference("item", null), null, "0"),

    SHIELD_BOSS(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d6", "strength", "bludgeoning")), "1", null, "Shield boss", null, null, new ElementoWindowReference("item", null), "Attached to shield", "0"),

    SHIELD_SPIKES(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d6", "strength", "piercing")), "1", null, "Shield spikes", null, null, new ElementoWindowReference("item", null), "Attached to shield", "0"),

    SHORTSWORD(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d6", "strength", "piercing")), "1", null, "Shortsword", null, null, new ElementoWindowReference("item", null), "Agile, finesse, versatile S", "0"),

    STARKNIFE(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d4", "strength", "piercing")), "1", null, "Starknife", null, null, new ElementoWindowReference("item", null), "Agile, deadly d6, finesse, thrown 20 ft., versatile S", "0"),

    STARKNIFE_T(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d4", "strength", "piercing")), "1", null, "Starknife", null, null, new ElementoWindowReference("item", null), "Agile, deadly d6, finesse, thrown 20 ft., versatile S", "1"),

    TRIDENT(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d8", "strength", "piercing")), "1", null, "Trident", null, null, new ElementoWindowReference("item", null), "Thrown 20 ft.", "0"),

    TRIDENT_T(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d8", "strength", "piercing")), "1", null, "Trident", null, null, new ElementoWindowReference("item", null), "Thrown 20 ft.", "1"),

    WAR_FLAIL(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d10", "strength", "bludgeoning")), "1", null, "War flail", null, null, new ElementoWindowReference("item", null), "Disarm, sweep, trip", "0"),

    WARHAMMER(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d8", "strength", "bludgeoning")), "1", null, "Warhammer", null, null, new ElementoWindowReference("item", null), "Shove", "0"),

    WHIP(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d4", "strength", "slashing, nonlethal")), "1", null, "Whip", null, null, new ElementoWindowReference("item", null), "Disarm, finesse, nonlethal, reach, trip", "0"),

    DOGSLICER(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d6", "strength", "slashing")), "1", null, "Dogslicer", null, null, new ElementoWindowReference("item", null), "Agile, backstabber, finesse, goblin", "0"),

    ELVEN_CURVE_BLADE(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d8", "strength", "slashing")), "1", null, "Elven curve blade", null, null, new ElementoWindowReference("item", null), "Elf, finesse, forceful", "0"),

    FILCHERS_FORK(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d4", "strength", "piercing")), "1", null, "Filcher's fork", null, null, new ElementoWindowReference("item", null), "Agile, backstabber, deadly d6, finesse, halfling, thrown 20 ft.", "0"),

    FILCHERS_FORK_T(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d4", "strength", "piercing")), "1", null, "Filcher's fork", null, null, new ElementoWindowReference("item", null), "Agile, backstabber, deadly d6, finesse, halfling, thrown 20 ft.", "1"),

    GNOME_HOOKED_HAMMER(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d6", "strength", "bludgeoning")), "1", null, "Gnome hooked hammer", null, null, new ElementoWindowReference("item", null), "Gnome, trip, two-hand d10, versatile P", "0"),

    HORSECHOPPER(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d8", "strength", "slashing")), "1", null, "Horsechopper", null, null, new ElementoWindowReference("item", null), "Goblin, reach, trip, versatile P", "0"),

    KAMA(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d6", "strength", "slashing")), "1", null, "Kama", null, null, new ElementoWindowReference("item", null), "Agile, monk, trip", "0"),

    KATANA(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d6", "strength", "slashing")), "1", null, "Katana", null, null, new ElementoWindowReference("item", null), "Deadly d8, two-hand d10, versatile P", "0"),

    KUKRI(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d6", "strength", "slashing")), "1", null, "Kukri", null, null, new ElementoWindowReference("item", null), "Agile, finesse, trip", "0"),

    NUNCHAKU(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d6", "strength", "bludgeoning")), "1", null, "Nunchaku", null, null, new ElementoWindowReference("item", null), "Backswing, disarm, finesse, monk", "0"),

    ORC_KNUCKLE_DAGGER(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d6", "strength", "piercing")), "1", null, "Orc knuckle dagger", null, null, new ElementoWindowReference("item", null), "Agile, disarm, orc", "0"),

    SAI(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d4", "strength", "piercing")), "1", null, "Sai", null, null, new ElementoWindowReference("item", null), "Agile, disarm, finesse, monk, versatile B", "0"),

    SPIKED_CHAIN(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d8", "strength", "slashing")), "1", null, "Spiked chain", null, null, new ElementoWindowReference("item", null), "Disarm, finesse, trip", "0"),

    TEMPLE_SWORD(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d8", "strength", "slashing")), "1", null, "Temple sword", null, null, new ElementoWindowReference("item", null), "Monk, trip", "0"),

    DWARVEN_WARAXE(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d8", "strength", "slashing")), "1", null, "Dwarven waraxe", null, null, new ElementoWindowReference("item", null), "Dwarf, sweep, two-hand d12", "0"),

    GNOME_FLICKMACE(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d8", "strength", "bludgeoning")), "1", null, "Gnome flickmace", null, null, new ElementoWindowReference("item", null), "Gnome, reach", "0"),

    ORC_NECKSPLITTER(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d8", "strength", "slashing")), "1", null, "Orc necksplitter", null, null, new ElementoWindowReference("item", null), "Forceful, orc, sweep", "0"),

    SAWTOOTH_SABRE(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d6", "strength", "slashing")), "1", null, "Sawtooth sabre", null, null, new ElementoWindowReference("item", null), "Agile, finesse, twin", "0"),

    BLOWGUN(null, "3", null, "0", null, "20", Arrays.asList(new Damage("1", "2", "", null, "piercing, nonlethal")), "1", null, "Blowgun", null, null, new ElementoWindowReference("item", null), "Agile, nonlethal", "1"),

    CROSSBOW(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d8", null, "piercing")), "1", null, "Crossbow", null, null, new ElementoWindowReference("item", null), null, "1"),

    DART(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d4", "strength", "piercing")), "1", null, "Dart", null, null, new ElementoWindowReference("item", null), "Agile, thrown", "1"),

    HAND_CROSSBOW(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d6", null, "piercing")), "1", null, "Hand crossbow", null, null, new ElementoWindowReference("item", null), null, "1"),

    HEAVY_CROSSBOW(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d10", null, "piercing")), "1", null, "Heavy crossbow", null, null, new ElementoWindowReference("item", null), null, "1"),

    JAVELIN(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d6", "strength", "piercing")), "1", null, "Javelin", null, null, new ElementoWindowReference("item", null), "Thrown", "1"),

    SLING(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d6", "strength", "bludgeoning")), "1", null, "Sling", null, null, new ElementoWindowReference("item", null), "Propulsive", "1"),

    ALCHEMICAL_BOMB(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "", null, null)), "1", null, "Alchemical bomb", null, null, new ElementoWindowReference("item", null), "Varies", "1"),

    COMPOSITE_LONGBOW(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d8", "strength", "piercing")), "1", null, "Composite longbow", null, null, new ElementoWindowReference("item", null), "Deadly d10, propulsive, volley 30 ft.", "1"),

    COMPOSITE_SHORTBOW(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d6", "strength", "piercing")), "1", null, "Composite shortbow", null, null, new ElementoWindowReference("item", null), "Deadly d10, propulsive", "1"),

    LONGBOW(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d8", null, "piercing")), "1", null, "Longbow", null, null, new ElementoWindowReference("item", null), "Deadly d10, volley 30 ft.", "1"),

    SHORTBOW(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d6", null, "piercing")), "1", null, "Shortbow", null, null, new ElementoWindowReference("item", null), "Deadly d10", "1"),

    HALFLING_SLING_STAFF(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d10", "strength", "bludgeoning")), "1", null, "Halfling sling staff", null, null, new ElementoWindowReference("item", null), "Halfling, propulsive", "1"),

    SHURIKEN(null, "3", null, "0", null, "20", Arrays.asList(new Damage("0", "2", "d4", "strength", "piercing")), "1", null, "Shuriken", null, null, new ElementoWindowReference("item", null), "Agile, monk, thrown", "1"),
    // ----------------------------------------------------------- WEAPONS-CORE-------------------------------------------------------

    WEAPON_NOT_FOUND()
    ;

    private String ammo;

    private String attacks;

    private String attackStat;

    private String bonus;

    private String carried;

    private String critAtkRange;

    private List<Damage> damageList;

    private String isIdentified;

    private String maxAmmo;

    private String name = "";

    private String prof;

    private String profLevel;

    private ElementoWindowReference shortcut;

    private String traits;

    private String type;

    public WeaponXML getWeaponXML(){
        return new WeaponXML(ammo, attacks, attackStat, bonus, carried, critAtkRange, new DamageList(damageList),
                isIdentified, maxAmmo, name, prof, profLevel,
                shortcut, traits, type);
    }

    public WeaponXML getWeaponXML(int bonus, String str, String die, int id, String profLevel){
        if ("striking".equals(str)){
            damageList.get(0).setDice(new ElementoDice(die + ", " + die));
        }
        if ("greaterStriking".equals(str)){
            damageList.get(0).setDice(new ElementoDice(die + ", " + die + ", " + die));
        }
        if ("majorStriking".equals(str)){
            damageList.get(0).setDice(new ElementoDice(die + ", " + die + ", " + die + ", " + die));
        }

        shortcut.setRecordName("....inventorylist.id-" + String.format("%05d", id));


        return new WeaponXML(ammo, attacks, attackStat, bonus, carried, critAtkRange, new DamageList(damageList),
                isIdentified, maxAmmo, name, prof, profLevel, shortcut, traits, type);
    }

    public static WeaponEnum getWeaponEnum(String name){
        for (WeaponEnum weaponEnum : WeaponEnum.values()){
            if (weaponEnum.getName().equalsIgnoreCase(name))
                return weaponEnum;
        }
        return WEAPON_NOT_FOUND;
    }

    public static WeaponEnum getWeaponEnumT(String name, WeaponEnum fistWeaponEnum){
        for (WeaponEnum weaponEnum : WeaponEnum.values()){
            if (weaponEnum.getName().equalsIgnoreCase(name) && weaponEnum != fistWeaponEnum)
                return weaponEnum;
        }
        return WEAPON_NOT_FOUND;
    }
}
