package com.liraneto.model.json.Build;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class WeaponJSON {
    private String name;

    private int qty;

    private String prof;

    private String die;

    private int pot;

    private String str;

    private String display;

    private List<String> runes;
}
