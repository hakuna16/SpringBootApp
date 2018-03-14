package com.tesco.rangeservicevalidation.main.db;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.document.json.JsonObject;
import com.couchbase.client.java.query.N1qlQuery;
import com.couchbase.client.java.query.N1qlQueryResult;
import com.couchbase.client.java.query.N1qlQueryRow;
import com.tesco.rangeservicevalidation.main.model.RangeSchedule;

@Repository
public class RangeScheduleRepository  {

	
	@Autowired
	private Bucket bucket;

	
	public List<RangeSchedule> findByType(String type, String date) {
		
		String effectiveDate = date+"T00:00:00-0000";
		String rangeType = type.toUpperCase();
		
		 N1qlQuery query = N1qlQuery.simple("select productGroup,effectiveDate,createdBy,created,version from `RangeService` where type='" + rangeType + "' AND updated > '" + effectiveDate + "'");
		 N1qlQueryResult n1qlQueryResult = bucket.query(query);
		
		 List<RangeSchedule> rangeSchedules = new ArrayList<>();
		 
		 for (N1qlQueryRow row : n1qlQueryResult) {
			 JsonObject jsonObject = row.value();
			 RangeSchedule rangeSchedule = new RangeSchedule();
			 rangeSchedule.setCreatedBy(jsonObject.getString("createdBy"));
			 rangeSchedule.setProductGroup(jsonObject.getString("productGroup"));
			 rangeSchedule.setVersion(jsonObject.getInt("version"));
			 rangeSchedule.setCreated(jsonObject.getString("created"));
			 rangeSchedule.setEffectiveDate(jsonObject.getString("effectiveDate"));
			 
			 rangeSchedules.add(rangeSchedule);
		 }
		return rangeSchedules;
	}
	
	
}
