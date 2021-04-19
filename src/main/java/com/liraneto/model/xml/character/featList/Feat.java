package com.liraneto.model.xml.character.featList;

import com.liraneto.model.xml.elementosType.ElementoFormattedText;
import com.liraneto.model.xml.elementosType.ElementoNumber;
import com.liraneto.model.xml.elementosType.ElementoString;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "feat")
@NoArgsConstructor
@Data
public class Feat {

    private ElementoString action;

    @XmlElement(name = "effectsbenefits")
    private ElementoFormattedText effectsBenefits;

    @XmlElement(name = "filtercategory")
    private ElementoString filterCategory;

    private ElementoNumber level;

    @XmlElement(name = "level_applied")
    private ElementoNumber levelApplied;

    private ElementoNumber locked;

    private ElementoString name;

    @XmlElement(name = "prerequisites")
    private ElementoString preRequisites;

    @XmlElement(name = "shortbenefits")
    private ElementoString shortBenefits;

    private ElementoString traits;

    private ElementoString trigger;

    public Feat(Object action, Object effectsBenefits, Object filterCategory, Object level, Object levelApplied, Object locked,
                Object name, Object preRequisites, Object shortBenefits, Object traits, Object trigger) {
        if (action != null) this.action = new ElementoString(action);
        if (effectsBenefits != null) this.effectsBenefits = new ElementoFormattedText(effectsBenefits);
        if (filterCategory != null) this.filterCategory = new ElementoString(filterCategory);
        if (level != null) this.level = new ElementoNumber(level);
        if (levelApplied != null) this.levelApplied = new ElementoNumber(levelApplied);
        if (locked != null) this.locked = new ElementoNumber(locked);
        if (name != null) this.name = new ElementoString(name);
        if (preRequisites != null) this.preRequisites = new ElementoString(preRequisites);
        if (shortBenefits != null) this.shortBenefits = new ElementoString(shortBenefits);
        if (traits != null) this.traits = new ElementoString(traits);
        if (trigger != null) this.trigger = new ElementoString(trigger);
    }

    @Override
    public String toString() {
        return name.toString()
                .toUpperCase()
                .replace("\"", "")
                .replace(" ", "_")
                .replace("'", "") + "(" +
                action + ", " +
                effectsBenefits + ", " +
                filterCategory + ", " +
                level + ", " +
                levelApplied + ", " +
                locked + ", " +
                name + ", " +
                preRequisites + ", " +
                shortBenefits + ", " +
                traits + ", " +
                trigger +
                "),\n";
    }
}
