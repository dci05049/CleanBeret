package com.example.springsocial.model;
import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;



//@Entity
//@Table(name = "users", uniqueConstraints = {
//        @UniqueConstraint(columnNames = "email")
//})

@Document
public class User {
    @Id
    private String id;

//    @Column(nullable = false)
    private String name;

//    @Email
//    @Column(nullable = false)
    private String email;

    private String imageUrl;

//    @Column(nullable = false)
    private Boolean emailVerified = false;

//    @JsonIgnore
    private String password;

//    @NotNull
//    @Enumerated(EnumType.STRING)
    private AuthProvider provider;

    private String providerId;

//    public User(String name, String email, String imageUrl, Boolean emailVerified, String password, AuthProvider provider, String providerId) {
//        this.name = name;
//        this.email = email;
//        this.imageUrl = imageUrl;
//        this.emailVerified = emailVerified;
//        this.password = password;
//        this.provider = provider;
//        this.providerId = providerId;
//    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }

    public Boolean getEmailVerified() {
        return emailVerified;
    }

    public void setEmailVerified(Boolean emailVerified) {
        this.emailVerified = emailVerified;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AuthProvider getProvider() {
        return provider;
    }

    public void setProvider(AuthProvider provider) {
        this.provider = provider;
    }

    public String getProviderId() {
        return providerId;
    }

    public void setProviderId(String providerId) {
        this.providerId = providerId;
    }
}
