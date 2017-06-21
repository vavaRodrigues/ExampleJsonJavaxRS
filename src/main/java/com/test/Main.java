package com.test;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;

import com.test.dto.CreateEnvironmentDTO;
import com.test.dto.CustomerCompany;
import com.test.dto.DatabasesEnvironment;
import com.test.dto.InstancesEnvironment;
import com.test.dto.Production;
import com.test.dto.ProviderParams;
import com.test.dto.Simulation;
import com.test.dto.Stages;
import com.test.dto.Storages;
import com.test.dto.WarmUps;
import com.test.dto.WorkingHoursEnvironment;
import com.test.simulador.dto.Manifest;
import com.test.simulador.dto.RampupHours;
import com.test.simulador.dto.SimulationDTO;
import com.test.simulador.dto.WorkingHours;

public class Main {
	
	
	public static void main(String args[]) throws JsonGenerationException, JsonMappingException, IOException {
		
		String json = "{" +
				"	\"id\": 6783," +
				"	\"segment_factor_number\": 1.0," +
				"	\"step\": 8," +
				"	\"plan\": \"small\"," +
				"	\"type\": \"on_demand\"," +
				"	\"created_at\": \"2017-06-10T10:20:03.536Z\"," +
				"	\"client\": {" +
				"		\"name\": \"IGREJA UNIVERSAL DO REINO DE DEUS\"," +
				"		\"t_code\": \"TEZOXW\"," +
				"		\"type\": \"CLIENTE\"," +
				"		\"category\": \"client\"," +
				"		\"email\": \"MSOUSA@UNIVERSAL.ORG.BR\"," +
				"		\"in_datacenter\": false," +
				"		\"consultant\": {" +
				"			\"t_code\": \"T12549\"," +
				"			\"name\": \"MONICA BAZANI\"" +
				"		}," +
				"		\"cnpj\": \"29744778006802\"" +
				"	}," +
				"	\"install_type\": \"new\"," +
				"	\"source_type\": null," +
				"	\"modality\": \"variable\"," +
				"	\"stages\": [\"production\"]," +
				"	\"user\": {" +
				"		\"category\": \"consultant\"" +
				"	}," +
				"	\"database\": {" +
				"		\"name\": \"MySql\"," +
				"		\"tag\": \"mysql\"" +
				"	}," +
				"	\"support\": {" +
				"		\"name\": \"Serviço Gerenciado Padrão\"," +
				"		\"tag\": \"standard_support\"" +
				"	}," +
				"	\"manifest\": [{" +
				"		\"hardware\": {" +
				"			\"core_instance\": [{" +
				"				\"kind\": 2," +
				"				\"ebses\": [{" +
				"					\"size\": 20," +
				"					\"device\": \"so\"," +
				"					\"storage_type\": \"gp2\"" +
				"				}, {" +
				"					\"size\": 30," +
				"					\"device\": \"/dev/sdf\"," +
				"					\"storage_type\": \"gp2\"" +
				"				}]," +
				"				\"additional\": false" +
				"			}]," +
				"			\"core_instance_elastic\": []," +
				"			\"core_service\": []," +
				"			\"core_service_elastic\": []," +
				"			\"in_transfer\": 30," +
				"			\"out_transfer\": 30," +
				"			\"transfer_public_ip_elastic_ip\": 30," +
				"			\"load_balancer\": 30," +
				"			\"databases\": [{" +
				"				\"kind\": 1," +
				"				\"database_id\": 3," +
				"				\"size\": 25," +
				"				\"backup\": {" +
				"					\"size\": 25," +
				"					\"interval\": 5" +
				"				}" +
				"			}]" +
				"		}," +
				"		\"stage\": \"production\"" +
				"	}]," +
				"	\"working_hours\": [{" +
				"		\"hours\": {" +
				"			\"sun\": []," +
				"			\"mon\": [8, 18]," +
				"			\"tue\": [8, 18]," +
				"			\"wed\": [8, 18]," +
				"			\"thu\": [8, 18]," +
				"			\"fri\": [8, 18]," +
				"			\"sat\": []" +
				"		}," +
				"		\"stage\": \"production\"" +
				"	}]," +
				"	\"rampup_hours\": [{" +
				"		\"hours\": {" +
				"			\"sun\": []," +
				"			\"mon\": []," +
				"			\"tue\": []," +
				"			\"wed\": []," +
				"			\"thu\": []," +
				"			\"fri\": []," +
				"			\"sat\": []" +
				"		}," +
				"		\"stage\": \"production\"" +
				"	}]," +
				"	\"expiration_date\": \"10/07/2017\"," +
				"	\"product\": {" +
				"		\"id\": 2," +
				"		\"name\": \"fluig\"" +
				"	}," +
				"	\"product_version\": \"latest\"," +
				"	\"provider\": {" +
				"		\"name\": \"aws\"" +
				"	}," +
				"	\"services\": []," +
				"	\"reviewable\": true," +
				"	\"editable\": false," +
				"	\"clonable\": true," +
				"	\"in_use\": false," +
				"	\"approved\": true," +
				"	\"available\": true," +
				"	\"current_status\": \"finished\"," +
				"	\"connections\": 30," +
				"	\"stats\": {" +
				"		\"volume\": 50," +
				"		\"database\": 25," +
				"		\"backup\": 25," +
				"		\"network_transfer\": 30" +
				"	}," +
				"	\"instances\": {" +
				"		\"total\": 1," +
				"		\"production\": 1," +
				"		\"development\": 0," +
				"		\"qa\": 0," +
				"		\"additional\": 0," +
				"		\"extra\": {" +
				"			\"portal\": 0," +
				"			\"total\": 0" +
				"		}" +
				"	}," +
				"	\"contact\": {" +
				"		\"name\": \"antonio\"," +
				"		\"phone\": \"11975755667\"," +
				"		\"email\": \"antonio.mariano@totvs.com.br\"" +
				"	}," +
				"	\"summary\": {" +
				"		\"question\": null," +
				"		\"additional_information\": null" +
				"	}," +
				"	\"predictability\": {" +
				"		\"additional_load_limit\": false," +
				"		\"additional_load\": 0," +
				"		\"additional_days\": []," +
				"		\"additional_load_alert_value\": 1.0," +
				"		\"scheduled_additional_load\": false" +
				"	}," +
				"	\"advanced\": {" +
				"		\"docs_qtt\": 0," +
				"		\"pub_docs_average_month\": 0," +
				"		\"pub_docs_size_average\": 0," +
				"		\"workflow_qtt\": 0," +
				"		\"proccess_init_average_month\": 0," +
				"		\"pages_access_average\": 0," +
				"		\"communities_qtt\": 0," +
				"		\"communities_pub_average\": 0," +
				"		\"email\": false," +
				"		\"installed_operational_system\": \"\"," +
				"		\"other_system_names\": \"\"," +
				"		\"totvs_system_integration\": false," +
				"		\"other_system_integration\": false," +
				"		\"fluig_data\": 1," +
				"		\"database_size\": 1," +
				"		\"product\": \"fluig\"" +
				"	}" +
				"}";
		
		
		ObjectMapper mapper = new ObjectMapper();
		SimulationDTO simulation = null;
		simulation = mapper.readValue(json, SimulationDTO.class);
		
		CreateEnvironmentDTO createEnvironmentDTO = new CreateEnvironmentDTO();
		createEnvironmentDTO.setProductId(simulation.getProduct().getId());
		createEnvironmentDTO.setProductVersion(simulation.getProductVersion());
		createEnvironmentDTO.setCustomerCompany(new CustomerCompany(simulation.getClient().getCnpj(), simulation.getClient().getEmail(), simulation.getClient().getName()));
		createEnvironmentDTO.setProviderParams(new ProviderParams("envCreationDTO.getLanguage();"));
		createEnvironmentDTO.setProviderParams(new ProviderParams("cloudAccountId"));
		
		String[] additionalCapacityDays = new String[1];
		Manifest[] manifest = simulation.getManifest();
 		WorkingHours[] workingHours = simulation.getWorkingHours();
 		RampupHours[] rampupHours = simulation.getRampupHours();
		WorkingHoursEnvironment workingHoursEnvironment = new WorkingHoursEnvironment(workingHours[0].getHours().getWed()
				                                                                       , workingHours[0].getHours().getFri()
				                                                                       , workingHours[0].getHours().getMon()
				                                                                       , workingHours[0].getHours().getSat()
				                                                                       , workingHours[0].getHours().getSun()
				                                                                       , workingHours[0].getHours().getThu()
				                                                                       , workingHours[0].getHours().getTue());
		
		
		WarmUps warmUps = new WarmUps(rampupHours[0].getHours().getMon()
				                     , rampupHours[0].getHours().getTue()
				                     , rampupHours[0].getHours().getWed()
				                     , rampupHours[0].getHours().getThu()
				                     , rampupHours[0].getHours().getFri()
				                     , rampupHours[0].getHours().getSat()
				                     , rampupHours[0].getHours().getSun());
		
		Storages[] storages = new Storages[1];
		DatabasesEnvironment[] databasesEnvironment = new DatabasesEnvironment[1];
		InstancesEnvironment[] instancesEnvironment = new InstancesEnvironment[1];
		String[] scalingInstances = new String[1];
		
		Production production = new Production(workingHoursEnvironment
				                              , "maxCoreInstanceElastic"
				                              , "maxInstances"
				                              , warmUps
				                              , scalingInstances
				                              , "maxCoreServiceElastic"
				                              , databasesEnvironment
				                              , instancesEnvironment);
		
		
		
		Simulation simulationDTO = new Simulation("billingType"
				                                  , "costAlert"
				                                  , "scalingType"
				                                  , simulation.getConnections()
				                                  , "additionalCapacity"
				                                  , "alertEnabled"
				                                  , new Stages(production)
				                                  , additionalCapacityDays
				                                  , "segmentFactorNumber"
				                                  , "numberOfDevices");
		
		
		createEnvironmentDTO.setSimulation(simulationDTO);
		
		
		System.out.println(createEnvironmentDTO.toString());
		String jsonInString = mapper.writeValueAsString(createEnvironmentDTO);
		byte[] envCreationBody = jsonInString.getBytes();
		System.out.println(envCreationBody);
		
		//System.out.println(simulation.toString());
		//String jsonInString = mapper.writeValueAsString(simulation);
		//System.out.println(jsonInString);
		 
		
		
		
		

	}

	private static void create_environment() throws IOException, JsonParseException, JsonMappingException,
			JsonGenerationException {
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
