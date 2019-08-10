package com.umg.Bookstore.model;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.util.Date;
@Entity
@Table(name= "book_Store")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"publicacion_book"}, allowGetters = true)
public class Book implements Serializable {



    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    private Long id_autor_book;
    @NotBlank
    private String name_book;
    @Column(nullable = false, updatable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @CreatedDate
    private Date publicacion_book;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId_autor_book() {
        return id_autor_book;
    }

    public void setId_autor_book(Long id_autor_book) {
        this.id_autor_book = id_autor_book;
    }

    public String getName_book() {
        return name_book;
    }

    public void setName_book(String name_book) {
        this.name_book = name_book;
    }

    public Date getPublicacion_book() {
        return publicacion_book;
    }

    public void setPublicacion_book(Date publicacion_book) {
        this.publicacion_book = publicacion_book;
    }
}
