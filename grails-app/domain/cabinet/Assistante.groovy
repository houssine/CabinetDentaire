package cabinet



class Assistante  {
	String nom
	String prenom
	int tel
	String adresse
	String mail
	
	
	static hasMany=[rdvs:RDV]
	static belongsTo=[caisses:Caisse]

	static constraints = {
		nom(blank:false)
		prenom(blank:false)
		tel(blank:false)
		adresse(blank:false)
		mail(email:true )
	}
}
