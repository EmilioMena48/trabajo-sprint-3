package com.utn.sprint3.entidades;

import com.utn.sprint3.Enumeraciones.Rol;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

@Entity
@Table(name = "empleado")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Empleado extends Persona{

    private Rol rol;

    @ManyToMany
    @JoinTable(
            name = "pedidos_empleados",
            joinColumns = @JoinColumn(name = "empleado_id"),
            inverseJoinColumns = @JoinColumn(name = "pedido_id")
    )
    //@Builder.Default
    private Set<Pedido> pedidos = new HashSet<>();
}
