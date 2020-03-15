package com.thoughtworks.businesshousegame.utility;

import com.thoughtworks.businesshousegame.enums.GameCellType;

public class GetCellType {
    private static void getCellType(String type) {
        GameCellType gameCellType = GameCellType.valueOf(type);
        if(gameCellType.getType().equalsIgnoreCase("J")){

        }
    }
}
