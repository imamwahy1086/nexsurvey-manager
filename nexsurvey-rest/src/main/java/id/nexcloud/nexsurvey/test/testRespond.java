package id.nexcloud.nexsurvey.test;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.security.servlet.SecurityAutoConfiguration;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.google.gson.Gson;

import id.nexcloud.nexsurvey.entity.jpa.customer;
import id.nexcloud.nexsurvey.service.customerService;

@RestController
@RequestMapping("/document")
public class testRespond {
	@Autowired
	customerService customerService;
	
	@GetMapping("/test")
	public String test() {
		return customerService.findByPrincipalIDAndDistributorIDAndCustomerCode("NESTLE01", "DIST01","CUST01") ;
	}
	
}
