package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;
import java.util.Map;

public class FixDisountPolicy implements DiscountPolicy {

  private int discountFixAmount = 1000;

  @Override
  public int discount(Member member, int price) {
    // member 정보 호출
    // case 로 등급 분류
    // 10%면 price * 0.1
    if (member.getGrade() == Grade.VIP) {
      return discountFixAmount;
    } else {
      return 0;
    }
  }
}
