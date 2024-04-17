package com.hitchanww.calculator.cabinet.domain.product;

import com.hitchanww.calculator.cabinet.domain.Measurement;
import com.hitchanww.calculator.cabinet.domain.part.Back;
import com.hitchanww.calculator.cabinet.domain.part.Bottom;
import com.hitchanww.calculator.cabinet.domain.part.Brace;
import com.hitchanww.calculator.cabinet.domain.part.Side;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.experimental.SuperBuilder;

import javax.measure.quantity.Length;
import java.util.Optional;

@Data
@SuperBuilder
@EqualsAndHashCode(callSuper = true)
public class Cabinet extends Product {

    private Bottom bottom;

    private Side side;

    private Back back;

    private Brace brace;

    private FaceFrame faceFrame;

    public Optional<FaceFrame> getFaceFrame() {
        return Optional.ofNullable(faceFrame);
    }

    @Override
    public Measurement<Length> getX() {
        return super.getX();
    }

    @Override
    public Measurement<Length> getY() {
        return super.getY();
    }

    @Override
    public Measurement<Length> getZ() {
        return super.getZ();
    }
}
