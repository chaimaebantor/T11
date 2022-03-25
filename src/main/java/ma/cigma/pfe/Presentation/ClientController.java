package ma.cigma.pfe.Presentation;

import ma.cigma.pfe.Models.Client;
import ma.cigma.pfe.Services.IClientservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import java.util.List;

@Controller("idCtrl")
public class ClientController {
    @Autowired
    IClientservice service;

    public ClientController(IClientservice service) {
        this.service = service;
    }

    public Client save(Client clt) {
        return service.save(clt);
    }
    public Client modify(Client clt) {
        return service.modify(clt);
    }
    public void remove(long idClt) {
        service.remove(idClt);
    }
    public Client getOne(long idClt) {
        return service.getOne(idClt);
    }
    public List<Client> getAll() {
        return service.getAll();
    }
}
