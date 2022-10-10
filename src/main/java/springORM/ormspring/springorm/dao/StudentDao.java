package springORM.ormspring.springorm.dao;
//we will implementing different database related operations(insert,update,delete,read) in here by using the hibernateTemplate class
// all the crud operations are performed below as a part of this project usig hibernate framework of ORM
import java.util.List;

import javax.transaction.Transactional;

import org.springframework.orm.hibernate5.HibernateTemplate;

import springORM.ormspring.springorm.entities.Student;

public class StudentDao {
	private HibernateTemplate hibernateTemplate;
	
	//the transactional annotation will enable the write mode also from our application to the database
	@Transactional 
	public int insert(Student student) {
		//the table will be created and object will be inserted by itself we dont even need to write the query
		Integer result=(Integer)this.hibernateTemplate.save(student);
		return result;
	}

	//get single data object
	public Student getStudent(int studentId) {
		Student student=this.hibernateTemplate.get(Student.class, studentId);
		return student;
	}
	
	//get all the students
	public List<Student> getAllStudents(){
		List<Student> students=this.hibernateTemplate.loadAll(Student.class);
		return students;
	}
	
	//updating a particular student's record
	@Transactional
	public void modify(Student student) {
		this.hibernateTemplate.update(student);
	}
	
	//deleting a particular student's record
	public void deleteStudent(int studentId) {
		Student student=this.hibernateTemplate.get(Student.class, studentId);
		this.hibernateTemplate.delete(student);
		return;
	}
	
	public HibernateTemplate getHibernateTemplate() {
		return hibernateTemplate;
	}

	public void setHibernateTemplate(HibernateTemplate hibernateTemplate) {
		this.hibernateTemplate = hibernateTemplate;
	}

	public StudentDao(HibernateTemplate hibernateTemplate) {
		super();
		this.hibernateTemplate = hibernateTemplate;
	}

	public StudentDao() {
		super();
		// TODO Auto-generated constructor stub
	}
	
}
