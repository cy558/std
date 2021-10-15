package hello.core.order;

import hello.core.AppConfig;
import hello.core.discount.FixDisountPolicy;
import hello.core.member.Grade;
import hello.core.member.Member;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;

public class OrderApp {

  public static void main(String[] args) {
    AppConfig appConfig = new AppConfig();
    MemberService memberService = appConfig.memberService();
    OrderService orderService = appConfig.orderService();

    Long memberId = 1l;
    Member member = new Member(memberId, "memberA", Grade.VIP);
    memberService.join(member);

      //ctrl + alt + v
    Order order = orderService.createOrder(memberId, "itemA", 10000);

    System.out.println("order = " + order);


  }
}
