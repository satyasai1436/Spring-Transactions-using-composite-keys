package in.satya.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Empl {
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Id
	private Integer eid;
	private String name;
	private Double salary;
	public Integer getId() {
		return eid;
	}
	public void setId(Integer id) {
		this.eid = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Double getSalary() {
		return salary;
	}
	public void setSalary(Double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Empl [id=" + eid + ", name=" + name + ", salary=" + salary + "]";
	}
	

}
