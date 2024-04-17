package com.hitchanww.calculator.cabinet.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import javax.measure.quantity.Length;

@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Stock extends Material implements Dimensional<Length> {

    private Measurement<Length> x;

    private Measurement<Length> y;

    private Measurement<Length> z;

}
