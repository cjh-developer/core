package com.project.core.discount;

import com.project.core.member.Grade;
import com.project.core.member.Member;

public class RateDiscountPolicy implements DiscountPolicy{

    private int discountPercent = 10;

    @Override
    public int discount(Member memember, int price) {
        if(memember.getGrade().equals(Grade.VIP)){
            return price * discountPercent / 100;
        } else {
            return 0;
        }
    }
}
