package com.java.designpatterns._02_factory._02_after;

import com.java.designpatterns._02_factory._01_before.Ship;

public interface ShipFactory {

    default Ship orderShip(String name, String email){
        validate(name, email);
        prepareFor(name);

        Ship ship = createShip(name);

        sendEmailTo(email,ship);
        return ship;
    }

    Ship createShip(String name);

    /**
     * java 9이상부터 인터페이스에 private 메소드 지정 가능
     * */
    void sendEmailTo(String email, Ship ship);

    void prepareFor(String name);

    void validate(String name, String email);
}
