package med.voll.api_rest_spring_boot_3.domain.consulta.validacoes.agendamento;

import med.voll.api_rest_spring_boot_3.domain.consulta.DadosAgendamentoConsulta;

public interface ValidadorAgendamentoDeConsulta {

    public void validar(DadosAgendamentoConsulta dados);
}
