//package com.uncledavecode.datajpa.model.id_class;
//
//import com.uncledavecode.datajpa.model.Course;
//import com.uncledavecode.datajpa.model.Student;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import javax.persistence.*;
//
//@Getter
//@Setter
//@Entity
//@IdClass(StudentCourseKey.class)
//public class StudentCourse {
//
//    @Id
//    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private Student student;
//
//    @Id
//    @ManyToOne(fetch = FetchType.LAZY, cascade = CascadeType.ALL)
//    private Course course;
//
//    @Column(name = "rating")
//    private int rating;
//
//    @Override
//    public String toString() {
//        return "StudentCourse{" +
//                "student=" + student +
//                ", course=" + course +
//                ", rating=" + rating +
//                '}';
//    }
//}
