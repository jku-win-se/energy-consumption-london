# Energy Consumption London

This project is an importer from the CSV provided by Smarter SmartMeter Energy Consumption Data in London households to XMI format.
CSV available at: https://data.london.gov.uk/dataset/smartmeter-energy-use-data-in-london-households

The project energy.comsumption.sample.mm was developed by using EMF. As follows it is described some folder within the project:
  - model: contains the Ecore meta-model designed to support the CSV data
  - data: contains the file LCL-June2015v2_0.csv (contains 1 millions of rows of electricity measure KWH/hh (per half hour)). The other file is LCLModel.zip which contains the file LCLModel.ec that is the XMI representation of the LCL-June2015v2_0.csv which follows the structure of the Ecore meta-model within the model folder. In addition, this folder contains the file LCLModel_4000 that only contains 4000 of electrical energy consumption.
  - In order to import the data. The user may use the class in: src/energy/comsumption/sample/mm/EnergyConsumptionImporter_4000.java. Execute this class as JUnit Plug-in Test.

Please, check the videoclip in /instructions to run the provided code.

Planned Agenda: 

- 9:00 – 9:30 Mentoring time slot I
- 13:00 – 13:30 Mentoring time slot II
- 17:00 – 17:30 Short presentation about the results

Eclipse Dependencies
  - Apache Commons CSV
    - Update Site: https://download.eclipse.org/tools/orbit/downloads/2021-12
    -  Install only Apache Commons CSV

