package com.thoughtworks.businesshousegame.enums;

public enum GameCellType {
    JAIL("J"), LOTTERY("L"), HOTEL("H"), EMPTY("E");
    String type;

    public String getType() {
        return this.type;
    }

    GameCellType(String type) {
        this.type = type;
    }
}
