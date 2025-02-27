package com.flabum.squidzbackend.reservation.domain.model.commands;

import com.flabum.squidzbackend.iam.domain.model.aggregates.User;
import com.flabum.squidzbackend.reservation.domain.model.entities.BarberService;
import com.flabum.squidzbackend.reservation.domain.model.entities.Local;

import java.sql.Time;
import java.time.LocalDate;
import java.time.LocalTime;

public record CreateReservationCommand(User user, Local local, LocalDate date, LocalTime time, BarberService barberService) {
}


