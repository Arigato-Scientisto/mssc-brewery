package tutorial.spring.msscbrewery.web.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import tutorial.spring.msscbrewery.services.BeerService;
import tutorial.spring.msscbrewery.web.model.BeerDto;

import java.util.UUID;

/**
 * created by Joseph Yacoub  on 01 Apr 2022
 */
@RequestMapping("/api/v1/beer")
@RestController
public class BeerController {

    private final BeerService beerService;

    public BeerController(BeerService beerService) {
        this.beerService = beerService;
    }

    @GetMapping({"/{beerId}"})
    public ResponseEntity<BeerDto> getBeer(@PathVariable("beerId") UUID beerId){
    return new ResponseEntity<>(beerService.getBeerById(beerId), HttpStatus.OK);
    }
}
