package com.uncledavecode.datajpa.model;

import com.uncledavecode.datajpa.model.embedded_id.StudentCourse;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.HashSet;
import java.util.Set;

@Getter
@Setter
@NoArgsConstructor
@Entity
@Table(name = "course")
public class Course {

    public Course(String name) {
        this.name = name;
    }

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "course_generator")
    @SequenceGenerator(name = "course_generator", allocationSize = 1)
    private Long id;

    @Column(name = "name", nullable = false)
    private String name;

    @ManyToOne(fetch = FetchType.EAGER)
    private Instructor instructor;

    //idClass
//    @OneToMany(mappedBy = "course", fetch = FetchType.EAGER)
//    private Set<StudentCourse> studentCourses = new HashSet<>();

    //EmbeddedId
    @OneToMany(mappedBy = "course")
    private Set<StudentCourse> studentCourses = new HashSet<>();

    @Override
    public String toString() {
        return "Course{" +
                "id=" + id +
                ", name='" + name +
                '}';
    }
}
