package br.com.dac.dacflix.beans;

import br.com.dac.dacflix.entity.Filme;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.Stateful;

@Stateful
public class ComentariosBean {
    
    private List<Filme> filmes = new ArrayList<>();
    
    public void addComentario(Filme filme) {
        filmes.add(filme);
    }
    
    public List<Filme> todosComentarios(){
        return filmes;
    }
}
