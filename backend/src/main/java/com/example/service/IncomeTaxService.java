package com.example.service;

import com.example.domain.IncomeTax;
import com.example.repository.IncomeTaxRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;

@Service
@Transactional
public class IncomeTaxService {

    @Inject
    IncomeTaxRepository incomeTaxRepository;

    @Transactional(readOnly = true)
    public List<IncomeTax> getAllIncomeTax(){
        return incomeTaxRepository.findAll();
    }
}
