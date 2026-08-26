package med.voll.api_rest_spring_boot_3.controller;

import jakarta.validation.Valid;
import med.voll.api_rest_spring_boot_3.medico.DadosCadastroMedico;
import med.voll.api_rest_spring_boot_3.medico.DadosListagemMedico;
import med.voll.api_rest_spring_boot_3.medico.Medico;
import med.voll.api_rest_spring_boot_3.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;

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
    public List<DadosListagemMedico> listart() {
        return repository.findAll().stream().map(DadosListagemMedico::new).toList();
    }
}
