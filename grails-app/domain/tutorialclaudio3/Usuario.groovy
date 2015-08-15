package tutorialclaudio3

class Usuario {
	String nome
    static constraints = {
		nome(nullable:false,blank:false,unique:true)
    }
}
