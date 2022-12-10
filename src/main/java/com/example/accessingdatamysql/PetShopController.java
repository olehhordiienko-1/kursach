package com.example.accessingdatamysql;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PetShopController {
	private static final Logger logger = Logger.getLogger(PetShopController.class);

	@Autowired
	private PetShopRepository petShopRepository;
	@Autowired
	private PetRepository petRepository;

	@GetMapping("/shop")
	public String blogMain(Model model) {
		logger.info("[log] execution petShopRepository.findAll()");
		Iterable<PetShop> petShops = petShopRepository.findAll();
		model.addAttribute("petshops", petShops);

		Iterable<Pet> pets = petRepository.findAll();
		logger.info("[log] execution petRepository.findAll()");
		model.addAttribute("pets", pets);

		return petShops.toString();
	}

}
