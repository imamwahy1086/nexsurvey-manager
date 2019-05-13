package id.nexcloud.nexsurvey.nexmile;

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
import com.google.gson.GsonBuilder;
import com.google.gson.JsonObject;

import id.nexcloud.nexsurvey.controller.helper.ResponseHelper;
import id.nexcloud.nexsurvey.entity.jpa.customer;
import id.nexcloud.nexsurvey.response.NexResponse;
import id.nexcloud.nexsurvey.service.customerService;

@RestController
@RequestMapping("/nexmile")
public class nexmileAPI {
	@Autowired
	customerService customerService;
	
	@PostMapping("/savedata")
	@ResponseBody
	public NexResponse saveCustomer(@RequestBody String job) {
		GsonBuilder gBuilder = new GsonBuilder().setDateFormat("yyyy-MM-dd");
		Gson g = gBuilder.create();
		Type tCust = new TypeToken<customer>() {
		}.getType();
		
		customer cust = g.fromJson(job, tCust);
		customerService.saveCustomer(cust);
		return ResponseHelper.ok();
	}

}
