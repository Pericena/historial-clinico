package com.example.backend_HistorialClinico.Modulos.GestionUsuarios.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.example.backend_HistorialClinico.Modulos.GestionUsuarios.entity.User;
import com.example.backend_HistorialClinico.Modulos.GestionUsuarios.repository.UserRepository;

import lombok.RequiredArgsConstructor;

@Service
@RequiredArgsConstructor
public class UsuarioServices {
    private final UserRepository userRepository;

    public List<User> obtenerTodosLosUsuario() {
        return userRepository.findAll();
    }

    // Obtener un rol por ID
    public Optional<User> obtenerUsuarioPorId(Integer id) {
        return userRepository.findById(id);
    }
    // Guardar usuario actualizado
    public User guardarUsuario(User user) {
        return userRepository.save(user);
    }
}
