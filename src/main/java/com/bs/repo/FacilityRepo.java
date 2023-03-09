package com.bs.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.bs.beans.Facility;

@Repository
public interface FacilityRepo extends JpaRepository<Facility, Integer> {

	Facility getFacilityByFacilityId(Integer id);

	String deleteFacilityByFacilityId(Integer id);

}
