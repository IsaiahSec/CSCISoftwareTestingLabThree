package com.isaiahstewart.labthree;

public class GuestAgeReservationException extends RuntimeException {

    public GuestAgeReservationException(int guestAge) {

        super("An invalid guestAge was selected: " + guestAge);
    }
}
