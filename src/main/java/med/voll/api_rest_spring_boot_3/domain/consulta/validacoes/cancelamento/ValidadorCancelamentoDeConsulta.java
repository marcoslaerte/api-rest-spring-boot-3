package med.voll.api_rest_spring_boot_3.domain.consulta.validacoes.cancelamento;

import med.voll.api_rest_spring_boot_3.domain.consulta.DadosCancelamentoConsulta;

public interface ValidadorCancelamentoDeConsulta {

    void validar(DadosCancelamentoConsulta dados);

}
