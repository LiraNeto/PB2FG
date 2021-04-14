package com.liraneto.model.json.Build;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Abilities {
    private int str;

    private int dex;

    private int con;

    @JsonProperty("int")
    private int intelligence;

    private int wis;

    private int cha;

    public List<String> getBoosts(){
        List<String> boosts = new ArrayList<String>();

        boosts.addAll(Collections.nCopies(5, "strength"));
        boosts.addAll(Collections.nCopies(5, "dexterity"));
        boosts.addAll(Collections.nCopies(5, "constitution"));
        boosts.addAll(Collections.nCopies(5, "intelligence"));
        boosts.addAll(Collections.nCopies(5, "wisdom"));
        boosts.addAll(Collections.nCopies(5, "charisma"));

        return boosts;
    }
}
