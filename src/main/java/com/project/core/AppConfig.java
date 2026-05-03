package com.project.core;

import com.project.core.discount.DiscountPolicy;
import com.project.core.discount.FixDiscountPolicy;
import com.project.core.member.MemberRepository;
import com.project.core.member.MemberService;
import com.project.core.member.MemberServiceImpl;
import com.project.core.member.MemoryMemberRepository;
import com.project.core.order.OrderService;
import com.project.core.order.OrderServiceImpl;

public class AppConfig {

    // 구현
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    // 역할
    private static MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    // 구현
    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    // 역할
    public DiscountPolicy discountPolicy(){
        return new FixDiscountPolicy();
    }

}
