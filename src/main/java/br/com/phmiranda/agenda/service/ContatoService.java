/*
 * Author: phmiranda
 * Project: agenda
 * Task Number: HU-XXX
 * Description: N/A
 * Date: 11/02/2022
 */

package br.com.phmiranda.agenda.service;

import br.com.phmiranda.agenda.domain.Contato;
import br.com.phmiranda.agenda.domain.dto.ContatoDto;
import br.com.phmiranda.agenda.repository.ContatoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ContatoService {

    @Autowired
    ContatoRepository contatoRepository;

    public List<Contato> index() {
        System.out.println("FAZENDO CONSULTA AOS CONTATOS CADASTRADOS");
        List<Contato> contatos = contatoRepository.findAll();
        return contatos;
    }

    public void deletar() {

    }

    public void atualizar() {

    }

    public void salvar(ContatoDto contatoDto) {

    }

    public void pesquisarPorId() {

    }

    public void pesquisarPorNome() {

    }

    public void pesquisarPorDocumento() {

    }

    public void pesquisarPorCelular() {

    }

    public void pesquisarPorTelefone() {

    }

    public void pesquisarPorTelefoneRecado() {

    }
}
