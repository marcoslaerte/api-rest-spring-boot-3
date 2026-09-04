package med.voll.api_rest_spring_boot_3.domain.paciente;

import jakarta.validation.Valid;
import med.voll.api_rest_spring_boot_3.domain.endereco.DadosEndereco;

public record DadosAtualizacaoPaciente(
        Long id,
        String nome,
        String telefone,
        @Valid DadosEndereco endereco
) {
}
