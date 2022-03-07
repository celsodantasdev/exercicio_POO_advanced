fun main() {

    /*Cria uma Classe Encap.Cliente, contendo os atributos encapsulados, um construtor padrão e pelo
      menos mais duas opções de construtores conforme sua percepção, com os atributos: nome (String),
      endereço (String), telefone (String), listaDeCompras (mutableListOf<Strings>()).
      A classe precisará de métodos para adicionar, remover e listar os itens do atributo listaDeCompras.
      Crie um método para verificar o nome ao inicializar a classe e, caso esteja vazio, jogue uma exceção.
      Ao instanciar a classe cliente na função main(), não esquecer de colocar dentro de um bloco try catch.*/

    println("Informe o seu nome: ")
    var nome = readLine()!!

    println("Informe o seu endereço: ")
    var endereco = readLine()!!

    println("Informe o seu telefone: ")
    var telefone = readLine()!!

    try {
        val josivan = Cliente(nome, endereco, telefone)
    } catch (e: Exception) {
        println(e.message)

    }

    while(true) {

        println("Menu")

        println("1 - Adicione itens no carrinho")
        println("2 - romove itens no carrinho")
        println("3 - Liste itens no carrinho")
        println("4 - Digite qualquer outro valor para sair")

        var opc = 0

        while (true) {
            println("Digite a opção desejada: ")

            try {
                val opc = readLine()!!.toInt()
                break
            } catch (e: Exception) {
                println("Valor inválido")
            }
        }
        when (opc) {
            1 -> {
                println("Digite o item a ser adicionado: ")
                val item = readLine()!!
                Cliente.addCompra(item)
            }
            2 -> {
                println("Digite o item a ser removido: ")
                val item = readLine()!!
                Cliente.removeCompra(item)
            }
            3 -> cliente.listarCompras()

            else -> break
        }

    }
}

/*

class Cliente(private val nome: String) {

    private var endereço = ""
    private var telefone = ""

    private val listaDeCompras = mutableListOf<String>()

    constructor(nome: String, endereço: String) : this(nome) {
        this.endereço = endereço
    }

    constructor(nome: String, endereço: String, telefone: String) : this(nome, endereço) {
        this.telefone = telefone

    }

    init{
        if(nome.isEmpty()){
            throw Exception("A classe cliente não foi instanciada corretamente")
        }
    }

    fun addCompra(valor: String) {
        if (valor.isEmpty()) {
            println("valor inválido")
        } else {
            listaDeCompras.add(valor)
        }
    }
    fun removeCompra(valor: String){
        if(valor.isEmpty()){
            println("valor inválido")
        }else if(listaDeCompras.contains(valor)){
            listaDeCompras.remove(valor)
        }else{
            print("O item $valor não existe na lista")
        }
        fun listarCompras(){
            println("***Compras Cliente: $nome***")

            listaDeCompras.forEach{
                println(it)
            }
        }
    }

}

/*
