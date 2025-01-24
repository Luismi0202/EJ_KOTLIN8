class ConjuntoLibros {
    var libros: Array<Libro?> = arrayOfNulls(20)

    private fun existeLibro(libroAnadido:Libro): Boolean{
        for(libro in libros){
            if(libro == libroAnadido){
                return true
            }
        }
        return false
    }

    private fun limitePermitido():Boolean{
        var contador = 0
        for(libro in libros){
            if(libro != null){
                contador++
            }
        }
        return contador > libros.size
    }

    fun mostrarContenido(){
        for(libro in libros){
            println(libro)
        }
    }

    fun anadirLibro(libroAnadido:Libro):Boolean{
        if(existeLibro(libroAnadido)){
            println("¡No se ha podido añadir el libro! El libro ${libroAnadido.titulo} ya existe")
            return false
        }
        if(limitePermitido()){
            println("¡No se pueden añadir más libros!")
            return false
        }

        else{
            var anadido = false
            var contador = 0
            do{
                if(libros[contador] == null){
                    libros[contador] = libroAnadido
                    anadido = true
                }
                contador++
            }while(!anadido)
        }
        return true
    }

    fun eliminarLibroPorTitulo(titulo:String){
        var contador = 0
        var eliminado = false
        for(libro in libros){
            if(libro?.titulo == titulo){
                libros[contador] = null
                eliminado = true
            }
            contador++
        }
        println(if(eliminado == false) "Libro no encontrado" else "¡Libro eliminado con éxito!")
    }

    fun eliminarLibroPorAutor(autor:String){
        var contador = 0
        var eliminado = false
        for(libro in libros){
            if(libro?.autor == autor){
                libros[contador] = null
                eliminado = true
            }
            contador++
        }
        println(if(eliminado == false) "Libro no encontrado" else "¡Libro eliminado con éxito!")
    }

    fun mostrarMenoraMayor(){
        var librosOrdenados = libros.sortedBy{it?.calificacion}
        for (libro in librosOrdenados){
            if(libro != null){
                println(libro)
            }
        }
    }

    fun mostrarMayoraMenor(){
        var librosOrdenados = libros.sortedByDescending{it?.calificacion}
        for (libro in librosOrdenados){
            if(libro != null){
                println(libro)
            }
        }
    }
}