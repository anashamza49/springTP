package ma.ehei.tp.service.manageEtudiant;

import ma.ehei.tp.service.etudiant.Etudiant;
import ma.ehei.tp.repository.EtudiantRepository; // Importez l'interface EtudiantRepository
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EtudiantService {

    @Autowired
    private EtudiantRepository etudiantRepository;

    public void ajouterEtudiant(Etudiant etudiant) {
        etudiantRepository.save(etudiant);
    }
}
