package med.voll.api_rest_spring_boot_3.domain.paciente;

import med.voll.api_rest_spring_boot_3.domain.endereco.Endereco;

public record DadosListagemPaciente(Long id, String nome, String email, String cpf, Endereco endereco) {
    public DadosListagemPaciente(Paciente paciente) {
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf(), paciente.getEndereco());
    }
}
