package com.thoughtworks.businesshousegame.pojo;

import com.thoughtworks.businesshousegame.enums.HotelType;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter
@Getter
@ToString
public class HotelCell implements Cell{
    private HotelType hotelType;
    private String hotelValue;
    private String hotelRent;
    private Integer hotelOwnerId;
}
