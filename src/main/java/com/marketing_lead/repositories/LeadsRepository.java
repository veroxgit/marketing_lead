package com.marketing_lead.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.marketing_lead.entities.Leads;

public interface LeadsRepository extends JpaRepository<Leads, Long> {

}
