package com.test;

import java.io.IOException;

import org.codehaus.jackson.JsonGenerationException;
import org.codehaus.jackson.JsonParseException;
import org.codehaus.jackson.map.JsonMappingException;
import org.codehaus.jackson.map.ObjectMapper;
import org.codehaus.jettison.json.JSONException;
import org.json.JSONObject;

import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.test.environment.dto.CreateEnvironmentDTO;
import com.test.environment.dto.CustomerCompany;
import com.test.environment.dto.ProductParams;
import com.test.environment.dto.ProviderParams;

public class Main {

	public static void main(String args[]) throws JsonGenerationException, JsonMappingException, IOException,
			JSONException, org.json.JSONException {

	
		String json = "{\n" + 
				"    \"simulation\": {\n" + 
				"        \"scaling_type\": \"fixed\",\n" + 
				"        \"billing_type\": \"intera\",\n" + 
				"        \"alert_enabled\": 0,\n" + 
				"        \"additional_capacity\": 0,\n" + 
				"        \"additional_capacity_days\": [],\n" + 
				"        \"cost_alert\": 0,\n" + 
				"        \"max_number_of_devices\": 1,\n" + 
				"        \"number_of_devices\": 1,\n" + 
				"        \"segment_factor_number\": 1,\n" + 
				"        \"stages\": {\n" + 
				"            \"development\": {\n" + 
				"                \"max_instances\": 8,\n" + 
				"                \"max_core_instance_elastic\": 0,\n" + 
				"                \"max_core_service_elastic\": 0,\n" + 
				"                \"databases\": [\n" + 
				"                    {\n" + 
				"                        \"tags\": {\n" + 
				"                            \"configuration_type\": \"database\"\n" + 
				"                        },\n" + 
				"                        \"flavour\": \"jis.database.micro_b\",\n" + 
				"                        \"engine\": \"Microsoft SQL Server\",\n" + 
				"                        \"storage_size\": 50\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"instances\": [\n" + 
				"                    {\n" + 
				"                        \"tags\": {\n" + 
				"                            \"configuration_type\": \"core_instance\"\n" + 
				"                        },\n" + 
				"                        \"flavour\": \"jis.instance.small_a\",\n" + 
				"                        \"storages\": [\n" + 
				"                            {\n" + 
				"                                \"tags\": {\n" + 
				"                                    \"configuration_type\": \"so\"\n" + 
				"                                },\n" + 
				"                                \"type\": \"gp2\",\n" + 
				"                                \"size\": 50,\n" + 
				"                                \"additional\": false\n" + 
				"                            },\n" + 
				"                            {\n" + 
				"                                \"tags\": {\n" + 
				"                                    \"configuration_type\": \"/dev/sdf\"\n" + 
				"                                },\n" + 
				"                                \"type\": \"gp2\",\n" + 
				"                                \"size\": 70,\n" + 
				"                                \"additional\": false\n" + 
				"                            }\n" + 
				"                        ]\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"scaling_instances\": [],\n" + 
				"                \"working_hours\": {\n" + 
				"                    \"sun\": [\n" + 
				"                        0,\n" + 
				"                        0\n" + 
				"                    ],\n" + 
				"                    \"mon\": [\n" + 
				"                        0,\n" + 
				"                        0\n" + 
				"                    ],\n" + 
				"                    \"tue\": [\n" + 
				"                        0,\n" + 
				"                        0\n" + 
				"                    ],\n" + 
				"                    \"wed\": [\n" + 
				"                        0,\n" + 
				"                        0\n" + 
				"                    ],\n" + 
				"                    \"thu\": [\n" + 
				"                        0,\n" + 
				"                        0\n" + 
				"                    ],\n" + 
				"                    \"fri\": [\n" + 
				"                        0,\n" + 
				"                        0\n" + 
				"                    ],\n" + 
				"                    \"sat\": [\n" + 
				"                        0,\n" + 
				"                        0\n" + 
				"                    ]\n" + 
				"                },\n" + 
				"                \"warm_ups\": {\n" + 
				"                    \"sun\": [],\n" + 
				"                    \"mon\": [],\n" + 
				"                    \"tue\": [],\n" + 
				"                    \"wed\": [],\n" + 
				"                    \"thu\": [],\n" + 
				"                    \"fri\": [],\n" + 
				"                    \"sat\": []\n" + 
				"                }\n" + 
				"            },\n" + 
				"            \"production\": {\n" + 
				"                \"max_instances\": 8,\n" + 
				"                \"max_core_instance_elastic\": 0,\n" + 
				"                \"max_core_service_elastic\": 0,\n" + 
				"                \"databases\": [\n" + 
				"                    {\n" + 
				"                        \"tags\": {\n" + 
				"                            \"configuration_type\": \"database\"\n" + 
				"                        },\n" + 
				"                        \"flavour\": \"jis.database.micro_b\",\n" + 
				"                        \"engine\": \"Microsoft SQL Server\",\n" + 
				"                        \"storage_size\": 50\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"instances\": [\n" + 
				"                    {\n" + 
				"                        \"tags\": {\n" + 
				"                            \"configuration_type\": \"core_instance\"\n" + 
				"                        },\n" + 
				"                        \"flavour\": \"jis.instance.medium_a\",\n" + 
				"                        \"storages\": [\n" + 
				"                            {\n" + 
				"                                \"tags\": {\n" + 
				"                                    \"configuration_type\": \"so\"\n" + 
				"                                },\n" + 
				"                                \"type\": \"gp2\",\n" + 
				"                                \"size\": 50,\n" + 
				"                                \"additional\": false\n" + 
				"                            },\n" + 
				"                            {\n" + 
				"                                \"tags\": {\n" + 
				"                                    \"configuration_type\": \"/dev/sdf\"\n" + 
				"                                },\n" + 
				"                                \"type\": \"gp2\",\n" + 
				"                                \"size\": 70,\n" + 
				"                                \"additional\": false\n" + 
				"                            }\n" + 
				"                        ]\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"scaling_instances\": [],\n" + 
				"                \"working_hours\": {\n" + 
				"                    \"sun\": [\n" + 
				"                        0,\n" + 
				"                        0\n" + 
				"                    ],\n" + 
				"                    \"mon\": [\n" + 
				"                        0,\n" + 
				"                        0\n" + 
				"                    ],\n" + 
				"                    \"tue\": [\n" + 
				"                        0,\n" + 
				"                        0\n" + 
				"                    ],\n" + 
				"                    \"wed\": [\n" + 
				"                        0,\n" + 
				"                        0\n" + 
				"                    ],\n" + 
				"                    \"thu\": [\n" + 
				"                        0,\n" + 
				"                        0\n" + 
				"                    ],\n" + 
				"                    \"fri\": [\n" + 
				"                        0,\n" + 
				"                        0\n" + 
				"                    ],\n" + 
				"                    \"sat\": [\n" + 
				"                        0,\n" + 
				"                        0\n" + 
				"                    ]\n" + 
				"                },\n" + 
				"                \"warm_ups\": {\n" + 
				"                    \"sun\": [],\n" + 
				"                    \"mon\": [],\n" + 
				"                    \"tue\": [],\n" + 
				"                    \"wed\": [],\n" + 
				"                    \"thu\": [],\n" + 
				"                    \"fri\": [],\n" + 
				"                    \"sat\": []\n" + 
				"                }\n" + 
				"            }\n" + 
				"        }\n" + 
				"    }\n" + 
				"}";

		JsonParser jsonParser = new JsonParser();
		JsonObject jsonArray = (JsonObject) jsonParser.parse(json);
		JsonElement jsonElement =  jsonArray.get("simulation");
		
		
		
		
		
		CreateEnvironmentDTO createEnvironmentDTO = new CreateEnvironmentDTO("Integer.toString(simulador.getProduct().getId())"
				                                                           , "productVersion", "totvs_cloud"
				                                                           , new CustomerCompany("simulador.getClient().getCnpj()"
				                                                        		               , "simulador.getClient().getName()"
				                                                        		               , "simulador.getClient().getEmail()")
				                                                           , new ProductParams("language")
				                                                           , jsonElement);

		Gson gson = new Gson();

		String jsonInString = gson.toJson(createEnvironmentDTO).replaceFirst("productId", "product_id")
                .replaceFirst("productVersion","product_version")
				   .replaceFirst("providerName", "provider_name")
				   .replaceFirst("customerCompany", "customer_company")
				   .replaceFirst("federalId", "federal_id")
			       .replaceFirst("corporateName", "corporate_name")
				   .replaceFirst("productParams", "product_params")
				   .replaceFirst("providerParams", "provider_params")
				   .replaceFirst("totvsCloudProjectId", "totvs_cloud_project_id")
				   .replace("mon", "seg")
				   .replace("tue", "ter")
				   .replace("wed", "qua")
				   .replace("thu", "qui")
				   .replace("fri", "sex")
				   .replace("sat", "sab")
				   .replace("sun", "dom");
				   
		
		System.out.println(jsonInString);

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
	
	
	public static void simulation() throws org.json.JSONException, JsonGenerationException, JsonMappingException, IOException  {
		
		String simulationComplete = "{\n" + 
				"    \"id\": 6797,\n" + 
				"    \"segment_factor_number\": 1,\n" + 
				"    \"step\": null,\n" + 
				"    \"plan\": null,\n" + 
				"    \"type\": \"intera\",\n" + 
				"    \"created_at\": \"2017-06-14T08:44:29.374Z\",\n" + 
				"    \"client\": {\n" + 
				"        \"name\": \"JOSE EDILSON DOS SANTOS COMERCIAL DE UTENSILIOS DOMESTICOS EPP\",\n" + 
				"        \"t_code\": \"TEZOTT\",\n" + 
				"        \"type\": \"CLIENTE\",\n" + 
				"        \"category\": \"client\",\n" + 
				"        \"email\": \"rogerio.melonio@lojaseconomica.com.br\",\n" + 
				"        \"in_datacenter\": false,\n" + 
				"        \"consultant\": {\n" + 
				"            \"t_code\": \"T13236\",\n" + 
				"            \"name\": \"ROSANGELA FELTRIN\"\n" + 
				"        },\n" + 
				"        \"cnpj\": \"25014139000115\"\n" + 
				"    },\n" + 
				"    \"install_type\": \"new\",\n" + 
				"    \"source_type\": null,\n" + 
				"    \"modality\": \"fixed\",\n" + 
				"    \"stages\": [\n" + 
				"        \"development\",\n" + 
				"        \"production\"\n" + 
				"    ],\n" + 
				"    \"user\": {\n" + 
				"        \"category\": null\n" + 
				"    },\n" + 
				"    \"database\": {\n" + 
				"        \"name\": \"Microsoft SQL Server\",\n" + 
				"        \"tag\": \"sqlserver\"\n" + 
				"    },\n" + 
				"    \"support\": {\n" + 
				"        \"name\": \"Serviço Gerenciado Padrão\",\n" + 
				"        \"tag\": \"standard_support\"\n" + 
				"    },\n" + 
				"    \"manifest\": [\n" + 
				"        {\n" + 
				"            \"hardware\": {\n" + 
				"                \"core_instance\": [\n" + 
				"                    {\n" + 
				"                        \"kind\": 1,\n" + 
				"                        \"ebses\": [\n" + 
				"                            {\n" + 
				"                                \"size\": 50,\n" + 
				"                                \"device\": \"so\",\n" + 
				"                                \"storage_type\": \"gp2\"\n" + 
				"                            },\n" + 
				"                            {\n" + 
				"                                \"size\": 70,\n" + 
				"                                \"device\": \"/dev/sdf\",\n" + 
				"                                \"storage_type\": \"gp2\"\n" + 
				"                            }\n" + 
				"                        ],\n" + 
				"                        \"additional\": false\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"core_instance_elastic\": [],\n" + 
				"                \"core_service\": [],\n" + 
				"                \"core_service_elastic\": [],\n" + 
				"                \"in_transfer\": 50,\n" + 
				"                \"out_transfer\": 50,\n" + 
				"                \"transfer_public_ip_elastic_ip\": 50,\n" + 
				"                \"load_balancer\": 30,\n" + 
				"                \"databases\": [\n" + 
				"                    {\n" + 
				"                        \"kind\": 0,\n" + 
				"                        \"database_id\": 1,\n" + 
				"                        \"size\": 50,\n" + 
				"                        \"backup\": null\n" + 
				"                    }\n" + 
				"                ]\n" + 
				"            },\n" + 
				"            \"stage\": \"development\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"hardware\": {\n" + 
				"                \"core_instance\": [\n" + 
				"                    {\n" + 
				"                        \"kind\": 2,\n" + 
				"                        \"ebses\": [\n" + 
				"                            {\n" + 
				"                                \"size\": 50,\n" + 
				"                                \"device\": \"so\",\n" + 
				"                                \"storage_type\": \"gp2\"\n" + 
				"                            },\n" + 
				"                            {\n" + 
				"                                \"size\": 70,\n" + 
				"                                \"device\": \"/dev/sdf\",\n" + 
				"                                \"storage_type\": \"gp2\"\n" + 
				"                            }\n" + 
				"                        ],\n" + 
				"                        \"additional\": false\n" + 
				"                    }\n" + 
				"                ],\n" + 
				"                \"core_instance_elastic\": [],\n" + 
				"                \"core_service\": [],\n" + 
				"                \"core_service_elastic\": [],\n" + 
				"                \"in_transfer\": 50,\n" + 
				"                \"out_transfer\": 50,\n" + 
				"                \"transfer_public_ip_elastic_ip\": 50,\n" + 
				"                \"load_balancer\": 30,\n" + 
				"                \"databases\": [\n" + 
				"                    {\n" + 
				"                        \"kind\": 0,\n" + 
				"                        \"database_id\": 1,\n" + 
				"                        \"size\": 50,\n" + 
				"                        \"backup\": {\n" + 
				"                            \"size\": 50,\n" + 
				"                            \"interval\": 5\n" + 
				"                        }\n" + 
				"                    }\n" + 
				"                ]\n" + 
				"            },\n" + 
				"            \"stage\": \"production\"\n" + 
				"        }\n" + 
				"    ],\n" + 
				"    \"working_hours\": [\n" + 
				"        {\n" + 
				"            \"hours\": {\n" + 
				"                \"dom\": [\n" + 
				"                    0,\n" + 
				"                    24\n" + 
				"                ],\n" + 
				"                \"seg\": [\n" + 
				"                    0,\n" + 
				"                    24\n" + 
				"                ],\n" + 
				"                \"ter\": [\n" + 
				"                    0,\n" + 
				"                    24\n" + 
				"                ],\n" + 
				"                \"qua\": [\n" + 
				"                    0,\n" + 
				"                    24\n" + 
				"                ],\n" + 
				"                \"qui\": [\n" + 
				"                    0,\n" + 
				"                    24\n" + 
				"                ],\n" + 
				"                \"sex\": [\n" + 
				"                    0,\n" + 
				"                    24\n" + 
				"                ],\n" + 
				"                \"sab\": [\n" + 
				"                    0,\n" + 
				"                    24\n" + 
				"                ]\n" + 
				"            },\n" + 
				"            \"stage\": \"development\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"hours\": {\n" + 
				"                \"dom\": [\n" + 
				"                    0,\n" + 
				"                    24\n" + 
				"                ],\n" + 
				"                \"seg\": [\n" + 
				"                    0,\n" + 
				"                    24\n" + 
				"                ],\n" + 
				"                \"ter\": [\n" + 
				"                    0,\n" + 
				"                    24\n" + 
				"                ],\n" + 
				"                \"qua\": [\n" + 
				"                    0,\n" + 
				"                    24\n" + 
				"                ],\n" + 
				"                \"qui\": [\n" + 
				"                    0,\n" + 
				"                    24\n" + 
				"                ],\n" + 
				"                \"sex\": [\n" + 
				"                    0,\n" + 
				"                    24\n" + 
				"                ],\n" + 
				"                \"sab\": [\n" + 
				"                    0,\n" + 
				"                    24\n" + 
				"                ]\n" + 
				"            },\n" + 
				"            \"stage\": \"production\"\n" + 
				"        }\n" + 
				"    ],\n" + 
				"    \"rampup_hours\": [\n" + 
				"        {\n" + 
				"            \"hours\": {\n" + 
				"                \"dom\": [],\n" + 
				"                \"seg\": [],\n" + 
				"                \"ter\": [],\n" + 
				"                \"qua\": [],\n" + 
				"                \"qui\": [],\n" + 
				"                \"sex\": [],\n" + 
				"                \"sab\": []\n" + 
				"            },\n" + 
				"            \"stage\": \"development\"\n" + 
				"        },\n" + 
				"        {\n" + 
				"            \"hours\": {\n" + 
				"                \"dom\": [],\n" + 
				"                \"seg\": [],\n" + 
				"                \"ter\": [],\n" + 
				"                \"qua\": [],\n" + 
				"                \"qui\": [],\n" + 
				"                \"sex\": [],\n" + 
				"                \"sab\": []\n" + 
				"            },\n" + 
				"            \"stage\": \"production\"\n" + 
				"        }\n" + 
				"    ],\n" + 
				"    \"expiration_date\": \"14/07/2017\",\n" + 
				"    \"product\": {\n" + 
				"        \"id\": 1,\n" + 
				"        \"name\": \"protheus\"\n" + 
				"    },\n" + 
				"    \"product_version\": \"12.1.016\",\n" + 
				"    \"provider\": {\n" + 
				"        \"name\": \"totvs_cloud\"\n" + 
				"    },\n" + 
				"    \"services\": [],\n" + 
				"    \"reviewable\": true,\n" + 
				"    \"editable\": false,\n" + 
				"    \"clonable\": true,\n" + 
				"    \"in_use\": false,\n" + 
				"    \"approved\": true,\n" + 
				"    \"available\": true,\n" + 
				"    \"current_status\": \"finished\",\n" + 
				"    \"connections\": 1,\n" + 
				"    \"stats\": {\n" + 
				"        \"volume\": 90,\n" + 
				"        \"database\": 75,\n" + 
				"        \"backup\": 75,\n" + 
				"        \"network_transfer\": 30\n" + 
				"    },\n" + 
				"    \"instances\": {\n" + 
				"        \"total\": 2,\n" + 
				"        \"production\": 1,\n" + 
				"        \"development\": 1,\n" + 
				"        \"qa\": 0,\n" + 
				"        \"additional\": 0,\n" + 
				"        \"extra\": {\n" + 
				"            \"portal\": 0,\n" + 
				"            \"total\": 0\n" + 
				"        }\n" + 
				"    },\n" + 
				"    \"contact\": {\n" + 
				"        \"name\": null,\n" + 
				"        \"phone\": null,\n" + 
				"        \"email\": null\n" + 
				"    },\n" + 
				"    \"summary\": {\n" + 
				"        \"question\": null,\n" + 
				"        \"additional_information\": null\n" + 
				"    },\n" + 
				"    \"predictability\": {\n" + 
				"        \"additional_load_limit\": false,\n" + 
				"        \"additional_load\": 0,\n" + 
				"        \"additional_days\": [],\n" + 
				"        \"additional_load_alert_value\": 1,\n" + 
				"        \"scheduled_additional_load\": false\n" + 
				"    },\n" + 
				"    \"advanced\": {\n" + 
				"        \"software_integration\": false,\n" + 
				"        \"tss_at_installation\": false,\n" + 
				"        \"protheus_data\": 1,\n" + 
				"        \"database_size\": 1,\n" + 
				"        \"product\": \"protheus\"\n" + 
				"    }\n" + 
				"}";
		
		
		JSONObject jsonObj = new JSONObject(simulationComplete);
		
		//JSONObject jsonObj = new JSONObject(simulationComplete);
		ObjectMapper mapper = new ObjectMapper();
		
		
		CreateEnvironmentDTO createEnvironmentDTO = new CreateEnvironmentDTO("1"
											                , "productVersion"
											                , "totvs_cloud"
											                , new CustomerCompany("clientDTO.getCnpj()"
											                		             ,"clientDTO.getEmail()"
											                                     ,"clientDTO.getName()")
											                , new ProductParams("language")
											                , new ProviderParams("cloudId")
											                , jsonObj);
		
		String jsonInString = mapper.writeValueAsString(createEnvironmentDTO);
		
		System.out.println(jsonInString);

		
		//String jsonInString = mapper.writeValueAsString(createEnvironmentDTO);
		//System.out.println(jsonInString);
		
		/*
		JsonParser jsonParser = new JsonParser();
		ObjectMapper mapper = new ObjectMapper();
		
		JsonObject jsonsimulationComplete = (JsonObject) jsonParser.parse(simulationComplete);
		JsonElement jsonElementClientSimulation =  jsonsimulationComplete.get("client");
		JsonElement jsonElementProduct =  jsonsimulationComplete.get("product");
		
		String stringProduct = jsonElementProduct.toString();
		String stringClientSimulation = jsonElementClientSimulation.toString();
		
		Client clientDTO = mapper.readValue(stringClientSimulation, Client.class);
		Product prodcutDTO = mapper.readValue(stringProduct, Product.class);
		
		System.out.println(prodcutDTO.toString());
		*/
		/*
		String simulation = cloudCalculatorService.getSimulationById(String.valueOf(calcId));
		JsonObject jsonArray = (JsonObject) jsonParser.parse(simulation);
		JsonElement jsonElement =  jsonArray.get("simulation");
		
		CreateEnvironmentDTO createEnvironmentDTO = new CreateEnvironmentDTO(Integer.toString(prodcutDTO.getId())
				                                                            , "productVersion"
				                                                            , "totvs_cloud"
				                                                            , new CustomerCompany(clientDTO.getCnpj()
				                                                            		             ,clientDTO.getEmail()
				                                                                                 ,clientDTO.getName())
				                                                            , new ProductParams(language)
				                                                            , new ProviderParams(cloudId)
				                                                            , jsonElement);
				                                                            
				                                                            */

	}
}
