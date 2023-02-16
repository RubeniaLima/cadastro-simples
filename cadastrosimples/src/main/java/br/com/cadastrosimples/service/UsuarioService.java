package br.com.cadastrosimples.service;

import br.com.cadastrosimples.model.Usuario;
import br.com.cadastrosimples.repository.IUsuario;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class UsuarioService {
    private IUsuario repository;

    public UsuarioService(IUsuario repository){

        this.repository=repository;
    }

    public List<Usuario> listaUsuario(){
        List<Usuario> lista  = repository.findAll();
        return lista;
    }
    public Usuario criarUsuario (Usuario usuario){
        Usuario usuarioNovo = repository.save(usuario);
        return usuarioNovo;
    }

    public Usuario editarUsuario (Usuario usuario){
        Usuario usuarioNovo = repository.save(usuario);
        return usuarioNovo;
    }

    public boolean excluirUsuario(Integer id){
        repository.deleteById(id);
        return true;
    }


}
