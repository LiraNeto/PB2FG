package com.liraneto.controller.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Getter
public enum ProficiencyLevelEnum {

    TRAINED ("trained", 2),

    EXPERT("expert", 4),

    MASTER("master", 6),

    LEGENDARY("legendary", 8),

    PROFICIENCY_LEVEL_NOT_FOUND ("PROFICIENCY_LEVEL_NOT_FOUND", 0);
    ;

    private String name;

    private int bonus;

    public static ProficiencyLevelEnum getProficiencyLevelEnum (int level, int bonus){
        int proficiecyBonus = bonus - level;

        for (ProficiencyLevelEnum proficiency : ProficiencyLevelEnum.values()) {
            if (proficiency.getBonus() == proficiecyBonus)
                return proficiency;
        }

        return ProficiencyLevelEnum.PROFICIENCY_LEVEL_NOT_FOUND;
    }
}
