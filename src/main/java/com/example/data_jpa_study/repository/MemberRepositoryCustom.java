package com.example.data_jpa_study.repository;

import com.example.data_jpa_study.entity.Member;

import java.util.List;

public interface MemberRepositoryCustom {

    List<Member> findMemberCustom();
}
