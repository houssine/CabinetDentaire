package cabinet

class RDV {
	Date date
	Assistante assistante
	static hasMany=[patients:Patient]
	static belongsTo=[Assistante, Patient]

	static constraints = { date(blank:false) }
}
