package org.colmea.learningspringboot.repositories;

import org.colmea.learningspringboot.models.Speaker;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SpeakerRepository extends JpaRepository<Speaker, Long> {
}
