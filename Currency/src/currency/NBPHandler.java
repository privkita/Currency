package currency;

import java.io.IOException;
import java.io.InputStream;
import java.net.URL;
import java.time.LocalDate;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpressionException;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class NBPHandler {
	
	public static Table getTable() {
		Document doc = readXML("http://api.nbp.pl/api/exchangerates/tables/A?format=xml");
		return tableFromXML(doc);
	}
	
	public static Document readXML(String adress) {
		try {
			DocumentBuilderFactory dbf = DocumentBuilderFactory.newInstance();
			DocumentBuilder db = dbf.newDocumentBuilder();
			
			URL url = new URL(adress);
			try(InputStream in = url.openStream()) {
				return db.parse(in);
			}
		} catch (ParserConfigurationException | SAXException | IOException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	private static Table tableFromXML(Document doc) {
		try {
			XPathFactory xpf = XPathFactory.newInstance();
			XPath xpath = xpf.newXPath();
		
			String tableNumber = xpath.evaluate("//No", doc);
			LocalDate tableDate = LocalDate.parse(xpath.evaluate("//EffectiveDate", doc));
			
			Table currenciesTable = new Table(tableNumber, tableDate);
			
			NodeList rates = (NodeList)xpath.evaluate("//rate", doc, XPathConstants.NODESET);
			for(int i = 0; i < rates.getLength(); i++) {
				Node rate = rates.item(i);
				String currencyName = xpath.evaluate("Currency", doc);
				String currencyCode = xpath.evaluate("Code", doc);
				String currencyRate = xpath.evaluate("Mid", doc);
				Currency currency = new Currency(currencyName, currencyCode, currencyRate);
				currenciesTable.addCurrency(currency);
			}
			return currenciesTable;
			
		} catch (XPathExpressionException e) {
			e.printStackTrace();
			return null;
		}
	}
}
