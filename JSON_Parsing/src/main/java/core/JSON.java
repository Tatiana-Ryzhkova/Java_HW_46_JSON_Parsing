package core;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;

import javax.json.Json;
import javax.json.stream.JsonParser;
import javax.json.stream.JsonParser.Event;

public class JSON {
public static void main(String[] args) throws IOException {
		
		URL urlUSA = new URL("http://www.geoplugin.net/json.gp?ip=216.113.169.239");
		URL urlFR = new URL ("http://www.geoplugin.net/json.gp?ip=88.191.179.56");
		URL urlCH = new URL ("http://www.geoplugin.net/json.gp?ip=61.135.248.220");
		URL urlGB = new URL ("http://www.geoplugin.net/json.gp?ip=92.40.254.196");
		URL urlUK = new URL ("http://www.geoplugin.net/json.gp?ip=93.183.203.67");
		URL urlRU = new URL ("http://www.geoplugin.net/json.gp?ip=213.87.141.36");
		URL urlLV = new URL ("http://www.geoplugin.net/json.gp?ip=78.84.151.26");
		URL urlLU = new URL ("http://www.geoplugin.net/json.gp?ip=85.94.240.224");
		URL urlCHF = new URL ("http://www.geoplugin.net/json.gp?ip=213.55.176.199");
		
		final String element_01 = "geoplugin_city";
		final String element_02 = "geoplugin_countryName";
		final String element_03 = "geoplugin_latitude";
		final String element_04 = "geoplugin_longitude";

		String element_name_01 = "City: ";
		String element_name_02 = "Country: ";
		String element_name_03 = "Latitude: ";
		String element_name_04 = "Longitude: ";

		 
		InputStream is1 = urlUSA.openStream();
		JsonParser parser1 = Json.createParser(is1);
		
		InputStream is2 = urlFR.openStream();
		JsonParser parser2 = Json.createParser(is2);
		
		InputStream is3 = urlCH.openStream();
		JsonParser parser3 = Json.createParser(is3);
		
		InputStream is4 = urlGB.openStream();
		JsonParser parser4 = Json.createParser(is4);

		InputStream is5 = urlUK.openStream();
		JsonParser parser5 = Json.createParser(is5);
		
		InputStream is6 = urlRU.openStream();
		JsonParser parser6 = Json.createParser(is6);
		
		InputStream is7 = urlLV.openStream();
		JsonParser parser7 = Json.createParser(is7);
		
		InputStream is8 = urlLU.openStream();
		JsonParser parser8 = Json.createParser(is8);
		
		InputStream is9 = urlCHF.openStream();
		JsonParser parser9 = Json.createParser(is9);




		// USA
		
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
				System.out.println("////");
			break; 			} } }
		
// France
		
while (parser2.hasNext()) {

Event e = parser2.next();

if (e == Event.KEY_NAME) {

switch (parser2.getString()) {

case element_01:
	parser2.next();
	System.out.println(element_name_01 + parser2.getString());
break;

case element_02:
	parser2.next();
	System.out.println(element_name_02 + parser2.getString());
break;

case element_03:
	parser2.next();
	System.out.println(element_name_03 + parser2.getString());
break;

case element_04:
	parser2.next();
	System.out.println(element_name_04 + parser2.getString());
	System.out.println("////");
break; } } }

// China

while (parser3.hasNext()) {

Event e = parser3.next();

if (e == Event.KEY_NAME) {

switch (parser3.getString()) {

case element_01:
parser3.next();
System.out.println(element_name_01 + parser3.getString());
break;

case element_02:
parser3.next();
System.out.println(element_name_02 + parser3.getString());
break;

case element_03:
parser3.next();
System.out.println(element_name_03 + parser3.getString());
break;

case element_04:
parser3.next();
System.out.println(element_name_04 + parser3.getString());
System.out.println("////");
break; } } }


// Great Britain

while (parser4.hasNext()) {

Event e = parser4.next();

if (e == Event.KEY_NAME) {

switch (parser4.getString()) {

case element_01:
parser4.next();
System.out.println(element_name_01 + parser4.getString());
break;

case element_02:
parser4.next();
System.out.println(element_name_02 + parser4.getString());
break;

case element_03:
parser4.next();
System.out.println(element_name_03 + parser4.getString());
break;

case element_04:
parser4.next();
System.out.println(element_name_04 + parser4.getString());
System.out.println("////");
break; } } }

// Ukraine

while (parser5.hasNext()) {

Event e = parser5.next();

if (e == Event.KEY_NAME) {

switch (parser5.getString()) {

case element_01:
parser5.next();
System.out.println(element_name_01 + parser5.getString());
break;

case element_02:
parser5.next();
System.out.println(element_name_02 + parser5.getString());
break;

case element_03:
parser5.next();
System.out.println(element_name_03 + parser5.getString());
break;

case element_04:
parser5.next();
System.out.println(element_name_04 + parser5.getString());
System.out.println("////");
break; } } }

// Latvia

while (parser6.hasNext()) {

Event e = parser6.next();

if (e == Event.KEY_NAME) {

switch (parser6.getString()) {

case element_01:
parser6.next();
System.out.println(element_name_01 + parser6.getString());
break;

case element_02:
parser6.next();
System.out.println(element_name_02 + parser6.getString());
break;

case element_03:
parser6.next();
System.out.println(element_name_03 + parser6.getString());
break;

case element_04:
parser6.next();
System.out.println(element_name_04 + parser6.getString());
System.out.println("////");
break; } } }

//Russia

while (parser7.hasNext()) {

Event e = parser7.next();

if (e == Event.KEY_NAME) {

switch (parser7.getString()) {

case element_01:
parser7.next();
System.out.println(element_name_01 + parser7.getString());
break;

case element_02:
parser7.next();
System.out.println(element_name_02 + parser7.getString());
break;

case element_03:
parser7.next();
System.out.println(element_name_03 + parser7.getString());
break;

case element_04:
parser7.next();
System.out.println(element_name_04 + parser7.getString());
System.out.println("////");
break;  } } }

// Luxembourg

while (parser8.hasNext()) {

Event e = parser8.next();

if (e == Event.KEY_NAME) {

switch (parser8.getString()) {

case element_01:
	parser8.next();
	System.out.println(element_name_01 + parser8.getString());
break;

case element_02:
	parser8.next();
	System.out.println(element_name_02 + parser8.getString());
break;

case element_03:
	parser8.next();
	System.out.println(element_name_03 + parser8.getString());
break;

case element_04:
parser8.next();
	System.out.println(element_name_04 + parser8.getString());
	System.out.println("////");
break; } } }

// Switzerland

		while (parser9.hasNext()) {

		Event e = parser9.next();

		if (e == Event.KEY_NAME) {

			switch (parser9.getString()) {

			case element_01:
				parser9.next();
				System.out.println(element_name_01 + parser9.getString());
			break;

			case element_02:
				parser9.next();
				System.out.println(element_name_02 + parser9.getString());
			break;
			
			case element_03:
				parser9.next();
				System.out.println(element_name_03 + parser9.getString());
			break;
			
			case element_04:
				parser9.next();
				System.out.println(element_name_04 + parser9.getString());
				System.out.println("////");
			break;} } }
} } 