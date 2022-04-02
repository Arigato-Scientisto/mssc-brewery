package tutorial.spring.msscbrewery.services;

import tutorial.spring.msscbrewery.web.model.BeerDto;

import java.util.UUID;

/**
 * created by Joseph Yacoub  on 02 Apr 2022
 */

public interface BeerService {

    BeerDto getBeerById(UUID beerId);

    BeerDto saveNewBeer(BeerDto beerDto);

    void updateBeer(UUID beerId, BeerDto beerDto);
}
