package com.uncledavecode.datajpa.model.embedded_id;

import com.uncledavecode.datajpa.model.Course;
import com.uncledavecode.datajpa.model.Student;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Entity
public class StudentCourse {

    @EmbeddedId
    private StudentCourseKey id;

    @ManyToOne
    @JoinColumn(name = "student_id")
    @MapsId("studentId")
    private Student student;

    @ManyToOne
    @JoinColumn(name = "course_id")
    @MapsId("courseId")
    private Course course;

    @Column(name = "rating")
    private int rating;

    @Override
    public String toString() {
        return "CourseRating{" +
                "id=" + id +
                ", rating=" + rating +
                '}';
    }
}
