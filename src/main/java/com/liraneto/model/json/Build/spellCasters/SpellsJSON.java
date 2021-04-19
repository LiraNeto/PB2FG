package com.liraneto.model.json.Build.spellCasters;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpellsJSON {
    private int spellLevel;

    private List<String> list;
}
