package com.henriquefigueiredo.simplesquarevalidatorproducer.service;

import com.henriquefigueiredo.simplesquarevalidatorproducer.dto.RequestSquareDTO;
import com.henriquefigueiredo.simplesquarevalidatorproducer.dto.ResponseSquareDTO;

public interface ISquareValidatorService {

    ResponseSquareDTO validate(RequestSquareDTO squareDTO);

}
