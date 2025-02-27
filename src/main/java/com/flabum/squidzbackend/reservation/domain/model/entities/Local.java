package com.flabum.squidzbackend.reservation.domain.model.entities;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.Fetch;

import java.util.List;

@Getter
@Entity
@NoArgsConstructor
@AllArgsConstructor
public class Local {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Getter
    private String name;

    @Getter
    private String location;

    @ManyToMany
    @JoinTable(
            name = "local_barber_services",
            joinColumns = @JoinColumn(name = "local_id"),
            inverseJoinColumns = @JoinColumn(name = "barber_services_id")
    )
    private List<BarberService> barberServices;

    public Local(String name, String location, List<BarberService> barberServices) {
        this.name = name;
        this.location = location;
        this.barberServices = barberServices;
    }
}
