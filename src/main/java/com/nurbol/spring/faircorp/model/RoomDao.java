package com.nurbol.spring.faircorp.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface RoomDao extends JpaRepository <Room, Long>, RoomDaoCustom{
}
