package com.telecom.tnms.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import com.telecom.tnms.model.NetworkElement;
import com.telecom.tnms.service.NetworkElementService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/api/network-elements")
public class NetworkElementController {
    @Autowired
    private NetworkElementService service;

    @GetMapping
    public List<NetworkElement> getAllNetworkElements() {
        return service.findAll();
    }

    @GetMapping("/{id}")
    public Optional<NetworkElement> getNetworkElementById(@PathVariable Long id) {
        return service.findById(id);
    }

    @PostMapping
    public NetworkElement createNetworkElement(@RequestBody NetworkElement networkElement) {
        return service.save(networkElement);
    }

    @PutMapping("/{id}")
    public NetworkElement updateNetworkElement(@PathVariable Long id, @RequestBody NetworkElement networkElement) {
        networkElement.setId(id);
        return service.save(networkElement);
    }

    @DeleteMapping("/{id}")
    public void deleteNetworkElement(@PathVariable Long id) {
        service.deleteById(id);
    }
}
