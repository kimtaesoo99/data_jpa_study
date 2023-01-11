package com.example.data_jpa_study.repository;

import com.example.data_jpa_study.entity.Member;
import org.springframework.data.jpa.repository.JpaRepository;

public interface MemberRepository extends JpaRepository<Member,Long> {
}
