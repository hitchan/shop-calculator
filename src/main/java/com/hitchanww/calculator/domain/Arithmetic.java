package com.hitchanww.calculator.domain;

public interface Arithmetic<T> {

    T add(T addend);

    T subtract(T subtrahend);

    T multiply(T multiplicand);

    T divide(T divisor);

}
