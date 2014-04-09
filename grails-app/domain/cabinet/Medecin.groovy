package cabinet


class Medecin {

	String nom
	String prenom
	int tel
	String adresse
	String mail
	
	
	static hasMany=[consultations:Consulatation]

	static constraints = {
		nom(blank:false)
		prenom(blank:false)
		tel(blank:false)
		adresse(blank:false)
		mail(email:true)
    }
}
