fun main(){
    val song = Song("Hola", "yo", 2024, 1500 )
    song.imprimirDescripcionCancion()
    println(song.popularidad())

}

data class Song (
    val titulo:String,
    val artista:String,
    val anioPublicacion:Int,
    val recuento:Int){

    fun popularidad ():Boolean{
        var popular=false;
        if(recuento>=1000){
            popular=true;
        }
        return popular
    }

    fun imprimirDescripcionCancion(){
        println("$titulo, interpretada por $artista, se lanzó en , $anioPublicacion")
    }


}



