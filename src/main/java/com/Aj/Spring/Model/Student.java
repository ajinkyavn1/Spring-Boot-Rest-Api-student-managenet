package com.Aj.Spring.Model;

import lombok.Data;
import lombok.extern.apachecommons.CommonsLog;

import javax.persistence.*;

@Data
@Entity
@Table(name = "Student")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private  long id;
    @Column(name = "Name")
    private String Name;
    @Column(name = "Mobail")
    private long Mobail;
    @Column(name = "email")
    private String email;
    @Column(name = "Addhar")
    private  long addhar;
    @Column(name = "Parent_number")
    private long Parent_number;
    @Column(name = "Roll_no")
    private int Roll_no;
}
