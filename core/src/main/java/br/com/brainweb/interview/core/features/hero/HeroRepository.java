package br.com.brainweb.interview.core.features.hero;

import br.com.brainweb.interview.model.Hero;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.HashMap;
import java.util.Map;
import java.util.UUID;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

//@RequiredArgsConstructor
@Repository
public class HeroRepository {

	@Autowired
	private DataSource dataSource;

	private static final String CREATE_HERO_QUERY = "INSERT INTO hero" + " (name, race, power_stats_id)"
			+ " VALUES (:name, :race, :powerStatsId) RETURNING id";

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@PostConstruct
	private void postConstruct() {
		namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	UUID create(Hero hero) {
		final Map<String, Object> params = new HashMap<String, Object>();
		params.put("name", hero.getName());
		params.put("race", hero.getRace().name());
		params.put("powerStatsId", hero.getPowerStatsId());

		return namedParameterJdbcTemplate.queryForObject(CREATE_HERO_QUERY, params, UUID.class);
	}
}
