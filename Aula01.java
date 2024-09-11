public class Aula01{
    public static void main(String[] args) {
        BoasVindas bv = new BoasVindas();
        bv.mensagem();
    }
}
/*método deve ser declarado e a maioria dos métodos deve ser chamada para ser executada.

    CLASSE = Aula01. Essa classe contém o método main, que será executado quando o programa for iniciado.
    PUBLIC = o método pode ser chamado de fora da classe.
    STATIC = significa que o método pertence à classe, e não a uma instância específica. Ele pode ser executado sem criar um objeto da classe Aula01.
    VOID = indica que o método não retorna nenhum valor.
    STRING ARGS[] = é um parâmetro que representa uma array de strings, que pode ser usado para passar argumentos ao programa pela linha de comando.

    Usamos o objeto BV para chamar o método mensagem da classe BoasVindas.

    CRIAÇÃO DE UM OBJETO: Um objeto da classe BoasVindas é criado e armazenado na variável bv.
    CHAMADA DE MÉTODO: O método mensagem desse objeto é chamado, resultando na impressão da mensagem no console.*/

