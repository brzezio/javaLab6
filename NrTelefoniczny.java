
class NrTelefoniczny implements Comparable<NrTelefoniczny>
{
	public int nrkierunkowy;
	public int nrTelefonu;
	
	public NrTelefoniczny(int kier,int nr)
	{
		nrkierunkowy=kier;
		nrTelefonu=nr;
	}

	public int compareTo(NrTelefoniczny drugi)
	{
		if(this.nrkierunkowy==drugi.nrkierunkowy&&this.nrTelefonu==drugi.nrTelefonu)
			return 0;
		else return 1;
	}
	
	public String info()
	{
		return Integer.toString(nrkierunkowy)+Integer.toString(nrTelefonu);
	}
	
}
