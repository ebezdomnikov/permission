package com.ebezdomnikov.permission.domain.repository;

import com.ebezdomnikov.permission.domain.model.SecurityPermission;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SecurityPermissionRepository extends JpaRepository<SecurityPermission, UUID> {
}
