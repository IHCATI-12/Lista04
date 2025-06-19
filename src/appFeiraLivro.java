import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;
import java.util.TreeSet;

public class appFeiraLivro {
    private static Scanner input = new Scanner(System.in);

    public static Livro criaLivro(String aut) {
        System.out.println("--- Criando livro ---");
        System.out.println("Titulo: ");
        String tit = input.nextLine();
        System.out.println("Ano: ");
        int ano = input.nextInt();
        Livro obj = new Livro(aut, tit, ano); 
        return obj;
    }

    

    public static void imprimir(TreeMap<String, TreeSet<Livro>> bib) {
        for (Map.Entry<String, TreeSet<Livro>> autor : bib.entrySet()) {

            System.out.println("=======> Autor: " + autor.getKey() + " <=======");
            
            for (Livro livro : autor.getValue()) {
            
                System.out.println(livro);
            
            }
        }
    }
    
    public static void main(String[] args) {
        TreeMap<String, TreeSet<Livro>> biblioteca = new TreeMap<>();
        int op;
        
        do{
            System.out.println("Autor: ");
            String autor = input.nextLine();
            Livro livro = criaLivro(autor);
            if (!biblioteca.containsKey(autor)) { 
                biblioteca.put(autor, new TreeSet<Livro>());
            }
            biblioteca.get(autor).add(livro);
            imprimir(biblioteca);
            System.out.println("\n"+"deseja inserir mais registros? (0 = Não / 1 = Sim)");
            op = input.nextInt();
            input.nextLine(); // limpar /n 
        }while(op==1);
    }

    

    
}
