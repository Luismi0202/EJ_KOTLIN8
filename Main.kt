
fun main(){
    var libro1 = Libro("Quijote","Mancha",100,7)
    var libro2 = Libro("Juanitotenorio","juan",50,10)
    var conjuntoLuismi = ConjuntoLibros()

    conjuntoLuismi.anadirLibro(libro1)
    conjuntoLuismi.anadirLibro(libro2)
    conjuntoLuismi.mostrarContenido()

    conjuntoLuismi.mostrarMayoraMenor()
    conjuntoLuismi.mostrarMenoraMayor()

    conjuntoLuismi.eliminarLibroPorAutor("Mancha")
    conjuntoLuismi.eliminarLibroPorTitulo("Juanitotenorio")

    conjuntoLuismi.anadirLibro(Libro("OnePiece","Oda",100000,10))
    conjuntoLuismi.mostrarContenido()
}