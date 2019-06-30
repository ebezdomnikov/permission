package com.ebezdomnikov.permission.domain.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "policies")
public class SecurityPolicy {
    @Id
    @GenericGenerator(name = "id", strategy = "uuid2")
    private UUID id;

    @Column
    @NotEmpty
    private String name;

    @Column
    private String rule;

    @ManyToMany
    @JoinTable(
            name = "policy_permission",
            joinColumns = @JoinColumn(name = "policy_id"),
            inverseJoinColumns = @JoinColumn(name = "permission_id"))
    private Set<SecurityPermission> permissions;

    @Column(name = "active")
    @NotEmpty
    private boolean active;

    @Column(name = "logic")
    @NotEmpty
    private int logic;

    @Column(name = "created_by")
    private UUID createdBy;

    @Column(name = "created_at")
    private String createdAt;

    @Column(name = "updated_by")
    private UUID updatedBy;

    @Column(name = "updated_at")
    private String updatedAt;
}
