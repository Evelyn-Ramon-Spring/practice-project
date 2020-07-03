package com.codeup.blogpractice.dao;

import com.codeup.blogpractice.model.Ad;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AdsDao extends JpaRepository <Ad, Long>{

}
