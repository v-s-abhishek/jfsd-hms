package com.ooad;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface prescriptionRepository extends JpaRepository<prescription,Long> {

	List<prescription> findByPatientName(String patientName);
}
