import Exception.NameTooShortException;
import domain.Person;
import domain.Student;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

public class PersonTest {
    
    public PersonTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    //Corre antes de cualquier prueba
    
    }
    
    @AfterClass
    public static void tearDownClass() {
        //Corre despues de cualquier prueba
    }
    
    @Before
    public void setUp() {
        //Corre el metodo antes que los demas
    }
    
    @After
    public void tearDown() {
        //Corre despues que termite el metodo de prueba
        
    }

    @Test
    public void hello() throws NameTooShortException {
        Person personTemp = new Person();
        personTemp.setName("Kevin");
        System.out.println(personTemp.toString());
    }
    
    @Test
    public void Student() throws NameTooShortException{
        Student myStudent = new Student("I123456","Business Computing");
        System.out.println(myStudent.toString());
        myStudent.setName("Maria");
        
    }
    
    @Test 
    public void Student2() throws NameTooShortException{
        Student second = new Student("John", 19, 2,true, "IF12345");
        System.out.println(second);
    }
}
    


