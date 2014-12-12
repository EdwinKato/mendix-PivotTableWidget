// This file was generated by Mendix Business Modeler.
//
// WARNING: Code you write here will be lost the next time you deploy the project.

package myfirstmodule.proxies;

public enum Region
{
	North(new String[][] { new String[] { "en_US", "North" } }),
	South(new String[][] { new String[] { "en_US", "South" } }),
	East(new String[][] { new String[] { "en_US", "East" } }),
	West(new String[][] { new String[] { "en_US", "West" } });

	private java.util.Map<String,String> captions;

	private Region(String[][] captionStrings)
	{
		this.captions = new java.util.HashMap<String,String>();
		for (String[] captionString : captionStrings)
			captions.put(captionString[0], captionString[1]);
	}

	public String getCaption(String languageCode)
	{
		if (captions.containsKey(languageCode))
			return captions.get(languageCode);
		return captions.get("en_US");
	}

	public String getCaption()
	{
		return captions.get("en_US");
	}
}
