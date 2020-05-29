package org.colmea.learningspringboot.repositories;

import org.colmea.learningspringboot.models.Session;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SessionRepository extends JpaRepository<Session, Long> {
}
