package com.henriquefigueiredo.simplesquarevalidatorproducer.service;

import com.henriquefigueiredo.simplesquarevalidatorproducer.dto.RequestSquareDTO;
import com.henriquefigueiredo.simplesquarevalidatorproducer.dto.ResponseSquareDTO;
import org.springframework.stereotype.Service;

@Service
public class SquareValidatorService implements ISquareValidatorService{

    private final String SQUARE = "SQUARE";
    private final String RECTANGLE = "RECTANGLE";
    private final String NON_VALID_SQUARE = "NON_VALID_SQUARE";

    @Override
    public ResponseSquareDTO validate(final RequestSquareDTO squareDTO) {
        if (squareDTO.getBase() <= 0 || squareDTO.getHeight() <= 0) {
            return new ResponseSquareDTO(NON_VALID_SQUARE);
        }
        final String type = squareDTO.getBase() == squareDTO.getHeight() ? SQUARE : RECTANGLE;
        return new ResponseSquareDTO(type);
    }
}
