package com.larissaevaldt.springboot.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.larissaevaldt.springboot.model.Role;

import java.util.Optional;

public interface RoleRepository extends JpaRepository<Role, Long> {
    Optional<Role> findByRoleName(String name);
}
