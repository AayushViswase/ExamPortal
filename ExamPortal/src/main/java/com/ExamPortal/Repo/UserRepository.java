package com.ExamPortal.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ExamPortal.Model.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByUserName(String userName);

}
