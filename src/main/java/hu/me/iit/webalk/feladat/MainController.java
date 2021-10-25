package hu.me.iit.webalk.feladat;

import java.util.List;

import javax.validation.Valid;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.MediaType;

@RestController
@RequestMapping(path="icecream")
public class MainController {
	private final IceCreamService iceCreamService;
	
	public MainController(IceCreamService iceCreamService) {
	this.iceCreamService = iceCreamService;
	}

	@GetMapping(path="", produces = MediaType.APPLICATION_JSON_VALUE)
	List<IceCreamDto> allIceCream() {
		return iceCreamService.findAll();
	}
	
	 @PostMapping(path="")
	 void newIceCream(@RequestBody @Valid IceCreamDto iceCreamDto) {
		 iceCreamService.save(iceCreamDto);
	 }
	 
	 @PutMapping(path="/")
	 void replaceIceCream(@RequestBody @Valid IceCreamDto iceCreamDto) {
		 iceCreamService.save(iceCreamDto);
	 }
	 
	 @DeleteMapping(path="/{id}")
	 void deleteIceCream(@PathVariable("id") int id) {
		 iceCreamService.deleteById(id);
	 }
}
