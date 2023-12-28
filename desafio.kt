// [Template no Kotlin Playground](https://pl.kotl.in/WcteahpyN)

enum class Nivel { BASICO, INTERMEDIARIO, DIFICIL }

data class Usuario(val nome: String)

data class ConteudoEducacional(var nome: String, val duracao: Int = 60)

data class Formacao(val nome: String,  val nivel: String,var conteudos: List<ConteudoEducacional>) {

    val inscritos = mutableListOf<Usuario>()
    
    fun matricular(usuario: Usuario) {
        //TODO("Utilize o parâmetro $usuario para simular uma matrícula (usar a lista de $inscritos).")
        inscritos.add(usuario)
        println("Usuário cadastrado com sucesso $usuario")
    }
}

fun main() {
    //println("rodou")
    
 //   TODO("Analise as classes modeladas para este domínio de aplicação e pense em formas de evoluí-las.")
//    TODO("Simule alguns cenários de teste. Para isso, crie alguns objetos usando as classes em questão.")
	
    val disciplina1 = ConteudoEducacional("Matematica", 300)
    val disciplina2 = ConteudoEducacional("Fisica", 330)
    val conteudosEducacionais = mutableListOf(disciplina1, disciplina2)
    println("CURSOS -> $conteudosEducacionais")
    
    val selNivel = Nivel.INTERMEDIARIO
    val nivel = when (selNivel) {
        Nivel.BASICO -> "Básico"
        Nivel.INTERMEDIARIO -> "Intermediário"
        Nivel.DIFICIL -> "Difícil"
    }
     var formando = Formacao("Exatas", nivel, conteudosEducacionais )
    println("Formação -> $formando")

    val aluno = Usuario("Aluno1")
    formando.matricular(aluno)
}