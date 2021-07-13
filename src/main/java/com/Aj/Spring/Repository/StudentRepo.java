package com.Aj.Spring.Repository;

import com.Aj.Spring.Model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepo extends JpaRepository<Student,Long> {
}
