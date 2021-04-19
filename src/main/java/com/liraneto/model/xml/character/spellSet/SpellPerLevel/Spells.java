package com.liraneto.model.xml.character.spellSet.SpellPerLevel;

import com.liraneto.model.xml.character.spellSet.SpellPerLevel.actionsList.Action;
import com.liraneto.model.xml.character.spellSet.SpellPerLevel.actionsList.ActionList;
import com.liraneto.model.xml.elementosType.ElementoFormattedText;
import com.liraneto.model.xml.elementosType.ElementoNumber;
import com.liraneto.model.xml.elementosType.ElementoString;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.List;

@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "spell")
@Data
@NoArgsConstructor
public class Spells {
    private ActionList actions;

    private ElementoString area;
    
	private ElementoNumber cast;
	
	private ElementoString casting;
	
	private ElementoString duration;
	
	private ElementoFormattedText effects;

	@XmlElement(name = "filtercategory")
	private ElementoString filterCategory;
	
	private ElementoFormattedText heightened;
	
	private ElementoNumber level;

	@XmlElement(name = "linkedspells")
	private List<String> linkedSpells;
	
	private ElementoNumber locked;
	
	private ElementoString name;
	
	private ElementoNumber prepared;

	private ElementoString range;

	@XmlElement(name = "spcost")
	private ElementoNumber spCost;

	@XmlElement(name = "spelltype")
	private ElementoString spellType;

	@XmlElement(name = "spelltypelabel")
	private ElementoString spellTypeLabel;

	@XmlElement(name = "superscripts")
	private ElementoString superScripts;

	private ElementoString targets;

	private ElementoString traditions;
	
	private ElementoString traits;

	public Spells(List<Action> actions, Object area, Object cast, Object casting,
				  Object duration, Object effects, Object filterCategory,
				  Object heightened, Object level, List<String> linkedSpells,
				  Object locked, Object name, Object prepared, Object range,
				  Object spCost, Object spellType, Object spellTypeLabel,
				  Object superScripts, Object targets, Object traditions,
				  Object traits) {
		if (actions != null && !actions.isEmpty()) this.actions = new ActionList(actions);
		if (area != null) this.area = new ElementoString(area);
		if (cast != null) this.cast = new ElementoNumber(cast);
		if (casting != null) this.casting = new ElementoString(casting);
		if (duration != null) this.duration = new ElementoString(duration);
		if (effects != null) this.effects = new ElementoFormattedText(effects);
		if (filterCategory != null) this.filterCategory = new ElementoString(filterCategory);
		if (heightened != null) this.heightened = new ElementoFormattedText(heightened);
		if (level != null) this.level = new ElementoNumber(level);
		if (linkedSpells != null) this.linkedSpells = null;
		if (locked != null) this.locked = new ElementoNumber(locked);
		if (name != null) this.name = new ElementoString(name);
		if (prepared != null) this.prepared = new ElementoNumber(prepared);
		if (range != null) this.range = new ElementoString(range);
		if (spCost != null) this.spCost = new ElementoNumber(spCost);
		if (spellType != null) this.spellType = new ElementoString(spellType);
		if (spellTypeLabel != null) this.spellTypeLabel = new ElementoString(spellTypeLabel);
		if (superScripts != null) this.superScripts = new ElementoString(superScripts);
		if (targets != null) this.targets = new ElementoString(targets);
		if (traditions != null) this.traditions = new ElementoString(traditions);
		if (traits != null) this.traits = new ElementoString(traits);
	}

	@Override
	public String toString() {
		return  name.toString()
				.toUpperCase()
				.replace("\"", "")
				.replace(" ", "_")
				.replace("'", "")
				.replace(")", "")
				.replace("(", "") + "(" +
				actions + ", " +
				area + ", " +
				cast + ", " +
				casting + ", " +
				duration + ", " +
				effects + ", " +
				filterCategory + ", " +
				heightened + ", " +
				level + ", " +
				linkedSpells + ", " +
				locked + ", " +
				name + ", " +
				prepared + ", " +
				range + ", " +
				spCost + ", " +
				spellType + ", " +
				spellTypeLabel + ", " +
				superScripts + ", " +
				targets + ", " +
				traditions + ", " +
				traits +
				"),\r\n";
	}
}
