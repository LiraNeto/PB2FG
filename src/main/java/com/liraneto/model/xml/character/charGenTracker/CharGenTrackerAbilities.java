package com.liraneto.model.xml.character.charGenTracker;

import com.liraneto.model.xml.elementosType.ElementoString;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@NoArgsConstructor
@Data
public class CharGenTrackerAbilities {

    private ElementoString ancestryBoost1 = new ElementoString("0");

    private ElementoString ancestryBoost2 = new ElementoString("0");

    private ElementoString ancestryBoost3 = new ElementoString("0");

    private ElementoString ancestryBoost4 = new ElementoString("0");

    private ElementoString ancestryFlaw = new ElementoString("0");

    private ElementoString backgroundBoost1 = new ElementoString("0");

    private ElementoString backgroundBoost2 = new ElementoString("0");

    private ElementoString classKeyAbility = new ElementoString("0");

    private ElementoString freeBoost1 = new ElementoString("0");

    private ElementoString freeBoost2 = new ElementoString("0");

    private ElementoString freeBoost3 = new ElementoString("0");

    private ElementoString freeBoost4 = new ElementoString("0");

    public CharGenTrackerAbilities(Object ancestryBoost1, Object ancestryBoost2, Object ancestryBoost3,
                                   Object ancestryBoost4, Object ancestryFlaw, Object backgroundBoost1,
                                   Object backgroundBoost2, Object classKeyAbility, Object freeBoost1,
                                   Object freeBoost2, Object freeBoost3, Object freeBoost4) {

        if (ancestryBoost1 != null) this.ancestryBoost1 = new ElementoString(ancestryBoost1);
        if (ancestryBoost2 != null) this.ancestryBoost2 = new ElementoString(ancestryBoost2);
        if (ancestryBoost3 != null) this.ancestryBoost3 = new ElementoString(ancestryBoost3);
        if (ancestryBoost4 != null) this.ancestryBoost4 = new ElementoString(ancestryBoost4);
        if (ancestryFlaw != null) this.ancestryFlaw = new ElementoString(ancestryFlaw);
        if (backgroundBoost1 != null) this.backgroundBoost1 = new ElementoString(backgroundBoost1);
        if (backgroundBoost2 != null) this.backgroundBoost2 = new ElementoString(backgroundBoost2);
        if (classKeyAbility != null) this.classKeyAbility = new ElementoString(classKeyAbility);
        if (freeBoost1 != null) this.freeBoost1 = new ElementoString(freeBoost1);
        if (freeBoost2 != null) this.freeBoost2 = new ElementoString(freeBoost2);
        if (freeBoost3 != null) this.freeBoost3 = new ElementoString(freeBoost3);
        if (freeBoost4 != null) this.freeBoost4 = new ElementoString(freeBoost4);
    }

    public CharGenTrackerAbilities(List<String> boosts, String flaw) {

        if (!boosts.isEmpty()) this.backgroundBoost1 = new ElementoString(boosts.remove(0));
        if (!boosts.isEmpty()) this.backgroundBoost2 = new ElementoString(boosts.remove(0));
        if (!boosts.isEmpty()) this.classKeyAbility = new ElementoString(boosts.remove(0));
        if (!boosts.isEmpty()) this.freeBoost1 = new ElementoString(boosts.remove(0));
        if (!boosts.isEmpty()) this.freeBoost2 = new ElementoString(boosts.remove(0));
        if (!boosts.isEmpty()) this.freeBoost3 = new ElementoString(boosts.remove(0));
        if (!boosts.isEmpty()) this.freeBoost4 = new ElementoString(boosts.remove(0));
        if (!boosts.isEmpty()) this.ancestryBoost1 = new ElementoString(boosts.remove(0));
        if (!boosts.isEmpty()) this.ancestryBoost2 = new ElementoString(boosts.remove(0));
        if (!boosts.isEmpty()) this.ancestryBoost3 = new ElementoString(boosts.remove(0));
        if (!boosts.isEmpty()) this.ancestryBoost4 = new ElementoString(boosts.remove(0));

        if (flaw != null) this.ancestryFlaw = new ElementoString(flaw);
        }
}
