package com.bs.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PathVariable;

import com.bs.beans.Facility;
import com.bs.repo.FacilityRepo;
import com.bs.util.Utility;

@Service
public class FacilityService {
	@Autowired
	private FacilityRepo facilityRepo;

	public Facility setDefaultFacilityByID(Integer id) {
		return facilityRepo.save(new Facility(id, id, "N", "N", "N", "N"));
	}

	public List<Facility> getAllFacilitys() {
		List<Facility> allcountries = facilityRepo.findAll();
		return allcountries;
	}

	public Facility createFacility(Facility facility) {
		return facilityRepo.save(facility);
	}

	public Facility updateFacility(Facility countries) {
		Facility updatedFacility = null;
		Facility Saved = null;
//		Optional<Facility> findById = countryRepo.findByCountryId(countries.getClass());
//		if (findById.isPresent()) {
//			updatedFacility = new Facility();
////			updatedFacility.setCountryName(findById.get().getCountryName());
////			updatedFacility.setRegionId(findById.get().getRegionId());
//			Saved = countryRepo.save(updatedFacility);
//		}
		return Saved;
	}

	public Facility getByID(Integer id) {
		return facilityRepo.getFacilityByFacilityId(id);
	}

	public String deleteFacilityByID(Integer id) {
		return facilityRepo.deleteFacilityByFacilityId(id);
	}

}
