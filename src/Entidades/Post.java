package Entidades;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 *
 * @author arils
 */
public class Post {

    private static SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");

    private Date dataDoPost;
    private String titulo;
    private String conteudo;
    private Integer likes;

    private List<Comentario> comentarios = new ArrayList<>(); //Composicao de Objeto

    public Post() {
    }

    public Post(Date dataDoPost, String titulo, String conteudo, Integer likes) {
        this.dataDoPost = dataDoPost;
        this.titulo = titulo;
        this.conteudo = conteudo;
        this.likes = likes;
    }

    public Date getDataDoPost() {
        return dataDoPost;
    }

    public void setDataDoPost(Date dataDoPost) {
        this.dataDoPost = dataDoPost;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getConteudo() {
        return conteudo;
    }

    public void setConteudo(String conteudo) {
        this.conteudo = conteudo;
    }

    public Integer getLikes() {
        return likes;
    }

    public void setLikes(Integer likes) {
        this.likes = likes;
    }

    public List<Comentario> getComentarios() {
        return comentarios;
    }

    public void addComentario(Comentario comentario) {

        comentarios.add(comentario);
    }

    public void removeComentario(Comentario comentario) {
        comentarios.remove(comentario);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(titulo + "\n");
        sb.append(conteudo);
        sb.append("\n" + likes);
        sb.append(" Likes - ");
        sb.append(sdf.format(dataDoPost));
        sb.append("\nComentatios: \n");
        for (Comentario c : comentarios) {
            sb.append(c.getTexto() + "\n");
        }

        return sb.toString();
    }

}
