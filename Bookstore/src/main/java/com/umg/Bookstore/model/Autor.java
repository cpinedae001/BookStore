package com.umg.Bookstore.model;


import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import org.springframework.data.jpa.domain.support.AuditingEntityListener;
import org.springframework.format.annotation.DateTimeFormat;
import javax.persistence.*;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table(name = "book")
@EntityListeners(AuditingEntityListener.class)
@JsonIgnoreProperties(value = {"edad_autor"},
        allowGetters = false)
public class Autor implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @NotBlank
    @NotNull
    private String nameautorbook;
    @Column(nullable = false)
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat
    private Date edad_autor;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNameautorbook() {
        return nameautorbook;
    }

    public void setNameautorbook(String nameautorbook) {
        this.nameautorbook = nameautorbook;
    }

    public Date getEdad_autor() {
        return edad_autor;
    }

    public void setEdad_autor(Date edad_autor) {
        this.edad_autor = edad_autor;
    }
}
