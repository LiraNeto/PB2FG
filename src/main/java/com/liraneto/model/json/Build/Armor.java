package com.liraneto.model.json.Build;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Armor {
    private String name;

    private int qty;

    private String prof;

    private int pot;

    private String res;

    private String display;

    private boolean worn;

    private List<String> runes;

}
