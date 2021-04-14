package com.liraneto.model.json;

import com.liraneto.model.json.Build.Build;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FichaJSON {
    private String success;

    private Build build;
}
