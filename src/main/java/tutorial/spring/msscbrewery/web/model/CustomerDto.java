package tutorial.spring.msscbrewery.web.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.UUID;

/**
 * created by Joseph Yacoub  on 02 Apr 2022
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustomerDto {

    private UUID id;
    private String name;

}
