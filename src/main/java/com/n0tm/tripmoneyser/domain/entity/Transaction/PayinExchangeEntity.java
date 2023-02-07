package com.n0tm.tripmoneyser.domain.entity.Transaction;

import com.n0tm.tripmoneyser.domain.valueObject.Money;

public interface PayinExchangeEntity extends BasicEntity {
    Money exchanged();
}
