package com.uncledavecode.datajpa.model.embedded_id;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Column;
import javax.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Getter
@Setter
@Embeddable
public class StudentCourseKey  implements Serializable {

    @Column(name = "student_id")
    private Long studentId;

    @Column(name = "course_id")
    private Long courseId;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        StudentCourseKey that = (StudentCourseKey) o;

        if (!Objects.equals(studentId, that.studentId)) return false;
        return Objects.equals(courseId, that.courseId);
    }

    @Override
    public int hashCode() {
        int result = studentId != null ? studentId.hashCode() : 0;
        result = 31 * result + (courseId != null ? courseId.hashCode() : 0);
        return result;
    }

    @Override
    public String toString() {
        return "StudentCourseKey{" +
                "studentId=" + studentId +
                ", courseId=" + courseId +
                '}';
    }
}
