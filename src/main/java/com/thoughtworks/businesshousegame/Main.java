package com.thoughtworks.businesshousegame;

import com.thoughtworks.businesshousegame.enums.GameCellType;
import com.thoughtworks.businesshousegame.factory.PlayerObjectFactory;
import com.thoughtworks.businesshousegame.pojo.HotelCell;
import com.thoughtworks.businesshousegame.pojo.Player;
import com.thoughtworks.businesshousegame.utility.GameBoardCells;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        int[][] diceOutput = {{2, 2, 1}, {4, 4, 2}, {4, 4, 2}, {2, 2, 1}};
        int bankMoney = 5000;
        List<Player> playerList = PlayerObjectFactory.create();
        List<HotelCell> hotelCells = new ArrayList<>();
        String[] cells = {"J", "H", "L", "H", "E", "L", "H", "L", "H", "J"};
        GameBoardCells gameBoardCell = new GameBoardCells();
        for (int i = 1; i < diceOutput.length; i++) {
            for (int j = 1; j <= diceOutput[i].length; j++) {
                String value = gameBoardCell.getCellValue(cells, diceOutput[i][j]);
                if (GameCellType.JAIL.getType().equalsIgnoreCase(value)) {
                    updateJailDetails(bankMoney, playerList.get(j));
                } else if (GameCellType.LOTTERY.getType().equalsIgnoreCase(value)) {
                    updateLotteryDetails(bankMoney, playerList.get(j));
                } else if (GameCellType.HOTEL.getType().equalsIgnoreCase(value)) {
                    updateHotelDetails(bankMoney, playerList.get(j), playerList);
                }
            }
        }
    }

    //method to updateJailValue --> variables -- Bank , Player
    public static void updateJailDetails(int bankMoney, Player player) {
        Integer playerTotalMoney = player.getPlayerTotalMoney();
        player.setPlayerTotalMoney(playerTotalMoney - 150);
        updateBankAmount(bankMoney + 150);
    }


    //method to updateLotteryValue --> variables -- Bank , Player
    public static void updateLotteryDetails(int bankMoney, Player player) {
        Integer playerTotalMoney = player.getPlayerTotalMoney();
        player.setPlayerTotalMoney(playerTotalMoney + 200);
        updateBankAmount(bankMoney - 200);
    }

    //method to updateHotelValue --> variables -- Bank , Player1 and Player 2
    public static void updateHotelDetails(int bankMoney, Player player, List<Player> players) {


    }

    private static void updateBankAmount(int updatedAmount) {
    }


}
