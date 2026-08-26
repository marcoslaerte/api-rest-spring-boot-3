package med.voll.api_rest_spring_boot_3.controller;

import jakarta.validation.constraints.NotNull;
import med.voll.api_rest_spring_boot_3.endereco.DadosEndereco;

public record DadosAtualizacaoMedico(

        @NotNull
        Long id,
        String nome,
        String telefone,
        DadosEndereco endereco
) {
}
