package hello.core;

import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;

public class MemberApp {

  public static void main(String[] args) {
    MemberService memberService = new MemberServiceImpl();
    Member member = new Member(1l, "memberA", Grade.VIP);
    memberService.join(member);
    //ctrl + alt + v 변수 자동 생성
    //alt + Insert 생성자, getter,setter 다축키

    // 확인
    Member findMember = memberService.findMember(1L);
    System.out.println("new Member = " + member.getName());
    System.out.println("find Member = " + findMember.getName());
    // 순수한 자바 코드
  }
}
