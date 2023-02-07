package com.n0tm.tripmoneyser.domain.entity.Transaction;

import com.n0tm.tripmoneyser.domain.entity.UserEntity;

public interface PayoutEntity extends BasicEntity {
    UserEntity debtor();
}
