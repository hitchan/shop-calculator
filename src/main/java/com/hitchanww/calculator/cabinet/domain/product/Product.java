package com.hitchanww.calculator.cabinet.domain.product;

import com.hitchanww.calculator.cabinet.domain.Dimensional;
import com.hitchanww.calculator.cabinet.domain.Measurement;
import com.hitchanww.calculator.cabinet.domain.part.Part;
import lombok.Data;
import lombok.experimental.SuperBuilder;

import javax.measure.quantity.Length;
import java.util.Map;

@Data
@SuperBuilder
public class Product implements Dimensional<Length> {

    private Measurement<Length> x;

    private Measurement<Length> y;

    private Measurement<Length> z;

    private Map<Part, Integer> parts;

}
