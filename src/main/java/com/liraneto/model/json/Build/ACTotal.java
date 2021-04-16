package com.liraneto.model.json.Build;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ACTotal {
    private int acProfBonus;

    private int acAbilityBonus;

    private int acItemBonus;

    private int acTotal;

    private String shieldBonus;
}
