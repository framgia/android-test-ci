package com.framgia.androidtestci;

/**
 * Created by haipq on 12/5/16.
 */

public class User {

    private boolean isPremium;
    private String coupon;

    public boolean isPremium() {
        return isPremium;
    }

    public void setPremium(boolean premium) {
        isPremium = premium;
    }

    public String getCoupon() {
        return coupon;
    }

    public void setCoupon(String coupon) {
        this.coupon = coupon;
    }

    public static User loadUserViaAPI() {
        return new User();
    }
}
