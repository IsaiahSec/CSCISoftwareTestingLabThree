package com.isaiahstewart.labthree;


public class StayPriceCalculator {

    private static final int MIN_STAY = 1;
    private static final int MAX_STAY = 14;
    private static final int CHILD = 12;
    private static final int SENIOR = 65;

    public double calculateStayPrice(int nights, int guestAge,
                                     boolean isArkansasResident,
                                     boolean hasVeteranDiscount) throws ReservationException {

        double CHILD_DISCOUNT = .5;
        double SENIOR_DISCOUNT = .2;
        double RESIDENT_DISCOUNT = 10;
        double VETERAN_DISCOUNT = .1;
        double BASE_PRICE = 50;
        double price = nights * BASE_PRICE;                     // Calculate base rate


        // Validation
        if (nights < MIN_STAY || nights > MAX_STAY) {

            throw new NightReservationException(nights);
        }
        if (guestAge < 0) {

            throw new GuestAgeReservationException(guestAge);
        }

        // Apply age-based discounts
        if (guestAge <= CHILD) {

            price-= (price * CHILD_DISCOUNT);
        }
        if (guestAge >= SENIOR) {

            price-= (price * SENIOR_DISCOUNT);
        }

        // Apply status-based discounts
        if (isArkansasResident) {

            price-= RESIDENT_DISCOUNT;
        }
        if (hasVeteranDiscount) {

            price-= (price * VETERAN_DISCOUNT);
        }

        return price;
    }
}
