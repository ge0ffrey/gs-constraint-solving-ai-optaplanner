package org.optaplanner.spring.boot.example.persistence;

import java.util.List;

import org.optaplanner.spring.boot.example.domain.Room;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface RoomRepository extends PagingAndSortingRepository<Room, Long> {

    @Override
    List<Room> findAll();

}
