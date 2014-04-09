package cabinet
 class Patient {

	String nom
	String prenom
	int tel
	String adresse
	String mail
	int poids
	String sexe
	
	
	static hasMany=[rdvs:RDV]

	static constraints = {
		nom(blank:false)
		prenom(blank:false)
		tel(blank:false)
		adresse(blank:false)
		mail(email:true )
		poids(blank:false)
		sexe(blank:false)

 
    }
}
