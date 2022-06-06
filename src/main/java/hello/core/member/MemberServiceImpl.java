package hello.core.member;

// 회원 서비스 구현체
public class MemberServiceImpl implements MemberService {

    // 가입과 조회를 하기 위해선 MemberRepository 인터페이스가 필요하다.
    /**
     * 현재 문제점: MemberServiceImpl이 MemberRepository(인터페이스)와 MemoryMemberRepository(구현체) 모두 의존하고 있다.
     * 즉, 의존관계가 인터페이스 뿐만 아니라 구현까지 모두 의존하는 문제점이 있으며, DIP를 위반하고 있다.
     */
    private final MemberRepository memberRepository = new MemoryMemberRepository();

    @Override
    public void join(Member member) {
        memberRepository.save(member);
    }

    @Override
    public Member findMember(Long memberId) {
        return memberRepository.findById(memberId);
    }
}
