package hello.core.member;

// 회원 저장소 인터페이스
public interface MemberRepository {

    void save(Member member);       // 회원을 저장

    Member findById(Long memberId); // 회원의 id로 회원을 조회
}
