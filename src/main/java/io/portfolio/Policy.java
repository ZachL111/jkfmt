package io.portfolio;

public final class Policy {
    private static final int THRESHOLD = 162;
    private static final int RISK_PENALTY = 6;
    private static final int LATENCY_PENALTY = 4;
    private static final int WEIGHT_BONUS = 3;

    private Policy() {}

    public record Signal(int demand, int capacity, int latency, int risk, int weight) {}

    public static int score(Signal signal) {
        return signal.demand() * 2 + signal.capacity() + signal.weight() * WEIGHT_BONUS
            - signal.latency() * LATENCY_PENALTY - signal.risk() * RISK_PENALTY;
    }

    public static String classify(Signal signal) {
        return score(signal) >= THRESHOLD ? "accept" : "review";
    }
}
