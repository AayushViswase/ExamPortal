package com.ExamPortal.Repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ExamPortal.Model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
}
