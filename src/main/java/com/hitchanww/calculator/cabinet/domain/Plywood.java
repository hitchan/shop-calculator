package com.hitchanww.calculator.cabinet.domain;

import com.hitchanww.calculator.cabinet.util.Sizes;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Data
@SuperBuilder
@NoArgsConstructor
@EqualsAndHashCode(callSuper = true)
public class Plywood extends Stock {

    public static final Plywood THREE_QUARTER_INCH = Plywood.builder()
            .x(Measurement.singular(Sizes.EIGHT_FEET))
            .y(Measurement.singular(Sizes.FOUR_FEET))
            .z(new Measurement<>(Sizes.THREE_QUARTER_INCH, Sizes.THREE_QUARTER_INCH.subtract(Sizes.ONE_SIXTEENTH_INCH)))
            .build();

    public static final Plywood HALF_INCH = Plywood.builder()
            .x(Measurement.singular(Sizes.EIGHT_FEET))
            .y(Measurement.singular(Sizes.FOUR_FEET))
            .z(new Measurement<>(Sizes.HALF_INCH, Sizes.HALF_INCH.subtract(Sizes.ONE_SIXTEENTH_INCH)))
            .build();

    public static final Plywood ONE_QUARTER_INCH = Plywood.builder()
            .x(Measurement.singular(Sizes.EIGHT_FEET))
            .y(Measurement.singular(Sizes.FOUR_FEET))
            .z(new Measurement<>(Sizes.QUARTER_INCH, Sizes.QUARTER_INCH.subtract(Sizes.ONE_SIXTEENTH_INCH)))
            .build();

}
