package com.bs.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.bs.beans.Facility;
import com.bs.service.FacilityService;
@CrossOrigin(origins = "http://localhost:3000")
@RestController
public class FacilityController {
	@Autowired
	private FacilityService facilityService;

	@GetMapping("/gett")
	public Facility gett() {
		return new Facility(12, 12, "Y", "Y", "Y", "Y");
	}

	@GetMapping("/setDefaultFacility/{id}")
	public ResponseEntity<Facility> setDefaultFacilityByID(@PathVariable("id") Integer id) {
		return new ResponseEntity<Facility>(facilityService.setDefaultFacilityByID(id), HttpStatus.OK);
	}

	@GetMapping("/getFacilityByID/{id}")
	public ResponseEntity<Facility> getFacilityByID(@PathVariable("id") Integer id) {
		return new ResponseEntity<Facility>(facilityService.getByID(id), HttpStatus.OK);
	}

	@GetMapping("/deleteFacilityByID/{id}")
	public ResponseEntity<String> deleteFacilityByID(@PathVariable("id") Integer id) {
		return new ResponseEntity<String>(facilityService.deleteFacilityByID(id), HttpStatus.OK);
	}

	@GetMapping("/getFacilities")
	public ResponseEntity<List<Facility>> getAllFacility() throws InterruptedException {
		return new ResponseEntity<List<Facility>>(facilityService.getAllFacilitys(), HttpStatus.OK);
	}

	@PostMapping("/createFacility")
	public ResponseEntity<Facility> createFacility(@RequestBody Facility countries) {

		return new ResponseEntity<Facility>(facilityService.createFacility(countries), HttpStatus.OK);
	}

	@PostMapping("/updateFacility")
	public ResponseEntity<Facility> updateFacility(@RequestBody Facility countries) {
		return new ResponseEntity<Facility>(facilityService.updateFacility(countries), HttpStatus.OK);
	}

}