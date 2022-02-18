package com.homework.StudentInfo.dataAccess.abstracts;



import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.homework.StudentInfo.entities.concretes.Student;


@Repository
public interface StudentDao extends JpaRepository <Student,Long> {

	


}


