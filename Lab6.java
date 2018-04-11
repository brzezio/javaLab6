import java.util.TreeMap;
import java.util.Collection;
import java.util.Iterator;

class Lab6
{
	public static void main(String[] args)
	{
		Osoba[] osoby=new Osoba[3];
		osoby[0]=new Osoba("Aaaa","Bbbbb","cccc",new NrTelefoniczny(42,123456789));
		osoby[1]=new Osoba("Dddd","Eeeee","Ffff",new NrTelefoniczny(42,123456788));
		osoby[2]=new Osoba("Gggg","Hhhhh","Iiii",new NrTelefoniczny(42,123456787));
		Firma[] firmy=new Firma[3];
		firmy[0]=new Firma("aaaa","bbbbb",new NrTelefoniczny(42,123456786));
		firmy[1]=new Firma("cccc","ddddd",new NrTelefoniczny(42,123456785));
		firmy[2]=new Firma("eeee","fffff",new NrTelefoniczny(42,123456784));
		TreeMap<String,Wpis> treeMap=new TreeMap<String,Wpis>();
		for(int i=0;i<3;i++)
		{
			treeMap.put(osoby[i].nrTel.info(),osoby[i]);
			treeMap.put(firmy[i].nrTel.info(),firmy[i]);
		}
		Collection c=treeMap.values();
		Iterator i=c.iterator();
		
		while(i.hasNext())
		{
			System.out.println(((Wpis)i.next()).opis());
		}
		
	}
}
