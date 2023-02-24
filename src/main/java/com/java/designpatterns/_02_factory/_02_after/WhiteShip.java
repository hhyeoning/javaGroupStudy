package com.java.designpatterns._02_factory._02_after;

import com.java.designpatterns._02_factory._01_before.Ship;

public class WhiteShip extends Ship {

    public WhiteShip(String name){
        setName(name);
        setLogo("\uD83D\uDEE5️");
        setColor("white");
    }
}
