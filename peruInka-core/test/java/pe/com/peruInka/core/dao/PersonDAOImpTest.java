package pe.com.peruInka.core.dao;

import org.springframework.beans.factory.annotation.Autowired;

import pe.com.peruInka.core.domain.Person;

public class PersonDAOImpTest extends AbstractUnitTest {

	@Autowired
	protected PersonDAO personDAO;
	// PersonDAO personDAO = new PersonDAO();

	
//	@Autowired
//	protected PeruInkaService peruInkaService;
//	
//	public void test() {
//		System.out.println(peruInkaService);
//	}
	
	
	public void testFindAllPerson() {
		System.out.println("===" + personDAO.findAllPerson());
	}

	public void testFindAllUser() {
		System.out.println("::::" + personDAO.findAllUser());

	}

	public void testFindTypeDocument() {
		System.out.println("::::" + personDAO.findTypeDocument());
	}

	public void testSavePerson() {
		testFindAllPerson();
		
		Person person = new Person();
		person.setAddress("Jr: Puno 212121");
		person.setName("Lesly");
		person.setLastNameF("Chahuara");
		person.setLastNameM("Flores");
		
		personDAO.savePerson(person);
		testFindAllPerson();
		setComplete();
		
	}

	public void testFindPersonById(){
		
		System.out.println("::: "+personDAO.findPersonById(5L));
		Person person = personDAO.findPersonById(5L);
		
		System.out.println("Name: "+person.getName());
		System.out.println("Address: "+person.getAddress());
		
	}
	

	public void testDeletePerson(){
		Person person = personDAO.findPersonById(4L);
		personDAO.deletePerson(person);
		setComplete();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
