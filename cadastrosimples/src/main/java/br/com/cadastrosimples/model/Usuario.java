package br.com.cadastrosimples.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;

import lombok.Data;

@Data
@Entity
@Table(name = "usuario")
public class Usuario {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    @NotBlank(message = "O campo Nome é obrigatório.")
    @Column(name = "nome_completo" , length = 200, nullable = true)
    private String nome;

    @Email(message = "Insira um e-mail válido.")
    @NotBlank(message = "O campo E-mail é obrigatório.")
    @Column(name = "email" , length = 50, nullable = true)
    private String email;

    @NotBlank(message = "O campo Senha é obrigatória.")
    @Column(name = "senha" , columnDefinition = "TEXT", nullable = true)
    private String senha;

    @NotBlank(message = "O campo Telefone é obrigatório")
    @Column(name = "telefone" , length = 50, nullable = true)
    private String telefone;

}
