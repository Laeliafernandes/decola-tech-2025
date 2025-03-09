package me.dio.decola_tech_2025.service;

import me.dio.decola_tech_2025.domain.model.User;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);
}
