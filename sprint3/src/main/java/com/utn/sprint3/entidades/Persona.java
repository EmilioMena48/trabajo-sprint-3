package com.utn.sprint3.entidades;

import jakarta.persistence.JoinColumn;
import jakarta.persistence.MappedSuperclass;
import jakarta.persistence.OneToMany;
import lombok.*;
import org.antlr.v4.runtime.misc.NotNull;

import java.util.ArrayList;
import java.util.List;

@MappedSuperclass
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Persona extends Base{

    private String nombre;

    private String apellido;

    private String telefono;

    private String email;

    @NotNull
    @OneToMany
    @JoinColumn(name = "id_cliente")
   // @Builder.Default
    private List<Domicilio> domicilios = new ArrayList<>();


}
