package co.com.n5.user.admin.service;

import co.com.n5.user.admin.model.AccessByPerson;
import co.com.n5.user.admin.repository.AccessByPersonRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccessByPersonService {

    @Autowired
    private AccessByPersonRepository accessByPersonRepository;

    public AccessByPerson create(AccessByPerson accessByPerson){
        return accessByPersonRepository.save(accessByPerson);
    }

    public List<AccessByPerson> getAll(){
        return accessByPersonRepository.findAll();
    }

    public void delete(AccessByPerson accessByPerson){ accessByPersonRepository.delete(accessByPerson); }

    public void update(AccessByPerson accessByPerson){
        accessByPersonRepository.save(accessByPerson);
    }

    public Optional<AccessByPerson> getOne(Long id){
        return accessByPersonRepository.findById(id);
    }

}

