package com.henriquefigueiredo.simplesquarevalidatorconsumer.repository;

import com.henriquefigueiredo.simplesquarevalidatorconsumer.dto.RequestSquareDTO;
import com.henriquefigueiredo.simplesquarevalidatorconsumer.dto.ResponseSquareDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Repository;
import org.springframework.web.client.RestTemplate;

@Repository
public class SquareRestRepository implements ISquareRepository{

    @Value("${SQUARE_VALIDATOR_URL}") private String serviceURL;

    @Autowired
    private RestTemplate restTemplate;

    @Override
    public ResponseSquareDTO getSquareType(final RequestSquareDTO requestSquareDTO) {
        final ResponseEntity<ResponseSquareDTO> response =
                restTemplate.postForEntity(serviceURL, requestSquareDTO, ResponseSquareDTO.class);
        return response.getBody();
    }
}
