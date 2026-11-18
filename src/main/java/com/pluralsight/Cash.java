package com.pluralsight;

import java.math.BigDecimal;

public class Cash extends Asset {
    public Cash(String description, String dateAcquired, BigDecimal originalCost) {
        super(description, dateAcquired, originalCost);
    }

    public BigDecimal getValue() {
        return getOriginalCost();
    }
}
/* When trying to create an instance of an Asset, I was given an error where the options were to remove the  abstract label
or implement the getValue method with an override.
The cash class was showing red when I first extended it as an Asset, but once I created a constructor and rewrote the getValue
method, it went away. I could create an instance with attributes and run the code no problem.
 */