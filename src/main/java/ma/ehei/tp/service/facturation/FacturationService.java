package ma.ehei.tp.service.facturation;

import ma.ehei.tp.service.reduction.ReductionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class FacturationService {

    @Autowired
    @Qualifier("franceParametrableReductionService")
    private ReductionService reductionService;

    public Double appliquerReduction(Double montant){
        return montant - reductionService.calculerReduction(montant);
    }
}
