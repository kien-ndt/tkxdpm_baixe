package entity;

public class Station {
	public String stationID;
	public String stationName;
	public String stationAddress;
	public int c_Bike;
	public int c_EBike;
	public int c_TBike;
	public int c_emptyDocks;

	public String getStationID() {
		return stationID;
	}

	public String getStationName() {
		return stationName;
	}

	public String getStationAddress() {
		return stationAddress;
	}

	public int getC_Bike() {
		return c_Bike;
	}

	public int getC_EBike() {
		return c_EBike;
	}

	public int getC_TBike() {
		return c_TBike;
	}

	public int getC_emptyDocks() {
		return c_emptyDocks;
	}
}
