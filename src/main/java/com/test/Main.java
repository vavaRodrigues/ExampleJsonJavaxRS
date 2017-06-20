package com.test;

import java.io.IOException;

import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jettison.json.JSONException;

import com.test.dto.CreateEnvironmentDTO;

public class Main {
	
	
	public static void main(String args[]) throws JsonParseException, JsonMappingException, IOException, JSONException {
		
		String json = "{" +
				"    \"product_id\" : \"1\"," +
				"    \"product_version\" : \"12.1.007\"," +
				"    \"provider_name\": \"totvs_cloud\"," +
				"    \"customer_company\" : {" +
				"        \"federal_id\": \"federal\"," +
				"        \"corporate_name\": \"name\"," +
				"        \"email\" : \"email\"" +
				"    }," +
				"    \"product_params\": {" +
				"      \"language\": \"portuguese\"" +
				"    }," +
				"    \"provider_params\": {" +
				"      \"totvs_cloud_project_id\": \"project_id\"" +
				"    }," +
				"    \"simulation\": {" +
				"      \"scaling_type\": \"fixed\"," +
				"      \"billing_type\": \"default\"," +
				"      \"alert_enabled\": \"informed\"," +
				"      \"additional_capacity\": 50," +
				"      \"additional_capacity_days\": []," +
				"      \"cost_alert\": 0.0," +
				"      \"max_number_of_devices\": 20," +
				"      \"number_of_devices\": 120," +
				"      \"segment_factor_number\": 1," +
				"      \"stages\": {" +
				"       \"production\": {" +
				"          \"max_instances\": 1," +
				"          \"max_core_instance_elastic\": 3," +
				"          \"max_core_service_elastic\": 0," +
				"          \"databases\": [" +
				"            {" +
				"              \"tags\": {" +
				"                \"configuration_type\": \"database\"" +
				"              }," +
				"              \"flavour\": \"jis.database.medium_a\"," +
				"              \"engine\": \"sqlserver\"," +
				"              \"storage_size\": 75" +
				"            }" +
				"          ]," +
				"          \"instances\": [" +
				"            {" +
				"              \"tags\": {" +
				"                \"configuration_type\": \"core_instance\"" +
				"              }," +
				"             \"flavour\": \"jis.instance.medium_a\"," +
				"             \"storages\": [" +
				"                {" +
				"                  \"tags\": {" +
				"                    \"configuration_type\": \"so\"" +
				"                  }," +
				"                  \"type\": \"jis.storage.ssd_a\"," +
				"                  \"size\": 10," +
				"                  \"additional\": false" +
				"                }," +
				"                {" +
				"                  \"tags\": {" +
				"                    \"configuration_type\": \"additional\"" +
				"                  }," +
				"                  \"type\": \"jis.storage.ssd_a\"," +
				"                  \"size\": 70," +
				"                  \"additional\": true" +
				"                }" +
				"              ]" +
				"            }" +
				"          ]," +
				"          \"scaling_instances\": []," +
				"          \"working_hours\": {" +
				"            \"seg\": [0, 23], \"ter\": [0, 23], \"qua\": [0, 23], \"qui\": [0, 23], \"sex\": [0, 23], \"sab\": [0, 23], \"dom\": [0, 23]" +
				"          }," +
				"          \"warm_ups\": {" +
				"            \"seg\": [0, 1]," +
				"            \"ter\": [0, 1, 2]," +
				"            \"qua\": []," +
				"            \"qui\": []," +
				"            \"sex\": []," +
				"            \"sab\": []," +
				"            \"dom\": []" +
				"          }" +
				"        }" +
				"      }" +
				"    }" +
				"  }";
		
		ObjectMapper mapper = new ObjectMapper();
		CreateEnvironmentDTO environment = mapper.readValue(json, CreateEnvironmentDTO.class);
		
		
		System.out.println(environment.toString());
		
		String jsonInString = mapper.writeValueAsString(environment);

		
		
		System.out.println(jsonInString);

	}

}
