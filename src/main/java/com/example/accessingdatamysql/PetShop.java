package com.example.accessingdatamysql;

import javax.persistence.*;
import java.io.Serializable;

@Entity
public class PetShop implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String shop_name;
	private String owner_email;

	@ManyToOne(fetch = FetchType.LAZY, optional = false)
	private Pet pet;

	public PetShop() {
	}

	public PetShop(String shop_name, String owner_email, Pet pet) {
		this.shop_name = shop_name;
		this.owner_email = owner_email;
		this.pet = pet;
	}

	@Override
	public String toString() {
		return "PetShop: " +
				"id - " + id +
				" shop - " + shop_name  +
				" email - " + owner_email +
				" pet - " + pet;
	}
}