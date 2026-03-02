package com.parkfinder;

import com.parkfinder.entities.Usuario;
import com.parkfinder.service.LoginService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import java.util.Scanner;

@Component
public class LoginCLI implements CommandLineRunner {

    @Autowired
    private LoginService loginService;

    @Override
    public void run(String... args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("\n╔══════════════════════════════╗");
        System.out.println("║      PARK FINDER - LOGIN     ║");
        System.out.println("╚══════════════════════════════╝");

        System.out.print("📧 Correo:     ");
        String correo = scanner.nextLine().trim();

        System.out.print("🔒 Contraseña: ");
        String contraseña = scanner.nextLine().trim();

        Usuario usuario = loginService.login(correo, contraseña);

        System.out.println("\n──────────────────────────────");

        if (usuario != null) {
            System.out.println("✅ LOGIN EXITOSO");
            System.out.println("👤 Bienvenido, " + usuario.getNombre());
            System.out.println("🚗 Placa:            " + usuario.getPlacaVehiculo());
            System.out.println("⭐ Usos acumulados:  " + usuario.getUsosAcumulados());
        } else {
            System.out.println("❌ Correo/contraseña incorrectos o cuenta inactiva.");
        }

        System.out.println("──────────────────────────────\n");
        scanner.close();
    }
}