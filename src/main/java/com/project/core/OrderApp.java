package com.project.core;

import com.project.core.member.Grade;
import com.project.core.member.Member;
import com.project.core.member.MemberService;
import com.project.core.member.MemberServiceImpl;
import com.project.core.order.Order;
import com.project.core.order.OrderService;
import com.project.core.order.OrderServiceImpl;

public class OrderApp {

    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        OrderService orderService = appConfig.orderService();

        Long memberId = 1L;
        Member member = new Member(memberId, "memberA", Grade.VIP);
        memberService.join(member);

        Order order = orderService.createOrder(memberId, "itemA", 10000);

        System.out.println("order = " + order);
        System.out.println("order.calculatePrice = " + order.calculatePrice());

    }
}
