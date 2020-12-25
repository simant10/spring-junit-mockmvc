package sp.brother.mokitodemo.service;

import java.util.List;

import sp.brother.mokitodemo.entity.StudentEntity;
import sp.brother.mokitodemo.model.Student;


public interface StudentService {
	public List<Student> getStudentList();
	void save(StudentEntity student);
}
