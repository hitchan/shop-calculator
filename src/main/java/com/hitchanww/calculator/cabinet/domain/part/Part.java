package com.hitchanww.calculator.cabinet.domain.part;

import com.hitchanww.calculator.cabinet.domain.Dimensional;
import com.hitchanww.calculator.cabinet.domain.Measurement;
import com.hitchanww.calculator.cabinet.domain.Stock;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import javax.measure.quantity.Length;

@Data
@SuperBuilder
public class Part implements Dimensional<Length> {

    private Measurement<Length> x;

    private Measurement<Length> y;

    private Measurement<Length> z;

    private Stock stock;

}
