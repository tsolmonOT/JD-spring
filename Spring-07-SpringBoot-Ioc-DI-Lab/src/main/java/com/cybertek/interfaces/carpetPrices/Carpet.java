package com.cybertek.interfaces.carpetPrices;

import com.cybertek.enums.City;

import java.math.BigDecimal;

public interface Carpet {
    //Double or float can replaced with BigDecimal => It does auto rounding for us
    BigDecimal getSqFtPrice(City city);
}
