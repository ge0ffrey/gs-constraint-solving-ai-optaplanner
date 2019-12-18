package org.optaplanner.spring.boot.example.persistence;

import java.util.List;

import org.optaplanner.spring.boot.example.domain.Lesson;
import org.springframework.data.repository.PagingAndSortingRepository;

public interface LessonRepository extends PagingAndSortingRepository<Lesson, Long> {

    @Override
    List<Lesson> findAll();

}
