package com.example.obspringdatajpa;

import jakarta.persistence.*;

@Entity
@Table(name="COCHE")
public class Coche {
    //atributos encapsulados
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "CAR_ID")
    private Long id;
    @Column(name = "MANUFACTURER")
    private String manufacturer;
    @Column(name = "MODEL")
    private String model;
    @Column(name = "MODEL_YEAR")
    private Integer model_year;


    //constructores

    public Coche() {
    }

    public Coche(Long id, String manufacturer, String model, Integer year) {
        this.id = id;
        this.manufacturer = manufacturer;
        this.model = model;
        this.model_year = year;
    }

    //getter & setters

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return model_year;
    }

    public void setYear(Integer year) {
        this.model_year = year;
    }


    //toString


    @Override
    public String toString() {
        return "Coche{" +
                "id=" + id +
                ", manufacturer='" + manufacturer + '\'' +
                ", model='" + model + '\'' +
                ", year=" + model_year +
                '}';
    }
}
