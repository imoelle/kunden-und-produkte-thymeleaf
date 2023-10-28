package io.division.fhswf.javaee.kundenundprodukte.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.sql.Blob;

@Entity
@Getter
@Setter
@Table(name = "Products")
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name="Product_ID", nullable = false, updatable = false)
    private Long id;
    @Column(name = "Product_Name")
    private String name;
    @Column(name = "Product_Value", nullable = false, updatable = false)
    private String value;
    @Lob
    @Column(name = "Prodict_Description")
    private Blob description;

    @ManyToOne
    @JoinColumn(name = "FK_Responsible")
    private Person responsible;

}
