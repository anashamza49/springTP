package ma.ehei.tp.repository;


import ma.ehei.tp.service.etudiant.Etudiant;

public interface EtudiantRepository {
    Etudiant findById(Long id);
    void save(Etudiant etudiant);
    void update(Etudiant etudiant);
    void delete(Etudiant etudiant);
}
