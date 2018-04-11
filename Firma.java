class Firma extends Wpis
{
	public String nazwa,adres;
	public NrTelefoniczny nrTel;
	
	public Firma(String Nazwa,String Adres,NrTelefoniczny nr)
	{
		nazwa=Nazwa;
		adres=Adres;
		nrTel=nr;
	}
	
	public String opis()
	{
		StringBuilder stringBuilder=new StringBuilder();
		return (stringBuilder.append(nazwa).append(" ").append(adres).append(" ").append(nrTel.info())).toString();
	}
}
