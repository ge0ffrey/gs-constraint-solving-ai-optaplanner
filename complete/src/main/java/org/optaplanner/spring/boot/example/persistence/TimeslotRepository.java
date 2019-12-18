package org.optaplanner.spring.boot.example.persistence;

import java.util.List;

import org.optaplanner.spring.boot.example.domain.Timeslot;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface TimeslotRepository extends PagingAndSortingRepository<Timeslot, Long> {

    @Override
    List<Timeslot> findAll();

}
