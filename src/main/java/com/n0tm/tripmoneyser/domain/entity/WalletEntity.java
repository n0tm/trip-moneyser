package com.n0tm.tripmoneyser.domain.entity;

import com.n0tm.tripmoneyser.domain.entity.Transaction.BasicEntity;

import java.util.List;

public interface WalletEntity {
    TripEntity trip();
    UserEntity owner();
    List<BasicEntity> transactions();
}
