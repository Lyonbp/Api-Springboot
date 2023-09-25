package com.api.prueba.controllers;

import com.api.prueba.models.ContactModel;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.api.prueba.services.ContactServices;

@RestController
@RequestMapping("/contact")
public class ContactController {
    @Autowired
    private ContactServices contactServices;
    @GetMapping
    public ArrayList<ContactModel> getContact() {
        return this.contactServices.getContacts();
    }

    @PostMapping
    public ContactModel saveContact(@RequestBody ContactModel contact){
        return this.contactServices.saveContact(contact);
    }

    @GetMapping(path = "/{id}")
    public Optional<ContactModel> getContactID(@PathVariable ("id") Long idContact){
        return this.contactServices.getContactID(idContact);
    }

    @PutMapping(path = "/{id}")
    public ContactModel updateContact(@RequestBody ContactModel request,@PathVariable ("id") Long idContact){
        return this.contactServices.updateContactModel(request, idContact);
    }
}
