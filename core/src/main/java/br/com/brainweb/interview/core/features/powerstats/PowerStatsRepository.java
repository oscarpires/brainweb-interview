package br.com.brainweb.interview.core.features.powerstats;

import br.com.brainweb.interview.model.PowerStats;
import lombok.RequiredArgsConstructor;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.namedparam.BeanPropertySqlParameterSource;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.UUID;

import javax.annotation.PostConstruct;
import javax.sql.DataSource;

@Repository
@RequiredArgsConstructor
public class PowerStatsRepository {

	@Autowired
	private DataSource dataSource;

	private static final String CREATE_POWER_STATS_QUERY = "INSERT INTO power_stats"
			+ " (strength, agility, dexterity, intelligence)"
			+ " VALUES (:strength, :agility, :dexterity, :intelligence) RETURNING id";

	private NamedParameterJdbcTemplate namedParameterJdbcTemplate;

	@PostConstruct
	private void postConstruct() {
		namedParameterJdbcTemplate = new NamedParameterJdbcTemplate(dataSource);
	}

	UUID create(PowerStats powerStats) {
		return namedParameterJdbcTemplate.queryForObject(CREATE_POWER_STATS_QUERY,
				new BeanPropertySqlParameterSource(powerStats), UUID.class);
	}
}
