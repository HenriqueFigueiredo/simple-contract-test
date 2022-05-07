package com.henriquefigueiredo.simplesquarevalidatorconsumer.controller;

import com.henriquefigueiredo.simplesquarevalidatorconsumer.dto.RequestSquareDTO;
import com.henriquefigueiredo.simplesquarevalidatorconsumer.dto.ResponseSquareDTO;
import com.henriquefigueiredo.simplesquarevalidatorconsumer.repository.ISquareRepository;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class SquareController {

    final private ISquareRepository squareRepository;

    public SquareController(final ISquareRepository squareRepository) {
        this.squareRepository = squareRepository;
    }

    @GetMapping(path = "/api/v1/square/{base}/{height}")
    public ResponseEntity<ResponseSquareDTO> getArea(@PathVariable(value = "base") final int base,
                                                     @PathVariable(value = "height") final int height) {
        final RequestSquareDTO requestSquareDTO = new RequestSquareDTO(base, height);
        final ResponseSquareDTO result = this.squareRepository.getSquareType(requestSquareDTO);
        return new ResponseEntity<>(result, HttpStatus.OK);
    }
}
