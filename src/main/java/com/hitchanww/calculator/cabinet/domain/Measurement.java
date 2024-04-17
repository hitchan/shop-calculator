package com.hitchanww.calculator.cabinet.domain;

import com.hitchanww.calculator.cabinet.util.Format;
import com.hitchanww.calculator.domain.Arithmetic;
import lombok.Data;

import javax.measure.Quantity;

@Data
public class Measurement<Q extends Quantity<Q>> implements Arithmetic<Measurement<Q>> {

    private final Quantity<Q> actual;

    private final Quantity<Q> nominal;

    public static <Q extends Quantity<Q>> Measurement<Q> singular(Quantity<Q> quantity) {
        return new Measurement<>(quantity, quantity);
    }

    public Format getActual() {
        return Format.from(actual);
    }

    public Format getNominal() {
        return Format.from(nominal);
    }

    @Override
    public Measurement<Q> add(Measurement<Q> addend) {
        return new Measurement<>(actual.add(addend.actual), nominal.add(addend.nominal));
    }

    @Override
    public Measurement<Q> subtract(Measurement<Q> subtrahend) {
        return new Measurement<>(actual.subtract(subtrahend.actual), nominal.subtract(subtrahend.nominal));
    }

    @Override
    public Measurement<Q> multiply(Measurement<Q> multiplicand) {
        return new Measurement<>(actual.multiply(multiplicand.actual.getValue()), nominal.multiply(multiplicand.nominal.getValue()));
    }

    @Override
    public Measurement<Q> divide(Measurement<Q> divisor) {
        return new Measurement<>(actual.divide(divisor.actual.getValue()), nominal.divide(divisor.nominal.getValue()));
    }
}
