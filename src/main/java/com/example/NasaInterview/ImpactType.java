package com.example.NasaInterview;

import java.util.Arrays;

/**
* READ ONLY - DO NOT MODIFY - helper enum to determine threat type of NEO
*/

public enum ImpactType {
    NODANGER,
    DUCK(1, 50),
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

    /**
     * Given a hazard determination and a size, return the corresponding ImpactType
     * @param isHazard boolean indicating near earth object threat level
     * @param sizeInMeters the diameter in Metres of the near earth object
     * @return ImpactType based on params provided
     */
    public static ImpactType determineThreat(boolean isHazard, int sizeInMeters) {
        if(!isHazard)
            return ImpactType.NODANGER;

        return Arrays.stream(ImpactType.values())
                .filter(range -> sizeInMeters >= range.minValue && sizeInMeters <= range.maxValue)
                .findAny()
                .orElse(NODANGER);
    }
}
