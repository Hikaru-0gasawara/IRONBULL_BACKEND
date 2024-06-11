package com.ironbull.controller;

import com.ironbull.model.Corrida;
import com.ironbull.model.Musculacao;
import com.ironbull.model.Usuario;
import com.ironbull.service.ServicoPerfilUsuario;
import com.ironbull.model.ObjParaJson;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping
public class ControladorPerfilUsuario {

    @Autowired
    private ServicoPerfilUsuario servicoPerfilUsuario;

    @PostMapping("/usuario/adicionar")
    public void criarPerfilUsuario(@RequestBody Usuario perfil) {
        servicoPerfilUsuario.criarPerfilUsuario(perfil);
    }
    
    @GetMapping("/usuario/{id}")
    public Usuario obterUsuarioPorId(@PathVariable String id) {
        return servicoPerfilUsuario.buscarUsuarioPeloId(id);
    }

    @GetMapping("/todos-usuarios")
    public List<Usuario> obterTodosUsuarios() {
        return servicoPerfilUsuario.obterTodosUsuarios();
    }

    @PostMapping("/usuario/{id}/adicionar-corridas")
    public void adicionarCorrida(@PathVariable String id, @RequestBody Corrida corrida) {
        servicoPerfilUsuario.adicionarCorridaParaUsuario(id, corrida);
    }

    @PostMapping("/usuario/{id}/adicionar-musculacao")
    public void adicionarMusculacao(@PathVariable String id, @RequestBody Musculacao musculacao) {
        servicoPerfilUsuario.adicionarMusculacaoParaUsuario(id, musculacao);
    }

    @GetMapping("/usuario/{id}/corridas")
    public String obterTodasCorridas(@PathVariable String id) {
        List<Corrida> corridas = servicoPerfilUsuario.obterTodasCorridasDoUsuario(id);
        return ObjParaJson.transformarParaJson(corridas);
    }

    @GetMapping("/usuario/{id}/musculacoes")
    public String obterTodasMusculacoes(@PathVariable String id) {
        List<Musculacao> musculacoes = servicoPerfilUsuario.obterTodasMusculacoesDoUsuario(id);
        return ObjParaJson.transformarParaJson(musculacoes);
    }
}
