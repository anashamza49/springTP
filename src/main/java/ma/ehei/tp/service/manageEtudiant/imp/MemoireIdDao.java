package ma.ehei.tp.service.manageEtudiant.imp;

import ma.ehei.tp.service.etudiant.Etudiant;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class MemoireIdDao {
    private List<Etudiant> etudiants = new ArrayList<>();

    public void persister(Etudiant e) {
        etudiants.add(e);
    }
}