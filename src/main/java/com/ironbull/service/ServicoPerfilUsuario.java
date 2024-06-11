package com.ironbull.service;

import com.ironbull.model.Corrida;
import com.ironbull.model.Musculacao;
import com.ironbull.model.Usuario;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
public class ServicoPerfilUsuario {

    private static ServicoPerfilUsuario instance;

    private final List<Usuario> perfisUsuarios = new ArrayList<>();

    private ServicoPerfilUsuario() {
    	
    }

    public static synchronized ServicoPerfilUsuario getInstance() {
        if (instance == null) {
            instance = new ServicoPerfilUsuario();
        }
        return instance;
    }

    public void criarPerfilUsuario(Usuario perfil) {
        perfisUsuarios.add(perfil);
    }
    
    public Usuario buscarUsuarioPeloId(String id) {
        return perfisUsuarios.stream()
                .filter(usuario -> id.equals(usuario.getId()))
                .findFirst()
                .orElse(null);
    }
    
    private Optional<Usuario> buscarUsuarioPorId(String idUsuario) {
        return perfisUsuarios.stream()
                .filter(usuario -> usuario.getId().equals(idUsuario))
                .findFirst();
    }
    
    public List<Usuario> obterTodosUsuarios() {
        return perfisUsuarios;
    }

    public void adicionarCorridaParaUsuario(String idUsuario, Corrida corrida) {
        Optional<Usuario> optionalUsuario = buscarUsuarioPorId(idUsuario);
        optionalUsuario.ifPresent(usuario -> usuario.adicionarCorrida(corrida));
    }

    public void adicionarMusculacaoParaUsuario(String idUsuario, Musculacao musculacao) {
        Optional<Usuario> optionalUsuario = buscarUsuarioPorId(idUsuario);
        optionalUsuario.ifPresent(usuario -> usuario.adicionarMusculacao(musculacao));
    }

    public List<Corrida> obterTodasCorridasDoUsuario(String idUsuario) {
        Optional<Usuario> optionalUsuario = buscarUsuarioPorId(idUsuario);
        return optionalUsuario.map(Usuario::obterTodasCorridas).orElse(new ArrayList<>());
    }

    public List<Musculacao> obterTodasMusculacoesDoUsuario(String idUsuario) {
        Optional<Usuario> optionalUsuario = buscarUsuarioPorId(idUsuario);
        return optionalUsuario.map(Usuario::obterTodasMusculacoes).orElse(new ArrayList<>());
    }
}
