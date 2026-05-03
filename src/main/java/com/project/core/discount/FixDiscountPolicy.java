package com.project.core.discount;

import com.project.core.member.Grade;
import com.project.core.member.Member;

public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000;

    @Override
    public int discount(Member memember, int price) {

        if(memember.getGrade().equals(Grade.VIP)){
            return discountFixAmount;
        }else{
            return 0;
        }

    }
}
