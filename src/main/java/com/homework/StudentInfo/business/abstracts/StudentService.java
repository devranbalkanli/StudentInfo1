package com.homework.StudentInfo.business.abstracts;

import java.util.List;



import com.homework.StudentInfo.core.utilities.results.DataResult;
import com.homework.StudentInfo.core.utilities.results.Result;
import com.homework.StudentInfo.entities.concretes.Student;


public interface StudentService {
	
	DataResult<List<Student>> getAll();
	
	Result add(Student student);
	
	Result delete(Student student);
	
	Result update(Student student);
	
	}
