package s10.aulas.listas;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Listas {
    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Ricardo"); //adicionar elemento
        list.add("Maria");
        list.add("Ana");
        list.add("Marcela");

        for (String x : list){ // ler os nomes da lista
            System.out.println(x);
        }

        list.add(2, "Marco"); // adiciona ele em uma posicao "2" por exemplo
        list.size(); // ver o tamanho da lista
        list.remove("Ana"); // remove a partir da comparação
        list.remove(1); // remove por posição
        list.removeIf(x -> x.charAt(0) == 'M'); // remove qualquer pessoa que começa com 'M' (posicao 0 == 'M')
        list.add("Ana");

        list.indexOf("Bob"); // encontrar a posicao desse item. Retornar -1 e porque nao tem esse item na lista
        List<String> result = list.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList()); // assim eu deixo apenas quem comeca com a letra 'A'
        for (String x : result){ // ler os nomes da lista
            System.out.println(x);
        }
        String name = list.stream().filter(x -> x.charAt(0) == 'A').findFirst().orElse(null); // encontra a primeira pessoa com a letra 'a' ou retorna nulo se nao tiver ngm
        System.out.println(name);

    }
}
