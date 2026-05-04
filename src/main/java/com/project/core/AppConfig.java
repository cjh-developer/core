package com.project.core;

import com.project.core.discount.DiscountPolicy;
import com.project.core.discount.FixDiscountPolicy;
import com.project.core.discount.RateDiscountPolicy;
import com.project.core.member.MemberRepository;
import com.project.core.member.MemberService;
import com.project.core.member.MemberServiceImpl;
import com.project.core.member.MemoryMemberRepository;
import com.project.core.order.OrderService;
import com.project.core.order.OrderServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    // 구현
    @Bean
    public MemberService memberService(){
        return new MemberServiceImpl(memberRepository());
    }

    // 역할
    @Bean
    public static MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    // 구현
    @Bean
    public OrderService orderService(){
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    // 역할
    @Bean
    public DiscountPolicy discountPolicy(){
        //return new FixDiscountPolicy();
        return new RateDiscountPolicy();
    }

}
