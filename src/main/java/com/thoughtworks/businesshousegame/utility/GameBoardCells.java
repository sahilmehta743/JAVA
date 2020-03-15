package com.thoughtworks.businesshousegame.utility;

import com.thoughtworks.businesshousegame.enums.GameCellType;
import com.thoughtworks.businesshousegame.pojo.*;

public class GameBoardCells {

    public Cell updateState(GameCellType cellType) {
        Cell cell;
        if (cellType.getType().equalsIgnoreCase("J")) {
            cell = new JailCell();
        } else if (cellType.getType().equalsIgnoreCase("H")) {
            cell = new HotelCell();
        } else if (cellType.getType().equalsIgnoreCase("L")) {
            cell = new LotteryCell();
        } else {
            cell = new EmptyCell();
        }
        return cell;
    }

    public String getCellValue(String[] cells, int position) {
        return cells[position % cells.length];
    }
}
