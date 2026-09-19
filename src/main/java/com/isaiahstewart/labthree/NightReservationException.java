package com.isaiahstewart.labthree;

public class NightReservationException extends RuntimeException {

    public NightReservationException(int nights) {

        super("An invalid number of nights was selected: " + nights);
    }
}
