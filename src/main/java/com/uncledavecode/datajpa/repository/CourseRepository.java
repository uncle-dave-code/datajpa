package com.uncledavecode.datajpa.repository;

import com.uncledavecode.datajpa.dto.CourseDTO;
import com.uncledavecode.datajpa.model.Course;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface CourseRepository extends JpaRepository<Course, Long> {
    List<CourseDTO> findByInstructor_Id(Long id);
}
