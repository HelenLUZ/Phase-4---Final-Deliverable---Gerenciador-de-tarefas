
package com.taskeasy.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class Usuario {
    @Id @GeneratedValue
    private Long id;
    private String nome;
    private String email;
    private String senha;
}
