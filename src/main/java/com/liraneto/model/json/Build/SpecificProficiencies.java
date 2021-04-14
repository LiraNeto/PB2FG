package com.liraneto.model.json.Build;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class SpecificProficiencies {

    private List<String> trained;

    private List<String> expert;

    private List<String> master;

    private List<String> legendary;
}
