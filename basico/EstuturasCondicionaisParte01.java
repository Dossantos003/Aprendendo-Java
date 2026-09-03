package flamingo.aprendendo.basico;

public class EstuturasCondicionaisParte01 {
    static void main() {

//        byte idade = 20;
//        boolean isAutorizadoComprarBebida = idade >= 18;
//
//        if(isAutorizadoComprarBebida){
//            System.out.println("Pode comprar bebida alcólica");
//        }
//        else{
//            System.out.println("Não Pode comprar bebida alcólica");
//        }

        byte idade = 16;
        String categoria;

        if(idade<=15){
            categoria="Categoria Infantil";
        }else if( idade < 18){
            categoria ="Categoria Adolescente";
        }else{
            categoria ="Categoria Adulto";
        }
        System.out.println(categoria);
    }
}

