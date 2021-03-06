/**
 * Copyright (c) 2016-2020 by the respective copyright holders.
 * All rights reserved. This program and the accompanying materials
 * are made available under the terms of the Eclipse Public License v1.0
 * which accompanies this distribution, and is available at
 * http://www.eclipse.org/legal/epl-v10.html
 */
package com.zsmartsystems.zigbee.zcl.clusters.price;

import java.util.HashMap;
import java.util.Map;

import javax.annotation.Generated;

/**
 * Payment Discount Period value enumeration.
 * <p>
 * Code is auto-generated. Modifications may be overwritten!
 */
@Generated(value = "com.zsmartsystems.zigbee.autocode.ZigBeeCodeGenerator", date = "2019-02-09T15:28:08Z")
public enum PaymentDiscountPeriodEnum {

    /**
     * Current Billing Period
     */
    CURRENT_BILLING_PERIOD(0x0000),

    /**
     * Current Consolidated Bill
     */
    CURRENT_CONSOLIDATED_BILL(0x0001),

    /**
     * One Month
     */
    ONE_MONTH(0x0002),

    /**
     * One Quarter
     */
    ONE_QUARTER(0x0003),

    /**
     * One Year
     */
    ONE_YEAR(0x0004);

    /**
     * A mapping between the integer code and its corresponding PaymentDiscountPeriodEnum type to facilitate lookup by value.
     */
    private static Map<Integer, PaymentDiscountPeriodEnum> idMap;

    static {
        idMap = new HashMap<Integer, PaymentDiscountPeriodEnum>();
        for (PaymentDiscountPeriodEnum enumValue : values()) {
            idMap.put(enumValue.key, enumValue);
        }
    }

    private final int key;

    private PaymentDiscountPeriodEnum(final int key) {
        this.key = key;
    }

    public int getKey() {
        return key;
    }

    public static PaymentDiscountPeriodEnum getByValue(final int value) {
        return idMap.get(value);
    }
}
