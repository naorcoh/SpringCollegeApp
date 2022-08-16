package com.example.springcollege.CollegeAppSpring.service;

import com.example.springcollege.CollegeAppSpring.model.Contact;
import com.example.springcollege.CollegeAppSpring.model.enums.EInquiryStatus;
import com.example.springcollege.CollegeAppSpring.model.enums.EUserRoles;
import com.example.springcollege.CollegeAppSpring.repository.ContactRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;


@Service
@Slf4j
public class ContactService {

    @Autowired
    private ContactRepository contactRepository;

    public ContactService() {

        System.out.println("Contact Service bean was initialized!");
    }

    /**
     *
     * @param contact
     * @return
     */
    public boolean saveMessageDetails(Contact contact) {

        contact.setStatus(EInquiryStatus.OPEN.toString());
        Contact queryResults = contactRepository.save(contact);

        return (queryResults != null && queryResults.getInquiryId() > 0);
    }

    public List<Contact> findInquiriesByStatus() {

        List<Contact> inquiriesList = contactRepository.findByStatus(EInquiryStatus.OPEN.toString());
        return inquiriesList;
    }

    public boolean updateInquiryStatus(int inquiryId) {

        Optional<Contact> contact = contactRepository.findById(inquiryId);

        contact.ifPresent(contactObj -> {
            contactObj.setStatus(EInquiryStatus.CLOSED.toString());
        });

        Contact queryResults = contactRepository.save(contact.get());

        return (queryResults != null && queryResults.getUpdatedBy() != null);
    }


}
