package com.entity;

import javax.persistence.*;

@Entity
@Table(name = "teams")
public class Teams {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name = "name", unique = true, nullable = false)
    private String name;
    @Column(name = "logo_adress", nullable = false)
    private String logoAddress;
    @Column(unique = false)
    private String website;
    @ManyToOne
    @JoinColumn(name = "kind_of_sport_id")
    private KindOfSport kindOfSport;

    public Teams() {
    }

    public Teams(String name, String logoAddress, String website, KindOfSport kindOfSport) {
        this.name = name;
        this.logoAddress = logoAddress;
        this.website = website;
        this.kindOfSport = kindOfSport;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLogoAddress() {
        return logoAddress;
    }

    public void setLogoAddress(String logoAddress) {
        this.logoAddress = logoAddress;
    }

    public String getWebsite() {
        return website;
    }

    public void setWebsite(String website) {
        this.website = website;
    }

    public KindOfSport getKindOfSport() {
        return kindOfSport;
    }

    public void setKindOfSport(KindOfSport kindOfSport) {
        this.kindOfSport = kindOfSport;
    }
}
