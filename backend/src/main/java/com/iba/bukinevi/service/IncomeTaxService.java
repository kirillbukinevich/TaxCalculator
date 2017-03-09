package com.iba.bukinevi.service;

import com.iba.bukinevi.domain.IncomeTax;
import com.iba.bukinevi.repository.IncomeTaxRepository;
import com.iba.bukinevi.service.builder.IncomeTaxBuilder;
import com.iba.bukinevi.service.dto.IncomeTaxDTO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import javax.inject.Inject;
import java.util.List;

@Service
@Transactional
public class IncomeTaxService {

    private final Logger log = LoggerFactory.getLogger(IncomeTaxService.class);

    @Inject
    IncomeTaxRepository incomeTaxRepository;

    @Transactional(readOnly = true)
    public List<IncomeTax> getAllIncomeTax() {
        return incomeTaxRepository.findAll();
    }

    public IncomeTax createUser(IncomeTaxDTO incomeTaxDTO) {
        IncomeTax incomeTax = buildIncomeTax(incomeTaxDTO);
                incomeTaxRepository.save(incomeTax);
        log.debug("Created Information for Person Info: {}", incomeTax);
        return incomeTax;
    }

    private IncomeTax buildIncomeTax(IncomeTaxDTO incomeTaxDTO) {
        IncomeTaxBuilder incomeTaxBuilder = new IncomeTaxBuilder();

        return incomeTaxBuilder.period(incomeTaxDTO.getPeriod()).
                profitOther(incomeTaxDTO.getProfitOther()).
                profitFromGoods(incomeTaxDTO.getProfitFromGoods()).
                businessCost(incomeTaxDTO.getBusinessCost()).
                educationalCost(incomeTaxDTO.getEducationalCost()).
                housingCost(incomeTaxDTO.getHousingCost()).
                insuranceCost(incomeTaxDTO.getInsuranceCost()).
                dependents(incomeTaxDTO.getDependents()).
                disabledChildren(incomeTaxDTO.getDisabledChildren()).
                numberOfMinors(incomeTaxDTO.getNumberOfMinors()).
                hasWork(incomeTaxDTO.isHasWork()).
                hasBenefits(incomeTaxDTO.isHasBenefits()).
                hasFamilyBenefits(incomeTaxDTO.isHasFamilyBenefits()).
                total(incomeTaxDTO.getTotal()).build();
    }
}
