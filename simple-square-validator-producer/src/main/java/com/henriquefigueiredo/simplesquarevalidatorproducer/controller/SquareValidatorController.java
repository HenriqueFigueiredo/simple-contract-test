package com.henriquefigueiredo.simplesquarevalidatorproducer.controller;

import com.henriquefigueiredo.simplesquarevalidatorproducer.dto.RequestSquareDTO;
import com.henriquefigueiredo.simplesquarevalidatorproducer.dto.ResponseSquareDTO;
import com.henriquefigueiredo.simplesquarevalidatorproducer.service.ISquareValidatorService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SquareValidatorController {

    final private ISquareValidatorService squareValidatorService;

    public SquareValidatorController(final ISquareValidatorService squareValidatorService) {
        this.squareValidatorService = squareValidatorService;
    }

    @PostMapping(path = "/api/v1/square/validation")
    public ResponseEntity<ResponseSquareDTO> validate(@RequestBody RequestSquareDTO requestSquareDTO) {
        final ResponseSquareDTO result = this.squareValidatorService.validate(requestSquareDTO);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
