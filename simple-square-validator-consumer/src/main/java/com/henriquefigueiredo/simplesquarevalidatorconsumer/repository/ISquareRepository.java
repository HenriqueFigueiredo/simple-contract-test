package com.henriquefigueiredo.simplesquarevalidatorconsumer.repository;

import com.henriquefigueiredo.simplesquarevalidatorconsumer.dto.RequestSquareDTO;
import com.henriquefigueiredo.simplesquarevalidatorconsumer.dto.ResponseSquareDTO;

public interface ISquareRepository {

    ResponseSquareDTO getSquareType(RequestSquareDTO requestSquareDTO);
}
