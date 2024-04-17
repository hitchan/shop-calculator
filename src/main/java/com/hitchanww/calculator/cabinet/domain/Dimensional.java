package com.hitchanww.calculator.cabinet.domain;

import javax.measure.Quantity;

public interface Dimensional<Q extends Quantity<Q>> {

    Measurement<Q> getX();

    Measurement<Q> getY();

    Measurement<Q> getZ();

}
