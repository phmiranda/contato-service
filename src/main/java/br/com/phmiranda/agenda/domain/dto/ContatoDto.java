/*
 * Author: phmiranda
 * Project: agenda
 * Task Number: HU-XXX
 * Description: N/A
 * Date: 11/02/2022
 */

package br.com.phmiranda.agenda.domain.dto;

import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;

@Getter
@Setter
public class ContatoDto {
    @NotNull
    @NotEmpty
    private Long id;

    @NotNull
    @NotEmpty
    private String nome;

    @Email
    @NotNull
    @NotEmpty
    private String email;

    @NotNull
    @NotEmpty
    private String documento;

    @NotNull
    @NotEmpty
    private String celular;

    @NotNull
    @NotEmpty
    private String telefone;

    @NotNull
    @NotEmpty
    private String telefoneRecado;
}
