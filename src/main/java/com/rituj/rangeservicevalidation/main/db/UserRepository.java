package com.rituj.rangeservicevalidation.main.db;

import java.util.List;

import org.springframework.data.couchbase.core.query.N1qlPrimaryIndexed;
import org.springframework.data.repository.Repository;

import com.tesco.rangeservicevalidation.main.model.Range;
import com.tesco.rangeservicevalidation.main.model.RangeOutput;
import com.tesco.rangeservicevalidation.main.model.RangeSchedule;

@N1qlPrimaryIndexed
public interface UserRepository extends Repository<Range, String>{
	
	List<RangeSchedule> findByType(String type , String Date);
	
}
