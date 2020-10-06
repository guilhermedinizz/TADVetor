package tadvetor;

/**
 *
 * @author guilhermedinizdesousa
 */
public class Vetor {

    private Pessoas[] A;
    private int capacity;
    private int size;
    
    
    public Vetor(int capacity) {
        A = new Pessoas[capacity];
        this.size = 0;
        this.capacity = capacity;
    }
    
    
    public boolean isEmpty() {
        return size == 0;
    }
    
    public int size() {
        return size;
    }

    public Pessoas get(int i) throws Exception {
        if (isEmpty()) {
            throw new Exception("Lista vazia!");
        }
        if (i >= size()) {
            throw new Exception("Posição inexistente!");
        }
        return A[i];
    }

    public void set(int i, Pessoas n) throws Exception {
        if (isEmpty()) {
            throw new Exception("Lista vazia!");
        }
        if (i >= size()) {
            throw new Exception("Posição inexistente!");
        }
        A[i] = n;
    }

    public void locPlace(Pessoas n) throws Exception {
        if (size == 0) {
            add(0, n);
        } else {
            for (int i = 0; i < size; i++) {
                if (n.getPosicao() <= A[i].getPosicao()) {
                    add(i, n);
                    break;
                }
            }
        }
    }

    public void add(int i, Pessoas n) throws Exception {
        if (size == A.length) {
            size--;
        }

        for (int j = size - 1; j > i; j--) {
            A[j + 1] = A[j];
        }
        A[i] = n;
        size++;
    }

    public void remove(int i) throws Exception {
        if (isEmpty()) {
            throw new Exception("Lista vazia!");
        }
        if (i >= size()) {
            throw new Exception("Posição inexistente!");
        }
        for (int j = i; j <= size - 1; j++) {
            A[j] = A[j + 1];
        }
        size--;
    }

    public int search(Pessoas n) {
        for (int i = 0; i < A.length; i++) {
            if (A[i].getNome().equals(n.getNome())) {
                return i;
            }
        }
        return -1;
    }
}
