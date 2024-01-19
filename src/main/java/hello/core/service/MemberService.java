package hello.core.service;

import hello.core.domain.Member;

public interface MemberService {
    // 1.회원가입
    void join(Member member);
    // 2.회원조회
    Member findMember(Long memberId);
}
