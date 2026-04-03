package com.example.demo.impls;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Repository;

import com.example.demo.ifaces.ReservationRepository;
import com.example.demo.model.Reservation;

@Repository
@ConditionalOnProperty(name="storage.option", havingValue="list")
public class ListImpl implements ReservationRepository {
	
	private List<Reservation> repo;
	
	

	public ListImpl() {
		super();
		this.repo = new ArrayList<>();
	}

	@Override
	public boolean save(Reservation obj) {
		return this.repo.add(obj);
	}

	@Override
	public Collection<Reservation> findall() {
		return this.repo;
	}
	
	
}
