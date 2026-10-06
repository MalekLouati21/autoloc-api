package tn.esprit.autoloc.Services;

import tn.esprit.autoloc.Entities.Agence;
import tn.esprit.autoloc.Entities.Vehicule;

import java.util.List;

public interface IAgenceService {
    Agence AjouterAgence(Agence a);
    void supprimerAgence(Long id);
    List<Agence> recupererAgence();
    Agence modifierAgence(Agence a);
}
