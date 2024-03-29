package ma.ehei.tp.service.reduction.impl;

import ma.ehei.tp.service.reduction.ReductionService;
import org.springframework.stereotype.Service;

@Service
public class VariableReductionService implements ReductionService {
    @Override
    public Double calculerReduction(Double montant) {
        Double reduction = 0.0;
        if (montant > 5000) {
            reduction = montant * 0.2;
        }
        return reduction;
    }
}
