package com.example.springpj.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.springpj.model.User;



@Repository
public interface ShoopingRepository extends JpaRepository<User,Long>{
	


}
