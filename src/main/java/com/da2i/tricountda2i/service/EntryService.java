package com.da2i.tricountda2i.service;

import com.da2i.tricountda2i.model.Ecriture;
import com.da2i.tricountda2i.repository.EntryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EntryService {

    @Autowired
    EntryRepository entryRepository;

    public List<Ecriture> getAllWriting(){

        return (List<Ecriture>) entryRepository.findAll();
    }

    public List<Ecriture> getAllWritingByEventId(Integer id){
        return entryRepository.findByEvenementId(id);
    }

    public Ecriture getWriting(Integer id){

        return entryRepository.findByIdEcriture(id);
    }

    public Ecriture addWriting(Ecriture ecriture){

        return entryRepository.save(ecriture);
    }

    public void deleteWriting(Integer id){

        entryRepository.deleteById(Long.valueOf(id));
    }

    public Ecriture updateWriting(Ecriture ecriture){

        return entryRepository.save(ecriture);
    }
}