package ma.ehei.tp.service.reduction.impl;

import ma.ehei.tp.service.reduction.ReductionService;
import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
public class SansReductionService implements ReductionService {
    @Override
    public Double calculerReduction(Double montant) {
        return 0.0;
    }
}
