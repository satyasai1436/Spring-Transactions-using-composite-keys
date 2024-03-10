package in.satya.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class addres {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer aid;
	private String city;
	private String state;
	private Double sal;
	private Integer eid;
	public Integer getAid() {
		return aid;
	}
	public void setAid(Integer aid) {
		this.aid=aid;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public Double getSal() {
		return sal;
	}
	public void setSal(Double sal) {
		this.sal = sal;
	}
	public Integer getEid() {
		return eid;
	}
	public void setEid(Integer eid) {
		this.eid = eid;
	}
	@Override
	public String toString() {
		return "addres [aid=" + aid + ", city=" + city + ", state=" + state + ", sal=" + sal + ", eid=" + eid + "]";
	}
	
	
	
	

}
