package io.portfolio;

public final class DomainReviewTest {
    public static void main(String[] args) {
        var item = new DomainReview.Item(41, 21, 9, 77);
        if (DomainReview.score(item) != 153) throw new AssertionError("domain score mismatch");
        if (!DomainReview.lane(item).equals("ship")) throw new AssertionError("domain lane mismatch");
    }
}
