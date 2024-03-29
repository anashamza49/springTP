package ma.ehei.tp.service.manageEtudiant.impId;

import org.springframework.stereotype.Service;

@Service
public class AutoIncIdGenerator {
    private static int idCounter = 0;

    public int genererId() {
        return ++idCounter;
    }
}
