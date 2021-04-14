package com.liraneto.model.json.Build;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.swing.*;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@JsonIgnoreProperties(ignoreUnknown = true)
public class Build {
    private String name;

    @JsonProperty("class")
    private String classe;

    private String level;

    private String ancestry;

    private String heritage;

    private String background;

    private String alignment;

    private String gender;

    private String age;

    private String deity;

    private String size;

    @JsonProperty("keyability")
    private String keyAbility;

    private List<String> languages;

    private Attributes attributes;

    private Abilities abilities;

    private Proficiencies proficiencies;

    private List<List<String>> feats;

    private List<String> specials;

    private List<List<String>> lores;

    private List<String> equipment;

    private SpecificProficiencies specificProficiencies;

    private List<String> weapons;

    private Money money;

    private List<String> armor;

    private List<String> spellCasters;

    private List<String> formula;

    private List<String> pets;

    private ACTotal acTotal;
}
