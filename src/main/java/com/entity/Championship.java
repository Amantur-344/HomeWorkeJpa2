package com.entity;

import javax.persistence.*;

@Entity
@Table(name = "championship")
public class Championship {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @OneToOne
    @JoinColumn(name = "country")
    private Country country;
    @Column(name = "name_Championship",nullable = false)
    private String nameChampionship;
    @OneToMany
    @JoinColumn(name = "kind_of_sport")
    private KindOfSport kindOfSport;

    public Championship() {
    }

    public Championship(Country country, String nameChampionship, KindOfSport kindOfSport) {
        this.country = country;
        this.nameChampionship = nameChampionship;
        this.kindOfSport = kindOfSport;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Country getCountry() {
        return country;
    }

    public void setCountry(Country country) {
        this.country = country;
    }

    public String getNameChampionship() {
        return nameChampionship;
    }

    public void setNameChampionship(String nameChampionship) {
        this.nameChampionship = nameChampionship;
    }

    public KindOfSport getKindOfSport() {
        return kindOfSport;
    }

    public void setKindOfSport(KindOfSport kindOfSport) {
        this.kindOfSport = kindOfSport;
    }

    @Override
    public String toString() {
        return "Championship{" +
                "id=" + id +
                ", country=" + country +
                ", nameChampionship='" + nameChampionship + '\'' +
                ", kindOfSport=" + kindOfSport +
                '}';
    }
}
