package com.ebezdomnikov.permission.domain.repository;

import com.ebezdomnikov.permission.domain.model.SecurityResource;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface SecurityResourceRepository extends JpaRepository<SecurityResource, UUID> {
}
