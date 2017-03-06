package com.example.service;

import com.example.domain.PersonInfo;
import com.example.repository.PersonInfoRepository;
import com.example.web.rest.vm.ManagedPersonInfoVM;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;

@Service
@Transactional
public class PersonInfoService {

    private final Logger log = LoggerFactory.getLogger(PersonInfoService.class);

    @Inject
    PersonInfoRepository personInfoRepository;

    @Transactional(readOnly = true)
    public List<PersonInfo> getAllIncomeTax(){
        return personInfoRepository.findAll();
    }

    public PersonInfo createUser(ManagedPersonInfoVM managedPersonInfoVM) {
        PersonInfo personInfo = new PersonInfo();
        fillFieldsForUser(personInfo, managedPersonInfoVM);

        personInfoRepository.save(personInfo);
        log.debug("Created Information for Person Info: {}", personInfo);
        return personInfo;
    }
    private void fillFieldsForUser(PersonInfo personInfo, ManagedPersonInfoVM managedPersonInfoVM){

        personInfo.setPeriod(managedPersonInfoVM.getPeriod());

        personInfo.setProfitOther(managedPersonInfoVM.getProfitOther());
        personInfo.setProfitFromGoods(managedPersonInfoVM.getProfitFromGoods());

        personInfo.setBusinessCost(managedPersonInfoVM.getBusinessCost());
        personInfo.setEducationalCost(managedPersonInfoVM.getEducationalCost());
        personInfo.setHousingCost(managedPersonInfoVM.getHousingCost());
        personInfo.setInsuranceCost(managedPersonInfoVM.getInsuranceCost());

        personInfo.setDependents(managedPersonInfoVM.getDependents());
        personInfo.setDisabledChildren(managedPersonInfoVM.getDisabledChildren());
        personInfo.setNumberOfMinors(managedPersonInfoVM.getNumberOfMinors());

        personInfo.setWorking(managedPersonInfoVM.isHasWork());
        personInfo.setHasBenefits(managedPersonInfoVM.isHasBenefits());
        personInfo.setHasFamilyBenefits(managedPersonInfoVM.isHasFamilyBenefits());

        }

}
