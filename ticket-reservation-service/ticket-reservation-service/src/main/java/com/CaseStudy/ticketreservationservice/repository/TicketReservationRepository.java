package com.CaseStudy.ticketreservationservice.repository;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.CaseStudy.ticketreservationservice.model.TicketReservation;

@Repository
public interface TicketReservationRepository extends MongoRepository<TicketReservation, String> {

	

}
