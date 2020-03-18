### Scott Waechter
### GEO 308 Final Project
## Using GIS to locate psychics

### [Click this link to read the report on my GitHub.io page](https://awaechter.github.io/Radio_Psychic.html)

This repository contains the following:

* __LocatingPsychicsReport.pdf__ - A full project report, also viewable at the link above
* __LocatingPsychicsVisual.tif__ - A large layout of resultant visuals and explanation
* __CustomDelimiter.java__ - program written specifically to turn the raw radio data into a delimited form that can be read by Excel etc. Included as a novelty
* __Original_Data__ - Folder containing the original data I used, accessed Fall 2019
	* __fmradio.txt__ - FM Radio data from FCC website, after processing with CustomDelimiter.java
	* __ALLFMRadioTableWithHeaders.csv__ - Formatted table of FM Radio data
	* __Colleges-and-Universities__ - Point shapefile from HIFLD of over 7000 post-secondary institutes in the USA
	* __Colleges_Retention.csv__ - Table data from IPEDS of graduation and transfer-out rates of colleges
* __Resultant_Shapefiles__ - Folder containing final resultant shapefiles
	* __FM_Stations_Reach__ - Buffer polygon shapefile of all FM stations signal range at 60dBu, calculated as described in my report
	* __Colleges_SignalsInRange__ - Point shapefile of colleges and universities, with fields for rate of academic success, number of FM signals in range, and finally, radio effect on cognition, all calculated as described in my report
	* __Vortexes__ - Point shapefile of several prominent vortices / places of power in the USA
	* __Ley_Lines__ - Line shapefile of ley lines over the USA, gathered by georeference
* __Psychics_Geodatabase.gdb__ - Full Esri geodatabase at end of project, including the above shapefiles plus intermediate shapefiles
* __README.md__ - The file you're reading