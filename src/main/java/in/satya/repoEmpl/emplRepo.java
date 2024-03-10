package in.satya.repoEmpl;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import in.satya.entity.Empl;

public interface emplRepo extends JpaRepository<Empl, Integer>{
	//NativeSql
	@Query(value="SELECT e.*, a.* FROM Empl e JOIN addres a ON e.eid = a.eid WHERE e.eid = :eid", nativeQuery=true)
	//Hql
	//@Query("SELECT e,a FROM Empl e JOIN addres a ON e.eid = a.eid WHERE e.eid = :eid")
	public List<Object[]> getAll(Integer eid);



}
