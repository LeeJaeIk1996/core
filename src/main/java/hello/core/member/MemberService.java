package hello.core.member;

// 회원 서비스 인터페이스
// 회원 가입, 회원 조회가 있음
public interface MemberService {

    // 회원 가입
    void join(Member member);

    // 회원 조회
    Member findMember(Long MemberId);
}
