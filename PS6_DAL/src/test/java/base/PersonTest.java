package base;

import static org.junit.Assert.*;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Month;
import java.util.Calendar;
import java.util.Date;


import domain.PersonDomainModel;

import org.junit.BeforeClass;
import org.junit.Test;
import org.junit.After;


public class PersonTest {
	
	/* private static PersonDomainModel person1;
	
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		PersonDomainModel person1 = new PersonDomainModel();
		LocalDate birthday = LocalDate.of(1997,Month.AUGUST,1);
		person1.setFirstName("John");
		person1.setLastName("Smith");
		person1.setBirthday(birthday);
		person1.setCity("Cityville");
		person1.setPostalCode(12345);
		person1.setStreet("123 Not Real Address");
	}
	

	@After
	public void tearDown() throws Exception {
		PersonDomainModel person;	
		PersonDAL.deletePerson(person1.getPersonID());
		person = PersonDAL.getPerson(person1.getPersonID());
		assertNull("The Person shouldn't have been in the database",person);		
	}
	

	@Test
	public void AddPersonTest() {
		PersonDomainModel person;		
		person = PersonDAL.getPerson(person1.getPersonID());		
		assertNull("The Person shouldn't have been in the database",person);		
		PersonDAL.addPerson(person1);	
		person = PersonDAL.getPerson(person1.getPersonID());
		System.out.println(person1.getPersonID() + " found");
		assertNotNull("The Person should have been added to the database",person);
	}
	
	@Test
	public void UpdatePersonTest() {
		PersonDomainModel person;
		final String C_LASTNAME = "Johnson";
		person = PersonDAL.getPerson(person1.getPersonID());		
		assertNull("The Person shouldn't have been in the database",person);		
		PersonDAL.addPerson(person1);	
		person1.setLastName(C_LASTNAME);
		PersonDAL.updatePerson(person1);
		person = PersonDAL.getPerson(person1.getPersonID());
		assertTrue(person1.getLastName() == C_LASTNAME);
		
	}
	@Test
	public void DeletePersonTest()
	{		
		PersonDomainModel person;		
		person = PersonDAL.getPerson(person1.getPersonID());		
		assertNull("The Person shouldn't have been in the database",person);	
		PersonDAL.addPerson(person1);			
		person = PersonDAL.getPerson(person1.getPersonID());
		System.out.println(person1.getPersonID());
		assertNotNull("The Person should have been added to the database",person);
		PersonDAL.deletePerson(person1.getPersonID());
		person = PersonDAL.getPerson(person1.getPersonID());		
		assertNull("The Person shouldn't have been in the database",person);	
		
	}
 */
}
