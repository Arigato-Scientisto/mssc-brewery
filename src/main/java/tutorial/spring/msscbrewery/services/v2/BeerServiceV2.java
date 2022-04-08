package tutorial.spring.msscbrewery.services.v2;

import tutorial.spring.msscbrewery.web.model.v2.BeerDtoV2;

import java.util.UUID;

/**
 * created by Joseph Yacoub  on 08 Apr 2022
 */

public interface BeerServiceV2 {

    BeerDtoV2 getBeerById(UUID beerId);

    BeerDtoV2 saveNewBeer(BeerDtoV2 beerDto);

    void updateBeer(UUID beerId, BeerDtoV2 beerDto);

    void deleteById(UUID beerId);
}
