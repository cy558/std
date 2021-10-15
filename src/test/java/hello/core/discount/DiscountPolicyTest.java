package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class DiscountPolicyTest {

  private FixDisountPolicy discountPolicy = new FixDisountPolicy();


  @Test
  void fixDiscountTest(){
    Member member = new Member(1L, "memberA", Grade.VIP);
    int discount = discountPolicy.discount(member, 10000);
    System.out.println("Fix discount = " + discount);
  }

}
