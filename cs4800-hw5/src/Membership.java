public class Membership {
    private float loyaltyDiscount;

    Membership() {
        loyaltyDiscount = 0;
    }

    public void setLoyaltyDiscount(float loyaltyDiscount) {
        this.loyaltyDiscount = loyaltyDiscount;
    }
    public float getLoyaltyDiscount() {
        return loyaltyDiscount;
    }
}
