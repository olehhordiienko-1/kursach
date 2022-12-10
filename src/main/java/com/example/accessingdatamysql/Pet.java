package com.example.accessingdatamysql;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Set;

@Entity
public class Pet implements Serializable {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private boolean has_vaccine;

	@Column(unique = true)
	private String pet_name;

	@OneToMany(mappedBy = "pet", fetch = FetchType.LAZY,
			cascade = CascadeType.ALL)
	private Set<PetShop> petShops;

	public Pet() {
	}

	public Pet(String pet_name, boolean has_vaccine) {
		this.pet_name = pet_name;
		this.has_vaccine = has_vaccine;
	}

	@Override
	public String toString() {
		return "Pet: " +
				"id - " + id +
				" pet name - " + pet_name +
				" vaccine - " + has_vaccine;
	}
}