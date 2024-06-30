package com.telecom.tnms.repository;

import com.telecom.tnms.model.NetworkElement;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface NetworkElementRepository extends JpaRepository<NetworkElement, Long> {
}
