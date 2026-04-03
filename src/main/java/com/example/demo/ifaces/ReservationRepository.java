package com.example.demo.ifaces;

import java.util.Collection;

import org.springframework.stereotype.Repository;

import com.example.demo.model.Reservation;


public interface ReservationRepository {
	
	boolean save(Reservation obj);
	
	Collection<Reservation> findall();

}
