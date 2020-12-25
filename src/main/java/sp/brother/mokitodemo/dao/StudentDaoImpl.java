package sp.brother.mokitodemo.dao;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import sp.brother.mokitodemo.entity.StudentEntity;
import sp.brother.mokitodemo.model.Student;
@Repository
public class StudentDaoImpl implements StudentDao {

	@Autowired
	EntityManager entityManager;
	@Override
	public List<Student> getStudentList() {
		List<Student> studentList = new ArrayList<Student>();
		try {
			Session currentSession = entityManager.unwrap(Session.class);
			Query<StudentEntity> query = currentSession.createQuery("From StudentEntity",StudentEntity.class);
			List<StudentEntity> students = query.getResultList();
			students.forEach(studentEntity ->{
				Student student = new Student();
				student.setStudentId(studentEntity.getStudentId());
				student.setName(studentEntity.getName());
				student.setEmail(studentEntity.getEmail());
				student.setMobile(studentEntity.getMobile());
				student.setStatus(studentEntity.getStatus());
				studentList.add(student);
			});
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return studentList;
	}

	@Override
	public void save(StudentEntity student) {
		Session currentSession = entityManager.unwrap(Session.class);
		currentSession.save(student);

	}

}
