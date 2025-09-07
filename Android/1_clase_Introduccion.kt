//es necesario instalar un compilador de kotlinc
//usando la powershell en modo admin:
//$ choco install kotlinc
//$ kotlinc -version

//para compilar y luego ejecutar en vscode:
//$ kotlinc Main.kt -include-runtime -d Main.jar
//$ java -jar Main.jar

//modo mas rapido:
//$ kotlinc -script Main.kt


fun main(){

    var numero:Int = 10
    numero = 15

    var texto:String = "palabra"
    texto = "frase"

    var booleano:Boolean = true
    booleano = false


    //sin usar tipo de dato
    var num = 5
    var text = "hola"
    var bool = false


    println(numero)
    println(texto)
    println(booleano)
}