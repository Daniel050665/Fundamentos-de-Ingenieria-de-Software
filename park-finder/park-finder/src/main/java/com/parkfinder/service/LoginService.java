package com.parkfinder.service;

import com.parkfinder.entities.Usuario;
import com.parkfinder.repository.UsuarioRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Optional;

@Service
public class LoginService {

    @Autowired
    private UsuarioRepository usuarioRepository;

    public Usuario login(String correo, String contraseña) {
        Optional<Usuario> usuario = usuarioRepository
                .findByCorreoAndContraseña(correo, contraseña);

        if (usuario.isEmpty()) {
            return null; // credenciales incorrectas
        }

        if (!usuario.get().getEstadoCuenta()) {
            return null; // cuenta desactivada (ej: Carlos)
        }

        return usuario.get();
    }
}