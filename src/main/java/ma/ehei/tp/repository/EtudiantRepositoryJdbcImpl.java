package ma.ehei.tp.repository;

import ma.ehei.tp.service.etudiant.Etudiant;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

@Repository
public class EtudiantRepositoryJdbcImpl implements EtudiantRepository {

    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public Etudiant findById(Long id) {

        return null;
    }

    @Override
    public void save(Etudiant etudiant) {
        String sql = "INSERT INTO Etudiant (nom, prenom) VALUES (?, ?)";
        jdbcTemplate.update(sql, etudiant.getNom(), etudiant.getPrenom());
    }

    @Override
    public void update(Etudiant etudiant) {
    }

    @Override
    public void delete(Etudiant etudiant) {
    }
}
