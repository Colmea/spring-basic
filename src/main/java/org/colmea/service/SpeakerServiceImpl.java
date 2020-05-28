package org.colmea.service;

import org.colmea.model.Speaker;
import org.colmea.repository.HibernateSpeakerRepositoryImpl;
import org.colmea.repository.SpeakerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import javax.annotation.PostConstruct;
import java.util.List;

@Service("speakerService")
@Profile("dev")
public class SpeakerServiceImpl implements SpeakerService {

    private SpeakerRepository repository;

    @Autowired
    public SpeakerServiceImpl(SpeakerRepository speakerRepository) {
        repository = speakerRepository;
    }

    @PostConstruct
    private void initialize() {
        System.out.println("Initialized SpeakerService");
    }

    public void setRepository(SpeakerRepository repository) {
        this.repository = repository;
    }

    public List<Speaker> findAll() {
        return repository.findAll();
    }
}
