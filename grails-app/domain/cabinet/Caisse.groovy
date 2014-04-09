package cabinet

class Caisse {

    
	int montant_depense
	int montant_restant
	Assistante assistante
        static constraints = {
		montant_depense(blank:false)
		montant_restant(blank:false)
    }
}
