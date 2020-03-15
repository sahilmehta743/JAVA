package com.thoughtworks.businesshousegame.factory;

import com.thoughtworks.businesshousegame.pojo.Player;

import java.util.ArrayList;
import java.util.List;

public final class PlayerObjectFactory {
    //Assume to have 3 players
    public static List<Player> create() {
        Player player1 = new Player();
        player1.setPlayerId(1);
        player1.setPlayerTotalMoney(1000);

        Player player2 = new Player();
        player2.setPlayerId(2);
        player2.setPlayerTotalMoney(1000);

        Player player3 = new Player();
        player3.setPlayerId(3);
        player3.setPlayerTotalMoney(1000);

        List<Player> playerList = new ArrayList<>();
        playerList.add(player1);
        playerList.add(player2);
        playerList.add(player3);

        return playerList;
    }
}
