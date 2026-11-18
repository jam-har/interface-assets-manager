package com.pluralsight;

import java.math.BigDecimal;

public interface Valuable {
    public default BigDecimal getValue() {
        return null;
    }
}
