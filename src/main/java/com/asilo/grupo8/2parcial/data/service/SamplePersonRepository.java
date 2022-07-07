package com.asilo.grupo8.2parcial.data.service;

import com.asilo.grupo8.2parcial.data.entity.SamplePerson;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import java.time.LocalDate;

public interface SamplePersonRepository extends JpaRepository<SamplePerson, UUID> {

}