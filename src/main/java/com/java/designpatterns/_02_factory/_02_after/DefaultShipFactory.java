package com.java.designpatterns._02_factory._02_after;

import com.java.designpatterns._02_factory._01_before.Ship;

public abstract class DefaultShipFactory implements ShipFactory {

    @Override
    public void sendEmailTo(String email, Ship ship) {
        System.out.println(ship.getName() + " 다 만들었습니다.");
    }

    @Override
    public void prepareFor(String name){
        System.out.println(name + " 만들 준비 중");
    }

    @Override
    public void validate(String name, String email){
        if (name == null || name.isEmpty()) {
            throw new IllegalArgumentException("배 이름을 지어주세요.");
        }
        if (email == null || email.isEmpty()) {
            throw new IllegalArgumentException("연락처를 남겨주세요.");
        }
    }

}
