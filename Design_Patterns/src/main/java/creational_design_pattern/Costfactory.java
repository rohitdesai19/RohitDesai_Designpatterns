package creational_design_pattern;

public class Costfactory {
public Specialization getPhone(String s)
{
	if (s.equals("Micromax"))
{
	return new Micromax();
}
	else if(s.equals("Nokia"))
			{
		return new Nokia();
				
			}
	else if(s.equals("Samsung"))
	{
		return new Samsung();
		
	}
	else
	{
		return(null);
	}
	
	
	
	
}
}
