package com.example.socialsql.dbCollection;

import lombok.*;

import javax.persistence.*;

import java.util.Date;

@Entity
@Table(name = "post")
@Getter
@Setter
@NonNull
public class Comment {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String commentId;
    @ManyToOne(fetch = FetchType.EAGER)
    private Post post;
    @ManyToOne(fetch = FetchType.EAGER)
    private UserCollection user;
    private String comment;
    private Date commentDate = new Date();;
}
