package com.example.parts.entity;

import javax.persistence.*;

@Entity
@Table(name = "parts")
public class Parts {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private int id;

    @Column(name = "partname")
    private String partname;

    @Column(name = "tire")
    private String tire;

    @Column(name = "stering_wheel")
    private String steringWheel;

    @Column(name = "lights")
    private String lights;

    //default constructor
    public Parts() {
    }

    public Parts(String tire, String steringWheel, String lights) {
        this.tire = tire;
        this.steringWheel = steringWheel;
        this.lights = lights;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getpartname() {
        return partname;
    }

    public void setpartname(String partname) {
        this.partname = partname;
    }

    public String gettire() {
        return tire;
    }

    public void settire(String tire) {
        this.tire = tire;
    }

    public String getsteringWheel() {
        return steringWheel;
    }

    public void setsteringWheel(String steringWheel) {
        this.steringWheel = steringWheel;
    }

    public String getlights() {
        return lights;
    }

    public void setlights(String lights) {
        this.lights = lights;
    }

    //ToString Method
    @Override
    public String toString() {
        return "Parts{" +
                "id=" + id +
                ", partname='" + partname + '\'' +
                ", tire='" + tire + '\'' +
                ", stering_wheel='" + steringWheel + '\'' +
                ", lights='" + lights + '\'' +
                '}';
    }
}
