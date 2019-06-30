package com.ebezdomnikov.permission.domain.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "permissions")
public class SecurityPermission {

    @Id
    @GenericGenerator(name = "id", strategy = "uuid2")
    private UUID id;

    @Column(name = "name")
    @NotEmpty
    private String name;

    @Column(name = "strategy")
    @NotEmpty
    private int strategy;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "security_resource_id", referencedColumnName = "id")
    private SecurityResource securityResource;

    @ManyToMany(mappedBy = "permissions")
    private Set<SecurityPolicy> policies;

    @Column(name = "active")
    @NotEmpty
    private boolean active;

    @Column(name = "created_by")
    private UUID createdBy;

    @Column(name = "created_at")
    private String createdAt;

    @Column(name = "updated_by")
    private UUID updatedBy;

    @Column(name = "updated_at")
    private String updatedAt;
}
