package com.jennbowers.bowersportfolio.repositories;

import com.jennbowers.bowersportfolio.interfaces.PortfolioRepository;
import com.jennbowers.bowersportfolio.models.Portfolio;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PortfolioRepositoryImpl implements PortfolioRepository {
    @Autowired
    JdbcTemplate jdbcTemplate;

    public List<Portfolio> findAll() {
        jdbcTemplate.query("SELECT * FROM portfolio");
        return null;
    }
}
