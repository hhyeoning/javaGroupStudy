package com.java.designpatterns._02_factory._02_after;

public class Client {

    public static void main(String[] args) {
        Client client = new Client();
        client.print(new WhiteShipFactory(),"whiteShip","white@mail.com");
        client.print(new BlackShipFactory(),"blackShip","black@mail.com");
    }

    private void print(ShipFactory shipFactory, String name, String email){
        System.out.println(shipFactory.orderShip(name,email));
    }
}
