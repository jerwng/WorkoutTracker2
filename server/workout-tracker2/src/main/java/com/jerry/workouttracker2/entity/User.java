package com.jerry.workouttracker2.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;

import java.util.Objects;

@Entity
class User {
    private @Id @GeneratedValue Long id;
    private String name;
    private String email;
    private String password;

    User() {}
    User(String name, String email, String password) {
        this.name = name;
        this.email = email;
        this.password = password;
    }

    public Long getId() {
        return this.id;
    }

    public String getName() {
        return this.name;
    }

    public String getEmail() {
        return this.email;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o)
            return true;

        if (!(o instanceof User))
            return false;

        User user = (User) o;

        return Objects.equals(this.id, user.id) && Objects.equals(this.name, user.name) && Objects.equals(this.email, user.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(this.id, this.name, this.email);
    }

    @Override
    public String toString() {
        return "User ID: " + this.id + ", Name: " + this.email + ", Email: " + this.email;
    }
}
