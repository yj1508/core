package hello.core.member;

import hello.core.domain.Grade;
import hello.core.domain.Member;
import hello.core.service.MemberService;
import hello.core.service.MemberServiceImpl;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class MemberServiceTest {
    MemberService memberService = new MemberServiceImpl();
    @Test
    void join(){
        //given
        Member member = new Member(1L, "member", Grade.VIP);
        //when
        memberService.join(member); //회원가입 test
        Member findMember = memberService.findMember(1L); //조회 test
        //then
        Assertions.assertThat(member).isEqualTo(findMember);
    }


}
