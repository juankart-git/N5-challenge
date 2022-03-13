package co.com.n5.user.admin.service;

import co.com.n5.user.admin.model.DocumentType;
import co.com.n5.user.admin.repository.DocumentTypeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class DocumentTypeService {

    @Autowired
    private DocumentTypeRepository documentTypeRepository;

    public DocumentType create(DocumentType documentType){
        return documentTypeRepository.save(documentType);
    }

    public List<DocumentType> getAll (){
        return documentTypeRepository.findAll();
    }

    public void delete(DocumentType documentType){
        documentTypeRepository.deleteById(documentType.getId());
    }

    public void update(DocumentType documentType){
        documentTypeRepository.save(documentType);
    }

    public Optional<DocumentType> getOne(Long id){
        return documentTypeRepository.findById(id);
    }

}
