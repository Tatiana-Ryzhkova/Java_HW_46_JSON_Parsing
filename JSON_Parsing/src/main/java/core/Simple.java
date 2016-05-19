package core;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.json.Json;
import javax.json.stream.JsonParser;
import javax.json.stream.JsonParser.Event;

public class Simple {

	public static void main(String[] args) throws IOException {
		
		URL urlUSA = new URL("http://www.geoplugin.net/json.gp?ip=216.113.169.239");
		// URL urlRU = new URL ("http://www.geoplugin.net/json.gp?ip=213.87.141.36");
		// URL urlLV = new URL ("http://www.geoplugin.net/json.gp?ip=78.84.151.26");
		// URL urlLU = new URL ("http://www.geoplugin.net/json.gp?ip=85.94.240.224");
		// URL urlCH = new URL ("http://www.geoplugin.net/json.gp?ip=213.55.176.199");

		final String element_01 = "geoplugin_city";
		final String element_02 = "geoplugin_region";
		final String element_03 = "geoplugin_latitude";
		final String element_04 = "geoplugin_longitude";

		String element_name_01 = "City: ";
		String element_name_02 = "State: ";
		String element_name_03 = "Latitude: ";
		String element_name_04 = "Longitude: ";

		InputStream is1 = urlUSA.openStream();
		JsonParser parser1 = Json.createParser(is1);

		while (parser1.hasNext()) {

		Event e = parser1.next();

		if (e == Event.KEY_NAME) {

			switch (parser1.getString()) {

			case element_01:
				parser1.next();
				System.out.println(element_name_01 + parser1.getString());
			break;

			case element_02:
				parser1.next();
				System.out.println(element_name_02 + parser1.getString());
			break;
			
			case element_03:
				parser1.next();
				System.out.println(element_name_03 + parser1.getString());
			break;
			
			case element_04:
				parser1.next();
				System.out.println(element_name_04 + parser1.getString());
			break;
			} } } } }