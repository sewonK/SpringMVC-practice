package hello.hellospring.controller;

import hello.hellospring.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

@Controller
public class MemberController {

    private final MemberService memberService;

    @Autowired //생성자, 스프링의 MemberService를 연결해준다. 스프링에 MemberService가 등록되어있어야함.
    public MemberController(MemberService memberService) {
        this.memberService = memberService;
    }
}
