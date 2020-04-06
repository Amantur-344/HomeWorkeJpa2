package com.entity;

import javax.persistence.*;

@Entity
@Table(name = "tale_example")
public class TableExample {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
   // @Column(name = "'id");
    private Integer id;

    @OneToOne
    @JoinColumn(name = "emloyee_id")
    private Employee employee;

    @Column(nullable = false)
    private String adress;

    public TableExample() {
    }

    public TableExample(Integer id, Employee employee, String adress) {
        this.id = id;
        this.employee = employee;
        this.adress = adress;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress;
    }

    @Override
    public String toString() {
        return "TableExample{" +
                "id=" + id +
                ", employee=" + employee +
                ", adress='" + adress + '\'' +
                '}';
    }
}
