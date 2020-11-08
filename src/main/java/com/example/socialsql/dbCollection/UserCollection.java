package com.example.socialsql.dbCollection;

import lombok.*;

import javax.persistence.*;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users", uniqueConstraints = {
        @UniqueConstraint(columnNames = {
                "email"
        })
})
@Getter
@Setter
public class UserCollection {
    @Id  @NonNull
    private String username;

    @NonNull
    private String email;

    @NonNull
    private String password;

    private String phone;

    private Date dob;

    private String about;

    @ManyToMany(fetch = FetchType.LAZY)
    @JoinTable(
            name = "friends",
            joinColumns = @JoinColumn(name = "username"),
            inverseJoinColumns = @JoinColumn(name = "username"))
    Set<UserCollection> friends = new HashSet<>();;
}