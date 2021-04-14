package com.liraneto.model.json.Build;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

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
}
