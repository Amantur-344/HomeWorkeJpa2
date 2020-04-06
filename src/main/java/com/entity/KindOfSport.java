package com.entity;

import javax.persistence.*;

@Entity
@Table(name = "kind_of_sport")
public class KindOfSport {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name_sport",nullable = false)
    private String nameSport;

    public KindOfSport() {
    }

    public KindOfSport(String nameSport) {
        this.nameSport = nameSport;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNameSport() {
        return nameSport;
    }

    public void setNameSport(String nameSport) {
        this.nameSport = nameSport;
    }

    @Override
    public String toString() {
        return "KindOfSport{" +
                "id=" + id +
                ", nameSport='" + nameSport + '\'' +
                '}';
    }
}
