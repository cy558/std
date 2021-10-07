package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.junit.jupiter.api.Test;

public class DiscountPolicyTest {

  private FixDisountPolicy fixDisountPolicy = new FixDisountPolicy();

  @Test
  void discountTest(){
    Member member = new Member(1L, "memberA", Grade.VIP);
    int discount = fixDisountPolicy.discount(member, 10000);
    System.out.println("discount = " + discount);
  }
}
