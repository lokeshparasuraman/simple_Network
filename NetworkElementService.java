package com.telecom.tnms.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.telecom.tnms.model.NetworkElement;
import com.telecom.tnms.repository.NetworkElementRepository;

import java.util.List;
import java.util.Optional;

@Service
public class NetworkElementService {
    @Autowired
    private NetworkElementRepository repository;

    public List<NetworkElement> findAll() {
        return repository.findAll();
    }

    public Optional<NetworkElement> findById(Long id) {
        return repository.findById(id);
    }

    public NetworkElement save(NetworkElement networkElement) {
        return repository.save(networkElement);
    }

    public void deleteById(Long id) {
        repository.deleteById(id);
    }
}
