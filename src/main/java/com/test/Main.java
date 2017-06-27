package com.test;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jettison.json.JSONException;

import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.test.environment.dto.CreateEnvironmentDTO;
import com.test.environment.dto.CustomerCompany;
import com.test.environment.dto.ProductParams;
import com.test.environment.dto.ProviderParams;

public class Main {

	public static void main(String args[]) throws JsonGenerationException, JsonMappingException, IOException,
			JSONException {

		
		//create_environment();
		
		
		String json = "{" + "    \"product_id\": \"1\"," + "    \"product_version\": \"12.1.014\","
				+ "    \"provider_name\": \"totvs_cloud\"," + "    \"customer_company\": {"
				+ "        \"federal_id\": \"432432432423432432\"," + "        \"corporate_name\": \"ADTSYS\","
				+ "        \"email\": \"otoniel.isidoro@adtsys.com.br\"" + "    }," + "    \"product_params\": {"
				+ "        \"language\": \"portuguese\"" + "    }," + "    \"provider_params\": {"
				+ "        \"totvs_cloud_project_id\": \"c87527d7-1a91-44cb-985d-4d74110d6a68\"" + "    },"
				+ "    \"simulation\": {" + "        \"id\": 6425," + "        \"segment_factor_number\": 1,"
				+ "        \"step\": null," + "        \"plan\": null," + "        \"type\": \"intera\","
				+ "        \"created_at\": \"2016-11-29T09:41:36.404Z\"," + "        \"client\": {"
				+ "            \"name\": \"PHARMAINOX INDUSTRIA E COMERCIO DE EQUIPAMENTOS LTDA\","
				+ "            \"t_code\": \"TEZNRH\"," + "            \"type\": \"CLIENTE\","
				+ "            \"category\": \"client\"," + "            \"email\": \"PHARMAINOX@PHARMAINOX.COM.BR\","
				+ "            \"in_datacenter\": false," + "            \"consultant\": {"
				+ "                \"t_code\": \"T04027\"," + "                \"name\": \"LAIS DECRESCI\""
				+ "            }," + "            \"cnpj\": \"07787590000193\"" + "        },"
				+ "        \"install_type\": \"new\"," + "        \"source_type\": null,"
				+ "        \"modality\": \"fixed\"," + "        \"stages\": [" + "            \"production\","
				+ "            \"qa\"" + "        ]," + "        \"user\": {" + "            \"category\": null"
				+ "        }," + "        \"database\": {" + "            \"name\": \"Microsoft SQL Server\","
				+ "            \"tag\": \"sqlserver\"" + "        }," + "        \"support\": {"
				+ "            \"name\": \"Serviço Gerenciado Padrão\"," + "            \"tag\": \"standard_support\""
				+ "        }," + "        \"manifest\": [" + "            {" + "                \"hardware\": {"
				+ "                    \"core_instance\": [" + "                        {"
				+ "                            \"kind\": 1," + "                            \"ebses\": ["
				+ "                                {" + "                                    \"size\": 20,"
				+ "                                    \"device\": \"so\","
				+ "                                    \"storage_type\": \"gp2\""
				+ "                                }," + "                                {"
				+ "                                    \"size\": 70,"
				+ "                                    \"device\": \"/dev/sdf\","
				+ "                                    \"storage_type\": \"gp2\"" + "                                }"
				+ "                            ]," + "                            \"additional\": false"
				+ "                        }" + "                    ],"
				+ "                    \"core_instance_elastic\": []," + "                    \"core_service\": [],"
				+ "                    \"core_service_elastic\": []," + "                    \"in_transfer\": 30,"
				+ "                    \"out_transfer\": 30,"
				+ "                    \"transfer_public_ip_elastic_ip\": 30,"
				+ "                    \"load_balancer\": 30," + "                    \"databases\": ["
				+ "                        {" + "                            \"kind\": 3,"
				+ "                            \"database_id\": 1," + "                            \"size\": 75,"
				+ "                            \"backup\": null" + "                        }"
				+ "                    ]" + "                }," + "                \"stage\": \"qa\""
				+ "            }," + "            {" + "                \"hardware\": {"
				+ "                    \"core_instance\": [" + "                        {"
				+ "                            \"kind\": 1," + "                            \"ebses\": ["
				+ "                                {" + "                                    \"size\": 0,"
				+ "                                    \"device\": \"so\","
				+ "                                    \"storage_type\": \"gp2\""
				+ "                                }," + "                                {"
				+ "                                    \"size\": 70,"
				+ "                                    \"device\": \"/dev/sdf\","
				+ "                                    \"storage_type\": \"gp2\"" + "                                }"
				+ "                            ]," + "                            \"additional\": false"
				+ "                        }" + "                    ],"
				+ "                    \"core_instance_elastic\": []," + "                    \"core_service\": [],"
				+ "                    \"core_service_elastic\": []," + "                    \"in_transfer\": 50,"
				+ "                    \"out_transfer\": 50,"
				+ "                    \"transfer_public_ip_elastic_ip\": 50,"
				+ "                    \"load_balancer\": 30," + "                    \"databases\": ["
				+ "                        {" + "                            \"kind\": 3,"
				+ "                            \"database_id\": 1," + "                            \"size\": 0,"
				+ "                            \"backup\": {" + "                                \"size\": 0,"
				+ "                                \"interval\": 5" + "                            }"
				+ "                        }" + "                    ]" + "                },"
				+ "                \"stage\": \"production\"" + "            }" + "        ],"
				+ "        \"working_hours\": [" + "            {" + "                \"hours\": {"
				+ "                    \"sun\": [" + "                        0," + "                        24"
				+ "                    ]," + "                    \"mon\": [" + "                        0,"
				+ "                        24" + "                    ]," + "                    \"tue\": ["
				+ "                        0," + "                        24" + "                    ],"
				+ "                    \"wed\": [" + "                        0," + "                        24"
				+ "                    ]," + "                    \"thu\": [" + "                        0,"
				+ "                        24" + "                    ]," + "                    \"fri\": ["
				+ "                        0," + "                        24" + "                    ],"
				+ "                    \"sat\": [" + "                        0," + "                        24"
				+ "                    ]" + "                }," + "                \"stage\": \"qa\""
				+ "            }," + "            {" + "                \"hours\": {"
				+ "                    \"sun\": [" + "                        0," + "                        24"
				+ "                    ]," + "                    \"mon\": [" + "                        0,"
				+ "                        24" + "                    ]," + "                    \"tue\": ["
				+ "                        0," + "                        24" + "                    ],"
				+ "                    \"wed\": [" + "                        0," + "                        24"
				+ "                    ]," + "                    \"thu\": [" + "                        0,"
				+ "                        24" + "                    ]," + "                    \"fri\": ["
				+ "                        0," + "                        24" + "                    ],"
				+ "                    \"sat\": [" + "                        0," + "                        24"
				+ "                    ]" + "                }," + "                \"stage\": \"production\""
				+ "            }" + "        ]," + "        \"rampup_hours\": [" + "            {"
				+ "                \"hours\": {" + "                    \"sun\": [],"
				+ "                    \"mon\": []," + "                    \"tue\": [],"
				+ "                    \"wed\": []," + "                    \"thu\": [],"
				+ "                    \"fri\": []," + "                    \"sat\": []" + "                },"
				+ "                \"stage\": \"qa\"" + "            }," + "            {"
				+ "                \"hours\": {" + "                    \"sun\": [],"
				+ "                    \"mon\": []," + "                    \"tue\": [],"
				+ "                    \"wed\": []," + "                    \"thu\": [],"
				+ "                    \"fri\": []," + "                    \"sat\": []" + "                },"
				+ "                \"stage\": \"production\"" + "            }" + "        ],"
				+ "        \"expiration_date\": \"29/12/2016\"," + "        \"product\": {" + "            \"id\": 1,"
				+ "            \"name\": \"protheus\"" + "        }," + "        \"product_version\": \"12.1.007\","
				+ "        \"provider\": {" + "            \"name\": \"totvs_cloud\"" + "        },"
				+ "        \"services\": []," + "        \"reviewable\": false," + "        \"editable\": false,"
				+ "        \"clonable\": true," + "        \"in_use\": false," + "        \"approved\": true,"
				+ "        \"available\": true," + "        \"current_status\": \"expired\","
				+ "        \"connections\": 1," + "        \"stats\": {" + "            \"volume\": 90,"
				+ "            \"database\": 75," + "            \"backup\": 75,"
				+ "            \"network_transfer\": 30" + "        }," + "        \"instances\": {"
				+ "            \"total\": 2," + "            \"production\": 1," + "            \"development\": 0,"
				+ "            \"qa\": 1," + "            \"additional\": 0," + "            \"extra\": {"
				+ "                \"portal\": 0," + "                \"total\": 0" + "            }" + "        },"
				+ "        \"contact\": {" + "            \"name\": null," + "            \"phone\": null,"
				+ "            \"email\": null" + "        }," + "        \"summary\": {"
				+ "            \"question\": null," + "            \"additional_information\": null" + "        },"
				+ "        \"predictability\": {" + "            \"additional_load_limit\": false,"
				+ "            \"additional_load\": 0," + "            \"additional_days\": [],"
				+ "            \"additional_load_alert_value\": 1,"
				+ "            \"scheduled_additional_load\": false" + "        }," + "        \"advanced\": {"
				+ "            \"software_integration\": false," + "            \"tss_at_installation\": false,"
				+ "            \"protheus_data\": 1," + "            \"database_size\": 1,"
				+ "            \"product\": \"protheus\"" + "        }" + "    }" + "}";

		JsonParser jsonParser = new JsonParser();
		JsonObject jsonArray = (JsonObject) jsonParser.parse(json);

		CreateEnvironmentDTO createEnvironmentDTO = new CreateEnvironmentDTO(
				"Integer.toString(simulador.getProduct().getId())", "productVersion", "totvs_cloud",
				new CustomerCompany("simulador.getClient().getCnpj()", "simulador.getClient().getEmail()",
						"simulador.getClient().getName()"), new ProductParams("language"), new ProviderParams(
						"cloudAccountId"), jsonArray);

		Gson gson = new Gson();

		System.out.println(gson.toJson(createEnvironmentDTO));

	}

	private static void create_environment() throws IOException, JsonParseException, JsonMappingException,
			JsonGenerationException {

		String json = "{" + "    \"product_id\": \"2\"," + "    \"product_version\": \"productVersion\","
				+ "    \"provider_name\": \"totvs_cloud\"," + "    \"customer_company\": {"
				+ "        \"federal_id\": \"29744778006802\","
				+ "        \"corporate_name\": \"MSOUSA@UNIVERSAL.ORG.BR\","
				+ "        \"email\": \"IGREJA UNIVERSAL DO REINO DE DEUS\"" + "    }," + "    \"product_params\": {"
				+ "        \"language\": \"language\"" + "    }," + "    \"provider_params\": {"
				+ "        \"totvs_cloud_project_id\": \"cloudAccountId\"" + "    }," + "    \"simulation\": {"
				+ "        \"scaling_type\": \"fixed\"," + "        \"billing_type\": \"default\","
				+ "        \"alert_enabled\": \"informed\"," + "        \"additional_capacity\": 50,"
				+ "        \"additional_capacity_days\": []," + "        \"cost_alert\": 0,"
				+ "        \"max_number_of_devices\": 30," + "        \"number_of_devices\": 130,"
				+ "        \"segment_factor_number\": 1," + "        \"stages\": {" + "            \"production\": {"
				+ "                \"max_instances\": 1," + "                \"max_core_instance_elastic\": 0,"
				+ "                \"max_core_service_elastic\": 0," + "                \"databases\": ["
				+ "                    {" + "                        \"tags\": {"
				+ "                            \"configuration_type\": \"database\"" + "                        },"
				+ "                        \"flavour\": \"jis.database.medium_a\","
				+ "                        \"engine\": \"sqlserver\"," + "                        \"storage_size\": 75"
				+ "                    }" + "                ]," + "                \"instances\": ["
				+ "                    {" + "                        \"tags\": {"
				+ "                            \"configuration_type\": \"core_instance\""
				+ "                        }," + "                        \"flavour\": \"jis.instance.medium_a\","
				+ "                        \"storages\": [" + "                            {"
				+ "                                \"tags\": {"
				+ "                                    \"configuration_type\": \"so\""
				+ "                                },"
				+ "                                \"type\": \"jis.storage.ssd_a\","
				+ "                                \"size\": 10,"
				+ "                                \"additional\": false" + "                            },"
				+ "                            {" + "                                \"tags\": {"
				+ "                                    \"configuration_type\": \"additional\""
				+ "                                },"
				+ "                                \"type\": \"jis.storage.ssd_a\","
				+ "                                \"size\": 70,"
				+ "                                \"additional\": true" + "                            }"
				+ "                        ]" + "                    }" + "                ],"
				+ "                \"scaling_instances\": []," + "                \"working_hours\": {"
				+ "                    \"seg\": [" + "                        0," + "                        23"
				+ "                    ]," + "                    \"ter\": [" + "                        0,"
				+ "                        23" + "                    ]," + "                    \"qua\": ["
				+ "                        0," + "                        23" + "                    ],"
				+ "                    \"qui\": [" + "                        0," + "                        23"
				+ "                    ]," + "                    \"sex\": [" + "                        0,"
				+ "                        23" + "                    ]," + "                    \"sab\": ["
				+ "                        0," + "                        23" + "                    ],"
				+ "                    \"dom\": [" + "                        0," + "                        23"
				+ "                    ]" + "                }," + "                \"warm_ups\": {"
				+ "                    \"seg\": []," + "                    \"ter\": [],"
				+ "                    \"qua\": []," + "                    \"qui\": [],"
				+ "                    \"sex\": []," + "                    \"sab\": [],"
				+ "                    \"dom\": []" + "                }" + "            }," + "            \"qa\": {"
				+ "                \"max_instances\": 1," + "                \"max_core_instance_elastic\": 0,"
				+ "                \"max_core_service_elastic\": 0," + "                \"databases\": ["
				+ "                    {" + "                        \"tags\": {"
				+ "                            \"configuration_type\": \"database\"" + "                        },"
				+ "                        \"flavour\": \"jis.database.medium_a\","
				+ "                        \"engine\": \"sqlserver\"," + "                        \"storage_size\": 75"
				+ "                    }" + "                ]," + "                \"instances\": ["
				+ "                    {" + "                        \"tags\": {"
				+ "                            \"configuration_type\": \"core_instance\""
				+ "                        }," + "                        \"flavour\": \"jis.instance.medium_a\","
				+ "                        \"storages\": [" + "                            {"
				+ "                                \"tags\": {"
				+ "                                    \"configuration_type\": \"so\""
				+ "                                },"
				+ "                                \"type\": \"jis.storage.ssd_a\","
				+ "                                \"size\": 10,"
				+ "                                \"additional\": false" + "                            },"
				+ "                            {" + "                                \"tags\": {"
				+ "                                    \"configuration_type\": \"additional\""
				+ "                                },"
				+ "                                \"type\": \"jis.storage.ssd_a\","
				+ "                                \"size\": 70,"
				+ "                                \"additional\": true" + "                            }"
				+ "                        ]" + "                    }" + "                ],"
				+ "                \"scaling_instances\": []," + "                \"working_hours\": {"
				+ "                    \"seg\": [" + "                        0," + "                        23"
				+ "                    ]," + "                    \"ter\": [" + "                        0,"
				+ "                        23" + "                    ]," + "                    \"qua\": ["
				+ "                        0," + "                        23" + "                    ],"
				+ "                    \"qui\": [" + "                        0," + "                        23"
				+ "                    ]," + "                    \"sex\": [" + "                        0,"
				+ "                        23" + "                    ]," + "                    \"sab\": ["
				+ "                        0," + "                        23" + "                    ],"
				+ "                    \"dom\": [" + "                        0," + "                        23"
				+ "                    ]" + "                }," + "                \"warm_ups\": {"
				+ "                    \"seg\": []," + "                    \"ter\": [],"
				+ "                    \"qua\": []," + "                    \"qui\": [],"
				+ "                    \"sex\": []," + "                    \"sab\": [],"
				+ "                    \"dom\": []" + "                }" + "            }" + "        }" + "    }"
				+ "}";

		ObjectMapper mapper = new ObjectMapper();
		CreateEnvironmentDTO environment = mapper.readValue(json, CreateEnvironmentDTO.class);

		System.out.println(environment.toString());

		String jsonInString = mapper.writeValueAsString(environment);

		System.out.println(jsonInString);
	}

}
