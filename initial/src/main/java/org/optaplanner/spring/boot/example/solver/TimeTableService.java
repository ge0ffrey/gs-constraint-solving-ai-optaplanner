package org.optaplanner.spring.boot.example.solver;

import java.util.UUID;
import java.util.concurrent.ExecutionException;

import org.optaplanner.core.api.solver.SolverJob;
import org.optaplanner.core.api.solver.SolverManager;
import org.optaplanner.spring.boot.example.domain.TimeTable;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/timeTable")
public class TimeTableService {

    @Autowired
    private SolverManager<TimeTable, UUID> solverManager;

    // To try, POST http://localhost:8080/timeTable
    @PostMapping("/solve")
    public TimeTable solve(TimeTable problem) {
        SolverJob<TimeTable, UUID> solverJob = solverManager.solve(UUID.randomUUID(), problem);
        TimeTable solution;
        try {
            solution = solverJob.getFinalBestSolution();
        } catch (InterruptedException | ExecutionException e) {
            throw new IllegalStateException("Solving failed.", e);
        }
        return solution;
    }

}
