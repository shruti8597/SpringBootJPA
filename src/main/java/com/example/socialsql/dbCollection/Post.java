package com.example.socialsql.dbCollection;

import lombok.*;

import javax.persistence.*;

import java.util.Date;
import java.util.Set;

@Entity
@Table(name = "post")
@Getter
@Setter
@NonNull
public class Post {
    @Id
    @GeneratedValue(strategy=GenerationType.AUTO)
    private String postId;
    @ManyToOne
    private UserCollection user;
    private String post;
    private Date postedDate = new Date();;
    private Date updatedDate = new Date();;
    @OneToMany(mappedBy = "post",fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private Set<Like> likes;
    @OneToMany(mappedBy = "post",fetch = FetchType.LAZY, cascade = CascadeType.REMOVE)
    private Set<Comment> comments;
}
