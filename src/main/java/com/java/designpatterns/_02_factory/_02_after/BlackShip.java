package com.java.designpatterns._02_factory._02_after;

import com.java.designpatterns._02_factory._01_before.Ship;

public class BlackShip extends Ship {

    public BlackShip(String name){
        setName(name);
        setLogo("⚓");
        setColor("black");
    }
}
