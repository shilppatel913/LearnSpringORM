package springORM.ormspring.springorm;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springORM.ormspring.springorm.dao.StudentDao;
import springORM.ormspring.springorm.entities.Student;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        ApplicationContext context=new ClassPathXmlApplicationContext("config.xml");
        StudentDao s1=context.getBean("studentDao",StudentDao.class);
        Student student=new Student(1,"Shilp Patel","Ahmedabad");
       int result= s1.insert(student);
       System.out.println("Number of rows affected"+result);
    }
}
