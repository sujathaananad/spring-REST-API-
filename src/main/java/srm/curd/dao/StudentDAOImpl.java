package srm.curd.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import srm.curd.model.Student;

@Service
@Transactional(propagation = Propagation.REQUIRED)
public class StudentDAOImpl implements StudentDAO {

	@PersistenceContext
    private EntityManager entityManager;
    
    @Override
    public void createStudent(Student student)
    {
        entityManager.persist(student);
        System.out.println("Saved successfully");
    }

    @Override
    public Student getStudentById(long id)
    {
    	System.out.println("get student");
        return entityManager.find(Student.class,id);
    }

    @Override
    public List<Student> getAllStudents()
    {
    	System.out.println("all students");
        return entityManager.createQuery("select s from Student s").getResultList();
    }

    @Override
    public void updateStudent(Student student)
    {
        entityManager.merge(student);
    }

    @Override
    public void deleteStudent(long id)
    {
        Student s = entityManager.find(Student.class,id);
        entityManager.remove(s);
    }
}