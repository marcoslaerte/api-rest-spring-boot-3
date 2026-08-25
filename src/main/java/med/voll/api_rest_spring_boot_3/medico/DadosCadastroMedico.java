package med.voll.api_rest_spring_boot_3.medico;

import med.voll.api_rest_spring_boot_3.endereco.DadosEndereco;

public record DadosCadastroMedico(String nome, String email, String crm, Especialidade especialidade, DadosEndereco endereco) {
}
