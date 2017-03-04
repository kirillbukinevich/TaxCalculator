package com.example.web.rest;

import com.example.domain.IncomeTax;
import com.example.service.IncomeTaxService;
import com.example.service.dto.IncomeTaxDTO;
import com.example.web.rest.util.HeaderUtil;
import com.example.web.rest.vm.ManagedIncomeTaxVM;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.http.HttpStatus.OK;

@RestController
public class IncomeTaxResource {
    private final Logger log = LoggerFactory.getLogger(IncomeTaxResource.class);

    @Inject
    private IncomeTaxService incomeTaxService;

    @RequestMapping(value = "/incomeTaxes",
        method = RequestMethod.GET,
        produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ManagedIncomeTaxVM>> getAllIncomeTax() {
        log.debug("REST request get all Goods");
        List<ManagedIncomeTaxVM> taxVMList = incomeTaxService.getAllIncomeTax()
                .stream().map(ManagedIncomeTaxVM::new).collect(Collectors.toList());

        HttpHeaders headers = HeaderUtil.createAlert("incomeTax.getAll",null);
        return new ResponseEntity<List<ManagedIncomeTaxVM>>(taxVMList,headers,OK);
    }
}
