/*
 * Author: phmiranda
 * Project: agenda
 * Task Number: HU-XXX
 * Description: N/A
 * Date: 11/02/2022
 */

package br.com.phmiranda.agenda.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Data
@AllArgsConstructor
@NoArgsConstructor
@EqualsAndHashCode
@Entity(name = "contatos")
public class Contato {

    @Id
    @Column(name = "id", nullable = false)
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "nome", nullable = false, length = 200)
    private String nome;

    @Column(name = "email", nullable = false, length = 150)
    private String email;

    @Column(name = "documento", nullable = false, length = 11)
    private String documento;

    @Column(name = "celular", nullable = false, length = 11)
    private String celular;

    @Column(name = "telefone", nullable = false, length = 10)
    private String telefone;

    @Column(name = "telefone_recado", nullable = false, length = 11)
    private String telefoneRecado;
}
