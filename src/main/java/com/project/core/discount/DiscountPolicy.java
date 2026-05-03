package com.project.core.discount;

import com.project.core.member.Member;

public interface DiscountPolicy {

    /**
     * 
     * @param memember
     * @param price
     * @return 할인 대상 금액
     */
    int discount(Member memember, int price);
}
