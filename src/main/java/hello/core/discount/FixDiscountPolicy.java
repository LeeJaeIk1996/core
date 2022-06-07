package hello.core.discount;

import hello.core.member.Grade;
import hello.core.member.Member;

// 정액 할인 정책 구현체
public class FixDiscountPolicy implements DiscountPolicy {

    private int discountFixAmount = 1000;   // 1000원 할인

    @Override
    public int discount(Member member, int price) {
        if (member.getGrade() == Grade.VIP) {
            return discountFixAmount;   // 회원의 등급이 VIP인 경우 1000원 할인
        } else {
            return 0;                   // VIP 회원이 아닐 경우 할인 X
        }
    }

}
