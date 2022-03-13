package co.com.n5.user.admin.service;

import co.com.n5.user.admin.model.Person;
import co.com.n5.user.admin.repository.PersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class PersonService {

    @Autowired
    private PersonRepository personRepository;

    public Person create(Person person){
        return personRepository.save(person);
    }

    public List<Person> getAll (){
        return personRepository.findAll();
    }

    public void delete(Person person){
        personRepository.deleteById(person.getId());
    }

    public void update(Person person){
        personRepository.save(person);
    }

    public Optional<Person> getOne(Long id){
        return personRepository.findById(id);
    }

}
