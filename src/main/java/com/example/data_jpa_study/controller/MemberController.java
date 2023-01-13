package com.example.data_jpa_study.controller;


import com.example.data_jpa_study.dto.MemberDto;
import com.example.data_jpa_study.entity.Member;
import com.example.data_jpa_study.repository.MemberRepository;
import lombok.RequiredArgsConstructor;
import org.hibernate.engine.jdbc.Size;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.PostConstruct;

@RestController
@RequiredArgsConstructor
public class MemberController {

    private final MemberRepository memberRepository;

    @GetMapping("/members/{id}")
    public String findMember(@PathVariable("id") Long id){
        Member member = memberRepository.findById(id).get();
        return member.getUsername();
    }

    @GetMapping("/members2/{id}")
    public String findMember2(@PathVariable("id") Member member){
        return member.getUsername();
    }

    @GetMapping("/members")
    public Page<MemberDto> list(@PageableDefault(size = 5) Pageable pageable){
        return memberRepository.findAll(pageable)
            .map(member -> new MemberDto(member.getId(), member.getUsername(), null));
    }

    @PostConstruct
    public void init(){
        for (int i = 0; i < 100; i++){
            memberRepository.save(new Member("user"+i,i));
        }
    }
}
