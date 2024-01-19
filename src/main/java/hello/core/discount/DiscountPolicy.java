package hello.core.discount;

import hello.core.domain.Member;

public interface DiscountPolicy{
    //할인 금액 반환
    int discount(Member member, int price);
}
