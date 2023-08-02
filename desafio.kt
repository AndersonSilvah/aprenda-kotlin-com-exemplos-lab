enum class Nivel { BASICO, INTERMEDIARIO, AVANCADO }

class Usuario(val nome: String, val nivel: Nivel)

data class ConteudoEducacional(var nome: String, val duracao: Int = 25) // Duração utilizando a técnica Pomodoro 25/5

data class Formacao(val nome: String, var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()

    fun matricular(usuario: Usuario) {
        inscritos.add(usuario)
    }
}

fun main() {
    println("Digite o nome da formação:")
    val nomeFormacao = readLine() ?: ""

    val formacao = Formacao(nomeFormacao, emptyList())

    val usuario1 = Usuario("João", Nivel.BASICO)
    val usuario2 = Usuario("Maria", Nivel.AVANCADO)

    formacao.matricular(usuario1)
    formacao.matricular(usuario2)

    println("Formação: ${formacao.nome}")
    println("Conteúdos: ${formacao.conteudos}")
    println("Inscritos: ${formacao.inscritos}")
}
