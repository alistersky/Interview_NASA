package com.example.NasaInterview;

import java.util.Arrays;

public enum ImpactType {
    NODANGER,
    DUCK(0, 50),
    WATCHOUT(51, 499),
    REGIONKILLER(500, 15999),
    LIFEKILLER(16000, 250000),
    PLANETKILLER(250001, Integer.MAX_VALUE);

    private final int minValue;
    private final int maxValue;

    ImpactType(){
        this.minValue = 0;
        this.maxValue = 0;
    }

    ImpactType(int min, int max) {
        this.minValue = min;
        this.maxValue = max;
    }

    public static ImpactType range(int size) {
        return Arrays.stream(ImpactType.values())
                .filter(range -> size >= range.minValue && size <= range.maxValue)
                .findAny()
                .orElse(NODANGER);
    }
}
