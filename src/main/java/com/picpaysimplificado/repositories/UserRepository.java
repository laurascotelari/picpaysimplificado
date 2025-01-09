package com.picpaysimplificado.repositories;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import com.picpaysimplificado.domain.user.User;

public interface UserRepository extends JpaRepository<User, Long> {
    //o retorno deve ser optional, pois pode ou não existir um usuário cadastrado
    //com esse documento
    Optional<User> findUserByDocument(String document);
    Optional<User> findUserById(Long id);
} 
