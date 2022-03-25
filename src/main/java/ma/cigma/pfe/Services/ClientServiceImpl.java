package ma.cigma.pfe.Services;

import ma.cigma.pfe.Repositories.IClientDao;
import ma.cigma.pfe.Models.Client;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class ClientServiceImpl  implements IClientservice{@Autowired
private IClientDao dao;
    @Override
    @Transactional
    public Client save(Client clt) {
        return dao.save(clt);
    }
    @Override
    @Transactional
    public Client modify(Client newClt) {
        Client oldClt = dao.findById(newClt.getId()).get();
        oldClt.setName(newClt.getName());
        return dao.save(oldClt);
    }
    @Override
    @Transactional
    public void remove(long idClt) {
        dao.deleteById(idClt);
    }
    @Override
    public Client getOne(long idClt) {
        return dao.findById(idClt).get();
    }
    @Override
    public List<Client> getAll() {
        return (List<Client>) dao.findAll();
    }






    /* @Autowired
      IClientDao dao;



    public IClientDao getDao() {
        return dao;
    }
    @Autowired
    IClientDao clientRepository;

    @Override
    @Transactional
    public Client save(Client c) {
        return clientRepository.save(c);
    }

    @Override
    @Transactional
    public Client modify(Client c) {

        Client oldClt = dao.findById(c.getId()).get();
        oldClt.setName(c.getName());
        return dao.save(oldClt);

    }

    @Override
    @Transactional
    public void removeById(long id) {
        dao.deleteById(id);
    }

    @Override
    @Transactional
    public Client getById(long id) {
        return dao.findById(id).get();
    }

    @Override
    @Transactional
    public List<Client> findByName(String name) {
        return null;
    }

    @Override
    @Transactional
    public List<Client> getAll() {
        return (List<Client>) dao.findAll();
    }
*/

}
