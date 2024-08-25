package lista7_5;

import java.util.Arrays;
import javax.swing.JOptionPane;

public class Lista7_5 {
    public static void main(String[] args) {
        final int LIMITEMAX = 300;
        final int LINHA = 5;
//        final int COLUNA = 5;
        int vet[][] = new int [LINHA][LINHA];
        int esc, cont;
        for(int x=0; x < LINHA; x++){
            for(int y=0; y < LINHA; y++){
                do{
                    vet[x][y] = (int) (Math.random() * (LIMITEMAX+1));
                }while(vet[x][y] < 100);
            }
        }
        String vetorOriginal = "";
        for (int x = 0; x < LINHA; x++) {
            vetorOriginal += Arrays.toString(vet[x]) + "\n";
        }
        do{
            cont=0;
            esc = Integer.parseInt(JOptionPane.showInputDialog("Matriz: "+vetorOriginal+"\nDigite um número positivo para realizar a busca ou um número negativo para encerrar o programa: "));
            if(esc >= 0){
                for(int x = 0; x < LINHA; x++){
                    for(int y = 0; y < LINHA; y++){
                        if(vet[x][y] == esc){
                            cont++;
                        }
                    }
                }
                if(cont > 1){
                    JOptionPane.showMessageDialog(null, "Número encontrado " +cont + " vezes");
                }
                else if(cont == 1){
                    JOptionPane.showMessageDialog(null, "Número encontrado " +cont + " vez");
                } else{
                    JOptionPane.showMessageDialog(null, "Número não encontrado");
                }
            }
        }while(esc >= 0);
    }    
}
