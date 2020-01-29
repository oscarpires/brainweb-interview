package br.com.brainweb.interview.core.features.hero;

import br.com.brainweb.interview.model.Hero;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.UUID;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

//@RequiredArgsConstructor

public interface HeroRepository extends JpaRepository<Hero, UUID> {

	
	
	/*@Autowired
	private DataSource dataSource;

	private static final String QUERY_HERO_ALL = " SELECT * FROM Hero ";

	private static final String CREATE_HERO_QUERY = "INSERT INTO hero" + " (name, race, power_stats_id)"
			+ " VALUES (:name, :race, :powerStatsId) RETURNING id";

	private NamedParameterJdbcTemplate template;

	@PostConstruct
	private void postConstruct() {
		template = new NamedParameterJdbcTemplate(dataSource);
	}

	UUID create(Hero hero) {
		final Map<String, Object> params = new HashMap<String, Object>();
		params.put("name", hero.getName());
		params.put("race", hero.getRace().name());
		params.put("powerStatsId", hero.getPowerStatsId());

		return template.queryForObject(CREATE_HERO_QUERY, params, UUID.class);
	}

	Hero find(UUID id) {
		final Map<String, Object> params = new HashMap<String, Object>();
		Hero hero = null;
		params.put("name", hero.getName());
		params.put("race", hero.getRace().name());
		params.put("powerStatsId", hero.getPowerStatsId());

		return template.queryForObject("SELECT * FROM Hero where id = ?", params, Hero.class);

		// return NamedParameterJdbcTemplate.CREATE_HERO_QUERY, params, UUID.class);
	}

	Hero findAll() {
		final Map<String, Object> params = new HashMap<String, Object>();

		return template.queryForObject(QUERY_HERO_ALL, params, Hero.class);
	}*/
}
