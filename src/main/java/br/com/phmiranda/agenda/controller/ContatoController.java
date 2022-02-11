/*
 * Author: phmiranda
 * Project: agenda
 * Task Number: HU-XXX
 * Description: N/A
 * Date: 11/02/2022
 */

package br.com.phmiranda.agenda.controller;

import br.com.phmiranda.agenda.domain.Contato;
import br.com.phmiranda.agenda.domain.dto.ContatoDto;
import br.com.phmiranda.agenda.service.ContatoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RequestMapping("/contatos")
@RestController
public class ContatoController {

    @Autowired
    ContatoService contatoService;

    @GetMapping
    public List<Contato> index() {
        return contatoService.index();
    }

    @DeleteMapping
    public void deletarContato() {
        contatoService.deletar();
    }

    @PutMapping("/{id}")
    public void atualizarContato() {
        contatoService.atualizar();
    }

    @PostMapping
    public void cadastrarContato(@RequestBody @Valid ContatoDto contatoDto) {

    }

    @GetMapping("/{id}")
    public void pesquisarContatoPorId() {
        contatoService.pesquisarPorId();
    }


}
