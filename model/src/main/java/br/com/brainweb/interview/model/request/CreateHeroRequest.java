package br.com.brainweb.interview.model.request;

import br.com.brainweb.interview.model.Hero;
import br.com.brainweb.interview.model.enums.Race;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.validator.constraints.Length;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;

import static lombok.AccessLevel.PRIVATE;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor(access = PRIVATE)
public class CreateHeroRequest {

	static CreateHeroRequest newHero = new CreateHeroRequest();

	@NotBlank(message = "message.name.mandatory")
	@Length(min = 1, max = 255, message = "message.name.length")
	String name;

	@NotNull(message = "message.race.mandatory")
	Race race;

	@Min(value = 0, message = "message.powerstats.strength.min")
	@Max(value = 10, message = "message.powerstats.strength.max")
	@NotNull(message = "message.powerstats.strength.mandatory")
	int strength;

	@Min(value = 0, message = "message.powerstats.agility.min")
	@Max(value = 10, message = "message.powerstats.agility.max")
	@NotNull(message = "message.powerstats.agility.mandatory")
	int agility;

	@Min(value = 0, message = "message.powerstats.dexterity.min")
	@Max(value = 10, message = "message.powerstats.dexterity.max")
	@NotNull(message = "message.powerstats.dexterity.mandatory")
	int dexterity;

	@Min(value = 0, message = "message.powerstats.intelligence.min")
	@Max(value = 10, message = "message.powerstats.intelligence.max")
	@NotNull(message = "message.powerstats.intelligence.mandatory")
	int intelligence;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Race getRace() {
		return race;
	}

	public void setRace(Race race) {
		this.race = race;
	}

	public int getStrength() {
		return strength;
	}

	public void setStrength(int strength) {
		this.strength = strength;
	}

	public int getAgility() {
		return agility;
	}

	public void setAgility(int agility) {
		this.agility = agility;
	}

	public int getDexterity() {
		return dexterity;
	}

	public void setDexterity(int dexterity) {
		this.dexterity = dexterity;
	}

	public int getIntelligence() {
		return intelligence;
	}

	public void setIntelligence(int intelligence) {
		this.intelligence = intelligence;
	}

	public static CreateHeroRequest builder() {
		return newHero;
	}

	public CreateHeroRequest name(String name) {
		newHero.setName(name);
		return newHero;
	}

	public CreateHeroRequest agility(int i) {
		newHero.setAgility(i);
		return newHero;
	}

	public CreateHeroRequest dexterity(int i) {
		newHero.setDexterity(i);
		return newHero;
	}
	
	public CreateHeroRequest strength(int i) {
		newHero.setStrength(i);
		return newHero;
	}

	public CreateHeroRequest intelligence(int i) {
		newHero.setIntelligence(i);
		return newHero;
	}

	public CreateHeroRequest race(Race human) {
		newHero.setRace(human);
		return newHero;
	}

	public CreateHeroRequest build() {
		return newHero;
	}
}
