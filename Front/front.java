package Front;
import back.negocio.Fachada;
import back.negocio.QuadroNegro;

public class front {
    public static void main(String[] args) {
        Fachada fachada = new Fachada();
        fachada.criaQuadrado(10.6);
        fachada.criaRetangulo(50.5, 20.4);
        fachada.criaTriangulo(6.7, 5.5);
        fachada.criaCircunferencia(10);
        fachada.mostraAreaObjetos();
        String mensagem = fachada.mostraAreaObjetos();
        System.out.println(mensagem);


    }
}