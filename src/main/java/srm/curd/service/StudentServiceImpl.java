package srm.curd.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import srm.curd.dao.StudentDAO;
import srm.curd.model.Student;

@Service
@Transactional
public class StudentServiceImpl implements StudentService
{
	@Autowired
	private StudentDAO studentDao;
	@Override
	public void createStudent(Student student) {
		studentDao.createStudent(student);		
	}
	@Transactional
	@Override
	public Student getStudentById(long id) {
		return studentDao.getStudentById(id);
	}
	@Transactional
	@Override
	public List<Student> getAllStudents() {
		return studentDao.getAllStudents();
	}
	@Transactional
	@Override
	public void updateStudent(Student student) {
		studentDao.updateStudent(student);
	}
	@Transactional
	@Override
	public void deleteStudent(long id) 
	{
		studentDao.deleteStudent(id);
	}

}
