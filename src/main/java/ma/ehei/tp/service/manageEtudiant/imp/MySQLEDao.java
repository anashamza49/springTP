package ma.ehei.tp.service.manageEtudiant.imp;

import ma.ehei.tp.service.etudiant.Etudiant;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.sql.DataSource;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

@Service
public class MySQLEDao {

    @Autowired
    private DataSource dataSource;

    public void persister(Etudiant etudiant) {
        String sql = "INSERT INTO Etudiant (Id, nom, prenom) VALUES (?, ?, ?)";

        try (Connection connection = dataSource.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(sql)) {
            preparedStatement.setInt(1, etudiant.getId());
            preparedStatement.setString(2, etudiant.getNom());
            preparedStatement.setString(3, etudiant.getPrenom());

            preparedStatement.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
