package com.liraneto.controller.enums.ItemEnum;

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
    LONGSWORD(null, "3", null, "0", "2", "20",
            Arrays.asList(new Damage(0, 2, "d8", "strength", "slashing")), "1",
            null, "Longsword", null, null,
            new ElementoWindowReference("item", null), "Versatile P", "0"),

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

    private String name;

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
}
