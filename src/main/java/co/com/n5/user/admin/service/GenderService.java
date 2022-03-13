package co.com.n5.user.admin.service;

import co.com.n5.user.admin.model.Gender;
import co.com.n5.user.admin.repository.GenderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class GenderService {

    @Autowired
    private GenderRepository genderRepository;

    public Gender create(Gender gender){
        return genderRepository.save(gender);
    }

    public List<Gender> getAll (){
        return genderRepository.findAll();
    }

    public void delete(Gender gender){
        genderRepository.deleteById(gender.getId());
    }

    public void update(Gender gender){
        genderRepository.save(gender);
    }

    public Optional<Gender> getOne(Long id){
        return genderRepository.findById(id);
    }

}

