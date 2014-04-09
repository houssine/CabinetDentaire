package cabinet

class Consulatation {

	int numero_consultation
    String nom_Patient
	static belongsTo=[medecins:Medecin]
  static constraints = {
	  numero_consultation(blank:false)
	  nom_Patient(blank:true)
  }
}
