package med.voll.api_rest_spring_boot_3.controller;

import med.voll.api_rest_spring_boot_3.medico.DadosCadastroMedico;
import med.voll.api_rest_spring_boot_3.medico.Medico;
import med.voll.api_rest_spring_boot_3.medico.MedicoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @Autowired
    private MedicoRepository repository;

    @PostMapping
    public void cadastrar(@RequestBody DadosCadastroMedico dados) {
        repository.save(new Medico(dados));
    }
}
