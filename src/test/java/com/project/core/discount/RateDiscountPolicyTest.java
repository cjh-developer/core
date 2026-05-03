package com.project.core.discount;

import com.project.core.member.Grade;
import com.project.core.member.Member;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class RateDiscountPolicyTest {

    RateDiscountPolicy rateDiscountPolicy = new RateDiscountPolicy();
    
    @Test
    @DisplayName("VIP는 10%할인 적용")
    void vip_o (){
        //given
        Member member = new Member(1L, "memberVIP", Grade.VIP);
        //when
        int discount = rateDiscountPolicy.discount(member, 10000);
        //then
        assertEquals(discount, 1000);
    }

    @Test
    @DisplayName("VIP가 아니면 할인이 적용되지 않음")
    void vip_f(){
        Member member = new Member(2L, "memberBasic", Grade.BASIC);
        int discount = rateDiscountPolicy.discount(member, 10000);
        assertEquals(discount, 1000);
    }

}