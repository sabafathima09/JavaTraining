package com.oops.inher;

public class ElecMain {
public static void main(String[] args) {
	Mobile mobile = new Mobile("motorola",20000.0,"moto m12","pixeler");
	mobile.showCameratype();
	String[] port = {"HDMI", "USB", "LAN"};
	Laptop laptop = new Laptop("Dell",10000.0,"dell xp",port);
	laptop.showports();
}
}
