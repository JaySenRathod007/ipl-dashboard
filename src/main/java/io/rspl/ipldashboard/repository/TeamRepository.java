package io.rspl.ipldashboard.repository;

import org.springframework.data.repository.CrudRepository;

import io.rspl.ipldashboard.model.Team;

public interface TeamRepository extends CrudRepository<Team, Long>  {

    Team findByTeamName(String teamName);
    
}
