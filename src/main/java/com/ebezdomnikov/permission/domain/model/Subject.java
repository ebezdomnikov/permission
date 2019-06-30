package com.ebezdomnikov.permission.domain.model;

/**
 * Subject of security - current user
 */
final public class Subject {
    private User user;

    public Subject(User user) {
        this.user = user;
    }

    public User getSubject() {
        return user;
    }
}
