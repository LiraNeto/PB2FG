package com.liraneto.model.json.Build.spellCasters;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpellCasters {
    private String name;
    
    private String magicTradition;
    
    private String spellcastingType;
    
    private String ability;
    
    private int proficiency;
    
    private int focusPoints;

    private List<SpellsJSON> spells;

    private List<Integer> perDay;
    
}
