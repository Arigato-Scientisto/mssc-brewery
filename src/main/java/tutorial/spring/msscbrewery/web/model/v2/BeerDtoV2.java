package tutorial.spring.msscbrewery.web.model.v2;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * created by Joseph Yacoub  on 08 Apr 2022
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class BeerDtoV2 {

    private UUID id;
    private String beerName;
    private BeerStyleEnum beerStyle;
    private Long upc;
}
