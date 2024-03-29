package ma.ehei.tp.service.manageEtudiant.impId;

import org.springframework.stereotype.Service;

@Service
public class PrefixIdGenerator {
    private static int idCounter = 0;
    private static final String PREFIX = "ehei";

    public String genererId() {
        return PREFIX + (++idCounter);
    }
}

