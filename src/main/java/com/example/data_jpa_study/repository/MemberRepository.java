package com.example.data_jpa_study.repository;

import com.example.data_jpa_study.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;

import java.util.List;

public interface MemberRepository extends JpaRepository<Member,Long> {

    List<Member> findByUsernameAndAgeGreaterThan(String username,int age);

    //@Query(name = "Member.findByUsername")
    List<Member> findByUsername(@Param("username") String username);
}
