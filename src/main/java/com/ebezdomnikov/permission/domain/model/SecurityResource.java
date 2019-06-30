package com.ebezdomnikov.permission.domain.model;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.*;
import javax.validation.constraints.NotEmpty;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;
import java.util.UUID;

@Entity
@Table(name = "resources")
public class SecurityResource {
    @Id
    @GenericGenerator(name = "id", strategy = "uuid2")
    private UUID id;

    @Column(name = "name")
    private String name;

    @Column(name = "active")
    private boolean active = true;

    @ManyToMany
    @JoinTable(
            name = "resource_scope",
            joinColumns = @JoinColumn(name = "resource_id"),
            inverseJoinColumns = @JoinColumn(name = "scope_id"))
    private Set<SecurityScope> scopes = new HashSet<>();

    @Column(name = "created_by")
    private UUID createdBy = null;

    @Column(name = "created_at")
    private String createdAt = null;

    @Column(name = "updated_by")
    private UUID updatedBy = null;

    @Column(name = "updated_at")
    private String updatedAt = null;

    public SecurityResource() {
    }

    public SecurityResource(String name) {
        this.id = UUID.randomUUID();
        this.name = name;
    }

    public SecurityResource addScope(SecurityScope scope) {
        this.scopes.add(scope);
        return this;
    }
}
