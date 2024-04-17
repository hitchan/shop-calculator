package com.hitchanww.calculator.cabinet.util;

import org.apache.commons.math3.fraction.Fraction;
import systems.uom.common.USCustomary;
import tech.units.indriya.quantity.Quantities;

import javax.measure.Quantity;
import javax.measure.quantity.Length;

public class Sizes {

    public static Quantity<Length> FOUR_FEET = Quantities.getQuantity(4, USCustomary.FOOT);

    public static Quantity<Length> EIGHT_FEET = Quantities.getQuantity(8, USCustomary.FOOT);

    public static Quantity<Length> THREE_QUARTER_INCH = Quantities.getQuantity(Fraction.THREE_QUARTERS, USCustomary.INCH);

    public static Quantity<Length> ONE_SIXTEENTH_INCH = Quantities.getQuantity(Fractions.ONE_SIXTEENTH, USCustomary.INCH);

    public static Quantity<Length> HALF_INCH = Quantities.getQuantity(Fraction.ONE_HALF, USCustomary.INCH);

    public static Quantity<Length> QUARTER_INCH = Quantities.getQuantity(Fraction.ONE_QUARTER, USCustomary.INCH);

}
