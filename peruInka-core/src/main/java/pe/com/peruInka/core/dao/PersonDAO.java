package pe.com.peruInka.core.dao;

import java.util.List;

import pe.com.peruInka.core.domain.Person;
import pe.com.peruInka.core.domain.StatusPerson;
import pe.com.peruInka.core.domain.StatusUser;
import pe.com.peruInka.core.domain.TypeDocument;
import pe.com.peruInka.core.domain.UserSystem;

public interface PersonDAO {

	void updateUserSystem(UserSystem userSystem);

	UserSystem findUserSystemById(Long id);

	void deleteUserSystem(UserSystem userSystem);

	List<Person> findAllPerson();

	List<UserSystem> findUserSystem();

	List<TypeDocument> findTypeDocument();

	void savePerson(Person person);

	Person findPersonById(Long id);

	void deletePerson(Person person);

	List<StatusPerson> findStatusPerson();

	void saveUserSystem(UserSystem userSystem);

	List<StatusUser> findStatusUser();
}
