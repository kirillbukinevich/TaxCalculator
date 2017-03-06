package com.example.repository;

import com.example.domain.PersonInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PersonInfoRepository extends JpaRepository<PersonInfo,Long>{

}
