package hello.core.discount;

import static org.assertj.core.api.Assertions.*;

import hello.core.member.Grade;
import hello.core.member.Member;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class RateDiscountPolicyTest {

  private RateDiscountPolicy discountPolicy = new RateDiscountPolicy();
  // ctrl + shift + T 테스트자동생성

  @Test
  @DisplayName("VIP는 10% 할인이 적용되어야한다.")
  void vip_o(){
    //given
    Member member = new Member(1L, "memberVIP", Grade.VIP);
    //when
    int discount = discountPolicy.discount(member, 10000);
    //then
    System.out.println("Rate discount = " + discount);
    assertThat(discount).isEqualTo(1000);
  }

  // 실패테스트도 꼭 만들어 봐야한다.
  @Test
  @DisplayName("VIP가 아니면 할인이 적용되지 않아야 한다.")
  void vip_x(){
    //given
    Member member = new Member(2L, "memberBASIC", Grade.BASIC);
    //when
    int discount = discountPolicy.discount(member, 10000);
    //then
    System.out.println("Rate discount = " + discount);
    assertThat(discount).isEqualTo(0);
    // Assertions는 static import 하는게 좋다. (java기본문법)
    // alt + Enter
  }
}