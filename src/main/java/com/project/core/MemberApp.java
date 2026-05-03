package com.project.core;

import com.project.core.member.Grade;
import com.project.core.member.Member;
import com.project.core.member.MemberService;
import com.project.core.member.MemberServiceImpl;

public class MemberApp {

    public static void main(String[] args) {
        AppConfig appConfig = new AppConfig();
        MemberService memberService = appConfig.memberService();
        Member member = new Member(1L, "memberA", Grade.VIP);
        memberService.join(member);

        Member findMember = memberService.findMember(1L);
        System.out.println("newMember : " + member.getName());
        System.out.println("findMember : " + findMember.getName());
    }
}
