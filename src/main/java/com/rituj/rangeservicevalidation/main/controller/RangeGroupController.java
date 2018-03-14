package com.tesco.rangeservicevalidation.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tesco.rangeservicevalidation.main.db.RangeGroupRepository;
import com.tesco.rangeservicevalidation.main.model.RangeGroupOutput;

@RestController
public class RangeGroupController {

	@Autowired
	RangeGroupRepository rangeGroupRepository;
	
	@RequestMapping(value = "/mgps/{mgp}/rangegroup" )
	public @ResponseBody List<RangeGroupOutput> getAllRangeGroups (@PathVariable("mgp") String mgp, @RequestParam("effectiveDate") String effectiveDate){
		
		String rangeGroup = "rangegroup";
		List<RangeGroupOutput> rangeGroupResponse= rangeGroupRepository.findByType(mgp, rangeGroup, effectiveDate);
		
		return rangeGroupResponse;
		
	}
}
