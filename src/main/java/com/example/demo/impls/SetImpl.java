package com.example.demo.impls;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

import org.springframework.boot.autoconfigure.condition.ConditionalOnProperty;
import org.springframework.stereotype.Repository;

import com.example.demo.ifaces.ReservationRepository;
import com.example.demo.model.Reservation;

@Repository
@ConditionalOnProperty(name="storage.option", havingValue="set")
public class SetImpl implements ReservationRepository {
	
	private Set<Reservation> repo;
	
	

	public SetImpl() {
		super();
		this.repo = new HashSet<>();
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
