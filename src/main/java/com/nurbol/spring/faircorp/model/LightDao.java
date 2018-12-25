package com.nurbol.spring.faircorp.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface LightDao extends JpaRepository<Light, Long>, LightDaoCustom {
}
