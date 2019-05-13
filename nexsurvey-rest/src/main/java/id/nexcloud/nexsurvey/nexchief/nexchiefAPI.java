package id.nexcloud.nexsurvey.nexchief;

import java.lang.reflect.Type;

import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.google.common.reflect.TypeToken;
import com.google.gson.Gson;

import id.nexcloud.nexsurvey.controller.helper.ResponseHelper;
import id.nexcloud.nexsurvey.entity.jpa.customer;
import id.nexcloud.nexsurvey.response.NexResponse;
import id.nexcloud.nexsurvey.service.customerService;

@RestController
@RequestMapping("/nexchief")
public class nexchiefAPI {
	@Autowired
	customerService customerService;
	
	@PostMapping("/getCustomer")
	@ResponseBody
	public String getCustomer(@RequestBody String body) throws ParseException {
		JSONParser parser = new JSONParser();
		JSONObject job = (JSONObject) parser.parse(body);
		String principalID = (String)job.get("principalID");
		String distributorID = (String)job.get("distributorID");
		
		return customerService.findByPrincipalIDAndDistributorID(principalID, distributorID);
	}

	@PostMapping("/getDate")
	@ResponseBody
	public String getDate(@RequestBody String body) throws ParseException {
		JSONParser parser = new JSONParser();
		JSONObject job = (JSONObject) parser.parse(body);
		String principalID = (String)job.get("principalID");
		String distributorID = (String)job.get("distributorID");
		String customerID = (String)job.get("customerID");

		return customerService.findVisitDate(principalID, distributorID, customerID);
	}

	@GetMapping("/get/{id}")
	public String findById(@PathVariable Long id) {
		return customerService.findByID(id);
		
	}
	

}
