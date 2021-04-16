package com.liraneto.model.json.Build;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Proficiencies {

    private int classDC;

    private int perception;

    private int fortitude;

    private int reflex;

    private int will;

    private int heavy;

    private int medium;

    private int light;

    private int unarmored;

    private int advanced;

    private int martial;

    private int simple;

    private int unarmed;

    private int castingArcane;

    private int castingDivine;

    private int castingOccult;

    private int castingPrimal;

    private int acrobatics;

    private int arcana;

    private int athletics;

    private int crafting;

    private int deception;

    private int diplomacy;

    private int intimidation;

    private int medicine;

    private int nature;

    private int occultism;

    private int performance;

    private int religion;

    private int society;

    private int stealth;

    private int survival;

    private int thievery;

    public String getProficiency (String name){
        int profBonus = 0;

        if ("classDC".equals(name)) {
            profBonus = classDC;
        }

        if ("perception".equals(name)) {
            profBonus = perception;
        }

        if ("fortitude".equals(name)) {
            profBonus = fortitude;
        }

        if ("reflex".equals(name)) {
            profBonus = reflex;
        }

        if ("will".equals(name)) {
            profBonus = will;
        }

        if ("heavy".equals(name)) {
            profBonus = heavy;
        }

        if ("medium".equals(name)) {
            profBonus = medium;
        }

        if ("light".equals(name)) {
            profBonus = light;
        }

        if ("unarmored".equals(name)) {
            profBonus = unarmored;
        }

        if ("advanced".equals(name)) {
            profBonus = advanced;
        }

        if ("martial".equals(name)) {
            profBonus = martial;
        }

        if ("simple".equals(name)) {
            profBonus = simple;
        }

        if ("unarmed".equals(name)) {
            profBonus = unarmed;
        }

        if ("castingArcane".equals(name)) {
            profBonus = castingArcane;
        }

        if ("castingDivine".equals(name)) {
            profBonus = castingDivine;
        }

        if ("castingOccult".equals(name)) {
            profBonus = castingOccult;
        }

        if ("castingPrimal".equals(name)) {
            profBonus = castingPrimal;
        }

        if ("acrobatics".equals(name)) {
            profBonus = acrobatics;
        }

        if ("arcana".equals(name)) {
            profBonus = arcana;
        }

        if ("athletics".equals(name)) {
            profBonus = athletics;
        }

        if ("crafting".equals(name)) {
            profBonus = crafting;
        }

        if ("deception".equals(name)) {
            profBonus = deception;
        }

        if ("diplomacy".equals(name)) {
            profBonus = diplomacy;
        }

        if ("intimidation".equals(name)) {
            profBonus = intimidation;
        }

        if ("medicine".equals(name)) {
            profBonus = medicine;
        }

        if ("nature".equals(name)) {
            profBonus = nature;
        }

        if ("occultism".equals(name)) {
            profBonus = occultism;
        }

        if ("performance".equals(name)) {
            profBonus = performance;
        }

        if ("religion".equals(name)) {
            profBonus = religion;
        }

        if ("society".equals(name)) {
            profBonus = society;
        }

        if ("stealth".equals(name)) {
            profBonus = stealth;
        }

        if ("survival".equals(name)) {
            profBonus = survival;
        }

        if ("thievery".equals(name)) {
            profBonus = thievery;
        }

        switch (profBonus){
            case 0:
                return "untrained";
            case 2:
                return "trained";
            case 4:
                return "expert";
            case 6:
                return "master";
            case 8:
                return "legendary";
            default:
                return "untrained";
        }
    }

}
