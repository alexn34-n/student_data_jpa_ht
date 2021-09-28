package com.alexn.spring.springboot.spring_data_jpa.student_data_jpa_ht.repositories;


import com.alexn.spring.springboot.spring_data_jpa.student_data_jpa_ht.models.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface StudentRepository extends JpaRepository <Student,Long>{
}
