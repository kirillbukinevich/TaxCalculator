package com.example.web.rest;

import com.example.domain.PersonInfo;
import com.example.service.PersonInfoService;
import com.example.web.rest.util.HeaderUtil;
import com.example.web.rest.vm.ManagedPersonInfoVM;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.inject.Inject;
import javax.servlet.http.HttpServletRequest;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;
import java.util.stream.Collectors;

import static org.springframework.http.HttpStatus.OK;
import static org.springframework.web.bind.annotation.RequestMethod.POST;

@RestController
public class PersonInfoResource {
    private final Logger log = LoggerFactory.getLogger(PersonInfoResource.class);

    @Inject
    private PersonInfoService personInfoService;

    @RequestMapping(value = "/personInfo",
            method = RequestMethod.GET,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<List<ManagedPersonInfoVM>> getAllIncomeTax() {
        System.out.println("!!!!!!!!!!!!!!");
        log.debug("REST request get all Goods");
        List<ManagedPersonInfoVM> taxVMList = personInfoService.getAllIncomeTax()
                .stream().map(ManagedPersonInfoVM::new).collect(Collectors.toList());

        HttpHeaders headers = HeaderUtil.createAlert("incomeTax.getAll", null);
        return new ResponseEntity<List<ManagedPersonInfoVM>>(taxVMList, headers, OK);
    }

    @RequestMapping(value = "/personInfo",
            method = POST,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public ResponseEntity<?> saveIncomeTax(@RequestBody ManagedPersonInfoVM managedPersonInfoVM) throws URISyntaxException {
        System.out.println("HERE!!!!!!!!");
        log.debug("REST request to save person info : {}", managedPersonInfoVM);

        PersonInfo personInfo = personInfoService.createUser(managedPersonInfoVM);
        return ResponseEntity.created(new URI("/api/personInfo/" + 1)) //!!!!!!!!!!!!!!!
                .headers(HeaderUtil.createAlert("personInfoManagement.created", "1"))
                .body(personInfo);
    }
}

