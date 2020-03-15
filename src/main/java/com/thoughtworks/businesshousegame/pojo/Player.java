package com.thoughtworks.businesshousegame.pojo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Setter
@Getter
@ToString
public class Player {
    private Integer playerId;
    private Integer playerTotalMoney;
    private List<HotelCell> ownedHotelCells;
}
