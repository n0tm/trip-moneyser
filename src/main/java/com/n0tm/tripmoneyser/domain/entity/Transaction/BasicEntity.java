package com.n0tm.tripmoneyser.domain.entity.Transaction;

import com.n0tm.tripmoneyser.domain.entity.WalletEntity;
import com.n0tm.tripmoneyser.domain.valueObject.Money;

public interface BasicEntity {
    Long id();
    Money money();
    WalletEntity wallet();
    String description();
}
