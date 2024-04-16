package ca.sheridancollege.mcowans.a4webservicemcowans.beans;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Entity(name="COURSE")
@Data
@NoArgsConstructor
public class Course implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="COURSEID")
    private Long courseID;
    @Column(name="COURSENAME")
    private String courseName;
    @Column(name="COURSECODE")
    private String courseCode;
    @Column(name="COURSECREDIT")
    private String courseCredit;
    @Column(name = "EDIT")
    private boolean edit;
}