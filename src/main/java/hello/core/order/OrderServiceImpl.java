package hello.core.order;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.domain.Member;
import hello.core.repository.MemberRepository;
import hello.core.repository.MemoryMemberRepository;

public class OrderServiceImpl implements OrderService{
    MemberRepository memberRepository = new MemoryMemberRepository();
    DiscountPolicy discountPolicy = new FixDiscountPolicy();

    @Override
    public Order createOrder(Long memberId, String itemName, int itemPrice){
        Member member = memberRepository.findById(memberId); //회원조회 (아이디 반환)
        int discountPrice = discountPolicy.discount(member, itemPrice); //할인적용
        return new Order(memberId, itemName, itemPrice, discountPrice);
    }
}
