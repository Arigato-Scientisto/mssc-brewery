package tutorial.spring.msscbrewery.services;

import org.springframework.stereotype.Service;
import tutorial.spring.msscbrewery.web.model.BeerDto;

import java.util.UUID;

/**
 * created by Joseph Yacoub  on 02 Apr 2022
 */

@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Rothaus")
                .beerStyle("Pils")
                .build();
    }
}
