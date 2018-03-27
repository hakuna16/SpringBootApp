package com.rituj.rangeservicevalidation.main.controller;


import java.util.List;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.tesco.rangeservicevalidation.main.db.RangeScheduleRepository;
import com.tesco.rangeservicevalidation.main.model.RangeSchedule;


@RestController
public class ScheduleController {
	
	@Autowired
	RangeScheduleRepository rangeScheduleRepository;

	@RequestMapping(value = "rangeschedule" )
	
	public @ResponseBody List<RangeSchedule> getAllRanges (@RequestParam("effectiveDate") String effectiveDate) {
		
		String rangeSchedule = "rangeschedule";
		
		 List<RangeSchedule> rangeSchedulesResponse = rangeScheduleRepository.findByType(rangeSchedule, effectiveDate);
		
		return rangeSchedulesResponse;
	}
}
