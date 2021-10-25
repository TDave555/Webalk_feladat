package hu.me.iit.webalk.feladat;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

@Component
public class IceCreamMemoryRepoistory implements IceCreamRepository {

	List<IceCreamDto> iceCreams = new ArrayList<>();
	
	private int findIceCreamById(int id) {
		int found = -1;
		for (int i = 0; i < iceCreams.size(); i++) {
			if (iceCreams.get(i).getId() == id) {
				found = i;
				break;
			}
		}
		return found;
	}
	
	@Override
	public List<IceCreamDto> findAll() {
		return iceCreams;
	}

	@Override
	public IceCreamDto getById(int id) {
		return iceCreams.get(findIceCreamById(id));
	}

	@Override
	public int save(IceCreamDto iceCreamDto) {
		int found = findIceCreamById(iceCreamDto.getId());
		
		if (found != -1) {
			IceCreamDto foundIceCream = iceCreams.get(found);
			foundIceCream.setFlavour(iceCreamDto.getFlavour());
			foundIceCream.setType(iceCreamDto.getType());
		}
		
		return 0;
	}

	@Override
	public void deleteById(int id) {
		int found = findIceCreamById(id);
		
		if (found != -1) {
			iceCreams.remove(found);
		}
	}

}
