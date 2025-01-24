class Libro(
    var titulo: String,
    var autor: String,
    var numPaginas: Int,
    var calificacion: Int
) {
    init{
        require(calificacion in 0..10){"La calificación tiene que estar en el rango de 0 y 10!"}
        require(numPaginas > 0){"¡Un libro no puede tener 0 páginas!"}
        require(titulo.trim().isNotEmpty()){"¡Un libro tiene que tener un título!"}
        if(autor.trim().isEmpty()) autor = "Anónimo"
    }
    override fun toString(): String {
        return "Titulo: $titulo autor: $autor numPaginas: $numPaginas calificacion: $calificacion"
    }
}