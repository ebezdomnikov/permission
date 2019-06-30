package com.ebezdomnikov.permission.domain.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "scopes")
public class SecurityScope {
    @Id
    @GenericGenerator(name = "id", strategy = "uuid2")
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "active")
    private boolean active = true;

    @ManyToMany(mappedBy = "scopes")
    private Set<SecurityResource> resources = new HashSet<>();

    @Column(name = "created_by")
    private UUID createdBy = null;

    @Column(name = "created_at")
    private String createdAt = null;

    @Column(name = "updated_by")
    private UUID updatedBy = null;

    @Column(name = "updated_at")
    private String updatedAt = null;

    public SecurityScope() {
    }

    public SecurityScope(@NotEmpty Action action) {
        this.id = UUID.randomUUID();
        this.name = action.toString();
    }
}
