package com.homework.StudentInfo.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.homework.StudentInfo.business.abstracts.StudentService;
import com.homework.StudentInfo.core.utilities.results.DataResult;
import com.homework.StudentInfo.core.utilities.results.Result;
import com.homework.StudentInfo.core.utilities.results.SuccessDataResult;
import com.homework.StudentInfo.core.utilities.results.SuccessResult;
import com.homework.StudentInfo.dataAccess.abstracts.StudentDao;
import com.homework.StudentInfo.entities.concretes.Student;


@Service
public class StudentManager implements StudentService {
	
	@Autowired
	private StudentDao studentDao;
	
	public StudentManager() {
		
	}
	
	
    public StudentManager(StudentDao studentDao) {
		super();
		this.studentDao = studentDao;
	}

	
    @Override
	public DataResult<List<Student>> getAll() {
    	
		return new SuccessDataResult<List<Student>> (this.studentDao.findAll(),"Öğrenci Listelendi");
	}


	@Override
	public Result add(Student student) {
		this.studentDao.save(student);
		return new SuccessResult("Öğrenci Eklendi");
	}


	@Override
	public Result delete(Student student) {
		this.studentDao.delete(student);
		return new SuccessResult("Öğrenci Silindi");
	}


	@Override
	public Result update(Student student) {
		this.studentDao.save(student);
		return new SuccessResult("Öğrenci Güncellendi");
	}

}
