class Libro(
    var titulo: String,
    var autor: String,
    var numPaginas: Int,
    var calificacion: Int
) {
    override fun toString(): String {
        return "Titulo: $titulo autor: $autor numPaginas: $numPaginas calificacion: $calificacion"
    }
}