package com.ebezdomnikov.permission.domain.repository;

import com.ebezdomnikov.permission.domain.model.SecurityScope;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SecurityScopeRepository extends JpaRepository<SecurityScope, UUID> {
}
