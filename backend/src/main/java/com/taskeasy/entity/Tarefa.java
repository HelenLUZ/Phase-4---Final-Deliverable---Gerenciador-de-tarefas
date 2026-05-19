
package com.taskeasy.entity;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Data
public class Tarefa {
    @Id @GeneratedValue
    private Long id;
    private String titulo;
    private String status;

    @ManyToOne
    private Usuario usuario;
}
