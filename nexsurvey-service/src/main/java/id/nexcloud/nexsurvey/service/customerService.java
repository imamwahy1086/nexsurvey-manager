package id.nexcloud.nexsurvey.service;

import java.io.IOException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Optional;

import org.hibernate.proxy.HibernateProxy;
import org.joda.time.DateTime;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.TypeAdapter;
import com.google.gson.stream.JsonReader;

import id.nexcloud.nexsurvey.entity.jpa.competitor;
import id.nexcloud.nexsurvey.entity.jpa.customer;
import id.nexcloud.nexsurvey.entity.jpa.customerView;
import id.nexcloud.nexsurvey.entity.jpa.noteStore;
import id.nexcloud.nexsurvey.helper.DateHelper;
import id.nexcloud.nexsurvey.repository.jpa.competitorRepo;
import id.nexcloud.nexsurvey.repository.jpa.customerRepo;
import id.nexcloud.nexsurvey.repository.jpa.customerViewRepo;
import id.nexcloud.nexsurvey.repository.jpa.noteStoreRepo;
import id.nexcloud.nexsurvey.repository.jpa.productStoreRepo;
import id.nexcloud.nexsurvey.repository.jpa.promotionRepo;
import id.nexcloud.nexsurvey.service.helper.HibernateProxyTypeAdapter;
import lombok.RequiredArgsConstructor;

@Service("customerService")
@RequiredArgsConstructor
public class customerService {

	@Autowired
	customerRepo customerRepo;

	@Autowired
	customerViewRepo customerViewRepo;
	
	@Autowired
	noteStoreRepo noteStoreRepo;

	@Autowired
	promotionRepo promotionRepo;

	@Autowired
	competitorRepo competitorRepo;
	
	@Autowired
	productStoreRepo productStoreRepo;

	public String findByPrincipalIDAndDistributorIDAndCustomerCode(String principalID, String distributorID,
			String customerID) {
		List<customer> listCust = customerRepo.findByPrincipalIDAndDistributorIDAndCustomerCode(principalID,
				distributorID, customerID);
		System.out.println("cek list = "+listCust.size());
		System.out.println("json = ");
		Gson g = new Gson();
		System.out.println("json2 = ");
		String json = g.toJson(listCust);
		System.out.println("json = "+json);
		return json;
	}
	public String findVisitDate(String principalID, String distributorID, String customerID ) {
		String ret ="";
		List<Object[]> listDate = customerViewRepo.findVisitDate(principalID, distributorID, customerID);
		Gson g = new Gson();
		String json = g.toJson(listDate);
		System.out.println(json);
		return json;
	}
	
	public String findByPrincipalIDAndDistributorID(String principalID, String distributorID) {
		DateTime dt = new DateTime();
		dt = dt.minusMonths(1);
		
		Timestamp from = new Timestamp(dt.getMillis());
//		String send = DateHelper.convertTimestampToString(end, "yyyy-MM-dd");
//		String sfrom = DateHelper.convertTimestampToString(end, "yyyy-MM-dd");
		List<customerView> listCust = customerViewRepo.findByPrincipalIDAndDistributorID
		(principalID,distributorID,from,new Timestamp(new Date().getTime()));
//		listCust.forEach(c -> {
//			c.setListMsl(null);
//			c.setListNote(null);
//			c.setListProd(null);
//			c.setListPromo(null);
//		});
		Gson g = new Gson();
		String json = g.toJson(listCust);
		return json;
	}
	@Transactional
	public void saveCustomer(customer cust) {
		customer c = customerRepo.findByPrincipalIDAndDistributorIDAndCustomerCodeAndVisitDate(cust.getPrincipalID(),
				cust.getDistributorID(), cust.getCustomerCode(), cust.getVisitDate());
		if (c != null) {
			System.out.println("c.getid = "+c.getId());
			customerRepo.delete(c);
			if(c.getListPromo()!=null && c.getListPromo().size()>0)promotionRepo.deleteAll(c.getListPromo());
			if(c.getListNote()!=null && c.getListNote().size()>0)noteStoreRepo.deleteAll(c.getListNote());
			if(c.getListProd()!=null && c.getListProd().size()>0)productStoreRepo.deleteAll(c.getListProd());
			if(c.getListCompetitor()!=null && c.getListCompetitor().size()>0)competitorRepo.deleteAll(c.getListCompetitor());
			
		}
			customerRepo.save(cust);

			customer cu = customerRepo.findByPrincipalIDAndDistributorIDAndCustomerCodeAndVisitDate(cust.getPrincipalID(),
					cust.getDistributorID(), cust.getCustomerCode(), cust.getVisitDate());			
			System.out.println("getID = "+cu.getId());
			cust.getListPromo().forEach(promo -> promo.setCustomer_ID(cu.getId()));
			cust.getListNote().forEach(note -> note.setCustomer_ID(cu.getId()));
			cust.getListProd().forEach(prod -> prod.setCustomer_ID(cu.getId()));
			cust.getListCompetitor().forEach(competitor -> competitor.setCustomer_ID(cu.getId()));
			promotionRepo.saveAll(cust.getListPromo());
			noteStoreRepo.saveAll(cust.getListNote());
			productStoreRepo.saveAll(cust.getListProd());
			competitorRepo.saveAll(cust.getListCompetitor());
			
	}
	
	public String findByID(long id) {
		customer cust = customerRepo.getOne(id);

		customer c = customerRepo.findByPrincipalIDAndDistributorIDAndCustomerCodeAndVisitDate(cust.getPrincipalID(),
				cust.getDistributorID(), cust.getCustomerCode(), cust.getVisitDate());
		System.out.println(c);
		GsonBuilder b = new GsonBuilder();
		b.registerTypeAdapterFactory(HibernateProxyTypeAdapter.FACTORY);
		Gson gson = b.create();
		String json =gson.toJson(c);
		return json;
	}

}
