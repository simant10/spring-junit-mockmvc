package sp.brother.mokitodemo.dao;
import java.util.List;
import sp.brother.mokitodemo.entity.StudentEntity;
import sp.brother.mokitodemo.model.Student;
public interface StudentDao {
	List<Student> getStudentList();
	void save(StudentEntity student);
}
