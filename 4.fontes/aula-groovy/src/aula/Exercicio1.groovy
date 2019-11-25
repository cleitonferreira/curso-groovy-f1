package aula

class Exercicio1 {

    // Ola mundo 1
    static main (args) {
        // Exer1
        println "Ola mundo groovy"

        // Exer2
        // interpolação de string -  concatena automaticamente - $variavel ou $objeto.atributo
        String nome = "Fernando"
        int idade = 36

        String frase = "O $nome tem $idade anos."
        println frase
    }
}
