package com.java.designpatterns._02_factory._02_after;

import com.java.designpatterns._02_factory._01_before.Ship;

public class WhiteShipFactory extends DefaultShipFactory {

    @Override
    public Ship createShip(String name) {
        return new WhiteShip(name);
    }
}
