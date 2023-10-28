package io.division.fhswf.javaee.kundenundprodukte.entities;

import com.fasterxml.jackson.annotation.JsonIgnore;
import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "Persons")
public class Person {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "Person_ID", nullable = false, updatable = false)
    private Long id;
    @Column(name = "Person_Name")
    private String name;
    @Column(name = "Person_Email")
    private String email;

    @OneToMany(fetch = FetchType.LAZY, cascade = CascadeType.ALL, mappedBy = "responsible")
    @JsonIgnore
    private List<Product> products;
}

