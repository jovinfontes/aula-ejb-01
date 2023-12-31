package br.com.dac.dacflix.mb;

import br.com.dac.dacflix.beans.ComentariosBean;
import br.com.dac.dacflix.entity.Filme;
import br.com.dac.dacflix.entity.User;
import java.util.ArrayList;
import java.util.List;
import javax.ejb.EJB;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped //Este escope será melhor explicado quendo formos estudar JSF
public class ComentariosMB {

   private User user = new User();
   private Filme filme = new Filme();
   
   @EJB
   private ComentariosBean bean;
   
   public void addComentario() {
       filme.setUser(user);
       bean.addComentario(filme);
       filme = new Filme();
       user = new User();
   }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Filme getFilme() {
        return filme;
    }

    public void setFilme(Filme filme) {
        this.filme = filme;
    }
   
    public List<Filme> getTodosComentarios() {
        //atualizando a nova lista
        return new ArrayList<>(bean.todosComentarios());
    }

}
