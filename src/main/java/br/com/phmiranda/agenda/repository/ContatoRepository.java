/*
 * Author: phmiranda
 * Project: agenda
 * Task Number: HU-XXX
 * Description: N/A
 * Date: 11/02/2022
 */

package br.com.phmiranda.agenda.repository;

import br.com.phmiranda.agenda.domain.Contato;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ContatoRepository extends JpaRepository<Contato, Long> {

}
