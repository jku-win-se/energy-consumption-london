package energy.comsumption.sample.mm;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.Reader;
import java.nio.file.FileSystems;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.Locale;

import org.apache.commons.csv.CSVFormat;
import org.apache.commons.csv.CSVRecord;
import org.eclipse.emf.common.util.URI;
import org.eclipse.emf.ecore.resource.Resource;
import org.eclipse.emf.ecore.resource.ResourceSet;
import org.eclipse.emf.ecore.resource.impl.ResourceSetImpl;
import org.junit.jupiter.api.Test;

import energy.comsumption.sample.mm.EnergyProvider.City;
import energy.comsumption.sample.mm.EnergyProvider.ElectricalEnergyConsumption;
import energy.comsumption.sample.mm.EnergyProvider.EnergyProvider;
import energy.comsumption.sample.mm.EnergyProvider.HouseHold;
import energy.comsumption.sample.mm.EnergyProvider.impl.EnergyConsumptionFactoryImpl;

class EnergyConsumptionImporter {
	
	public static String[] HEADERS = { "LCLid", "stdorToU", "DateTime", "KWH/hh (per half hour)"};
	
	@Test
	void test() {
			try {
			//Create Resource
			ResourceSet reset = new ResourceSetImpl();
			//Path
			java.net.URI root = FileSystems.getDefault().getPath("data").resolve("LCLModel.ec").toAbsolutePath().toUri();
			Resource res = reset.createResource(URI.createURI(root.toString()));
			//Root Object
			EnergyProvider energyProvider = EnergyConsumptionFactoryImpl.init().createEnergyProvider();
			energyProvider.setCompanyName("UK Power Networks");
			res.getContents().add(energyProvider);
			//Add London City
			City londonCity = EnergyConsumptionFactoryImpl.init().createCity();
			londonCity.setName("London");
			energyProvider.getCities().add(londonCity);
			//Read CSV
			Reader in = new FileReader("data/LCL-June2015v2_0.csv");
			Iterable<CSVRecord> records = CSVFormat.DEFAULT
				      .withHeader(HEADERS)
				      .withFirstRecordAsHeader()
				      .parse(in);
			DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-M-dd H:m:s.n", Locale.UK);
			for (CSVRecord record : records) {
				String houseHoldID = record.get(0);
		        String dateTime = record.get(2);
		        String kwh = record.get(3);
		        //kwh may be Null in some case, in this case we change the value to -1
		        if (kwh.equals("Null")) {
		        	kwh = "-1";
		        }
		        HouseHold houseHold = energyProvider.getHousehold()
		        			.parallelStream()
		        			.filter(hh -> hh.getHouseHoldId().equals(houseHoldID))
		        			.findAny()
		        			.orElse(null);
		        if (houseHold == null) {
		        	houseHold = EnergyConsumptionFactoryImpl.init().createHouseHold();
		        	houseHold.setCity(londonCity);
		        	houseHold.setHouseHoldId(houseHoldID);
		        	energyProvider.getHousehold().add(houseHold);
		        }
		        //Create Electrical Energy Consumption
		        ElectricalEnergyConsumption electricalEnergyConsumption = EnergyConsumptionFactoryImpl.init().createElectricalEnergyConsumption();
		        LocalDateTime date = LocalDateTime.parse(dateTime, formatter);		        
		        electricalEnergyConsumption.setHousehold(houseHold);
		        electricalEnergyConsumption.setDateTime(java.sql.Timestamp.valueOf(date));
		        electricalEnergyConsumption.setKwh(Double.valueOf(kwh));	
		        energyProvider.getElectricalEnergyConsumption().add(electricalEnergyConsumption);
		        System.out.println("Size: " + energyProvider.getElectricalEnergyConsumption().size());		        
		    }			
			res.save(Collections.emptyMap());
			System.out.println("Import the CSV File");
		} catch (FileNotFoundException e) {			
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
