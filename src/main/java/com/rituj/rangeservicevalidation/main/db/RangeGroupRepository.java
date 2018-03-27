package com.rituj.rangeservicevalidation.main.db;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.couchbase.client.java.Bucket;
import com.couchbase.client.java.document.json.JsonObject;
import com.couchbase.client.java.query.N1qlQuery;
import com.couchbase.client.java.query.N1qlQueryResult;
import com.couchbase.client.java.query.N1qlQueryRow;
import com.tesco.rangeservicevalidation.main.model.RangeGroupOutput;


@Repository
public class RangeGroupRepository {

	@Autowired
	private Bucket bucket;


	public List<RangeGroupOutput> findByType(String productGroup, String type, String date) {

		String rangeGroupType = type.toUpperCase();
		String effectiveDate = date+"T00:00:00-0000";
		
		String statemaent = "select productGroup,count(*) as RangeGroupCount from `RangeService` where type='" + rangeGroupType + "' and productGroup='" + productGroup + "' and startDate <= '" + effectiveDate + "' and (endDate>'" + effectiveDate +"' or endDate='NULL') group by productGroup order by productGroup";
		
		/*String stmt = "select productGroup,count(*) as RangeGroupCount from `RangeService` \r\n" + 
				"where type=\"RANGEGROUP\" \r\n" + 
				"and productGroup in [\"H2A\", \r\n" + 
				"\"H2C\", \r\n" + 
				"\"H2E\", \r\n" + 
				"\"H2F\", \r\n" + 
				"\"H5C\"] \r\n" + 
				"and startDate <= \"2018-01-05\" and (endDate>\"2018-01-05\" or endDate=\"NULL\") \r\n" + 
				"group by productGroup \r\n" + 
				"order by productGroup";
*/				
		N1qlQuery query = N1qlQuery.simple(statemaent);
		N1qlQueryResult n1qlQueryResult = bucket.query(query);
		
		List<RangeGroupOutput> rangeGroupOutputList = new ArrayList<>();
		
		for (N1qlQueryRow row : n1qlQueryResult) {
			
			JsonObject jsonObject = row.value();
			RangeGroupOutput rangeGroupOutput = new RangeGroupOutput();
			rangeGroupOutput.setProductGroup(jsonObject.getString("productGroup"));
			rangeGroupOutput.setRangeGroupCount(jsonObject.getInt("RangeGroupCount"));
			rangeGroupOutputList.add(rangeGroupOutput);
		}
			 
		return rangeGroupOutputList;
	}

}
