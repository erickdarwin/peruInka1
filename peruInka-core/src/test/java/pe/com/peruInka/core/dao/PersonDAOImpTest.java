package pe.com.peruInka.core.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import pe.com.peruInka.core.domain.Person;
import pe.com.peruInka.core.domain.StatusPerson;
import pe.com.peruInka.core.domain.StatusUser;
import pe.com.peruInka.core.domain.UserSystem;

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
	
	public void testSaveUserSystem(){
		UserSystem userSystem = new UserSystem();
		userSystem.setUserName("lchahuares");
		userSystem.setUserPassword("chahuares");
		
		StatusUser statusUser = new StatusUser();
		statusUser.setTypeCode(StatusUser.USER_INACT);
		
		userSystem.setStatusUser(statusUser);

		Person person = new Person();
		person.setName("Lesly");
		person.setLastNameF("Chahuares");
		person.setLastNameM("Flores");
		
		StatusPerson statusPerson = new StatusPerson();
		statusPerson.setTypeCode(StatusPerson.Status.PERSON_ACT.toString());
		person.setStatusPerson(statusPerson);
		
		userSystem.setPerson(person);
		
		personDAO.saveUserSystem(userSystem);
		setComplete();
	}
	
	public void testFindUserSystem(){
		
//		System.out.println(personDAO.findUserSystem());
//		
//		UserSystem userSystem = personDAO.findUserSystem().get(0);
//		System.out.println("userSystem::: "+userSystem.getPerson().getName());
//		System.out.println("userSystem::: "+userSystem.getUserName());
//		
		List<UserSystem> listaUserSystem = personDAO.findUserSystem();
		
		for (UserSystem userSystem2 : listaUserSystem) {
			System.out.println(userSystem2.getUserName()+"  ::: "+userSystem2.getPerson().getName());
		}
		
	}
	
	public void testFindAllPerson() {
		System.out.println("===" + personDAO.findAllPerson());
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
