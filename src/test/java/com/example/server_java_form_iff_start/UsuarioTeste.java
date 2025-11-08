package com.example.server_java_form_iff_start;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.example.server_java_form_iff_start.usuario.model.Usuario;

public class UsuarioTeste {
    @Test
    void testCriarUsuario() {
        // Given (Dado que)
        // Dado que temos um novo usuário com dados específicos
        Usuario usuario = new Usuario("John Doe", "john.doe@example.com", "password123");

        // When (Quando)
        // Quando acessamos os dados do usuário usando os métodos getters
        String nome = usuario.getNome();
        String email = usuario.getEmail();
        String senha = usuario.getSenha();

        System.out.println("Nome: " + nome);
        System.out.println("Email: " + email);
        System.out.println("Senha: " + senha);

        // Then (Então)
        // Então os dados devem ser os mesmos que os fornecidos ao criar o usuário
        assertEquals("John Doe", nome, "O nome do usuário deve ser 'John Doe'");
        assertEquals("john.doe@example.com", email, "O email do usuário deve ser 'john.doe@example.com'");
        assertEquals("password123", senha, "A senha do usuário deve ser 'password123'");
    }
}
