package tutorial.spring.msscbrewery.services;

import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;
import tutorial.spring.msscbrewery.web.model.BeerDto;

import java.util.UUID;

/**
 * created by Joseph Yacoub  on 02 Apr 2022
 */
@Slf4j
@Service
public class BeerServiceImpl implements BeerService {
    @Override
    public BeerDto getBeerById(UUID beerId) {
        return BeerDto.builder().id(UUID.randomUUID())
                .beerName("Rothaus")
                .beerStyle("Pils")
                .build();
    }

    @Override
    public BeerDto saveNewBeer(BeerDto beerDto) {
        return BeerDto.builder()
                .id(UUID.randomUUID())
                .beerName(beerDto.getBeerName())
                .beerStyle(beerDto.getBeerStyle())
                .build();
    }

    @Override
    public void updateBeer(UUID beerId, BeerDto beerDto) {
        //todo impl to update a beer
    }

    @Override
    public void deleteBeerByID(UUID beerId) {
        log.debug("deleting a beer with Id "+ beerId);
    }

}
