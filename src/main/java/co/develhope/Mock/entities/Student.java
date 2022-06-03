package co.develhope.Mock.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Data
@Table
public class Student {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int id;

    private String firstName;
    private String lastName;

    @Column(unique = true)
    private String email;
}
