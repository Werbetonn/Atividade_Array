package Q02;

public class ComparacaoValoresTeste {
    public static void main(String[] args) {
        ComparacaoValores cv = new ComparacaoValores();
        int [] v= new int[10];
        for(int i = 0; i < v.length; i++){
            v[i]=(i*i)+1;
            v[i] = i + 1;

            
        }
        int resultado = cv.totalPares(v);
        System.out.println(resultado);

        
        int maiorResultado = cv.maiorValor(v);
        System.out.println("O maior valor é: " + maiorResultado);
        }
    }
