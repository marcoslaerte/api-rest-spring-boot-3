package med.voll.api_rest_spring_boot_3.paciente;

import med.voll.api_rest_spring_boot_3.endereco.Endereco;

public record DadosListagemPaciente(Long id, String nome, String email, String cpf, Endereco endereco) {
    public DadosListagemPaciente(Paciente paciente) {
        this(paciente.getId(), paciente.getNome(), paciente.getEmail(), paciente.getCpf(), paciente.getEndereco());
    }
}
