package ma.ehei.tp.service.reduction.impl;

import ma.ehei.tp.service.reduction.ReductionService;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class ParametrableReductionService implements ReductionService {

    @Value("${reduction.taux}")
    private Double taux;

    @Override
    public Double calculerReduction(Double montant) {
        return montant * taux / 100;
    }

    public void setTaux(Double taux) {
        this.taux = taux;
    }
}
