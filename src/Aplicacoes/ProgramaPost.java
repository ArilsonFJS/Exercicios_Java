package Aplicacoes;

import Entidades.Comentario;
import Entidades.Post;
import java.text.ParseException;
import java.text.SimpleDateFormat;

/**
 *
 * @author arils
 */
public class ProgramaPost {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
        
        Comentario c1 = new Comentario("Woooolll !");
        Comentario c2 = new Comentario("Incriveeeel !");
        
        Post p1 = new Post(sdf.parse("10/02/2021 14:05:24"), "Viagem para o Canada", "Eu amei este pais", 12);
        
        p1.addComentario(c1);
        p1.addComentario(c2);
        
        System.out.println(p1);
    }
}
