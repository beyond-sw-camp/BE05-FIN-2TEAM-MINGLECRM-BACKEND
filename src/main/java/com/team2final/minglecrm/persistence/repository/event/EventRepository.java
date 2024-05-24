package com.team2final.minglecrm.persistence.repository.event;

import com.team2final.minglecrm.entity.event.Event;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EventRepository extends JpaRepository<Event, Long> {
}
