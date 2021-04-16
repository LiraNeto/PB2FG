package com.liraneto.controller.enums.ItemEnum;

import com.liraneto.model.xml.character.inventoryList.Item;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Getter
@AllArgsConstructor
@NoArgsConstructor
public enum ItemEnum {
    // ----------------------------------------------------------- WEAPONS-CORE-------------------------------------------------------
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
    // ----------------------------------------------------------- WEAPONS-CORE-------------------------------------------------------

    // ----------------------------------------------------------- ARMORS-CORE--------------------------------------------------------
    NO_ARMOR("0", "0", "0", "0", null, "2", "0", "-", "1", null, null, "<p></p>", "<p></p>", null, null, "0", "1", "0", "0", "0", "1", "999", "No armor", "False", null, null, "1", "0", "Unarmored", null, "Armor", "0"),

    EXPLORERS_CLOTHING("0", "0", "0", "0", "L", "1", "0", "1 sp", "1", null, null, "<p></p>", "<p></p>", null, null, "0", "1", "0", "0", "0", "1", "5", "Explorer's clothing", "False", null, null, "1", "0", "Unarmored", "Comfort", "Armor", "0"),

    PADDED_ARMOR("1", "0", "10", "0", "L", "1", "0", "2 sp", "1", null, null, "<p></p>", "<p></p>", null, null, "0", "1", "0", "0", "0", "1", "3", "Padded Armor", "False", null, null, "1", "0", "Light", "Comfort", "Armor", "0"),

    LEATHER("1", "0", "10", "0", "1", "1", "-1", "20 sp", "1", null, null, "<p></p>", "<p></p>", null, null, "0", "1", "0", "0", "0", "1", "4", "Leather", "False", null, null, "1", "0", "Light", null, "Armor", "0"),

    STUDDED_LEATHER("2", "0", "12", "0", "1", "1", "-1", "30 sp", "1", null, null, "<p></p>", "<p></p>", null, null, "0", "1", "0", "0", "0", "1", "3", "Studded Leather", "False", null, null, "1", "0", "Light", null, "Armor", "0"),

    CHAIN_SHIRT("2", "0", "12", "0", "1", "1", "-1", "50 sp", "1", null, null, "<p>Sometimes called a hauberk, this is a long shirt constructed of the same metal rings as chainmail. However, it is much lighter than chainmail and protects only the torso, upper arms, and upper legs of its wearer.</p>", "<p></p>", null, null, "0", "1", "0", "0", "0", "1", "3", "Chain Shirt", "False", null, null, "1", "0", "Light", "Flexible, Noisy", "Armor", "0"),

    HIDE("3", "0", "14", "0", "2", "1", "-2", "20 sp", "1", null, null, "<p></p>", "<p></p>", "Leather", null, "0", "1", "0", "0", "0", "1", "2", "Hide", "False", null, null, "1", "-5", "Medium", null, "Armor", "0"),

    SCALE_MAIL("3", "0", "14", "0", "2", "1", "-2", "40 sp", "1", null, null, "<p></p>", "<p></p>", "Composite", null, "0", "1", "0", "0", "0", "1", "2", "Scale mail", "False", null, null, "1", "-5", "Medium", null, "Armor", "0"),

    CHAIN_MAIL("4", "0", "16", "0", "2", "1", "-2", "60 sp", "1", null, null, "<p>A suit of chain mail consists of several pieces of armor composed of small metal rings linked together in a protective mesh. It typically includes a chain shirt, leggings, a pair of arms, and a coif, collectively protecting most of the body.</p>", "<p></p>", "Chain", null, "0", "1", "0", "0", "0", "1", "1", "Chain Mail", "False", null, null, "1", "-5", "Medium", "Flexible, Noisy", "Armor", "0"),

    BREASTPLATE("4", "0", "16", "0", "2", "1", "-2", "80 sp", "1", null, null, "<p>Though referred to as a breastplate, this type of armor consists of several pieces of plate or half-plate armor (page 276) that protect the torso, chest, neck, and sometimes the hips and lower legs. It strategically grants some of the protection of plate while allowing greater flexibility and speed.</p>", "<p></p>", "Plate", null, "0", "1", "0", "0", "0", "1", "1", "Breastplate", "False", null, null, "1", "-5", "Medium", null, "Armor", "0"),

    SPLINT_MAIL("5", "0", "16", "0", "3", "1", "-3", "130 sp", "1", null, null, "<p></p>", "<p></p>", "Composite", null, "0", "1", "0", "0", "0", "1", "1", "Splint mail", "False", null, null, "1", "-10", "Heavy", null, "Armor", "0"),

    HALF_PLATE("5", "0", "16", "0", "3", "1", "-3", "180 sp", "1", null, null, "<p></p>", "<p></p>", "Plate", null, "0", "1", "0", "0", "0", "1", "1", "Half Plate", "False", null, null, "1", "-10", "Heavy", null, "Armor", "0"),

    FULL_PLATE("6", "0", "18", "0", "4", "1", "-3", "300 sp", "1", null, null, "<p></p>", "<p></p>", "Plate", null, "0", "1", "0", "0", "0", "1", "0", "Full plate", "False", null, null, "1", "-10", "Heavy", "Bulwark", "Armor", "0"),
    // -------------------------------------------------------------ARMORS-CORE--------------------------------------------------------

    // ------------------------------------------------------------SHIELDS-CORE--------------------------------------------------------
    BUCKLER("1", "0", "0", "0", "L", "2", "0", "10 sp", "1", null, null, "<p>This very small shield is a favorite of duelists and quick, lightly armored warriors. It's typically made of steel and strapped to your forearm. You can Raise a Shield with your buckler as long as you have that hand free or are holding a light object that's not a weapon in that hand.</p>", "<p></p>", null, null, "3", "1", "3", "6", "0", "1", "0", "Buckler", "False", null, null, "1", "0", "Shield", null, "Shield", "0"),

    WOODEN_SHIELD("2", "0", "0", "0", "1", "1", "0", "10 sp", "1", null, null, "<p>Though they come in a variety of shapes and sizes, the protection offered by wooden shields comes from the stoutness of their materials. While wooden shields are less expensive than steel shields, they break more easily.</p>", "<p></p>", null, null, "3", "1", "6", "12", "0", "1", "0", "Wooden Shield", "False", null, null, "1", "0", "Shield", null, "Shield", "0"),

    TOWER_SHIELD("2", "4", "0", "0", "4", "1", "0", "100 sp", "1", null, null, "<p>These massive shields can be used to provide cover to nearly the entire body. Due to their size, they are typically made of wood reinforced with metal.</p><p>Getting the higher AC bonus for a tower shield requires using the Take Cover action (page 471) while the shield is raised.</p>", "<p></p>", null, null, "5", "1", "10", "20", "0", "1", "0", "Tower Shield", "False", null, null, "1", "-5", "Shield", null, "Shield", "0"),

    STEEL_SHIELD("2", "0", "0", "0", "1", "1", "0", "20 sp", "1", null, null, "<p>Like wooden shields, steel shields come in a variety of shapes and sizes. Though more expensive than wooden shields, they are much more durable.</p>", "<p></p>", null, null, "5", "1", "10", "20", "0", "1", "0", "Steel shield", "False", null, null, "1", "0", "Shield", null, "Shield", "0"),
    // ------------------------------------------------------------SHIELDS-CORE--------------------------------------------------------

    // -------------------------------------------------------------GEARSS-CORE--------------------------------------------------------
    ADVENTURERS_PACK("0", "0", "0", "0", "1", "1", "0", "7 sp", "1", null, null, "<p>This item is the starter kit for an adventurer, containing the essential items for exploration and survival. The Bulk value is for the entire pack together, but see the descriptions of individual items as necessary.</p><p>The pack contains the following items: backpack (containing the other goods), bedroll, two belt pouches, 10 pieces of chalk, flint and steel, 50 feet of rope, 2 weeks' rations, soap, 5 torches, and a waterskin.</p>", "<p></p>", null, "-", "0", "1", "0", "0", "0", "1", "0", "Adventurer's pack", "False", "0", "0", "1", "0", "Adventuring Gear", null, "Gear", "1"),

    ALCHEMISTS_LAB(null, null, null, null, "6", "1", null, "50 sp", "1", null, null, "<p>You need an alchemist's lab to Craft alchemical items during downtime. An expanded alchemist's lab gives a +1 item bonus to Crafting checks to create alchemical items.</p>", "<p></p>", null, "2", null, "1", null, null, "0", "1", null, "Alchemist's lab", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    ALCHEMISTS_LAB_EXPANDED(null, null, null, null, "6", "1", null, "550 sp", "1", null, null, "<p>You need an alchemist's lab to Craft alchemical items during downtime. An expanded alchemist's lab gives a +1 item bonus to Crafting checks to create alchemical items.</p>", "<p></p>", null, "2", null, "1", null, null, "3", "1", null, "Alchemist's lab - Expanded", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    ALCHEMISTS_TOOLS(null, null, null, null, "1", "1", null, "30 sp", "1", null, null, "<p>This mobile collection of vials and chemicals can be used for simple alchemical tasks.</p>", "<p></p>", null, "2", null, "1", null, null, "0", "1", null, "Alchemist's tools", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    ARTISANS_TOOLS(null, null, null, null, "2", "1", null, "40 sp", "1", null, null, "<p>You need these tools to create items from raw materials with the Craft skill. Different sets are needed for different work, as determined by the GM; for example, blacksmith's tools differ from woodworker's tools.</p>", "<p></p>", null, "2", null, "1", null, null, "0", "1", null, "Artisan's tools", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    ARTISANS_TOOLS_STERLING(null, null, null, null, "2", "1", null, "500 sp", "1", null, null, "<p>You need these tools to create items from raw materials with the Craft skill. Sterling artisan's tools give you a +1 item bonus to the check. Different sets are needed for different work, as determined by the GM; for example, blacksmith's tools differ from woodworker's tools.</p>", "<p></p>", null, "2", null, "1", null, null, "3", "1", null, "Artisan's tools - sterling", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    BACKPACK(null, null, null, null, "-", "1", null, "1 sp", "1", null, null, "<p>A backpack holds up to 4 Bulk of items. If you're carrying or stowing the pack rather than wearing it on your back, its bulk is light instead of negligible.</p>", "<p></p>", null, "-", null, "1", null, null, "0", "1", null, "Backpack", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    BANDOLIER(null, null, null, null, "-", "1", null, "1 sp", "1", null, null, "<p>A bandolier holds up to eight items of light Bulk within easy reach and is usually used for alchemical items or potions. If you are carrying or stowing a bandolier rather than wearing it around your chest, it has light Bulk instead of negligible. A bandolier can be dedicated to a full set of tools, such as healer's tools, allowing you to draw the tools as part of the action that requires them.</p>", "<p></p>", null, "-", null, "1", null, null, "0", "1", null, "Bandolier", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    BASIC_CRAFTERS_BOOK(null, null, null, null, "L", "1", null, "1 sp", "1", null, null, "<p>This book contains the formulas (page 293) for Crafting the common items in this chapter.</p>", "<p></p>", null, "2", null, "1", null, null, "0", "1", null, "Basic crafter's book", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    BEDROLL(null, null, null, null, "L", "1", null, "1 cp", "1", null, null, "<p></p>", "<p></p>", null, "-", null, "1", null, null, "0", "1", null, "Bedroll", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    BELT_POUCH(null, null, null, null, "-", "1", null, "4 cp", "1", null, null, "<p>A belt pouch holds up to four items of light Bulk.</p>", "<p></p>", null, "-", null, "1", null, null, "0", "1", null, "Belt pouch", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    CALTROPS(null, null, null, null, "L", "1", null, "3 sp", "1", null, null, "<p>These four-pronged metal spikes can cause damage to a creature's feet. You can scatter caltrops in an empty square adjacent to you with an Interact action. The first creature that moves into that square must succeed at a DC 14 Acrobatics check or take 1d4 piercing damage and 1 persistent bleed damage. A creature taking persistent bleed damage from caltrops takes a -5-foot penalty to its Speed. Spending an Interact action to pluck the caltrops free reduces the DC to stop the bleeding. Once a creature takes damage from caltrops, enough caltrops are ruined that other creatures moving into the square are safe.</p><p>Deployed caltrops can be salvaged and reused if no creatures took damage from them. Otherwise, enough caltrops are ruined that they can't be salvaged.</p>", "<p></p>", null, "1", null, "1", null, null, "0", "1", null, "Caltrops", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    CANDLE(null, null, null, null, "-", "1", null, "1 cp", "1", null, null, "<p>A lit candle sheds dim light in a 10-foot radius.</p>", "<p></p>", null, "1", null, "1", null, null, "0", "1", null, "Candle (10)", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    CHAIN(null, null, null, null, "1", "1", null, "40 sp", "1", null, null, "<p></p>", "<p></p>", null, "2", null, "1", null, null, "0", "1", null, "Chain (10 feet)", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    CHALK(null, null, null, null, "-", "1", null, "1 cp", "1", null, null, "<p></p>", "<p></p>", null, "1", null, "1", null, null, "0", "1", null, "Chalk (10)", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    CHEST(null, null, null, null, "2", "1", null, "6 sp", "1", null, null, "<p>A wooden chest can hold up to 8 Bulk of items.</p>", "<p></p>", null, "2", null, "1", null, null, "0", "1", null, "Chest", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    CLIMBING_KIT(null, null, null, null, "1", "1", null, "5 sp", "1", null, null, "<p>This satchel includes 50 feet of rope, pulleys, a dozen pitons, a hammer, a grappling hook, and one set of crampons. Climbing kits allow you to attach yourself to the wall you're Climbing, moving half as quickly as usual (minimum 5 feet) but letting you attempt a DC 5 flat check whenever you critically fail to prevent a fall. A single kit has only enough materials for one climber; each climber needs their own kit.</p>", "<p></p>", null, "2", null, "1", null, null, "0", "1", null, "Climbing kit", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    CLIMBING_KIT_EXTREME(null, null, null, null, "1", "1", null, "400 sp", "1", null, null, "<p>This satchel includes 50 feet of rope, pulleys, a dozen pitons, a hammer, a grappling hook, and one set of crampons. Climbing kits allow you to attach yourself to the wall you're Climbing, moving half as quickly as usual (minimum 5 feet) but letting you attempt a DC 5 flat check whenever you critically fail to prevent a fall. You gain a +1 item bonus to Athletics checks to Climb while using an extreme climbing kit. A single kit has only enough materials for one climber; each climber needs their own kit.</p>", "<p></p>", null, "2", null, "1", null, null, "3", "1", null, "Climbing kit - extreme", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    CLOTHING_EXPLORERS(null, null, null, null, "L", "1", null, "1 sp", "1", null, null, "<p>Explorer's clothing is sturdy enough that it can be reinforced to protect you, even though it isn't a suit of armor. It comes in many forms, though the most common sorts look like clerical vestments, monk's garments, or wizard's robes, as members of all three classes are likely to avoid wearing armor. For more information on explorer's clothing, see pages 275-276.</p>", "<p></p>", null, null, null, "1", null, null, "0", "1", null, "Clothing - Explorer's", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    CLOTHING_FINE(null, null, null, null, "L", "1", null, "20 sp", "1", null, null, "<p>Fine clothing, suitable for a noble or royal, is made with expensive fabrics, precious metals, and intricate patterns.</p>", "<p></p>", null, null, null, "1", null, null, "0", "1", null, "Clothing - Fine", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    CLOTHING_FINE_HIGH_FASHION(null, null, null, null, "L", "1", null, "550 sp", "1", null, null, "<p>Fine clothing, suitable for a noble or royal, is made with expensive fabrics, precious metals, and intricate patterns. You gain a +1 item bonus to checks to Make an Impression on nobility or other upper-class folk while wearing high-fashion fine clothing.</p>", "<p></p>", null, null, null, "1", null, null, "3", "1", null, "Clothing - fine, high-fashion", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    CLOTHING_ORDINARY(null, null, null, null, null, "1", null, "1 sp", "1", null, null, "<p>Ordinary clothing is functional with basic tailoring, such as peasant garb, monk's robes, or work clothes.</p>", "<p></p>", null, null, null, "1", null, null, "0", "1", null, "Clothing - Ordinary", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    CLOTHING_WINTER(null, null, null, null, "L", "1", null, "4 sp", "1", null, null, "<p>Winter clothing allows you to negate the damage from severe environmental cold and reduce the damage from extreme cold to that of severe cold.</p>", "<p></p>", null, null, null, "1", null, null, "0", "1", null, "Clothing - Winter", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    COMPASS(null, null, null, null, "-", "1", null, "10 sp", "1", null, null, "<p>A compass helps you Sense Direction or navigate, provided you're in a location with uniform magnetic fields. Without a compass, you take a -2 item penalty to these checks (similar to using a shoddy item).</p>", "<p></p>", null, "1", null, "1", null, null, "0", "1", null, "Compass", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    COMPASS_LENSATIC(null, null, null, null, "-", "1", null, "200 sp", "1", null, null, "<p>A compass helps you Sense Direction or navigate, provided you're in a location with uniform magnetic fields. Without a compass, you take a -2 item penalty to these checks (similar to using a shoddy item). A lensatic compass gives you a +1 item bonus to these checks.</p>", "<p></p>", null, "1", null, "1", null, null, "3", "1", null, "Compass - lensatic", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    COOKWARE(null, null, null, null, "2", "1", null, "10 sp", "1", null, null, "<p></p>", "<p></p>", null, "2", null, "1", null, null, "0", "1", null, "Cookware", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    CROWBAR(null, null, null, null, "L", "1", null, "5 sp", "1", null, null, "<p>When Forcing Open an object that doesn't have an easy grip, a crowbar makes it easier to gain the necessary leverage. Without a crowbar, prying something open takes a -2 item penalty to the Athletics check to Force Open (similar to using a shoddy item).</p>", "<p></p>", null, "2", null, "1", null, null, "0", "1", null, "Crowbar", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    CROWBAR_LEVERED(null, null, null, null, "L", "1", null, "200 sp", "1", null, null, "<p>When Forcing Open an object that doesn't have an easy grip, a crowbar makes it easier to gain the necessary leverage. Without a crowbar, prying something open takes a -2 item penalty to the Athletics check to Force Open (similar to using a shoddy item). A levered crowbar grants you a +1 item bonus to Athletics checks to Force Open anything that can be pried open.</p>", "<p></p>", null, "2", null, "1", null, null, "3", "1", null, "Crowbar - levered", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    DISGUISE_KIT(null, null, null, null, "L", "1", null, "20 sp", "1", null, null, "<p>This small wooden box contains cosmetics, false facial hair, spirit gum, and a few simple wigs. You usually need a disguise kit to set up a disguise in order to Impersonate someone using the Deception skill. If you've crafted a large number of disguises, you can replenish your cosmetics supply with replacement cosmetics suitable for the type of your disguise kit.</p>", "<p></p>", null, "2", null, "1", null, null, "0", "1", null, "Disguise kit", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    DISGUISE_KIT_ELITE(null, null, null, null, "L", "1", null, "400 sp", "1", null, null, "<p>This small wooden box contains cosmetics, false facial hair, spirit gum, and a few simple wigs. You usually need a disguise kit to set up a disguise in order to Impersonate someone using the Deception skill. An elite disguise kit adds a +1 item bonus to relevant checks. If you've crafted a large number of disguises, you can replenish your cosmetics supply with replacement cosmetics suitable for the type of your disguise kit.</p>", "<p></p>", null, "2", null, "1", null, null, "3", "1", null, "Disguise kit - Elite", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    DISGUISE_KIT_ELITE_REPLACEMENT_COSMETICS(null, null, null, null, "-", "1", null, "5 sp", "1", null, null, "<p>If you've crafted a large number of disguises, you can replenish your cosmetics supply with replacement cosmetics suitable for the type of your disguise kit</p>", "<p></p>", null, "-", null, "1", null, null, "3", "1", null, "Disguise kit - Elite replacement cosmetics", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    DISGUISE_KIT_REPLACEMENT_COSMETICS(null, null, null, null, "-", "1", null, "1 sp", "1", null, null, "<p>If you've crafted a large number of disguises, you can replenish your cosmetics supply with replacement cosmetics suitable for the type of your disguise kit.</p>", "<p></p>", null, "-", null, "1", null, null, "0", "1", null, "Disguise kit - Replacement cosmetics", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    FISHING_TACKLE(null, null, null, null, "1", "1", null, "8 sp", "1", null, null, "<p>This kit include a collapsible fishing pole, fishhooks, line, lures, and a fishing net.</p>", "<p></p>", null, "2", null, "1", null, null, "0", "1", null, "Fishing tackle", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    FISHING_TACKLE_PROFESSIONAL(null, null, null, null, "1", "1", null, "200 sp", "1", null, null, "<p>This kit include a collapsible fishing pole, fishhooks, line, lures, and a fishing net. Professional fishing tackle grants a +1 item bonus to checks to fish.</p>", "<p></p>", null, "2", null, "1", null, null, "3", "1", null, "Fishing tackle - professional", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    FLINT_AND_STEEL(null, null, null, null, "-", "1", null, "5 cp", "1", null, null, "<p>Flint and steel are useful in creating a fire if you have the time to catch a spark, though using them is typically too time-consuming to be practical during an encounter. Even in ideal conditions, using flint and steel to light a flame requires using at least 3 actions, and often significantly longer.</p>", "<p></p>", null, "2", null, "1", null, null, "0", "1", null, "Flint and steel", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    FORMULA_BOOK(null, null, null, null, "L", "1", null, "10 sp", "1", null, null, "<p>A formula book holds the formulas necessary to make items other than the common equipment from this chapter; alchemists typically get one for free. Each formula book can hold the formulas for up to 100 different items. Formulas can also appear on parchment sheets, tablets, and almost any other medium; there's no need for you to copy them into a specific book as long as you can keep them on hand to reference them.</p>", "<p></p>", null, "1", null, "1", null, null, "0", "1", null, "Formula book (blank)", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    GRAPPLING_HOOK(null, null, null, null, "L", "1", null, "1 sp", "1", null, null, "<p>You can throw a grappling hook with a rope tied to it to make a climb easier. To anchor a grappling hook, make an attack roll with the secret trait against a DC depending on the target, typically at least DC 20. On a success, your hook has a firm hold, but on a critical failure, the hook seems like it will hold but actually falls when you're partway up.</p>", "<p></p>", null, "1", null, "1", null, null, "0", "1", null, "Grappling hook", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    HAMMER(null, null, null, null, "L", "1", null, "1 sp", "1", null, null, "<p></p>", "<p></p>", null, "1", null, "1", null, null, "0", "1", null, "Hammer", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    HEALERS_TOOLS(null, null, null, null, "1", "1", null, "50 sp", "1", null, null, "<p>This kit of bandages, herbs, and suturing tools is necessary for Medicine checks to Administer First Aid, Treat Disease, Treat Poison, or Treat Wounds. When you carry the tools from place to place, you keep many of the components handy on your person, in pockets or bandoliers.</p>", "<p></p>", null, "2", null, "1", null, null, "0", "1", null, "Healer's tools", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    HEALERS_TOOLS_EXPANDED(null, null, null, null, "1", "1", null, "500 sp", "1", null, null, "<p>This kit of bandages, herbs, and suturing tools is necessary for Medicine checks to Administer First Aid, Treat Disease, Treat Poison, or Treat Wounds. Expanded healer's tools provide a +1 item bonus to such checks. When you carry the tools from place to place, you keep many of the components handy on your person, in pockets or bandoliers.</p>", "<p></p>", null, "2", null, "1", null, null, "3", "1", null, "Healer's tools - expanded", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    HOLLY_AND_MISTLETOE(null, null, null, null, "-", "1", null, "0", "1", null, null, "<p>Plants of supernatural significance provide a primal focus for primal spellcasters, such as druids, when using certain abilities and casting some spells. A bundle of holly and mistletoe must be held in one hand to use it. Other primal foci exist for druids focused on other aspects of nature.</p>", "<p></p>", null, "1", null, "1", null, null, "0", "1", null, "Holly and mistletoe", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    HOURGLASS(null, null, null, null, "L", "1", null, "30 sp", "1", null, null, "<p></p>", "<p></p>", null, "1", null, "1", null, null, "0", "1", null, "Hourglass", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    LADDER(null, null, null, null, "3", "1", null, "3 cp", "1", null, null, "<p></p>", "<p></p>", null, "2", null, "1", null, null, "0", "1", null, "Ladder (10-foot)", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    LANTERN_BULLS_EYE(null, null, null, null, "1", "1", null, "10 sp", "1", null, null, "<p>A lantern sheds bright light and requires 1 pint of oil to function for 6 hours. A bull's-eye lantern emits its light in a 60-foot cone (and dim light in the next 60 feet).</p>", "<p></p>", null, "1", null, "1", null, null, "0", "1", null, "Lantern - Bull's-eye", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    LANTERN_HOODED(null, null, null, null, "L", "1", null, "7 sp", "1", null, null, "<p>A lantern sheds bright light and requires 1 pint of oil to function for 6 hours. A hooded lantern sheds light in a 30-foot radius (and dim light in the next 30 feet) and is equipped with shutters, which you can close to block the light. Closing or opening the shutters takes an Interact action.</p>", "<p></p>", null, "1", null, "1", null, null, "0", "1", null, "Lantern - Hooded", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    LOCK_AVERAGE(null, null, null, null, "-", "1", null, "150 sp", "1", null, null, "<p>Picking an average lock requires four successes at DC 25.</p>", "<p></p>", null, "2", null, "1", null, null, "3", "1", null, "Lock - average", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    LOCK_GOOD(null, null, null, null, "-", "1", null, "2,000 sp", "1", null, null, "<p>Picking a good lock requires five successes at DC 30.</p>", "<p></p>", null, "2", null, "1", null, null, "3", "1", null, "Lock - good", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    LOCK_POOR(null, null, null, null, "-", "1", null, "2 sp", "1", null, null, "<p>Picking a poor lock requires two successful DC 15 Thievery checks.</p>", "<p></p>", null, "2", null, "1", null, null, "0", "1", null, "Lock - poor", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    LOCK_SIMPLE(null, null, null, null, "-", "1", null, "20 sp", "1", null, null, "<p>Picking a simple lock requires three successful DC 20 Thievery checks.</p>", "<p></p>", null, "2", null, "1", null, null, "1", "1", null, "Lock - simple", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    LOCK_SUPERIOR(null, null, null, null, "-", "1", null, "45,000 sp", "1", null, null, "<p>Picking a superior lock six successes at DC 40.</p>", "<p></p>", null, "2", null, "1", null, null, "3", "1", null, "Lock - superior", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    MAGNIFYING_GLASS(null, null, null, null, "-", "1", null, "400 sp", "1", null, null, "<p>This quality handheld lens gives you a +1 item bonus to Perception checks to notice minute details of documents, fabric, and the like.</p>", "<p></p>", null, "1", null, "1", null, null, "3", "1", null, "Magnifying glass", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    MANACLES_AVERAGE(null, null, null, null, "-", "1", null, "200 sp", "1", null, null, "<p>You can manacle someone who is willing or otherwise at your mercy as an exploration activity taking 10-30 seconds depending on the creature's size and how many manacles you apply. A two-legged creature with its legs bound takes a -15-foot circumstance penalty to its Speeds, and a two-handed creature with its wrists bound has to succeed at a DC 5 flat check any time it uses a manipulate action or else that action fails. This DC may be higher depending on how tightly the manacles constrain the hands. A creature bound to a stationary object is immobilized. For creatures with more or fewer limbs, the GM determines what effect manacles have, if any. Freeing a creature from average manacles require four successes at DC 27.</p>", "<p></p>", null, "2", null, "1", null, null, "3", "1", null, "Manacles - average", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    MANACLES_GOOD(null, null, null, null, "-", "1", null, "2,500 sp", "1", null, null, "<p>You can manacle someone who is willing or otherwise at your mercy as an exploration activity taking 10-30 seconds depending on the creature's size and how many manacles you apply. A two-legged creature with its legs bound takes a -15-foot circumstance penalty to its Speeds, and a two-handed creature with its wrists bound has to succeed at a DC 5 flat check any time it uses a manipulate action or else that action fails. This DC may be higher depending on how tightly the manacles constrain the hands. A creature bound to a stationary object is immobilized. For creatures with more or fewer limbs, the GM determines what effect manacles have, if any. Freeing a creature from good manacles require five successes at DC 32.</p>", "<p></p>", null, "2", null, "1", null, null, "9", "1", null, "Manacles - good", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    MANACLES_POOR(null, null, null, null, "-", "1", null, "3 sp", "1", null, null, "<p>You can manacle someone who is willing or otherwise at your mercy as an exploration activity taking 10-30 seconds depending on the creature's size and how many manacles you apply. A two-legged creature with its legs bound takes a -15-foot circumstance penalty to its Speeds, and a two-handed creature with its wrists bound has to succeed at a DC 5 flat check any time it uses a manipulate action or else that action fails. This DC may be higher depending on how tightly the manacles constrain the hands. A creature bound to a stationary object is immobilized. For creatures with more or fewer limbs, the GM determines what effect manacles have, if any. Freeing a creature from poor manacles requires two successful DC 17 Thievery checks.</p>", "<p></p>", null, "2", null, "1", null, null, "0", "1", null, "Manacles - poor", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    MANACLES_SIMPLE(null, null, null, null, "-", "1", null, "30 sp", "2", null, null, "<p>You can manacle someone who is willing or otherwise at your mercy as an exploration activity taking 10-30 seconds depending on the creature's size and how many manacles you apply. A two-legged creature with its legs bound takes a -15-foot circumstance penalty to its Speeds, and a two-handed creature with its wrists bound has to succeed at a DC 5 flat check any time it uses a manipulate action or else that action fails. This DC may be higher depending on how tightly the manacles constrain the hands. A creature bound to a stationary object is immobilized. For creatures with more or fewer limbs, the GM determines what effect manacles have, if any. Freeing a creature from simple manacles requires three successes at DC 22.</p>", "<p></p>", null, "2", null, "1", null, null, "1", "1", null, "Manacles - simple", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    MANACLES_SUPERIOR(null, null, null, null, "-", "1", null, "50,000 sp", "1", null, null, "<p>You can manacle someone who is willing or otherwise at your mercy as an exploration activity taking 10-30 seconds depending on the creature's size and how many manacles you apply. A two-legged creature with its legs bound takes a -15-foot circumstance penalty to its Speeds, and a two-handed creature with its wrists bound has to succeed at a DC 5 flat check any time it uses a manipulate action or else that action fails. This DC may be higher depending on how tightly the manacles constrain the hands. A creature bound to a stationary object is immobilized. For creatures with more or fewer limbs, the GM determines what effect manacles have, if any. Freeing a creature from superior manacles require six successes at DC 42.</p>", "<p></p>", null, "2", null, "1", null, null, "17", "1", null, "Manacles - superior", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    MATERIAL_COMPONENT_POUCH(null, null, null, null, "L", "1", null, "5 sp", "1", null, null, "<p>This pouch contains material components for those spells that require them. Though the components are used up over time, you can refill spent components during your daily preparations.</p>", "<p></p>", null, "1", null, "1", null, null, "0", "1", null, "Material component pouch", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    MERCHANTS_SCALE(null, null, null, null, "L", "1", null, "2 sp", "1", null, null, "<p></p>", "<p></p>", null, "2", null, "1", null, null, "0", "1", null, "Merchant's scale", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    MIRROR(null, null, null, null, "-", "1", null, "10 sp", "1", null, null, "<p></p>", "<p></p>", null, "1", null, "1", null, null, "0", "1", null, "Mirror", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    MUG(null, null, null, null, "-", "1", null, "1 cp", "1", null, null, "<p></p>", "<p></p>", null, "1", null, "1", null, null, "0", "1", null, "Mug", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    MUSICAL_INSTRUMENT_HANDHELD(null, null, null, null, "1", "1", null, "8 sp", "1", null, null, "<p>Handheld instruments include bagpipes, a small set of chimes, small drums, fiddles and viols, flutes and recorders, small harps, lutes, trumpets, and similarly sized instruments. The GM might rule that an especially large handheld instrument (like a tuba) has greater Bulk.</p>", "<p></p>", null, "2", null, "1", null, null, "0", "1", null, "Musical instrument - Handheld", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    MUSICAL_INSTRUMENT_HEAVY(null, null, null, null, "16", "1", null, "20 sp", "1", null, null, "<p>Heavy instruments such as large drums, a full set of chimes, and keyboard instruments are less portable and generally need to be stationary while played..</p>", "<p></p>", null, "2", null, "1", null, null, "0", "1", null, "Musical instrument - Heavy", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    MUSICAL_INSTRUMENT_VIRTUOSO_HEAVY(null, null, null, null, "16", "1", null, "1,000 sp", "1", null, null, "<p>Heavy instruments such as large drums, a full set of chimes, and keyboard instruments are less portable and generally need to be stationary while played.</p><p>A virtuoso instrument gives a +1 item bonus to Performance checks using that instrument.</p>", "<p></p>", null, "2", null, "1", null, null, "3", "1", null, "Musical instrument - Virtuoso Heavy", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    MUSICAL_INSTRUMENT_VIRUOSO_HANDHELD(null, null, null, null, "1", "1", null, "500 sp", "1", null, null, "<p>Handheld instruments include bagpipes, a small set of chimes, small drums, fiddles and viols, flutes and recorders, small harps, lutes, trumpets, and similarly sized instruments. The GM might rule that an especially large handheld instrument (like a tuba) has greater Bulk.</p><p>A virtuoso instrument gives a +1 item bonus to Performance checks using that instrument.</p>", "<p></p>", null, "2", null, "1", null, null, "3", "1", null, "Musical instrument - Viruoso Handheld", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    OIL(null, null, null, null, "-", "1", null, "1 cp", "1", null, null, "<p>You can use oil to fuel lanterns, but you can also set a pint of oil aflame and throw it. You must first spend an Interact action preparing the oil, then throw it with another action as a ranged attack. If you hit, it splatters on the creature or in a single 5-foot square you target. You must succeed at a DC 10 flat check for the oil to ignite successfully when it hits. If the oil ignites, the target takes 1d6 fire damage.</p>", "<p></p>", null, "2", null, "1", null, null, "0", "1", null, "Oil (1 pint)", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    PITON(null, null, null, null, "-", "1", null, "1 cp", "1", null, null, "<p>These small spikes can be used as anchors to make climbing easier. To affix a piton, you must hold it in one hand and use a hammer to drive it in with your other hand. You can attach a rope to the hammered piton so that you don't fall all the way to the ground on a critical failure while Climbing.</p>", "<p></p>", null, "1", null, "1", null, null, "0", "1", null, "Piton", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    RATIONS(null, null, null, null, "L", "1", null, "4 sp", "1", null, null, "<p></p>", "<p></p>", null, "1", null, "1", null, null, "0", "1", null, "Rations (1 week)", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    RELIGIOUS_SYMBOL_SILVER(null, null, null, null, "L", "1", null, "20 sp", "1", null, null, "<p>This piece of wood or silver is emblazoned with an image representing a deity. Some divine spellcasters, such as clerics, can use a religious symbol of their deity as a divine focus to use certain abilities and cast some spells. A religious symbol must be held in one hand to use it.</p>", "<p></p>", null, "1", null, "1", null, null, "0", "1", null, "Religious symbol - Silver", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    RELIGIOUS_SYMBOL_WOODEN(null, null, null, null, "L", "1", null, "1 sp", "1", null, null, "<p>This piece of wood or silver is emblazoned with an image representing a deity. Some divine spellcasters, such as clerics, can use a religious symbol of their deity as a divine focus to use certain abilities and cast some spells. A religious symbol must be held in one hand to use it.</p>", "<p></p>", null, "1", null, "1", null, null, "0", "1", null, "Religious symbol - Wooden", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    RELIGIOUS_TEXT(null, null, null, null, "L", "1", null, "10 sp", "1", null, null, "<p>This manuscript contains scripture of a particular religion. Some divine spellcasters, such as clerics, can use a religious text as a divine focus to use certain abilities and cast some spells. A religious text must be held in one hand to use it.</p>", "<p></p>", null, "1", null, "1", null, null, "0", "1", null, "Religious text", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    REPAIR_KIT(null, null, null, null, "1", "1", null, "20 sp", "1", null, null, "<p>A repair kit allows you to perform simple repairs while traveling. It contains a portable anvil, tongs, woodworking tools, a whetstone, and oils for conditioning leather and wood. You can use a repair kit to Repair items using the Crafting skill.</p>", "<p></p>", null, "2", null, "1", null, null, "0", "1", null, "Repair kit", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    REPAIR_KIT_SUPERB(null, null, null, null, "1", "1", null, "250 sp", "1", null, null, "<p>A repair kit allows you to perform simple repairs while traveling. It contains a portable anvil, tongs, woodworking tools, a whetstone, and oils for conditioning leather and wood. You can use a repair kit to Repair items using the Crafting skill. A superb repair kit gives you a +1 item bonus to the check.</p>", "<p></p>", null, "2", null, "1", null, null, "3", "1", null, "Repair kit - Superb", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    ROPE(null, null, null, null, "L", "1", null, "5 sp", "1", null, null, "<p></p>", "<p></p>", null, "2", null, "1", null, null, "0", "1", null, "Rope", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    SACK(null, null, null, null, "L", "1", null, "1 cp", "1", null, null, "<p>A sack can hold up to 8 Bulk worth of items. A sack containing 2 Bulk or less can be worn on the body, usually tucked into a belt. You can carry a sack with one hand, but must use two hands to transfer items in and out.</p>", "<p></p>", null, "1", null, "1", null, null, "0", "1", null, "Sack (5)", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    SADDLEBAGS(null, null, null, null, "L", "1", null, "2 sp", "1", null, null, "<p>Saddlebags come in a pair. Each can hold up to 3 Bulk of items. The Bulk value given is for saddlebags worn by a mount. If you are carrying or stowing saddlebags, they count as 1 Bulk instead of light Bulk.</p>", "<p></p>", null, "2", null, "1", null, null, "0", "1", null, "Saddlebags", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    SATCHEL(null, null, null, null, "-", "1", null, "1 sp", "1", null, null, "<p>A satchel can hold up to 2 Bulk worth of items. If you are carrying or stowing a satchel rather than wearing it over your shoulder, it counts as light Bulk instead of negligible.</p>", "<p></p>", null, "2", null, "1", null, null, "0", "1", null, "Satchel", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    SCROLL_CASE(null, null, null, null, "-", "1", null, "1 sp", "1", null, null, "<p>Scrolls, maps, and other rolled documents are stored in scroll cases for safe transport.</p>", "<p></p>", null, "2", null, "1", null, null, "0", "1", null, "Scroll case", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    SHEATH(null, null, null, null, "-", "1", null, "1 cp", "1", null, null, "<p>A sheath or scabbard lets you easily carry a weapon on your person.</p>", "<p></p>", null, "-", null, "1", null, null, "0", "1", null, "Sheath", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    SIGNAL_WHISTLE(null, null, null, null, "-", "1", null, "8 cp", "1", null, null, "<p>When sounded, a signal whistle can be heard clearly up to half a mile away across open terrain.</p>", "<p></p>", null, "1", null, "1", null, null, "0", "1", null, "Signal whistle", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    SNARE_KIT(null, null, null, null, "2", "1", null, "50 sp", "1", null, null, "<p>This kit contains tools and materials for creating snares. A snare kit allows you to Craft snares using the Crafting skill.</p>", "<p></p>", null, "2", null, "1", null, null, "0", "1", null, "Snare kit", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    SNARE_KIT_SPECIALIST(null, null, null, null, "2", "1", null, "550 sp", "1", null, null, "<p>This kit contains tools and materials for creating snares. A snare kit allows you to Craft snares using the Crafting skill. A specialist snare kit gives you a +1 item bonus to the check.</p>", "<p></p>", null, "2", null, "1", null, null, "3", "1", null, "Snare kit - Specialist", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    SOAP(null, null, null, null, "-", "1", null, "2 cp", "1", null, null, "<p></p>", "<p></p>", null, "1", null, "1", null, null, "0", "1", null, "Soap", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    SPELLBOOK(null, null, null, null, "L", "1", null, "10 sp", "1", null, null, "<p>A spellbook holds the written knowledge necessary to learn and prepare various spells, a necessity for wizards (who typically get one for free) and a useful luxury for other spellcasters looking to learn additional spells. Each spellbook can hold up to 100 spells. The Price listed is for a blank spellbook.</p>", "<p></p>", null, "1", null, "1", null, null, "0", "1", null, "Spellbook (blank)", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    SPYGLASS(null, null, null, null, "L", "1", null, "200 sp", "1", null, null, "<p>A typical spyglass lets you see eight times farther than normal.</p>", "<p></p>", null, "2", null, "1", null, null, "0", "1", null, "Spyglass", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    SPYGLASS_FINE(null, null, null, null, "L", "1", null, "800 sp", "1", null, null, "<p>A typical spyglass lets you see eight times farther than normal. A fine spyglass adds a +1 item bonus to Perception checks to notice details at a distance.</p>", "<p></p>", null, "2", null, "1", null, null, "4", "1", null, "Spyglass - Fine", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    TACK(null, null, null, null, "1", "1", null, "40 sp", "1", null, null, "<p>Tack includes all the gear required to outfit a riding animal, including a saddle, bit and bridle, and stirrups if necessary. Especially large or oddly shaped animals might require specialty saddles. These can be more expensive or hard to find, as determined by the GM. The Bulk value given is for tack worn by a creature. If carried, the Bulk increases to 2.</p>", "<p></p>", null, "-", null, "1", null, null, "0", "1", null, "Tack", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    TEN_FOOT_POLE(null, null, null, null, "1", "1", null, "1 cp", "1", null, null, "<p>When wielding this long pole, you can use Seek to search a square up to 10 feet away. The pole is not sturdy enough to use as a weapon.</p>", "<p></p>", null, "2", null, "1", null, null, "0", "1", null, "Ten-foot pole", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    TENT_FOUR_PERSON(null, null, null, null, "1", "1", null, "50 sp", "1", null, null, "<p></p>", "<p></p>", null, "2", null, "1", null, null, "0", "1", null, "Tent - Four-person", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    TENT_PAVILION(null, null, null, null, "12", "1", null, "400 sp", "1", null, null, "<p></p>", "<p></p>", null, "2", null, "1", null, null, "2", "1", null, "Tent - Pavilion", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    TENT_PUP(null, null, null, null, "L", "1", null, "8 sp", "1", null, null, "<p></p>", "<p></p>", null, "2", null, "1", null, null, "0", "1", null, "Tent - Pup", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    THIEVES_TOOLS(null, null, null, null, "L", "1", null, "30 sp", "1", null, null, "<p>You need thieves' tools to Pick Locks or Disable Devices (of some types) using the Thievery skill. If your thieves' tools are broken, you can repair them by replacing the lock picks with replacement picks appropriate to your tools; this doesn't require using the Repair action.</p>", "<p></p>", null, "2", null, "1", null, null, "0", "1", null, "Thieves' tools", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    THIEVES_TOOLS_INFILTRATOR(null, null, null, null, "L", "1", null, "500 sp", "1", null, null, "<p>You need thieves' tools to Pick Locks or Disable Devices (of some types) using the Thievery skill. Infiltrator thieves' tools add a +1 item bonus to checks to Pick Locks and Disable Devices. If your thieves' tools are broken, you can repair them by replacing the lock picks with replacement picks appropriate to your tools; this doesn't require using the Repair action.</p>", "<p></p>", null, "2", null, "1", null, null, "3", "1", null, "Thieves' tools - Infiltrator", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    THIEVES_TOOLS_INFILTRATOR_PICKS(null, null, null, null, "-", "1", null, "30 sp", "1", null, null, "<p>If your thieves' tools are broken, you can repair them by replacing the lock picks with replacement picks appropriate to your tools; this doesn't require using the Repair action.</p>", "<p></p>", null, "-", null, "1", null, null, "3", "1", null, "Thieves' tools - Infiltrator picks", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    THIEVES_TOOLS_REPLACEMENT_PICKS(null, null, null, null, "-", "1", null, "3 sp", "1", null, null, "<p>If your thieves' tools are broken, you can repair them by replacing the lock picks with replacement picks appropriate to your tools; this doesn't require using the Repair action.</p>", "<p></p>", null, "-", null, "1", null, null, "0", "1", null, "Thieves' tools - Replacement picks", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    TOOL_LONG(null, null, null, null, "1", "1", null, "10 sp", "1", null, null, "<p>This entry is a catchall for basic hand tools that don't have a specific adventuring purpose. A hoe, shovel, or sledgehammer is a long tool, and a hand drill, ice hook, or trowel is a short tool. A tool can usually be used as an improvised weapon, dealing 1d4 damage for a short tool or 1d6 for a long tool. The GM determines the damage type that's appropriate or adjusts the damage if needed.</p>", "<p></p>", null, "2", null, "1", null, null, "0", "1", null, "Tool - Long", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    TOOL_SHORT(null, null, null, null, "L", "1", null, "4 sp", "1", null, null, "<p>This entry is a catchall for basic hand tools that don't have a specific adventuring purpose. A hoe, shovel, or sledgehammer is a long tool, and a hand drill, ice hook, or trowel is a short tool. A tool can usually be used as an improvised weapon, dealing 1d4 damage for a short tool or 1d6 for a long tool. The GM determines the damage type that's appropriate or adjusts the damage if needed.</p>", "<p></p>", null, "1 or 2", null, "1", null, null, "0", "1", null, "Tool - Short", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    TORCH(null, null, null, null, "L", "1", null, "1 cp", "1", null, null, "<p>A torch sheds bright light in a 20-foot radius (and dim light to the next 20 feet). It can be used as an improvised weapon that deals 1d4 bludgeoning damage plus 1 fire damage.</p>", "<p></p>", null, "1", null, "1", null, null, "0", "1", null, "Torch", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    VIAL(null, null, null, null, "-", "1", null, "5 cp", "1", null, null, "<p>A simple glass vial holds up to 1 ounce of liquid.</p>", "<p></p>", null, "1", null, "1", null, null, "0", "1", null, "Vial", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    WATERSKIN_EMPTY(null, null, null, null, "L", "1", null, "5 cp", "1", null, null, "<p>When it's full, a waterskin has L Bulk and contains roughly 1 day's worth of water for a Small or Medium creature.</p>", "<p></p>", null, "1", null, "1", null, null, "0", "1", null, "Waterskin (empty)", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    WATERSKIN_FULL(null, null, null, null, "L", "1", null, "5 cp", "1", null, null, "<p>When it's full, a waterskin has L Bulk and contains roughly 1 day's worth of water for a Small or Medium creature.</p>", "<p></p>", null, "1", null, "1", null, null, "0", "1", null, "Waterskin (full)", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    WRITING_SET(null, null, null, null, "L", "1", null, "10 sp", "1", null, null, "<p>Using a writing set, you can draft correspondence and scribe scrolls. A set includes stationery, including a variety of paper and parchment, as well as ink, a quill or inkpen, sealing wax, and a simple seal. If you've written a large amount, you can refill your kit with extra ink and paper.</p>", "<p></p>", null, "2", null, "1", null, null, "0", "1", null, "Writing set", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),

    WRITING_SET_EXTRA_INK_AND_PAPER(null, null, null, null, "-", "1", null, "1 sp", "1", null, null, "<p>If you've written a large amount, you can refill your kit with extra ink and paper.</p>", "<p></p>", null, "-", null, "1", null, null, "0", "1", null, "Writing set - Extra ink and paper", "False", null, null, "1", null, "Adventuring Gear", null, "Gear", "0"),
    // -------------------------------------------------------------GEARSS-CORE--------------------------------------------------------

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
