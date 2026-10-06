package tn.esprit.autoloc.Services;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import tn.esprit.autoloc.Entities.Agence;
import tn.esprit.autoloc.Repositories.AgenceRepository;

import java.util.List;
@Service
@AllArgsConstructor
public class AgenceService implements IAgenceService {
    private AgenceRepository agencerepo;
    @Override
    public Agence AjouterAgence(Agence agence) {
        return agencerepo.save(agence);
    }

    @Override
    public void supprimerAgence(Long id) {
        agencerepo.deleteById(id);
    }

    @Override
    public List<Agence> recupererAgence() {
        return agencerepo.findAllById(List.of());
    }

    @Override
    public Agence modifierAgence(Agence a) {
        return agencerepo.save(a);
    }
}
