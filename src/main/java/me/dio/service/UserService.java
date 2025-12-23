package me.dio.service;

import me.dio.domain.model.User;
import java.util.List;

public interface UserService {

    User findById(Long id);

    User create(User userToCreate);

    // Novo método para listar usuários por saldo
    List<User> listarPorSaldoMaiorQue(Double saldo);
}
