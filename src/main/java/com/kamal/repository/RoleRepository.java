package com.kamal.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.kamal.model.AppRole;
import com.kamal.model.Role;

public interface RoleRepository extends JpaRepository<Role, Long> {
	
	Optional<Role> findByRoleName(AppRole appRole);
}
