package hu.me.iit.webalk.feladat;

import java.util.List;

public interface IceCreamRepository {
	
	List<IceCreamDto> findAll();
	IceCreamDto getById(int id);
	int save(IceCreamDto iceCreamDto);
	void deleteById(int id);	

}
