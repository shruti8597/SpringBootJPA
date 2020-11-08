package com.example.socialsql.dbCollection;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "post")
@Getter
@Setter
@NonNull
public class Like {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String likeId;
    @ManyToOne(fetch = FetchType.EAGER)
    private Post post;
    @ManyToOne(fetch = FetchType.EAGER)
    private UserCollection user;
}
