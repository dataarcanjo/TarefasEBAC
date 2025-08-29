package br.com.rpires.service;

import br.com.rpires.dao.IContratoDao;

/**
 * @author rodrigo.pires
 */
public class ContratoService implements IContratoService {

    private IContratoDao contratoDao;

    public ContratoService(IContratoDao dao) {
        this.contratoDao = dao;
    }

    @Override
    public String salvar() {
        contratoDao.salvar();
        return "Sucesso";
    }

    @Override
    public String buscar() {
        contratoDao.buscar();
        return "Encontrado";    
    }

    @Override
    public String excluir() {
        contratoDao.excluir();
        return "Excluido";  
    }

    @Override
    public String atualizar() {
        contratoDao.atualizar();
        return "Atualizado";  
    }

}
