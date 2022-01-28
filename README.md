# Energy Consumption London

This project is an importer from the CSV provided by Smarter SmartMeter Energy Consumption Data in London households to XMI format.
CSV available at: https://data.london.gov.uk/dataset/smartmeter-energy-use-data-in-london-households

The project energy.comsumption.sample.mm was developed by using EMF. As follows it is described some folder within the project:
  - model: contains the Ecore meta-model designed to support the CSV data
  - data: contains the file LCL-June2015v2_0.csv (contains 1 millions of rows of electricity measure KWH/hh (per half hour)). The other file is LCLModel.zip which contains the file LCLModel.ec that is the XMI representation of the LCL-June2015v2_0.csv which follows the structure of the Ecore meta-model within the model folder
