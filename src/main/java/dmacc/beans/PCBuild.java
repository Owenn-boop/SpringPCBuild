package dmacc.beans;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import org.springframework.beans.factory.annotation.Autowired;

@Entity
public class PCBuild {
	@Id
	@GeneratedValue
	private long id;
	private String name;
	private int gigsOfRam; // ram that the build has
	private String graphicsCard; // graphics card inside of the system
	private float cpuClockSpeed; // speed of the cpu in the system
	private boolean wifi; // is there on-board wifi?
	// lots of room for addition PC build parameters
	
	public PCBuild() {
		super();
	}
	
	public PCBuild(String name) {
		super();
		this.name = name;
	}
	
	public PCBuild(String name, int gigsOfRam, String graphicsCard, float cpuClockSpeed, boolean wifi) {
		super();
		this.name = name;
		this.gigsOfRam = gigsOfRam;
		this.graphicsCard = graphicsCard;
		this.cpuClockSpeed = cpuClockSpeed;
		this.wifi = wifi;
	}
	
	public PCBuild(long id, String name, int gigsOfRam, String graphicsCard, float cpuClockSpeed, boolean wifi) {
		super();
		this.id = id;
		this.name = name;
		this.gigsOfRam = gigsOfRam;
		this.graphicsCard = graphicsCard;
		this.cpuClockSpeed = cpuClockSpeed;
		this.wifi = wifi;
	}
	
	// start of getters and setters
	//
	//
	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getGigsOfRam() {
		return gigsOfRam;
	}

	public void setGigsOfRam(int gigsOfRam) {
		this.gigsOfRam = gigsOfRam;
	}

	public String getGraphicsCard() {
		return graphicsCard;
	}

	public void setGraphicsCard(String graphicsCard) {
		this.graphicsCard = graphicsCard;
	}

	public float getCpuClockSpeed() {
		return cpuClockSpeed;
	}

	public void setCpuClockSpeed(float cpuClockSpeed) {
		this.cpuClockSpeed = cpuClockSpeed;
	}

	public boolean isWifi() {
		return wifi;
	}

	public void setWifi(boolean wifi) {
		this.wifi = wifi;
	}
	//
	//
	// end of getters and setters

	@Override
	public String toString() {
		return "PCBuild [id=" + id + ", name=" + name + ", gigsOfRam=" + gigsOfRam + ", graphicsCard=" + graphicsCard +
				", cpuClockSpeed=" + cpuClockSpeed + ", wifi=" + wifi
				+ "]";
	}

	
}
