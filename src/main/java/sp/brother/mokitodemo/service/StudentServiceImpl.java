package sp.brother.mokitodemo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import sp.brother.mokitodemo.dao.StudentDao;
import sp.brother.mokitodemo.entity.StudentEntity;
import sp.brother.mokitodemo.model.Student;

@Service
public class StudentServiceImpl implements StudentService {
	@Autowired
	StudentDao studentDao;
	
	@Override
	@Transactional
	public List<Student> getStudentList() {
		return studentDao.getStudentList();
	}

	@Override
	@Transactional	
	public void save(StudentEntity student) {
		studentDao.save(student);

	}

}
