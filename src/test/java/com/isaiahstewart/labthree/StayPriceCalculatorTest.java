package com.isaiahstewart.labthree;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.CsvSource;

import static org.junit.jupiter.api.Assertions.*;


class StayPriceCalculatorTest {
    @ParameterizedTest(name = "nights={0}, age={1}, resident={2}, veteran{3} -> {4}")
    @CsvSource({
            "1, 5, false, false, 25.0",
            "1, 40, false, false, 50.0",
            "1, 70, false, false, 40.0",
            "1, 30, false, false, 50.0",
            "14, 30, false, false, 700.0",
            "1, 0, false, false, 25.0",
            "1, 13, false, false, 50.0",
            "1, 12, false, false, 25.0",
            "1, 64, false, false, 50.0",
            "1, 65, false, false, 40.0",
            "1, 2147483647, false, false, 40.0",
            "1, 5, true, false, 15.0",
            "1, 40, true, false, 40.0",
            "1, 40, false, true, 45.0",
            "1, 40, true, true, 36.0",
            "1, 70, true, false, 30.0",
            "1, 70, false, true, 36.0",
            "1, 70, true, true, 27.0"
    })
    void testCalculateStayPrice(int nights, int guestAge, boolean isArkansasResident,
                                boolean hasVeteranDiscount, double expected){
        assertEquals(expected, new StayPriceCalculator().calculateStayPrice(
                nights, guestAge, isArkansasResident, hasVeteranDiscount));
    }
    // TC04 (Exception Case)
    @Test
    void testUnderNightBoundary() {

        assertThrowsExactly(NightReservationException.class, () -> new StayPriceCalculator().calculateStayPrice(0,30,false,false));
    }
    // TC06 (Exception Case)
    @Test
    void testOverNightBoundary() {

        assertThrowsExactly(NightReservationException.class, () -> new StayPriceCalculator().calculateStayPrice(15,30,false,false));
    }
    // TC08 (Exception Case)
    @Test
    void testUnderMinimumAgeBoundary() {

        assertThrowsExactly(GuestAgeReservationException.class, () -> new StayPriceCalculator().calculateStayPrice(1,-1,false,false));
    }
}