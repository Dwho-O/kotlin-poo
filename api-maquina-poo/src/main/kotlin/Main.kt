import classe.MaquinaDados

fun main(args: Array<String>) {
    var maquina: MaquinaDados? = null
    maquina?.setMaquinaDados(1,"sdfsdf","13:00","14:00","Parada troca de peça")

    if (maquina != null) {
        println(maquina.getMaquinaId())
    }
}