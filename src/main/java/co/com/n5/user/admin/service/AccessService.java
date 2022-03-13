package co.com.n5.user.admin.service;

import co.com.n5.user.admin.model.Access;
import co.com.n5.user.admin.repository.AccessRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AccessService {

    @Autowired
    private AccessRepository accessRepository;

    public Access create(Access role){
        return accessRepository.save(role);
    }

    public List<Access> getAll (){
        return accessRepository.findAll();
    }

    public void delete(Access role){
        accessRepository.deleteById(role.getId());
    }

    public void update(Access role){
        accessRepository.save(role);
    }

    public Optional<Access> getOne(Long id){
        return accessRepository.findById(id);
    }

}

