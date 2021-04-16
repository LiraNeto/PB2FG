package com.liraneto.controller.enums.ItemEnum;

import com.liraneto.model.xml.character.inventoryList.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ItemEnum {
    // ----------------------------------------------------------- WEAPONS -----------------------------------------------------------
    FIST(null, null, null, "0", null, "2", null, "-", "1", "1d4", "bludgeoning", "<p></p>", "<p></p>", "Brawling", "1", null, "1", null, null, "0", "1", null, "Fist", "False", "0", "0", "1", null, "Unarmed Attack", "Agile, finesse, nonlethal, unarmed", "Weapon", "0"),

    CLUB(null, null, null, "0", "1", "2", null, "0 sp", "1", "1d6", "bludgeoning", "<p>This is a piece of stout wood shaped or repurposed to bludgeon an enemy. Clubs can be intricately carved pieces of martial art or as simple as a tree branch or piece of wood.</p>", "<p></p>", "Club", "1", null, "1", null, null, "0", "1", null, "Club", "False", "10", "0", "1", null, "Simple Melee", "Thrown 10 ft.", "Weapon", "0"),

    DAGGER(null, null, null, "0", "L", "2", null, "2 sp", "1", "1d4", "piercing", "<p>This small, bladed weapon is held in one hand and used to stab a creature in close combat. It can also be thrown.</p>", "<p></p>", "Knife", "1", null, "1", null, null, "0", "1", null, "Dagger", "False", "10", "0", "1", null, "Simple Melee", "Agile, finesse, thrown 10 ft., versatile S", "Weapon", "0"),

    GAUNTLET(null, null, null, "0", "L", "2", null, "2 sp", "1", "1d4", "bludgeoning", "<p>A pair of these metal gloves comes with full plate, half plate, and splint armor; they can also be purchased separately and worn with other types of armor. They not only protect your hands but also transform your hands into lethal weapons.</p>", "<p></p>", "Brawling", "1", null, "1", null, null, "0", "1", null, "Gauntlet", "False", "0", "0", "1", null, "Simple Melee", "Agile, free-hand", "Weapon", "0"),

    LIGHT_MACE(null, null, null, "0", "L", "2", null, "4 sp", "1", "1d4", "bludgeoning", "<p>A light mace has a short wooden or metal shaft ending with a dense metal head. Used much like a club, it delivers heavy bludgeoning blows, but with extra power derived from the head's metal ridges or spikes.</p>", "<p></p>", "Club", "1", null, "1", null, null, "0", "1", null, "Light mace", "False", "0", "0", "1", null, "Simple Melee", "Agile, finesse, shove", "Weapon", "0"),

    LONGSPEAR(null, null, null, "0", "2", "2", null, "5 sp", "1", "1d8", "piercing", "<p>This very long spear, sometimes called a pike, is purely for thrusting rather than throwing. Used by many soldiers and city watch for crowd control and defense against charging enemies, it must be wielded with two hands.</p>", "<p></p>", "Spear", "2", null, "1", null, null, "0", "1", null, "Longspear", "False", "0", "0", "1", null, "Simple Melee", "Reach", "Weapon", "0"),

    MACE(null, null, null, "0", "1", "2", null, "10 sp", "1", "1d6", "bludgeoning", "<p>With a stout haft and a heavy metal head, a mace is sturdy and allows its wielder to deliver powerful blows and dent armor.</p>", "<p></p>", "Club", "1", null, "1", null, null, "0", "1", null, "Mace", "False", "0", "0", "1", null, "Simple Melee", "Shove", "Weapon", "0"),

    MORNINGSTAR(null, null, null, "0", "1", "2", null, "10 sp", "1", "1d6", "bludgeoning", "<p>This weapon has a short shaft ending in a metal ball studded with spikes.</p>", "<p></p>", "Club", "1", null, "1", null, null, "0", "1", null, "Morningstar", "False", "0", "0", "1", null, "Simple Melee", "Versatile P", "Weapon", "0"),

    SICKLE(null, null, null, "0", "L", "2", null, "2 sp", "1", "1d4", "slashing", "<p>Originally a farming tool used for reaping grain, this one-handed weapon has a short wooden handle ending in a curved blade, sometimes sharpened on both sides.</p>", "<p></p>", "Knife", "1", null, "1", null, null, "0", "1", null, "Sickle", "False", "0", "0", "1", null, "Simple Melee", "Agile, finesse, trip", "Weapon", "0"),

    SPEAR(null, null, null, "0", "1", "2", null, "1 sp", "1", "1d6", "piercing", "<p>A long metal shaft ending with a metal spike, a spear can be used one-handed as a melee weapon and can be thrown.</p>", "<p></p>", "Spear", "1", null, "1", null, null, "0", "1", null, "Spear", "False", "20", "0", "1", null, "Simple Melee", "Thrown 20 ft.", "Weapon", "0"),

    SPIKED_GAUNTLET(null, null, null, "0", "L", "2", null, "3 sp", "1", "1d4", "piercing", "<p>Providing the same defensive function as a standard gauntlet, this version has a group of spikes protruding from the knuckles to deliver piercing damage with a punch.</p>", "<p></p>", "Brawling", "1", null, "1", null, null, "0", "1", null, "Spiked gauntlet", "False", "0", "0", "1", null, "Simple Melee", "Agile, free-hand", "Weapon", "0"),

    STAFF(null, null, null, "0", "1", "2", null, "0 sp", "1", "1d4", "bludgeoning", "<p>This long piece of wood can aid in walking and deliver a mighty blow.</p>", "<p></p>", "Club", "1", null, "1", null, null, "0", "1", null, "Staff", "False", "0", "0", "1", null, "Simple Melee", "Two-hand d8", "Weapon", "0"),

    CLAN_DAGGER(null, null, null, "0", "L", "2", null, "20 sp", "1", "1d4", "piercing", "<p>This broad dagger is carried by dwarves as a weapon, tool, and designation of clan. Losing or having to surrender a clan dagger is considered a mark of embarrassment to most dwarves.</p>", "<p></p>", "Knife", "1", null, "1", null, null, "0", "1", null, "Clan dagger", "False", "0", "0", "1", null, "Uncommon Simple Melee", "Agile, dwarf, parry, versatile B", "Weapon", "0"),

    KATAR(null, null, null, "0", "L", "2", null, "3 sp", "1", "1d4", "piercing", "<p>Also known as punching daggers, katars are characterized by their H-shaped hand grip that allows the blade to jut out from the knuckles.</p>", "<p></p>", "Knife", "1", null, "1", null, null, "0", "1", null, "Katar", "False", "0", "0", "1", null, "Uncommon Simple Melee", "Agile, deadly d6, monk", "Weapon", "0"),

    BASTARD_SWORD(null, null, null, "0", "1", "2", null, "40 sp", "1", "1d8", "slashing", "<p>This broad-bladed sword, sometimes called the hand-and-a-half sword, has a longer grip so it can be held in one hand or used with two hands to provide extra piercing or slashing power.</p>", "<p></p>", "Sword", "1", null, "1", null, null, "0", "1", null, "Bastard Sword", "False", "0", "0", "1", null, "Martial Melee", "Two-hand d12", "Weapon", "0"),

    BATTLE_AXE(null, null, null, "0", "1", "2", null, "10 sp", "1", "1d8", "slashing", "<p>These axes are designed explicitly as weapons, rather than tools. They typically weigh less, with a shaft reinforced with metal bands or bolts, and have a sharper blade, making them ideal for chopping limbs rather than wood.</p>", "<p></p>", "Axe", "1", null, "1", null, null, "0", "1", null, "Battle axe", "False", "0", "0", "1", null, "Martial Melee", "Sweep", "Weapon", "0"),

    BO_STAFF(null, null, null, "0", "2", "2", null, "2 sp", "1", "1d8", "bludgeoning", "<p>This strong but slender staff is tapered at the ends and well balanced. It's designed to be an offensive and defensive weapon.</p>", "<p></p>", "Club", "2", null, "1", null, null, "0", "1", null, "Bo staff", "False", "0", "0", "1", null, "Martial Melee", "Monk, parry, reach, trip", "Weapon", "0"),

    FALCHION(null, null, null, "0", "2", "2", null, "30 sp", "1", "1d10", "slashing", "<p>This weapon is a heavier, two-handed version of the curved-bladed scimitar. It is weighted toward the blade's end, making it a powerful slashing weapon.</p>", "<p></p>", "Sword", "2", null, "1", null, null, "0", "1", null, "Falchion", "False", "0", "0", "1", null, "Martial Melee", "Forceful, sweep", "Weapon", "0"),

    FLAIL(null, null, null, "0", "1", "2", null, "8 sp", "1", "1d6", "bludgeoning", "<p>This weapon consists of a wooden handle attached to a spiked ball or cylinder by a chain, rope, or strap of leather.</p>", "<p></p>", "Flail", "1", null, "1", null, null, "0", "1", null, "Flail", "False", "0", "0", "1", null, "Martial Melee", "Disarm, sweep, trip", "Weapon", "0"),

    GLAIVE(null, null, null, "0", "2", "2", null, "10 sp", "1", "1d8", "slashing", "<p>This polearm consists of a long, single-edged blade on the end of a 7-foot pole. It is extremely effective at delivering lethal cuts at a distance.</p>", "<p></p>", "Polearm", "2", null, "1", null, null, "0", "1", null, "Glaive", "False", "0", "0", "1", null, "Martial Melee", "Deadly d8, forceful, reach", "Weapon", "0"),

    GREATAXE(null, null, null, "0", "2", "2", null, "20 sp", "1", "1d12", "slashing", "<p>This large battle axe is too heavy to wield with only one hand. Many greataxes incorporate two blades, and they are often \"bearded,\" having a hook at the bottom to increase the strength of their chopping power.</p>", "<p></p>", "Axe", "2", null, "1", null, null, "0", "1", null, "Greataxe", "False", "0", "0", "1", null, "Martial Melee", "Sweep", "Weapon", "0"),

    GREATCLUB(null, null, null, "0", "2", "2", null, "10 sp", "1", "1d10", "bludgeoning", "<p>While many greatclubs are intricately carved, others are little more than a sturdy tree branch. These massive clubs are too heavy to wield with only one hand.</p>", "<p></p>", "Club", "2", null, "1", null, null, "0", "1", null, "Greatclub", "False", "0", "0", "1", null, "Martial Melee", "Backswing, shove", "Weapon", "0"),

    GREATPICK(null, null, null, "0", "2", "2", null, "10 sp", "1", "1d10", "piercing", "<p>This pick has a longer handle and broader head than a regular pick. It is too heavy to wield in one hand.</p>", "<p></p>", "Pick", "2", null, "1", null, null, "0", "1", null, "Greatpick", "False", "0", "0", "1", null, "Martial Melee", "Fatal d12", "Weapon", "0"),

    GREATSWORD(null, null, null, "0", "2", "2", null, "20 sp", "1", "1d12", "slashing", "<p>This immense two-handed sword is nearly as tall as its wielder. Its lower blade is often somewhat dulled to allow it to be gripped for extra leverage in close-quarter fights.</p>", "<p></p>", "Sword", "2", null, "1", null, null, "0", "1", null, "Greatsword", "False", "0", "0", "1", null, "Martial Melee", "Versatile P", "Weapon", "0"),

    GUISARME(null, null, null, "0", "2", "2", null, "20 sp", "1", "1d10", "slashing", "<p>This polearm bears a long, often one-sided, curved blade with a hook protruding from the blunt side of the blade, which can allow its wielder to trip opponents at a distance. Its shaft is usually 8 feet long.</p>", "<p></p>", "Polearm", "2", null, "1", null, null, "0", "1", null, "Guisarme", "False", "0", "0", "1", null, "Martial Melee", "Reach, trip", "Weapon", "0"),

    HALBERD(null, null, null, "0", "2", "2", null, "20 sp", "1", "1d10", "piercing", "<p>This polearm has a relatively short, 5-foot shaft. The business end is a long spike with an axe blade attached.</p>", "<p></p>", "Polearm", "2", null, "1", null, null, "0", "1", null, "Halberd", "False", "0", "0", "1", null, "Martial Melee", "Reach, versatile S", "Weapon", "0"),

    HATCHET(null, null, null, "0", "L", "2", null, "4 sp", "1", "1d6", "slashing", "<p>This small axe can be used in close combat or thrown.</p>", "<p></p>", "Axe", "1", null, "1", null, null, "0", "1", null, "Hatchet", "False", "0", "0", "1", null, "Martial Melee", "Agile, sweep, thrown 10 ft.", "Weapon", "0"),

    LANCE(null, null, null, "0", "2", "2", null, "10 sp", "1", "1d8", "piercing", "<p>This spear-like weapon is used by a mounted creature to deal a great deal of damage.</p>", "<p></p>", "Spear", "2", null, "1", null, null, "0", "1", null, "Lance", "False", "0", "0", "1", null, "Martial Melee", "Deadly d8, jousting d6, reach", "Weapon", "0"),

    LIGHT_HAMMER(null, null, null, "0", "L", "2", null, "3 sp", "1", "1d6", "bludgeoning", "<p>This smaller version of the warhammer has a wooden or metal shaft ending in a metal head. Unlike its heavier cousin, it is light enough to throw.</p>", "<p></p>", "Hammer", "1", null, "1", null, null, "0", "1", null, "Light hammer", "False", "20", "0", "1", null, "Martial Melee", "Agile, thrown 20 ft.", "Weapon", "0"),

    LIGHT_PICK(null, null, null, "0", "L", "2", null, "4 sp", "1", "1d4", "piercing", "<p>A light pick is a modified mining implement with a wooden shaft ending in a pick head crafted more to pierce armor and flesh than chip rocks.</p>", "<p></p>", "Pick", "1", null, "1", null, null, "0", "1", null, "Light pick", "False", "0", "0", "1", null, "Martial Melee", "Agile, fatal d8", "Weapon", "0"),

    LONGSWORD(null, null, null, "0", "1", "2", null, "10 sp", "1", "1d8", "slashing", "<p>Longswords can be one-edged or two-edged swords. Their blades are heavy and they're between 3 and 4 feet in length.</p>", "<p></p>", "Sword", "1", null, "1", null, null, "0", "1", null, "Longsword", "False", "0", "0", "1", null, "Martial Melee", "Versatile P", "Weapon", "0"),

    MAIN_GAUCHE(null, null, null, "0", "L", "2", null, "5 sp", "1", "1d4", "piercing", "<p>This parrying dagger features a robust guard to protect the wielder's hand.</p>", "<p></p>", "Knife", "1", null, "1", null, null, "0", "1", null, "Main-gauche", "False", "0", "0", "1", null, "Martial Melee", "Agile, disarm, finesse, parry, versatile S", "Weapon", "0"),

    MAUL(null, null, null, "0", "2", "2", null, "30 sp", "1", "1d12", "bludgeoning", "<p>Mauls are massive warhammers that must be swung with two hands.</p>", "<p></p>", "Hammer", "2", null, "1", null, null, "0", "1", null, "Maul", "False", "0", "0", "1", null, "Martial Melee", "Shove", "Weapon", "0"),

    PICK(null, null, null, "0", "1", "2", null, "7 sp", "1", "1d6", "piercing", "<p>A pick designed solely for combat has a sturdy wooden shaft and a heavy, pointed head to deliver devastating blows.</p>", "<p></p>", "Pick", "1", null, "1", null, null, "0", "1", null, "Pick", "False", "0", "0", "1", null, "Martial Melee", "Fatal d10", "Weapon", "0"),

    RANSEUR(null, null, null, "0", "2", "2", null, "20 sp", "1", "1d10", "piercing", "<p>This polearm is a long trident with a central prong that's longer than the other two.</p>", "<p></p>", "Polearm", "2", null, "1", null, null, "0", "1", null, "Ranseur", "False", "0", "0", "1", null, "Martial Melee", "Disarm, reach", "Weapon", "0"),

    RAPIER(null, null, null, "0", "1", "2", null, "20 sp", "1", "1d6", "piercing", "<p>The rapier is a long and thin piercing blade with a basket hilt. It is prized among many as a dueling weapon.</p>", "<p></p>", "Sword", "1", null, "1", null, null, "0", "1", null, "Rapier", "False", "0", "0", "1", null, "Martial Melee", "Deadly d8, disarm, finesse", "Weapon", "0"),

    SAP(null, null, null, "0", "L", "2", null, "1 sp", "1", "1d6", "bludgeoning", "<p>A sap has a soft wrapping around a dense core, typically a leather sheath around a lead rod. Its head is wider than its grip to disperse the force of a blow, as the weapon's purpose is to knock out its victim rather than to draw blood.</p>", "<p></p>", "Club", "1", null, "1", null, null, "0", "1", null, "Sap", "False", "0", "0", "1", null, "Martial Melee", "Agile, nonlethal", "Weapon", "0"),

    SCIMITAR(null, null, null, "0", "1", "2", null, "10 sp", "1", "1d6", "slashing", "<p>This one-handed curved blade is sharp on one side.</p>", "<p></p>", "Sword", "1", null, "1", null, null, "0", "1", null, "Scimitar", "False", "0", "0", "1", null, "Martial Melee", "Forceful, sweep", "Weapon", "0"),

    SCYTHE(null, null, null, "0", "2", "2", null, "20 sp", "1", "1d10", "slashing", "<p>Derived from a farming tool used to mow down long grains and cereals, this weapon has a long wooden shaft with protruding handles, capped with a curved blade set at a right angle.</p>", "<p></p>", "Polearm", "2", null, "1", null, null, "0", "1", null, "Scythe", "False", "0", "0", "1", null, "Martial Melee", "Deadly d10, trip", "Weapon", "0"),

    SHIELD_BASH(null, null, null, "0", "-", "2", null, "-", "1", "1d4", "bludgeoning", "<p>A shield bash is not actually a weapon, but a maneuver in which you thrust or swing your shield to hit your foe with an impromptu attack.</p>", "<p></p>", "Shield", "1", null, "1", null, null, "0", "1", null, "Shield bash", "False", "0", "0", "1", null, "Martial Melee", null, "Weapon", "0"),

    SHIELD_BOSS(null, null, null, "0", "-", "2", null, "5 sp", "1", "1d6", "bludgeoning", "<p>Typically a round, convex, or conical piece of thick metal attached to the center of a shield, a shield boss increases the bludgeoning damage of a shield bash.</p>", "<p></p>", "Shield", "1", null, "1", null, null, "0", "1", null, "Shield boss", "False", "0", "0", "1", null, "Martial Melee", "Attached to shield", "Weapon", "0"),

    SHIELD_SPIKES(null, null, null, "0", "-", "2", null, "5 sp", "1", "1d6", "piercing", "<p>These metal spikes are strategically placed on the defensive side of the shield to deal piercing damage with a shield bash.</p>", "<p></p>", "Shield", "1", null, "1", null, null, "0", "1", null, "Shield spikes", "False", "0", "0", "1", null, "Martial Melee", "Attached to shield", "Weapon", "0"),

    SHORTSWORD(null, null, null, "0", "L", "2", null, "9 sp", "1", "1d6", "piercing", "<p>These blades come in a variety of shapes and styles, but they are typically 2 feet long.</p>", "<p></p>", "Sword", "1", null, "1", null, null, "0", "1", null, "Shortsword", "False", "0", "0", "1", null, "Martial Melee", "Agile, finesse, versatile S", "Weapon", "0"),

    STARKNIFE(null, null, null, "0", "L", "2", null, "20 sp", "1", "1d4", "piercing", "<p>From a central metal ring, four tapering metal blades extend like points on a compass rose. When gripping a starknife from the center, the wielder can use it as a melee weapon. It can also be thrown short distances.</p>", "<p></p>", "Knife", "1", null, "1", null, null, "0", "1", null, "Starknife", "False", "20", "0", "1", null, "Martial Melee", "Agile, deadly d6, finesse, thrown 20 ft., versatile S", "Weapon", "0"),

    TRIDENT(null, null, null, "0", "1", "2", null, "10 sp", "1", "1d8", "piercing", "<p>This three-pronged, spear-like weapon typically has a 4-foot shaft. Like a spear, it can be wielded with one hand or thrown.</p>", "<p></p>", "Spear", "1", null, "1", null, null, "0", "1", null, "Trident", "False", "20", "0", "1", null, "Martial Melee", "Thrown 20 ft.", "Weapon", "0"),

    WAR_FLAIL(null, null, null, "0", "2", "2", null, "20 sp", "1", "1d10", "bludgeoning", "<p>This large flail has a long shaft connected to a shorter piece of stout wood or metal that's sometimes inlaid with spikes.?</p>", "<p></p>", "Flail", "2", null, "1", null, null, "0", "1", null, "War flail", "False", "0", "0", "1", null, "Martial Melee", "Disarm, sweep, trip", "Weapon", "0"),

    WARHAMMER(null, null, null, "0", "1", "2", null, "10 sp", "1", "1d8", "bludgeoning", "<p>This weapon has a wooden shaft ending in a large, heavy metal head. The head of the hammer might be single-sided or double-sided, but it's always capable of delivering powerful bludgeoning blows.</p>", "<p></p>", "Hammer", "1", null, "1", null, null, "0", "1", null, "Warhammer", "False", "0", "0", "1", null, "Martial Melee", "Shove", "Weapon", "0"),

    WHIP(null, null, null, "0", "1", "2", null, "1 sp", "1", "1d4", "slashing", "<p>This long strand of thick leather, often braided, delivers a painful but nonlethal slash at a distance, usually accompanied by a distinctive cracking sound.</p>", "<p></p>", "Flail", "1", null, "1", null, null, "0", "1", null, "Whip", "False", "0", "0", "1", null, "Martial Melee", "Disarm, finesse, nonlethal, reach, trip", "Weapon", "0"),

    DOGSLICER(null, null, null, "0", "L", "2", null, "1 sp", "1", "1d6", "slashing", "<p>This short, curved, and crude makeshift blade often has holes drilled into it to reduce its weight. It's a favored weapon of goblins.</p>", "<p></p>", "Sword", "1", null, "1", null, null, "0", "1", null, "Dogslicer", "False", "0", "0", "1", null, "Uncommon Martial Melee", "Agile, backstabber, finesse, goblin", "Weapon", "0"),

    ELVEN_CURVE_BLADE(null, null, null, "0", "2", "2", null, "40 sp", "1", "1d8", "slashing", "<p>Essentially a longer version of the scimitar, this traditional elven weapon has a thinner blade than its cousin.</p>", "<p></p>", "Sword", "2", null, "1", null, null, "0", "1", null, "Elven curve blade", "False", "0", "0", "1", null, "Uncommon Martial Melee", "Elf, finesse, forceful", "Weapon", "0"),

    FILCHERS_FORK(null, null, null, "0", "L", "2", null, "10 sp", "1", "1d4", "piercing", "<p>This halfling weapon looks like a long, two-pronged fork and is used as both a weapon and a cooking implement.</p>", "<p></p>", "Spear", "1", null, "1", null, null, "0", "1", null, "Filcher's fork", "False", "20", "0", "1", null, "Uncommon Martial Melee", "Agile, backstabber, deadly d6, finesse, halfling, thrown 20 ft.", "Weapon", "0"),

    GNOME_HOOKED_HAMMER(null, null, null, "0", "1", "2", null, "20 sp", "1", "1d6", "bludgeoning", "<p>This gnome tool and weapon features a hammer at one end and a curved pick on the other. It's such a strange and awkward weapon that others think the gnomes are slightly erratic for using it.</p>", "<p></p>", "Hammer", "1", null, "1", null, null, "0", "1", null, "Gnome hooked hammer", "False", "0", "0", "1", null, "Uncommon Martial Melee", "Gnome, trip, two-hand d10, versatile P", "Weapon", "0"),

    HORSECHOPPER(null, null, null, "0", "2", "2", null, "9 sp", "1", "1d8", "slashing", "<p>Created by goblins to battle horses, this weapon is essentially a long shaft ending in a blade with a large hook.</p>", "<p></p>", "Polearm", "2", null, "1", null, null, "0", "1", null, "Horsechopper", "False", "0", "0", "1", null, "Uncommon Martial Melee", "Goblin, reach, trip, versatile P", "Weapon", "0"),

    KAMA(null, null, null, "0", "L", "2", null, "10 sp", "1", "1d6", "slashing", "<p>Similar to a sickle and used in some regions to reap grain, a kama has a short, slightly curved blade and a wooden handle.</p>", "<p></p>", "Knife", "1", null, "1", null, null, "0", "1", null, "Kama", "False", "0", "0", "1", null, "Uncommon Martial Melee", "Agile, monk, trip", "Weapon", "0"),

    KATANA(null, null, null, "0", "1", "2", null, "20 sp", "1", "1d6", "slashing", "<p>A katana is a curved, single-edged sword known for its wickedly sharped blade.</p>", "<p></p>", "Sword", "1", null, "1", null, null, "0", "1", null, "Katana", "False", "0", "0", "1", null, "Uncommon Martial Melee", "Deadly d8, two-hand d10, versatile P", "Weapon", "0"),

    KUKRI(null, null, null, "0", "L", "2", null, "6 sp", "1", "1d6", "slashing", "<p>The blade of this foot-long knife curves inward and lacks a cross guard at the hilt.</p>", "<p></p>", "Knife", "1", null, "1", null, null, "0", "1", null, "Kukri", "False", "0", "0", "1", null, "Uncommon Martial Melee", "Agile, finesse, trip", "Weapon", "0"),

    NUNCHAKU(null, null, null, "0", "L", "2", null, "2 sp", "1", "1d6", "bludgeoning", "<p>The nunchaku is constructed of two wooden or metal bars connected by a short length of rope or chain.</p>", "<p></p>", "Club", "1", null, "1", null, null, "0", "1", null, "Nunchaku", "False", "0", "0", "1", null, "Uncommon Martial Melee", "Backswing, disarm, finesse, monk", "Weapon", "0"),

    ORC_KNUCKLE_DAGGER(null, null, null, "0", "L", "2", null, "7 sp", "1", "1d6", "piercing", "<p>This stout, metal blade of orc design has a horizontal basket hilt with blades jutting from each end, or sometimes one blade like that of a katar.</p>", "<p></p>", "Knife", "1", null, "1", null, null, "0", "1", null, "Orc knuckle dagger", "False", "0", "0", "1", null, "Uncommon Martial Melee", "Agile, disarm, orc", "Weapon", "0"),

    SAI(null, null, null, "0", "L", "2", null, "6 sp", "1", "1d4", "piercing", "<p>This piercing dagger is a metal spike flanked by a pair of prongs that can be used to trap an enemy's weapon.</p>", "<p></p>", "Knife", "1", null, "1", null, null, "0", "1", null, "Sai", "False", "0", "0", "1", null, "Uncommon Martial Melee", "Agile, disarm, finesse, monk, versatile B", "Weapon", "0"),

    SPIKED_CHAIN(null, null, null, "0", "1", "2", null, "30 sp", "1", "1d8", "slashing", "<p>This 4-foot-long length of chain is covered with barbs and has spikes on one or both ends. Some feature metal hoops used as handgrips.</p>", "<p></p>", "Flail", "2", null, "1", null, null, "0", "1", null, "Spiked chain", "False", "0", "0", "1", null, "Uncommon Martial Melee", "Disarm, finesse, trip", "Weapon", "0"),

    TEMPLE_SWORD(null, null, null, "0", "1", "2", null, "20 sp", "1", "1d8", "slashing", "<p>This heavy blade is favored by guardians of religious sites. It has a distinctive, crescent-shaped blade that seems to be a mix of a sickle and sword. It often has holes drilled into the blade or the pommel so that bells or other holy trinkets can be affixed to the weapon as an aid for prayer or mediation.</p>", "<p></p>", "Sword", "1", null, "1", null, null, "0", "1", null, "Temple sword", "False", "0", "0", "1", null, "Uncommon Martial Melee", "Monk, trip", "Weapon", "0"),

    DWARVEN_WARAXE(null, null, null, "0", "2", "2", null, "30 sp", "1", "1d8", "slashing", "<p>This favored weapon of the dwarves has a large, ornate head mounted on a thick handle. This powerful axe can be wielded with one hand or two.</p>", "<p></p>", "Axe", "1", null, "1", null, null, "0", "1", null, "Dwarven waraxe", "False", "0", "0", "1", null, "Uncommon Advanced Melee", "Dwarf, sweep, two-hand d12", "Weapon", "0"),

    GNOME_FLICKMACE(null, null, null, "0", "2", "2", null, "30 sp", "1", "1d8", "bludgeoning", "<p>More a flail than a mace, this weapon has a short handle attached to a length of chain with a ball at the end. The ball is propelled to its reach with the flick of the wrist, the momentum of which brings the ball back to the wielder after the strike.</p>", "<p></p>", "Flail", "1", null, "1", null, null, "0", "1", null, "Gnome flickmace", "False", "0", "0", "1", null, "Uncommon Advanced Melee", "Gnome, reach", "Weapon", "0"),

    ORC_NECKSPLITTER(null, null, null, "0", "1", "2", null, "20 sp", "1", "1d8", "slashing", "<p>This single-bladed bearded axe has a jagged blade that's perfect for separating bone from tendon and cartilage.</p>", "<p></p>", "Axe", "1", null, "1", null, null, "0", "1", null, "Orc necksplitter", "False", "0", "0", "1", null, "Uncommon Advanced Melee", "Forceful, orc, sweep", "Weapon", "0"),

    SAWTOOTH_SABRE(null, null, null, "0", "L", "2", null, "50 sp", "1", "1d6", "slashing", "<p>The signature weapon of the Red Mantis assassins, this curved blade is serrated like a saw, hence the name.</p>", "<p></p>", "Sword", "1", null, "1", null, null, "0", "1", null, "Sawtooth sabre", "False", "0", "0", "1", null, "Uncommon Advanced Melee", "Agile, finesse, twin", "Weapon", "0"),

    BLOWGUN(null, null, null, "0", "L", "2", null, "1 sp", "1", "1", "piercing", "<p>This long, narrow tube is used for shooting blowgun darts, using only the power of a forcefully exhaled breath.</p>", "<p></p>", "Dart", "1", null, "1", null, null, "0", "1", null, "Blowgun", "False", "20", "1", "1", null, "Simple Ranged", "Agile, nonlethal", "Weapon", "0"),

    CROSSBOW(null, null, null, "0", "1", "2", null, "30 sp", "1", "1d8", "piercing", "<p>This ranged weapon has a bow-like assembly mounted on a handled frame called a tiller. The tiller has a mechanism to lock the bowstring in place, attached to a trigger mechanism that releases the tension and launches a bolt.</p>", "<p></p>", "Bow", "2", null, "1", null, null, "0", "1", null, "Crossbow", "False", "120", "1", "1", null, "Simple Ranged", null, "Weapon", "0"),

    DART(null, null, null, "0", "L", "2", null, "1 cp", "1", "1d4", "piercing", "<p>This thrown weapon is larger than an arrow but shorter than a javelin. It typically has a short shaft of wood ending in a metal tip and is sometimes stabilized by feathers or fur.</p>", "<p></p>", "Dart", "1", null, "1", null, null, "0", "1", null, "Dart", "False", "20", "0", "1", null, "Simple Ranged", "Agile, thrown", "Weapon", "0"),

    HAND_CROSSBOW(null, null, null, "0", "L", "2", null, "30 sp", "1", "1d6", "piercing", "<p>Sometimes referred to as an alley bow by rogues or ruffians, this small crossbow fires small bolts that are sometimes used to deliver poison to the target. It's small enough to be shot one-handed, but it still requires two hands to load.</p>", "<p></p>", "Bow", "1", null, "1", null, null, "0", "1", null, "Hand crossbow", "False", "60", "1", "1", null, "Simple Ranged", null, "Weapon", "0"),

    HEAVY_CROSSBOW(null, null, null, "0", "2", "2", null, "40 sp", "1", "1d10", "piercing", "<p>This large crossbow is harder to load and more substantial than a regular crossbow, but it packs a greater punch.</p>", "<p></p>", "Bow", "2", null, "1", null, null, "0", "1", null, "Heavy crossbow", "False", "120", "2", "1", null, "Simple Ranged", null, "Weapon", "0"),

    JAVELIN(null, null, null, "0", "L", "2", null, "1 sp", "1", "1d6", "piercing", "<p>This thin spear is well balanced for throwing but is not designed for melee use.</p>", "<p></p>", "Dart", "1", null, "1", null, null, "0", "1", null, "Javelin", "False", "30", "0", "1", null, "Simple Ranged", "Thrown", "Weapon", "0"),

    SLING(null, null, null, "0", "L", "2", null, "0 sp", "1", "1d6", "bludgeoning", "<p>Little more than a leather cup attached to a pair of straps, a sling can be used to fling smooth stones or sling bullets at a range.</p>", "<p></p>", "Sling", "1", null, "1", null, null, "0", "1", null, "Sling", "False", "50", "1", "1", null, "Simple Ranged", "Propulsive", "Weapon", "0"),

    ALCHEMICAL_BOMB(null, null, null, "0", "L", "2", null, "Varies", "1", "Varies", "Varies", "<p>These bombs come in a variety of types and levels of power, but no matter the variety, you throw the bomb at the target and it explodes, unleashing its alchemical blast.</p>", "<p></p>", "Bomb", "1", null, "1", null, null, "0", "1", null, "Alchemical bomb", "False", "20", "0", "1", null, "Martial Ranged", "Varies", "Weapon", "0"),

    COMPOSITE_LONGBOW(null, null, null, "0", "2", "2", null, "200 sp", "1", "1d8", "piercing", "<p>This projectile weapon is made from horn, wood, and sinew laminated together to increase the power of its pull and the force of its projectile. Like all longbows, its great size also increases the bow's range and power. You must use two hands to fire it, and it cannot be used while mounted. Any time an ability is specifically restricted to a longbow, such as Erastil's favored weapon, it also applies to composite longbows unless otherwise stated.</p>", "<p></p>", "Bow", "1+", null, "1", null, null, "0", "1", null, "Composite longbow", "False", "100", "0", "1", null, "Martial Ranged", "Deadly d10, propulsive, volley 30 ft.", "Weapon", "0"),

    COMPOSITE_SHORTBOW(null, null, null, "0", "1", "2", null, "140 sp", "1", "1d6", "piercing", "<p>This shortbow is made from horn, wood, and sinew laminated together to increase the power of its pull and the force of its projectile. Its compact size and power make it a favorite of mounted archers. Any time an ability is specifically restricted to a shortbow, it also applies to composite shortbows unless otherwise stated.</p>", "<p></p>", "Bow", "1+", null, "1", null, null, "0", "1", null, "Composite shortbow", "False", "60", "0", "1", null, "Martial Ranged", "Deadly d10, propulsive", "Weapon", "0"),

    LONGBOW(null, null, null, "0", "2", "2", null, "60 sp", "1", "1d8", "piercing", "<p>This 5-foot-tall bow, usually made of a single piece of elm, hickory, or yew, has a powerful draw and is excellent at propelling arrows with great force and at an extreme distance. You must use two hands to fire a longbow, and it can't be used while mounted.</p>", "<p></p>", "Bow", "1+", null, "1", null, null, "0", "1", null, "Longbow", "False", "100", "0", "1", null, "Martial Ranged", "Deadly d10, volley 30 ft.", "Weapon", "0"),

    SHORTBOW(null, null, null, "0", "1", "2", null, "30 sp", "1", "1d6", "piercing", "<p>This smaller bow is made of a single piece of wood and favored by skirmishers and cavalry.</p>", "<p></p>", "Bow", "1+", null, "1", null, null, "0", "1", null, "Shortbow", "False", "60", "0", "1", null, "Martial Ranged", "Deadly d10", "Weapon", "0"),

    HALFLING_SLING_STAFF(null, null, null, "0", "1", "2", null, "50 sp", "1", "1d10", "bludgeoning", "<p>This staff ends in a Y-shaped split that cradles a sling. The length of the staff provides excellent leverage when used two-handed to fling rocks or bullets from the sling.</p>", "<p></p>", "Sling", "2", null, "1", null, null, "0", "1", null, "Halfling sling staff", "False", "80", "1", "1", null, "Uncommon Martial Ranged", "Halfling, propulsive", "Weapon", "0"),

    SHURIKEN(null, null, null, "0", "-", "2", null, "1 cp", "1", "1d4", "piercing", "<p>This \"throwing star\" is a small piece of flat metal with sharp edges, designed to be flung with a flick of the wrist.</p>", "<p></p>", "Dart", "1", null, "1", null, null, "0", "1", null, "Shuriken", "False", "20", "0", "1", null, "Uncommon Martial Ranged", "Agile, monk, thrown", "Weapon", "0"),

    // ----------------------------------------------------------- WEAPONS -----------------------------------------------------------
    HALF_PLATE( "5", "0", "16", "0", "3", "2", "-3",
             "180 sp", null, null, null, "<p></p>", "<p></p>",
             "Plate", null, "0", "1", "0", "0", "0", "1",
             "1", "Half Plate", "False", null, null,
             "1", "-10", "Heavy", null, "Armor", "0"),

    ADVENTURERS_PACK("0", "0", "0", "0", "1", "1", "0",
            "7 sp", "1", null, null, "<p>This item is the starter kit for an" +
            " adventurer, containing the essential items for exploration and survival. The Bulk value is for the entire" +
            " pack together, but see the descriptions of individual items as necessary.</p><p>The pack contains the" +
            " following items: backpack (containing the other goods), bedroll, two belt pouches, 10 pieces of chalk," +
            " flint and steel, 50 feet of rope, 2 weeks' rations, soap, 5 torches, and a waterskin.</p>",
            "<p></p>", null, "-", "0", "1", "0", "0", "0",
            "1", "0", "Adventurer's pack", "False", "0", "0",
            "1", "0", "Adventuring Gear", null, "Gear", "1"),

    STEEL_SHIELD("2", "0", "0", "0", "1", "2", "0",
            "20 sp", "1", null, null, "<p>Like wooden shields, steel shields" +
            " come in a variety of shapes and sizes. Though more expensive than wooden shields, they are much more" +
            " durable.</p>", "<p></p>", null, null, "5", "1", "10",
            "20", "0", "1", "0", "Steel shield", "False", null,
            null, "1", "0", "Shield", null, "Shield", "0"),


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

    private String name = "";

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
        if (this != ITEM_NOT_FOUND) {
            return new Item(ac, acSpecial, armorStrength, bonus, bulk, carried, checkPenalty,
                    cost, qtd, damage, damageType, description, gmNotes,
                    group, hands, hardness, isIdentified, itemBT, itemHP, level,
                    locked, maxStatBonus, name, pfsLegal, range, reload, showOnMiniSheet,
                    speedPenalty, subType, traits, type, weight);
        } else {
            return null;
        }
    }

    public Item getItem(){
        return this.getItem(1);
    }

    public static ItemEnum getItemEnum(String name){
        for (ItemEnum itemEnum : ItemEnum.values()){
            if (itemEnum.getName().equalsIgnoreCase(name))
                return itemEnum;
        }
        return ITEM_NOT_FOUND;
    }
}
