package com.ani.poton.domain.member.service;

import com.ani.poton.domain.member.entity.Member;
import com.ani.poton.domain.member.repository.MemberRepository;
import org.springframework.stereotype.Service;

@Service
public class SigninService {

    MemberRepository memberRepository;

    Member signin(String name, String password){
        Member findMember = memberRepository.FindByName();
        if (findMember == null) {
            Member member = (Member.builder()
                    .name(name)
                    .password(password)
                    .build());
            return member;
        }else if(findMember.getPassword().equals(password)){
            return findMember;
        }else {
            throw new RuntimeException();
        }
    }

}
