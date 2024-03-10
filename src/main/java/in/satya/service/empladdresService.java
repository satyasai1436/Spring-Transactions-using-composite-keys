package in.satya.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.satya.entity.Empl;
import in.satya.entity.addres;
import in.satya.repoAddress.addressRepo;
import in.satya.repoEmpl.emplRepo;
import jakarta.transaction.Transactional;
@Service
public class empladdresService {
	@Autowired
	private emplRepo repo;
	@Autowired
	private addressRepo rep;
	
	 public void get(Integer eid) {
	        List<Object[]> all = repo.getAll(eid);
	        
	        for (Object[] objects : all) {
	            for (Object object : objects) {
	                System.out.print(object + " ");
	            }
	            System.out.println();
	        }
	    }
	
	@Transactional(rollbackOn =Exception.class)
	public void saveData() {
		//we are setting the data for Empl entity class
		Empl e=new Empl();
		e.setName("Karre");
		e.setSalary(80000.0);
		Empl ids = repo.save(e);
		System.out.println(ids);
		//int a=10/0;   
		//we are setting the data for address entity class
		addres adr=new addres();
		adr.setCity("Gummuluru");
		adr.setState("Ap");
		adr.setSal(60000.0);
		adr.setEid(ids.getId());
		rep.save(adr);
		System.out.println("Record is Saved...");
		
		
		
	}

}
