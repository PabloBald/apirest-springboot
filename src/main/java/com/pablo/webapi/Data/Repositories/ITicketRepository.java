package com.pablo.webapi.Data.Repositories;

import com.pablo.webapi.Domain.Ticket;
import org.springframework.data.repository.CrudRepository;

public interface ITicketRepository extends CrudRepository<Ticket,Long> {
}
