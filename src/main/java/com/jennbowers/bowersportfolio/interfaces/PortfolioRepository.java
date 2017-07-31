package com.jennbowers.bowersportfolio.interfaces;

import com.jennbowers.bowersportfolio.models.Portfolio;

import java.util.List;

public interface PortfolioRepository {
    List<Portfolio> findAll();
}
