package hello.core;

import hello.core.discount.DiscountPolicy;
import hello.core.discount.FixDiscountPolicy;
import hello.core.discount.OrderService;
import hello.core.discount.OrderServiceImpl;
import hello.core.member.MemberRepository;
import hello.core.member.MemberService;
import hello.core.member.MemberServiceImpl;
import hello.core.member.MemoryMemberRepository;

// 애플리케이션(App) 전체를 설정하고 구성(config)
// 애플리케이션의 전체 동작 방식을 구성하기 위해 구현 객체를 생성하고 연결하는 책임을 가지는 별도의 설정 클래스
// 즉, AppConfig는 애플리케이션의 실제 동작에 필요한 구현 객체를 생성한다.
// AppConfig는 생성한 객체 인스턴스의 참조를 생성자를 통해서 연결(주입)해준다.
public class AppConfig {

    // MemberService 인터페이스(역할)
    public MemberService memberService() {
        return new MemberServiceImpl(memberRepository());
    }

    // MemberRepository 인터페이스(역할)
    private MemberRepository memberRepository() {
        return new MemoryMemberRepository();
    }

    // OrderService 인터페이스(역할)
    public OrderService orderService() {
        return new OrderServiceImpl(memberRepository(), discountPolicy());
    }

    // DiscountPolicy 인터페이스(역할)
    public DiscountPolicy discountPolicy() {
        return new FixDiscountPolicy();
    }
}
