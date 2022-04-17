package com.men.eazySurvey.repository;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;

import com.men.eazySurvey.model.Role;
import com.men.eazySurvey.model.RoleName;

public interface RoleRepository extends JpaRepository<Role, Long> {
	
    Optional<Role> findByName(RoleName roleName);
}
