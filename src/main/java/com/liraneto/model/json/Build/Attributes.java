package com.liraneto.model.json.Build;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Attributes {
    @JsonProperty("ancestryhp")
    private int ancestryHp;

    @JsonProperty("classhp")
    private int classHp;

    @JsonProperty("bonushp")
    private int bonusHp;

    @JsonProperty("bonushpPerLevel")
    private int bonusHpPerLevel;

    private int speed;

    private int speedBonus;
}
