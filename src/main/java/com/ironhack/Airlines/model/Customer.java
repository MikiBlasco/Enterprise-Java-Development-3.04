package com.ironhack.Airlines.model;
import com.ironhack.Airlines.enums.Status;

import javax.persistence.*;

@Entity
@Table(name="customer")
public class Customer {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String nombre;
    @Column(columnDefinition = "ENUM('Gold', 'Silver', 'Gold')")
    @Enumerated(EnumType.STRING)
    private Status status;

    private long customer_mileage;

    public Customer(){

    }
    public Customer(Integer id, String nombre, Status status, long customer_mileage) {
        this.id = id;
        setNombre(nombre);
        setStatus(status);
        setCustomer_mileage(customer_mileage);
    }

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

    /* public String getStatus() {
        return this.status.name();
    }

    public void setStatus(String status) {
        this.status = Status.valueOf(status);
    } */

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
