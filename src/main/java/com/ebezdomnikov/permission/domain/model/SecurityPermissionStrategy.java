package com.ebezdomnikov.permission.domain.model;

public enum SecurityPermissionStrategy {
    AFFIRMATIVE(1), UNANIMOUS(2), CONSENSUS(3);

    private final int value;

    private SecurityPermissionStrategy(int value) {
        this.value = value;
    }

    public int getValue() {
        return value;
    }
}
