package med.voll.api_rest_spring_boot_3.domain.consulta;


import jakarta.validation.constraints.Future;
import jakarta.validation.constraints.NotNull;
import med.voll.api_rest_spring_boot_3.domain.medico.Especialidade;

import java.time.LocalDateTime;

public record DadosAgendamentoConsulta(
        Long idMedico,

        @NotNull
        Long idPaciente,

        @NotNull
        @Future
        LocalDateTime data,

        Especialidade especialidade) {
}
