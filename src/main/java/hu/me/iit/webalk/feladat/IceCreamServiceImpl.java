package hu.me.iit.webalk.feladat;

import java.util.List;

public class IceCreamServiceImpl implements IceCreamService {

	private final int MAXIMUM_ICECREAM_COUNT = 20;
	private final IceCreamRepository iceCreamRepository;
	
	public IceCreamServiceImpl(IceCreamRepository iceCreamReopsitory) {
		this.iceCreamRepository = iceCreamReopsitory;
	}
	
	@Override
	public List<IceCreamDto> findAll() {
		return iceCreamRepository.findAll();
	}

	@Override
	public IceCreamDto getById(int id) {
		return iceCreamRepository.getById(id);
	}

	@Override
	public int save(IceCreamDto iceCreamDto) {
		if (iceCreamRepository.findAll().size() > MAXIMUM_ICECREAM_COUNT) {
			throw new TooMuchIceCreamException();
		}
		return iceCreamRepository.save(iceCreamDto);
	}

	@Override
	public void deleteById(int id) {
		iceCreamRepository.deleteById(id);
	}

}
