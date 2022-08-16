package classe

class MaquinaDados {
    private var id: Int
    private var machine_tag: String
    private var start_time: String
    private var end_time: String
    private var reason: String

    constructor(id:Int, machine_tag:String, start_time: String, end_time:String, reason:String){
        this.id = id;
        this.machine_tag = machine_tag;
        this.start_time = start_time;
        this.end_time = end_time;
        this.reason = reason;
    }

    init {
        println("Bloco de inicialização")
    }

    fun getMaquinaId():Int{
        return id;
    }

    fun getMachine_tag():String{
        return machine_tag;
    }

    fun getStart_time(): String{
        return start_time;
    }

    fun getEnd_time():String{
        return end_time;
    }

    fun getReason():String{
        return reason;
    }

    fun setMaquinaDados(id:Int, machine_tag:String, start_time: String, end_time:String, reason:String){
        MaquinaDados(id,machine_tag,start_time,end_time,reason)
    }
}