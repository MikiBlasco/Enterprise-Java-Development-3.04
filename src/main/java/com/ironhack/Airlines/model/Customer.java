package com.ironhack.Airlines.model;
import javax.persistence.*;
import java.math.BigInteger;

@Entity
@Table(name="customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    @Column(columnDefinition = "enum")
    private Status status;

    private long customer_mileage;


    public long getCustomer_mileage() {
        return customer_mileage;
    }

    public void setCustomer_mileage(long customer_mileage) {
        this.customer_mileage = customer_mileage;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

}
