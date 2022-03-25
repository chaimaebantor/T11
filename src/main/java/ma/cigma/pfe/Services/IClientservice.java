package ma.cigma.pfe.Services;

import ma.cigma.pfe.Models.Client;

import java.util.List;

public interface IClientservice {
    /* Client save(Client c);
    Client modify(Client c);
    void removeById(long id);
    Client getById(long id);
    List<Client> findByName(String name);
    List<Client> getAll();*/
    Client save(Client clt);
    Client modify(Client clt);
    void remove(long idClt);
    Client getOne(long idClt);
    List<Client> getAll();

}
