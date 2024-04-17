package com.hitchanww.calculator.cabinet.util;

import org.apache.commons.math3.fraction.Fraction;

import javax.measure.Quantity;

public interface Format {

    static Format from(double value) {
        return new Format() {
            @Override
            public double asDouble() {
                return value;
            }

            @Override
            public Fraction asFraction() {
                return new Fraction(value);
            }
        };
    }

    static Format from(Fraction fraction) {
        return new Format() {
            @Override
            public double asDouble() {
                return fraction.doubleValue();
            }

            @Override
            public Fraction asFraction() {
                return fraction;
            }
        };
    }

    static <Q extends Quantity<Q>> Format from(Quantity<Q> quantity) {
        return new Format() {
            @Override
            public Fraction asFraction() {
                return new Fraction(asDouble());
            }

            @Override
            public double asDouble() {
                return quantity.getValue().doubleValue();
            }
        };
    }

    Fraction asFraction();

    double asDouble();

}
