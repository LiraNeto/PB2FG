package com.liraneto.controller.enums;

import com.liraneto.model.xml.character.inventoryList.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ItemEnum {
    HALF_PLATE( "5", "0", "16", "0", "3", "2", "-3",
             "180 sp", null, null, null, "<p></p>", "<p></p>",
             "Plate", null, "0", "1", "0", "0", "0", "1",
             "1", "Half Plate", "False", null, null,
             "1", "-10", "Heavy", null, "Armor", "0"),

    LONGSWORD( null, null, null, "0", "1", "2",
            null, "10 sp", "1", "1d8", "slashing",
            "<p>Longswords can be one-edged or two-edged swords. Their blades are heavy and they're " +
                    "between 3 and 4 feet in length.</p>", "<p></p>", "Sword", "1",
            null, "1", null, null, "0", "1", null,
            "Longsword", "False", "0", "0", "1", null,
            "Martial Melee", "Versatile P", "Weapon", "0"),

    ITEM_NOT_FOUND()
    ;

    private String ac;

    private String acSpecial;

    private String armorStrength;

    private String bonus;

    private String bulk;

    private String carried;

    private String checkPenalty;

    private String cost;

    private String count;

    private String damage;

    private String damageType;

    private String description;

    private String gmNotes;

    private String group;

    private String hands;

    private String hardness;

    private String isIdentified;

    private String itemBT;

    private String itemHP;

    private String level;

    private String locked;

    private String maxStatBonus;

    private String name;

    private String pfsLegal;

    private String range;

    private String reload;

    private String showOnMiniSheet;

    private String speedPenalty;

    private String subType;

    private String traits;

    private String type;

    private String weight;

    public Item getItem(int qtd){
        return new Item(ac, acSpecial, armorStrength, bonus, bulk, carried, checkPenalty,
                cost, qtd, damage, damageType, description, gmNotes,
                group, hands, hardness, isIdentified, itemBT, itemHP, level,
                locked, maxStatBonus, name, pfsLegal, range, reload, showOnMiniSheet,
                speedPenalty, subType, traits, type, weight);
    }

    public Item getItem(){
        return this.getItem(1);
    }

    public static ItemEnum getItemEnum(String name){
        for (ItemEnum itemEnum : ItemEnum.values()){
            if (itemEnum.getName().equals(name))
                return itemEnum;
        }
        return ITEM_NOT_FOUND;
    }
}
