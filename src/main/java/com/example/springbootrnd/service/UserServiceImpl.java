package com.example.springbootrnd.service;

import com.example.springbootrnd.entity.Contact;
import com.example.springbootrnd.entity.User;
import com.example.springbootrnd.model.UserModel;
import com.example.springbootrnd.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.transaction.Transactional;
import java.util.List;
import java.util.stream.Collectors;

/**
 * Created by Md. Liton Miah
 * Created on April 05, 2023 at 12:16 PM
 */

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserRepository userRepository;
    @Override
    @Transactional
    public User saveUser(UserModel userModel) {
        try {
            User user = new User();
            user.setFirstName(userModel.getFirstName());
            user.setLastName(userModel.getLastName());
            user.setEmail(userModel.getEmail());
            user.setAddress(userModel.getAddress());
            user.setContactNo(userModel.getContactNo());

        /*List<Contact> contactList = new ArrayList<>();
        userModel.getContactList().forEach(contactModel -> {
            Contact contact = new Contact();
            contact.setId(contactModel.getId());
            contact.setOperatorName(contactModel.getOperatorName());
            contact.setContactNumber(contactModel.getContactNumber());
            contact.setPackageName(contactModel.getPackageName());
            contact.setSimType(contactModel.getSimType());

            contactList.add(contact);
        });*/

            List<Contact> contactList = userModel.getContactList().stream()
                    .map(it -> new Contact(it.getId(), it.getOperatorName(), it.getContactNumber(), it.getPackageName(),
                            it.getSimType())).collect(Collectors.toList());

            user.setContactList(contactList);

            return userRepository.save(user);
        } catch (Exception ex) {
            throw new RuntimeException("Error occurred during data save. Details: " + ex.getMessage());
        }

    }

    @Override
    public List<User> getAllUsers() {
        return userRepository.findAll();
    }
}
