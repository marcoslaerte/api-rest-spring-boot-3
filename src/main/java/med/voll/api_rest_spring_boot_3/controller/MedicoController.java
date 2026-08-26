package med.voll.api_rest_spring_boot_3.controller;

import jakarta.validation.Valid;
import med.voll.api_rest_spring_boot_3.medico.DadosCadastroMedico;
import med.voll.api_rest_spring_boot_3.medico.DadosListagemMedico;
import med.voll.api_rest_spring_boot_3.medico.Medico;
import med.voll.api_rest_spring_boot_3.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.web.PageableDefault;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    @Transactional
    public void cadastrar(@RequestBody @Valid DadosCadastroMedico dados) {
        repository.save(new Medico(dados));
    }

    @GetMapping
    public Page<DadosListagemMedico> listar(@PageableDefault(size = 10, sort = {"nome"}) Pageable paginacao) {
        return repository.findAllByAtivoTrue(paginacao).map(DadosListagemMedico::new);
    }

    @PutMapping
    @Transactional
    public void atualizar(@RequestBody @Valid DadosAtualizacaoMedico dados) {
        var medico = repository.getReferenceById(dados.id());
        medico.atualizarInformacoes(dados);
    }

    @DeleteMapping("/{id}")
    @Transactional
    public void excluir(@PathVariable Long id) {
        // repository.deleteById(id);
        var medico = repository.getReferenceById(id);
        medico.excluir(); // Por causa do @Transactional, a JPA salvo o medico alterado automaticamente sem precisar colocar repository.save() explicitamente.
    }
}
