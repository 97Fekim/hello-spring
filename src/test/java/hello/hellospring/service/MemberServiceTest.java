package hello.hellospring.service;

import hello.hellospring.domain.Member;
import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

class MemberServiceTest {

    MemberService memberService = new MemberService();


    @Test
    void 회원가입() {
        //given
        Member member = new Member();
        member.setName("hello");

        //when
        long saveId = memberService.join(member);

        //then
        Member findMember = memberService.findOne(saveId).get();
        Assertions.assertThat(member.getName()).isEqualTo(findMember.getName());
    }

    @Test
    public void 중복회원예외(){
        //given

        //when

        //then
    }

    @Test
    void findMembers() {
    }

    @Test
    void findOne() {
    }
}