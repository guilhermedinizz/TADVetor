package tadvetor;

/**
 *
 * @author guilhermedinizdesousa
 */
public class TADVetor {
    public static void main(final String[] args) {
        final Vetor lista = new Vetor(5); 

        try { 
            Pessoas j1 = new Pessoas("Álvaro",0);
            lista.locPlace(j1);
            lista.add(1, new Pessoas("Pedro",1));
            lista.locPlace(new Pessoas("Carla",0));
            lista.size();
            lista.set(2, new Pessoas("Marta",2));
            
            for (int i = 0; i < lista.size(); i++){
                System.out.println("Nome: " + lista.get(i).getNome()
                + " Posição " + lista.get(i).getPosicao()) ;
            }
            System.out.println("Fim da lista!");
           
            





        } catch (final Exception e){ 

        System.out.println(e.getMessage()); 

    } 
    }
    
}
