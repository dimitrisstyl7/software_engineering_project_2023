package com.unipi.findoctor.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Data
@Entity
@Table(name = "appointment_tbl")
public class Appointment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(unique = true)
    private Long id;


    @ManyToOne
    @JoinColumn(name = "patient_amka", referencedColumnName = "amka")
    private Patient patient;

    @ManyToOne
    @JoinColumn(name = "doctor_afm", referencedColumnName = "afm")
    private Doctor doctor;

    private LocalDate date;
    private LocalTime time_slot;
}
