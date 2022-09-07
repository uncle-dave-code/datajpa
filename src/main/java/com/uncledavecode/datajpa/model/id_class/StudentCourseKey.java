//package com.uncledavecode.datajpa.model.id_class;
//
//import com.uncledavecode.datajpa.model.Course;
//import com.uncledavecode.datajpa.model.Student;
//import lombok.Getter;
//import lombok.NoArgsConstructor;
//import lombok.Setter;
//
//import java.io.Serializable;
//import java.util.Objects;
//
//@Getter
//@Setter
//@NoArgsConstructor
//public class StudentCourseKey implements Serializable {
//
//    private Student student;
//    private Course course;
//
//    public StudentCourseKey(Student student, Course course) {
//        this.student = student;
//        this.course = course;
//    }
//
//    @Override
//    public boolean equals(Object o) {
//        if (this == o) return true;
//        if (o == null || getClass() != o.getClass()) return false;
//
//        StudentCourseKey that = (StudentCourseKey) o;
//
//        if (!Objects.equals(student, that.student)) return false;
//        return Objects.equals(course, that.course);
//    }
//
//    @Override
//    public int hashCode() {
//        int result = Objects.hash(student);
//        result = 31 * result + Objects.hash(course);
//        return result;
//    }
//
//    @Override
//    public String toString() {
//        return "StudentCourseKey{" +
//                "student=" + student +
//                ", course=" + course +
//                '}';
//    }
//}
