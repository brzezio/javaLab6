class Osoba extends Wpis
{
	public String imie,nazwisko,adres;
	public NrTelefoniczny nrTel;
	
	public Osoba(String Imie,String Nazwisko,String Adres,NrTelefoniczny nr)
	{
		imie=Imie;
		nazwisko=Nazwisko;
		adres=Adres;
		nrTel=nr;
	}

	public String opis()
	{
		StringBuilder stringBuilder=new StringBuilder();
		return (stringBuilder.append(imie).append(" ").append(nazwisko).append(" ").append(adres).append(" ").append(nrTel.info())).toString();
	}

	
}
