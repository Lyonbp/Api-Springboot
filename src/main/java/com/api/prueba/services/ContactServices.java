package com.api.prueba.services;

import com.api.prueba.models.ContactModel;
import com.api.prueba.repositories.IContactRepository;
import java.util.ArrayList;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactServices {
    @Autowired
    IContactRepository contactRepository;

    public ArrayList<ContactModel> getContacts(){
        return (ArrayList<ContactModel>) contactRepository.findAll();
    }

    public ContactModel saveContact(ContactModel contact){
        return contactRepository.save(contact);
    }

    public Optional<ContactModel> getContactID(Long idContact){
        return contactRepository.findById(idContact);
    }

    public ContactModel updateContactModel(ContactModel request, Long idContact){
        ContactModel contact = contactRepository.findById(idContact).get();

        contact.setFirstName(request.getFirstName());
        contact.setLastName(request.getLastName());
        contact.setEmail(request.getEmail());

        contactRepository.save(contact);

        return contact;

    }
}
