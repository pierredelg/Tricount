package com.da2i.TricountDa2i.Controller;

import com.da2i.TricountDa2i.model.Utilisateur;
import com.da2i.TricountDa2i.repository.UtilisateurRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;

@RestController
public class UtilisateurController {

    @Autowired
    UtilisateurRepository utilisateurRepository;

    @RequestMapping(value = "/utilisateur", method= RequestMethod.GET)
    public ResponseEntity<Utilisateur> getPersonne(){

        Utilisateur utilisateur = utilisateurRepository.findByIdUtilisateur(3);

        if(utilisateur != null){
            return new ResponseEntity<>(utilisateur, HttpStatus.OK);
        }

        return new ResponseEntity<>(null, HttpStatus.NOT_FOUND);
    }
}