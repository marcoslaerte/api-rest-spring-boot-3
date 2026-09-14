package med.voll.api_rest_spring_boot_3.domain.consulta.validacoes;

import med.voll.api_rest_spring_boot_3.domain.ValidacaoException;
import med.voll.api_rest_spring_boot_3.domain.consulta.ConsultaRepository;
import med.voll.api_rest_spring_boot_3.domain.consulta.DadosAgendamentoConsulta;

public class ValidadorMedicoComOutraConsultaNoMesmoHorario {

    private ConsultaRepository repository;

    public void validar(DadosAgendamentoConsulta dados) {
        var medicoPossuiOutraConsultaNoMesmoHorario = repository.existsByMedicoIdAndData(dados.idMedico(), dados.data());
        if(medicoPossuiOutraConsultaNoMesmoHorario) {
            throw new ValidacaoException("Médico já possui outra consulta agendada nesse mesmo horário");
        }
    }
}
