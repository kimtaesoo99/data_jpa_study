package com.example.data_jpa_study.repository;

import com.example.data_jpa_study.entity.Item;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ItemRepository extends JpaRepository<Item,Long> {
}
