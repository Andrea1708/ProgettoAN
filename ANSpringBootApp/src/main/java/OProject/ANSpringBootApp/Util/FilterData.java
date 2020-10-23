package OProject.ANSpringBootApp.Util;

import java.util.ArrayList;

import OProject.ANSpringBootApp.JSON.JsonParser;
import OProject.ANSpringBootApp.JSON.JsonProcessing;
import OProject.ANSpringBootApp.Model.Nation;

public class FilterData {
	public static ArrayList<Nation> DataFil (String Slug, String From){
	ArrayList<String> roster = new ArrayList<String>();
	ArrayList<Nation> LS = new ArrayList<Nation>();
	if(FilterSlug.SlugCheck(Slug, FilterSlug.SlugTake(JsonProcessing.readURL())) == true);
			JsonParser.Parsing3(JsonProcessing.readURL3(Slug,From),LS);
		return LS;

}
}
