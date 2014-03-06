package test;

/**
 * @author Vincent Lee
 * @version 1.0
 * @since 2013-11-05
 */

import static org.junit.Assert.*;
import modules.vehicle_model_mod;
import org.junit.Test;

public class vehicle_model_test {

	@Test
	public void Acura() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Acura", "CL 3.2 Type-S"));
		assertTrue(instance.add("Acura", "CL Coupe"));
		assertTrue(instance.add("Acura", "ILX Sedan"));
		assertTrue(instance.add("Acura", "ILX Hybrid"));
		assertTrue(instance.add("Acura", "ILX Hybrid Sedan"));
		assertTrue(instance.add("Acura", "Integra Type R"));
		assertTrue(instance.add("Acura", "Integra Hatchback"));
		assertTrue(instance.add("Acura", "Integra Sedan"));
		assertTrue(instance.add("Acura", "Legend Coupe"));
		assertTrue(instance.add("Acura", "Legend Sedan"));
		assertTrue(instance.add("Acura", "MDX SUV"));
		assertTrue(instance.add("Acura", "NSX Coupe"));
		assertTrue(instance.add("Acura", "RDX SUV"));
		assertTrue(instance.add("Acura", "RL Sedan"));
		assertTrue(instance.add("Acura", "RLX Sedan"));
		assertTrue(instance.add("Acura", "RSX Type-S"));
		assertTrue(instance.add("Acura", "RSX Hatchback"));
		assertTrue(instance.add("Acura", "SLX SUV"));
		assertTrue(instance.add("Acura", "TL Sedan"));
		assertTrue(instance.add("Acura", "TL Type-S"));
		assertTrue(instance.add("Acura", "TL 3.2 Type-S"));
		assertTrue(instance.add("Acura", "TSX Sedan"));
		assertTrue(instance.add("Acura", "TSX Sport Wagon"));
		assertTrue(instance.add("Acura", "Vigor Sedan"));
		assertTrue(instance.add("Acura", "ZDX Hatchback"));
	}
	
	@Test
	public void AlfaRomeo() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Alfa Romeo", "4C Coupe"));
	}
	
	@Test
	public void AMGeneral() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("AM General", "Hummer SUV"));
	}
	
	@Test
	public void AstonMartin() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Aston Martin", "DB7 Coupe"));
		assertTrue(instance.add("Aston Martin", "DB7 GT"));
		assertTrue(instance.add("Aston Martin", "DB7 GTA"));
		assertTrue(instance.add("Aston Martin", "DB7 Convertible"));
		assertTrue(instance.add("Aston Martin", "DB9 Coupe"));
		assertTrue(instance.add("Aston Martin", "DB9 Convertible"));
		assertTrue(instance.add("Aston Martin", "DBS Coupe"));
		assertTrue(instance.add("Aston Martin", "DBS Convertible"));
		assertTrue(instance.add("Aston Martin", "Rapide Sedan"));
		assertTrue(instance.add("Aston Martin", "Rapide S Sedan"));
		assertTrue(instance.add("Aston Martin", "V12 Vanquish Coupe"));
		assertTrue(instance.add("Aston Martin", "V12 Vanquish S"));
		assertTrue(instance.add("Aston Martin", "V12 Vantage Coupe"));
		assertTrue(instance.add("Aston Martin", "V8 Vantage Coupe"));
		assertTrue(instance.add("Aston Martin", "V8 Vantage Convertible"));
		assertTrue(instance.add("Aston Martin", "V8 Vantage S Roadster"));
		assertTrue(instance.add("Aston Martin", "V8 Vantage S"));
		assertTrue(instance.add("Aston Martin", "V8 Vantage N400"));
		assertTrue(instance.add("Aston Martin", "V8 Vantage N400 Roadster"));
		assertTrue(instance.add("Aston Martin", "Vanquish Coupe"));
		assertTrue(instance.add("Aston Martin", "Virage Coupe"));
		assertTrue(instance.add("Aston Martin", "Virage Convertible"));
	}
	
	@Test
	public void Audi() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Audi", "100 Sedan"));
		assertTrue(instance.add("Audi", "100 Wagon"));
		assertTrue(instance.add("Audi", "200 Wagon"));
		assertTrue(instance.add("Audi", "200 Sedan"));
		assertTrue(instance.add("Audi", "80 Sedan"));
		assertTrue(instance.add("Audi", "90 Sedan"));
		assertTrue(instance.add("Audi", "A3 Convertible"));
		assertTrue(instance.add("Audi", "A3 Sedan"));
		assertTrue(instance.add("Audi", "A3 Diesel"));
		assertTrue(instance.add("Audi", "A3 Wagon"));
		assertTrue(instance.add("Audi", "A3 e-tron Hatchback"));
		assertTrue(instance.add("Audi", "A4 Sedan"));
		assertTrue(instance.add("Audi", "A4 Wagon"));
		assertTrue(instance.add("Audi", "A4 Convertible"));
		assertTrue(instance.add("Audi", "A5 Coupe"));
		assertTrue(instance.add("Audi", "A5 Convertible"));
		assertTrue(instance.add("Audi", "A6 Sedan"));
		assertTrue(instance.add("Audi", "A6 Diesel"));
		assertTrue(instance.add("Audi", "A6 Wagon"));
		assertTrue(instance.add("Audi", "A7 Sedan"));
		assertTrue(instance.add("Audi", "A7 Diesel"));
		assertTrue(instance.add("Audi", "A8 Sedan"));
		assertTrue(instance.add("Audi", "A8 Diesel"));
		assertTrue(instance.add("Audi", "allroad Wagon"));
		assertTrue(instance.add("Audi", "allroad quattro Wagon"));
		assertTrue(instance.add("Audi", "Cabriolet Convertible"));
		assertTrue(instance.add("Audi", "Coupe Hatchback"));
		assertTrue(instance.add("Audi", "Q3 SUV"));
		assertTrue(instance.add("Audi", "Q5 Hybrid"));
		assertTrue(instance.add("Audi", "Q5 SUV"));
		assertTrue(instance.add("Audi", "Q5 Diesel"));
		assertTrue(instance.add("Audi", "Q7 SUV"));
		assertTrue(instance.add("Audi", "Q7 Diesel"));
		assertTrue(instance.add("Audi", "R8 Coupe"));
		assertTrue(instance.add("Audi", "R8 Convertible"));
		assertTrue(instance.add("Audi", "R8 GT 5.2 FSI quattro"));
		assertTrue(instance.add("Audi", "R8 GT 5.2 FSI quattro Spyder"));
		assertTrue(instance.add("Audi", "RS 4 Sedan"));
		assertTrue(instance.add("Audi", "RS 4 Convertible"));
		assertTrue(instance.add("Audi", "RS 5 Convertible"));
		assertTrue(instance.add("Audi", "RS 5 Coupe"));
		assertTrue(instance.add("Audi", "RS 6 Sedan"));
		assertTrue(instance.add("Audi", "RS 7 Sedan"));
		assertTrue(instance.add("Audi", "S3 Sedan"));
		assertTrue(instance.add("Audi", "S4 Sedan"));
		assertTrue(instance.add("Audi", "S4 Convertible"));
		assertTrue(instance.add("Audi", "S4 Wagon"));
		assertTrue(instance.add("Audi", "S5 Coupe"));
		assertTrue(instance.add("Audi", "S5 Convertible"));
		assertTrue(instance.add("Audi", "S6 Sedan"));
		assertTrue(instance.add("Audi", "S6 Wagon"));
		assertTrue(instance.add("Audi", "S7 Sedan"));
		assertTrue(instance.add("Audi", "S8 Sedan"));
		assertTrue(instance.add("Audi", "SQ5 SUV"));
		assertTrue(instance.add("Audi", "TT Convertible"));
		assertTrue(instance.add("Audi", "TT Coupe"));
		assertTrue(instance.add("Audi", "TT Hatchback"));
		assertTrue(instance.add("Audi", "TT RS Coupe"));
		assertTrue(instance.add("Audi", "TTS Convertible"));
		assertTrue(instance.add("Audi", "TTS Coupe"));
		assertTrue(instance.add("Audi", "TTS Hatchback"));
		assertTrue(instance.add("Audi", "V8 Sedan"));
	}
	
	@Test
	public void Bentley() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Bentley", "Arnage Sedan"));
		assertTrue(instance.add("Bentley", "Arnage Final Series"));
		assertTrue(instance.add("Bentley", "Arnage T"));
		assertTrue(instance.add("Bentley", "Azure Convertible"));
		assertTrue(instance.add("Bentley", "Azure Mulliner"));
		assertTrue(instance.add("Bentley", "Azure T Convertible"));
		assertTrue(instance.add("Bentley", "Brooklands Coupe"));
		assertTrue(instance.add("Bentley", "Continental R Mulliner"));
		assertTrue(instance.add("Bentley", "Continental Coupe"));
		assertTrue(instance.add("Bentley", "Continental T"));
		assertTrue(instance.add("Bentley", "Continental T Mulliner"));
		assertTrue(instance.add("Bentley", "Continental Flying Spur Sedan"));
		assertTrue(instance.add("Bentley", "Continental Flying Spur Speed Sedan"));
		assertTrue(instance.add("Bentley", "Continental GT Coupe"));
		assertTrue(instance.add("Bentley", "Continental GT Speed Coupe"));
		assertTrue(instance.add("Bentley", "Continental GTC Convertible"));
		assertTrue(instance.add("Bentley", "Continental GTC Speed Convertible"));
		assertTrue(instance.add("Bentley", "Continental Supersports Coupe"));
		assertTrue(instance.add("Bentley", "Continental Supersports Convertible"));
		assertTrue(instance.add("Bentley", "Continental Supersports Convertible Convertible"));
		assertTrue(instance.add("Bentley", "Flying Spur Sedan"));
		assertTrue(instance.add("Bentley", "Mulsanne Sedan"));
	}
	
	@Test
	public void BMW() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("BMW", "1 Series Convertible"));
		assertTrue(instance.add("BMW", "1 Series Coupe"));
		assertTrue(instance.add("BMW", "1 Series M Coupe"));
		assertTrue(instance.add("BMW", "2 Series Coupe"));
		assertTrue(instance.add("BMW", "3 Series Wagon"));
		assertTrue(instance.add("BMW", "3 Series Hybrid"));
		assertTrue(instance.add("BMW", "3 Series Diesel"));
		assertTrue(instance.add("BMW", "3 Series Sedan"));
		assertTrue(instance.add("BMW", "3 Series Coupe"));
		assertTrue(instance.add("BMW", "3 Series Convertible"));
		assertTrue(instance.add("BMW", "3 Series Hatchback"));
		assertTrue(instance.add("BMW", "3 Series Gran Turismo Hatchback"));
		assertTrue(instance.add("BMW", "4 Series Coupe"));
		assertTrue(instance.add("BMW", "5 Series Sedan"));
		assertTrue(instance.add("BMW", "5 Series Diesel"));
		assertTrue(instance.add("BMW", "5 Series Wagon"));
		assertTrue(instance.add("BMW", "5 Series Gran Turismo Hatchback"));
		assertTrue(instance.add("BMW", "6 Series Convertible"));
		assertTrue(instance.add("BMW", "6 Series Coupe"));
		assertTrue(instance.add("BMW", "6 Series Gran Coupe Sedan"));
		assertTrue(instance.add("BMW", "7 Series Sedan"));
		assertTrue(instance.add("BMW", "8 Series Coupe"));
		assertTrue(instance.add("BMW", "8 Series 850CSi"));
		assertTrue(instance.add("BMW", "ActiveHybrid 5 Sedan"));
		assertTrue(instance.add("BMW", "ActiveHybrid 7 Sedan"));
		assertTrue(instance.add("BMW", "ActiveHybrid X6 SUV"));
		assertTrue(instance.add("BMW", "Alpina Convertible"));
		assertTrue(instance.add("BMW", "ALPINA B7 Sedan"));
		assertTrue(instance.add("BMW", "i3 Hatchback"));
		assertTrue(instance.add("BMW", "i8 Coupe"));
		assertTrue(instance.add("BMW", "M Coupe"));
		assertTrue(instance.add("BMW", "M Convertible"));
		assertTrue(instance.add("BMW", "M Hatchback"));
		assertTrue(instance.add("BMW", "M3 Sedan"));
		assertTrue(instance.add("BMW", "M3 Coupe"));
		assertTrue(instance.add("BMW", "M3 Convertible"));
		assertTrue(instance.add("BMW", "M4 Coupe"));
		assertTrue(instance.add("BMW", "M5 Sedan"));
		assertTrue(instance.add("BMW", "M6 Convertible"));
		assertTrue(instance.add("BMW", "M6 Coupe"));
		assertTrue(instance.add("BMW", "M6 Gran Coupe Sedan"));
		assertTrue(instance.add("BMW", "X1 SUV"));
		assertTrue(instance.add("BMW", "X3 SUV"));
		assertTrue(instance.add("BMW", "X4 SUV"));
		assertTrue(instance.add("BMW", "X5 Diesel"));
		assertTrue(instance.add("BMW", "X5 SUV"));
		assertTrue(instance.add("BMW", "X5 M SUV"));
		assertTrue(instance.add("BMW", "X6 SUV"));
		assertTrue(instance.add("BMW", "X6 M SUV"));
		assertTrue(instance.add("BMW", "Z3 Hatchback"));
		assertTrue(instance.add("BMW", "Z3 Convertible"));
		assertTrue(instance.add("BMW", "Z4 Convertible"));
		assertTrue(instance.add("BMW", "Z4 Hatchback"));
		assertTrue(instance.add("BMW", "Z4 M Convertible"));
		assertTrue(instance.add("BMW", "Z4 M Coupe"));
		assertTrue(instance.add("BMW", "Z8 Convertible"));
	}
	
	@Test
	public void Bugatti() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Bugatti", "Veyron 16.4 Coupe"));
		assertTrue(instance.add("Bugatti", "Veyron 16.4 Convertible"));
	}
	
	@Test
	public void Buick() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Buick", "Anthem SUV"));
		assertTrue(instance.add("Buick", "Century Sedan"));
		assertTrue(instance.add("Buick", "Century Wagon"));
		assertTrue(instance.add("Buick", "Century Coupe"));
		assertTrue(instance.add("Buick", "Electra Sedan"));
		assertTrue(instance.add("Buick", "Enclave SUV"));
		assertTrue(instance.add("Buick", "Encore SUV"));
		assertTrue(instance.add("Buick", "Estate Wagon"));
		assertTrue(instance.add("Buick", "LaCrosse Sedan"));
		assertTrue(instance.add("Buick", "LaCrosse Hybrid"));
		assertTrue(instance.add("Buick", "LaCrosse Super"));
		assertTrue(instance.add("Buick", "LeSabre Sedan"));
		assertTrue(instance.add("Buick", "LeSabre Coupe"));
		assertTrue(instance.add("Buick", "Lucerne Sedan"));
		assertTrue(instance.add("Buick", "Lucerne Super"));
		assertTrue(instance.add("Buick", "Park Avenue Sedan"));
		assertTrue(instance.add("Buick", "Rainier SUV"));
		assertTrue(instance.add("Buick", "Reatta Convertible"));
		assertTrue(instance.add("Buick", "Reatta Coupe"));
		assertTrue(instance.add("Buick", "Regal Hybrid"));
		assertTrue(instance.add("Buick", "Regal Sedan"));
		assertTrue(instance.add("Buick", "Regal GS"));
		assertTrue(instance.add("Buick", "Regal Coupe"));
		assertTrue(instance.add("Buick", "Rendezvous SUV"));
		assertTrue(instance.add("Buick", "Riviera Coupe"));
		assertTrue(instance.add("Buick", "Roadmaster Sedan"));
		assertTrue(instance.add("Buick", "Roadmaster Wagon"));
		assertTrue(instance.add("Buick", "Skylark Sedan"));
		assertTrue(instance.add("Buick", "Skylark Coupe"));
		assertTrue(instance.add("Buick", "Terraza Minivan"));
		assertTrue(instance.add("Buick", "Verano Sedan"));
	}
	
	@Test
	public void Cadillac() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Cadillac", "Allante Convertible"));
		assertTrue(instance.add("Cadillac", "ATS Sedan"));
		assertTrue(instance.add("Cadillac", "ATS Coupe"));
		assertTrue(instance.add("Cadillac", "ATS-V Sedan"));
		assertTrue(instance.add("Cadillac", "Brougham Sedan"));
		assertTrue(instance.add("Cadillac", "Catera Sedan"));
		assertTrue(instance.add("Cadillac", "CTS Vsport Premium"));
		assertTrue(instance.add("Cadillac", "CTS Vsport"));
		assertTrue(instance.add("Cadillac", "CTS Sedan"));
		assertTrue(instance.add("Cadillac", "CTS Coupe"));
		assertTrue(instance.add("Cadillac", "CTS Wagon"));
		assertTrue(instance.add("Cadillac", "CTS-V Sedan"));
		assertTrue(instance.add("Cadillac", "CTS-V Coupe"));
		assertTrue(instance.add("Cadillac", "CTS-V Wagon"));
		assertTrue(instance.add("Cadillac", "DeVille Sedan"));
		assertTrue(instance.add("Cadillac", "DeVille Coupe"));
		assertTrue(instance.add("Cadillac", "DTS Sedan"));
		assertTrue(instance.add("Cadillac", "Eldorado Coupe"));
		assertTrue(instance.add("Cadillac", "ELR Coupe"));
		assertTrue(instance.add("Cadillac", "Escalade SUV"));
		assertTrue(instance.add("Cadillac", "Escalade ESV SUV"));
		assertTrue(instance.add("Cadillac", "Escalade EXT Crew Cab"));
		assertTrue(instance.add("Cadillac", "Escalade Hybrid SUV"));
		assertTrue(instance.add("Cadillac", "Fleetwood Sedan"));
		assertTrue(instance.add("Cadillac", "Fleetwood Coupe"));
		assertTrue(instance.add("Cadillac", "Seville Sedan"));
		assertTrue(instance.add("Cadillac", "Sixty Special Sedan"));
		assertTrue(instance.add("Cadillac", "SRX SUV"));
		assertTrue(instance.add("Cadillac", "STS Sedan"));
		assertTrue(instance.add("Cadillac", "STS-V Sedan"));
		assertTrue(instance.add("Cadillac", "XLR Convertible"));
		assertTrue(instance.add("Cadillac", "XLR-V Convertible"));
		assertTrue(instance.add("Cadillac", "XTS Sedan"));
	}
	
	@Test
	public void Chevrolet() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Chevrolet", "Astro Minivan"));
		assertTrue(instance.add("Chevrolet", "Astro Cargo Minivan"));
		assertTrue(instance.add("Chevrolet", "Avalanche Crew Cab"));
		assertTrue(instance.add("Chevrolet", "Aveo Hatchback"));
		assertTrue(instance.add("Chevrolet", "Aveo Sedan"));
		assertTrue(instance.add("Chevrolet", "Beretta Coupe"));
		assertTrue(instance.add("Chevrolet", "Beretta GTZ"));
		assertTrue(instance.add("Chevrolet", "Beretta Indy GT"));
		assertTrue(instance.add("Chevrolet", "Black Diamond Avalanche Crew Cab"));
		assertTrue(instance.add("Chevrolet", "Blazer SUV"));
		assertTrue(instance.add("Chevrolet", "C/K 1500 Series Extended Cab"));
		assertTrue(instance.add("Chevrolet", "C/K 1500 Series Regular Cab"));
		assertTrue(instance.add("Chevrolet", "C/K 2500 Series Crew Cab"));
		assertTrue(instance.add("Chevrolet", "C/K 2500 Series Extended Cab"));
		assertTrue(instance.add("Chevrolet", "C/K 2500 Series Regular Cab"));
		assertTrue(instance.add("Chevrolet", "C/K 3500 Series Regular Cab"));
		assertTrue(instance.add("Chevrolet", "C/K 3500 Series Crew Cab"));
		assertTrue(instance.add("Chevrolet", "C/K 3500 Series Extended Cab"));
		assertTrue(instance.add("Chevrolet", "Camaro Convertible"));
		assertTrue(instance.add("Chevrolet", "Camaro Coupe"));
		assertTrue(instance.add("Chevrolet", "Camaro Z28"));
		assertTrue(instance.add("Chevrolet", "Camaro ZL1"));
		assertTrue(instance.add("Chevrolet", "Camaro 2SS"));
		assertTrue(instance.add("Chevrolet", "Camaro 1SS"));
		assertTrue(instance.add("Chevrolet", "Camaro Hatchback"));
		assertTrue(instance.add("Chevrolet", "Camaro Z28 SS"));
		assertTrue(instance.add("Chevrolet", "Camaro IROC Z"));
		assertTrue(instance.add("Chevrolet", "Caprice Wagon"));
		assertTrue(instance.add("Chevrolet", "Caprice Sedan"));
		assertTrue(instance.add("Chevrolet", "Captiva Sport SUV"));
		assertTrue(instance.add("Chevrolet", "Cavalier Sedan"));
		assertTrue(instance.add("Chevrolet", "Cavalier Coupe"));
		assertTrue(instance.add("Chevrolet", "Cavalier Convertible"));
		assertTrue(instance.add("Chevrolet", "Cavalier Wagon"));
		assertTrue(instance.add("Chevrolet", "Celebrity Wagon"));
		assertTrue(instance.add("Chevrolet", "Chevy Van"));
		assertTrue(instance.add("Chevrolet", "Chevy Van Classic"));
		assertTrue(instance.add("Chevrolet", "City Express Minivan"));
		assertTrue(instance.add("Chevrolet", "Classic Sedan"));
		assertTrue(instance.add("Chevrolet", "Cobalt Sedan"));
		assertTrue(instance.add("Chevrolet", "Cobalt SS"));
		assertTrue(instance.add("Chevrolet", "Cobalt Coupe"));
		assertTrue(instance.add("Chevrolet", "Cobalt SS Supercharged"));
		assertTrue(instance.add("Chevrolet", "Colorado Crew Cab"));
		assertTrue(instance.add("Chevrolet", "Colorado Regular Cab"));
		assertTrue(instance.add("Chevrolet", "Colorado Extended Cab"));
		assertTrue(instance.add("Chevrolet", "Corsica Sedan"));
		assertTrue(instance.add("Chevrolet", "Corsica Hatchback"));
		assertTrue(instance.add("Chevrolet", "Corvette 427"));
		assertTrue(instance.add("Chevrolet", "Corvette Convertible"));
		assertTrue(instance.add("Chevrolet", "Corvette ZR1"));
		assertTrue(instance.add("Chevrolet", "Corvette Coupe"));
		assertTrue(instance.add("Chevrolet", "Corvette Z06"));
		assertTrue(instance.add("Chevrolet", "Corvette Z06 Competition Sport Spec Ed"));
		assertTrue(instance.add("Chevrolet", "Corvette Z06 GT1 Championship Spec Ed"));
		assertTrue(instance.add("Chevrolet", "Corvette 427 Limited Edition Z06"));
		assertTrue(instance.add("Chevrolet", "Corvette Indy 500 Pace Car Replica"));
		assertTrue(instance.add("Chevrolet", "Corvette Ron Fellows Edition Z06"));
		assertTrue(instance.add("Chevrolet", "Corvette Indy Pace Car Edition"));
		assertTrue(instance.add("Chevrolet", "Corvette Hatchback"));
		assertTrue(instance.add("Chevrolet", "Corvette Stingray Coupe"));
		assertTrue(instance.add("Chevrolet", "Corvette Stingray Convertible"));
		assertTrue(instance.add("Chevrolet", "Cruze Sedan"));
		assertTrue(instance.add("Chevrolet", "Cruze Diesel"));
		assertTrue(instance.add("Chevrolet", "Equinox SUV"));
		assertTrue(instance.add("Chevrolet", "Express Diesel"));
		assertTrue(instance.add("Chevrolet", "Express Van"));
		assertTrue(instance.add("Chevrolet", "Express Cargo Van"));
		assertTrue(instance.add("Chevrolet", "Express Cargo Diesel"));
		assertTrue(instance.add("Chevrolet", "HHR Wagon"));
		assertTrue(instance.add("Chevrolet", "HHR SS"));
		assertTrue(instance.add("Chevrolet", "HHR Panel SS"));
		assertTrue(instance.add("Chevrolet", "Impala Sedan"));
		assertTrue(instance.add("Chevrolet", "Lumina Sedan"));
		assertTrue(instance.add("Chevrolet", "Lumina Coupe"));
		assertTrue(instance.add("Chevrolet", "Lumina Minivan"));
		assertTrue(instance.add("Chevrolet", "Malibu Sedan"));
		assertTrue(instance.add("Chevrolet", "Malibu Hybrid"));
		assertTrue(instance.add("Chevrolet", "Malibu Classic Sedan"));
		assertTrue(instance.add("Chevrolet", "Malibu Hybrid Sedan"));
		assertTrue(instance.add("Chevrolet", "Malibu Maxx Hatchback"));
		assertTrue(instance.add("Chevrolet", "Metro Sedan"));
		assertTrue(instance.add("Chevrolet", "Metro Hatchback"));
		assertTrue(instance.add("Chevrolet", "Monte Carlo Coupe"));
		assertTrue(instance.add("Chevrolet", "Prizm Sedan"));
		assertTrue(instance.add("Chevrolet", "R/V 3500 Series Crew Cab"));
		assertTrue(instance.add("Chevrolet", "S-10 Crew Cab"));
		assertTrue(instance.add("Chevrolet", "S-10 Regular Cab"));
		assertTrue(instance.add("Chevrolet", "S-10 Extended Cab"));
		assertTrue(instance.add("Chevrolet", "S-10 Blazer SUV"));
		assertTrue(instance.add("Chevrolet", "Silverado 1500 Crew Cab"));
		assertTrue(instance.add("Chevrolet", "Silverado 1500 Regular Cab"));
		assertTrue(instance.add("Chevrolet", "Silverado 1500 Extended Cab"));
		assertTrue(instance.add("Chevrolet", "Silverado 1500 SS"));
		assertTrue(instance.add("Chevrolet", "Silverado 1500 Classic Regular Cab"));
		assertTrue(instance.add("Chevrolet", "Silverado 1500 Classic Crew Cab"));
		assertTrue(instance.add("Chevrolet", "Silverado 1500 Classic Extended Cab"));
		assertTrue(instance.add("Chevrolet", "Silverado 1500 Hybrid Crew Cab"));
		assertTrue(instance.add("Chevrolet", "Silverado 1500HD Crew Cab"));
		assertTrue(instance.add("Chevrolet", "Silverado 1500HD Classic Crew Cab"));
		assertTrue(instance.add("Chevrolet", "Silverado 2500 Regular Cab"));
		assertTrue(instance.add("Chevrolet", "Silverado 2500 Extended Cab"));
		assertTrue(instance.add("Chevrolet", "Silverado 2500 Crew Cab"));
		assertTrue(instance.add("Chevrolet", "Silverado 2500HD Crew Cab"));
		assertTrue(instance.add("Chevrolet", "Silverado 2500HD Regular Cab"));
		assertTrue(instance.add("Chevrolet", "Silverado 2500HD Extended Cab"));
		assertTrue(instance.add("Chevrolet", "Silverado 2500HD Classic Crew Cab"));
		assertTrue(instance.add("Chevrolet", "Silverado 2500HD Classic Regular Cab"));
		assertTrue(instance.add("Chevrolet", "Silverado 2500HD Classic Extended Cab"));
		assertTrue(instance.add("Chevrolet", "Silverado 3500 Extended Cab"));
		assertTrue(instance.add("Chevrolet", "Silverado 3500 Crew Cab"));
		assertTrue(instance.add("Chevrolet", "Silverado 3500 Regular Cab"));
		assertTrue(instance.add("Chevrolet", "Silverado 3500 Classic Crew Cab"));
		assertTrue(instance.add("Chevrolet", "Silverado 3500 Classic Regular Cab"));
		assertTrue(instance.add("Chevrolet", "Silverado 3500 Classic Extended Cab"));
		assertTrue(instance.add("Chevrolet", "Silverado 3500HD Crew Cab"));
		assertTrue(instance.add("Chevrolet", "Silverado 3500HD Regular Cab"));
		assertTrue(instance.add("Chevrolet", "Silverado 3500HD Extended Cab"));
		assertTrue(instance.add("Chevrolet", "Sonic Sedan"));
		assertTrue(instance.add("Chevrolet", "Sonic Hatchback"));
		assertTrue(instance.add("Chevrolet", "Spark Hatchback"));
		assertTrue(instance.add("Chevrolet", "Spark EV Hatchback"));
		assertTrue(instance.add("Chevrolet", "Sportvan Van"));
		assertTrue(instance.add("Chevrolet", "Sportvan Diesel"));
		assertTrue(instance.add("Chevrolet", "SS Sedan"));
		assertTrue(instance.add("Chevrolet", "SSR Regular Cab"));
		assertTrue(instance.add("Chevrolet", "Suburban SUV"));
		assertTrue(instance.add("Chevrolet", "Tahoe SUV"));
		assertTrue(instance.add("Chevrolet", "Tahoe Hybrid SUV"));
		assertTrue(instance.add("Chevrolet", "Tahoe Limited/Z71 SUV"));
		assertTrue(instance.add("Chevrolet", "Tracker SUV"));
		assertTrue(instance.add("Chevrolet", "TrailBlazer SUV"));
		assertTrue(instance.add("Chevrolet", "TrailBlazer SS"));
		assertTrue(instance.add("Chevrolet", "TrailBlazer EXT SUV"));
		assertTrue(instance.add("Chevrolet", "Traverse SUV"));
		assertTrue(instance.add("Chevrolet", "Uplander Minivan"));
		assertTrue(instance.add("Chevrolet", "Venture Minivan"));
		assertTrue(instance.add("Chevrolet", "Volt Hatchback"));	
	}
	
	@Test
	public void Chrysler() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Chrysler", "200 Sedan"));
		assertTrue(instance.add("Chrysler", "200 Convertible"));
		assertTrue(instance.add("Chrysler", "300 Sedan"));
		assertTrue(instance.add("Chrysler", "300 SRT8"));
		assertTrue(instance.add("Chrysler", "300 SRT8 Core"));
		assertTrue(instance.add("Chrysler", "300 SRT-8"));
		assertTrue(instance.add("Chrysler", "300M Sedan"));
		assertTrue(instance.add("Chrysler", "Aspen SUV"));
		assertTrue(instance.add("Chrysler", "Aspen Hybrid"));
		assertTrue(instance.add("Chrysler", "Cirrus Sedan"));
		assertTrue(instance.add("Chrysler", "Concorde Sedan"));
		assertTrue(instance.add("Chrysler", "Crossfire Convertible"));
		assertTrue(instance.add("Chrysler", "Crossfire Hatchback"));
		assertTrue(instance.add("Chrysler", "Crossfire SRT-6"));
		assertTrue(instance.add("Chrysler", "Crossfire Coupe"));
		assertTrue(instance.add("Chrysler", "Grand Voyager Minivan"));
		assertTrue(instance.add("Chrysler", "Imperial Sedan"));
		assertTrue(instance.add("Chrysler", "Le Baron Convertible"));
		assertTrue(instance.add("Chrysler", "Le Baron Sedan"));
		assertTrue(instance.add("Chrysler", "Le Baron Coupe"));
		assertTrue(instance.add("Chrysler", "LHS Sedan"));
		assertTrue(instance.add("Chrysler", "New Yorker Sedan"));
		assertTrue(instance.add("Chrysler", "Pacifica Wagon"));
		assertTrue(instance.add("Chrysler", "Prowler Convertible"));
		assertTrue(instance.add("Chrysler", "PT Cruiser Wagon"));
		assertTrue(instance.add("Chrysler", "PT Cruiser Convertible"));
		assertTrue(instance.add("Chrysler", "Sebring Sedan"));
		assertTrue(instance.add("Chrysler", "Sebring Convertible"));
		assertTrue(instance.add("Chrysler", "Sebring Coupe"));
		assertTrue(instance.add("Chrysler", "TC Convertible"));
		assertTrue(instance.add("Chrysler", "Town and Country Minivan"));
		assertTrue(instance.add("Chrysler", "Voyager Minivan"));
	}
	
	@Test
	public void Daewood() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Daewood", "Lanos Hatchback"));
		assertTrue(instance.add("Daewood", "Lanos Sedan"));
		assertTrue(instance.add("Daewood", "Leganza Sedan"));
		assertTrue(instance.add("Daewood", "Nubira Wagon"));
		assertTrue(instance.add("Daewood", "Nubira Sedan"));
		assertTrue(instance.add("Daewood", "Nubira Hatchback"));
	}
	
	@Test
	public void Dodge() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Dodge", "Avenger Sedan"));
		assertTrue(instance.add("Dodge", "Avenger Coupe"));
		assertTrue(instance.add("Dodge", "Caliber Wagon"));
		assertTrue(instance.add("Dodge", "Caliber SRT4"));
		assertTrue(instance.add("Dodge", "Caravan Minivan"));
		assertTrue(instance.add("Dodge", "Challenger Coupe"));
		assertTrue(instance.add("Dodge", "Challenger SRT8"));
		assertTrue(instance.add("Dodge", "Challenger SRT8 Core"));
		assertTrue(instance.add("Dodge", "Challenger SRT8 392"));
		assertTrue(instance.add("Dodge", "Charger SRT8 Superbee"));
		assertTrue(instance.add("Dodge", "Charger Sedan"));
		assertTrue(instance.add("Dodge", "Charger SRT8"));
		assertTrue(instance.add("Dodge", "Charger SRT-8"));
		assertTrue(instance.add("Dodge", "Colt Coupe"));
		assertTrue(instance.add("Dodge", "Colt Sedan"));
		assertTrue(instance.add("Dodge", "Colt Hatchback"));
		assertTrue(instance.add("Dodge", "Colt Wagon"));
		assertTrue(instance.add("Dodge", "Dakota Crew Cab"));
		assertTrue(instance.add("Dodge", "Dakota Extended Cab"));
		assertTrue(instance.add("Dodge", "Dakota Quad Cab"));
		assertTrue(instance.add("Dodge", "Dakota Club Cab"));
		assertTrue(instance.add("Dodge", "Dakota Regular Cab"));
		assertTrue(instance.add("Dodge", "Dart Sedan"));
		assertTrue(instance.add("Dodge", "Daytona IROC R/T"));
		assertTrue(instance.add("Dodge", "Daytona Hatchback"));
		assertTrue(instance.add("Dodge", "Daytona IROC"));
		assertTrue(instance.add("Dodge", "Daytona Shelby"));
		assertTrue(instance.add("Dodge", "Durango SUV"));
		assertTrue(instance.add("Dodge", "Durango Hybrid"));
		assertTrue(instance.add("Dodge", "Dynasty Sedan"));
		assertTrue(instance.add("Dodge", "Grand Caravan Minivan"));
		assertTrue(instance.add("Dodge", "Intrepid Sedan"));
		assertTrue(instance.add("Dodge", "Journey SUV"));
		assertTrue(instance.add("Dodge", "Magnum Wagon"));
		assertTrue(instance.add("Dodge", "Magnum SRT-8"));
		assertTrue(instance.add("Dodge", "Monaco Sedan"));
		assertTrue(instance.add("Dodge", "Neon Sedan"));
		assertTrue(instance.add("Dodge", "Neon SRT-4"));
		assertTrue(instance.add("Dodge", "Neon Coupe"));
		assertTrue(instance.add("Dodge", "Nitro SUV"));
		assertTrue(instance.add("Dodge", "Omni Hatchback"));
		assertTrue(instance.add("Dodge", "RAM 150 Regular Cab"));
		assertTrue(instance.add("Dodge", "RAM 150 Extended Cab"));
		assertTrue(instance.add("Dodge", "RAM 250 Regular Cab"));
		assertTrue(instance.add("Dodge", "RAM 250 Extended Cab"));
		assertTrue(instance.add("Dodge", "RAM 250 Diesel"));
		assertTrue(instance.add("Dodge", "RAM 350 Diesel"));
		assertTrue(instance.add("Dodge", "RAM 350 Regular Cab"));
		assertTrue(instance.add("Dodge", "RAM 350 Extended Cab"));
		assertTrue(instance.add("Dodge", "Ram 50 Pickup Regular Cab"));
		assertTrue(instance.add("Dodge", "Ram 50 Pickup Extended Cab"));
		assertTrue(instance.add("Dodge", "Ram Cargo Van"));
		assertTrue(instance.add("Dodge", "Ram Pickup 1500 Quad Cab"));
		assertTrue(instance.add("Dodge", "Ram Pickup 1500 Crew Cab"));
		assertTrue(instance.add("Dodge", "Ram Pickup 1500 Regular Cab"));
		assertTrue(instance.add("Dodge", "Ram Pickup 1500 Mega Cab"));
		assertTrue(instance.add("Dodge", "Ram Pickup 1500 SRT-10"));
		assertTrue(instance.add("Dodge", "Ram Pickup 1500 Club Cab"));
		assertTrue(instance.add("Dodge", "Ram Pickup 1500 Extended Cab"));
		assertTrue(instance.add("Dodge", "Ram Pickup 2500 Regular Cab"));
		assertTrue(instance.add("Dodge", "Ram Pickup 2500 Crew Cab"));
		assertTrue(instance.add("Dodge", "Ram Pickup 2500 Mega Cab"));
		assertTrue(instance.add("Dodge", "Ram Pickup 2500 Quad Cab"));
		assertTrue(instance.add("Dodge", "Ram Pickup 2500 Extended Cab"));
		assertTrue(instance.add("Dodge", "Ram Pickup 3500 Crew Cab"));
		assertTrue(instance.add("Dodge", "Ram Pickup 3500 Regular Cab"));
		assertTrue(instance.add("Dodge", "Ram Pickup 3500 Mega Cab"));
		assertTrue(instance.add("Dodge", "Ram Pickup 3500 Quad Cab"));
		assertTrue(instance.add("Dodge", "Ram Pickup 3500 Diesel"));
		assertTrue(instance.add("Dodge", "Ram Pickup 3500 Extended Cab"));
		assertTrue(instance.add("Dodge", "Ram Van"));
		assertTrue(instance.add("Dodge", "Ram Wagon Van"));
		assertTrue(instance.add("Dodge", "Ramcharger SUV"));
		assertTrue(instance.add("Dodge", "Shadow Hatchback"));
		assertTrue(instance.add("Dodge", "Shadow Convertible"));
		assertTrue(instance.add("Dodge", "Spirit Sedan"));
		assertTrue(instance.add("Dodge", "Spirit R/T"));
		assertTrue(instance.add("Dodge", "Sprinter Van"));
		assertTrue(instance.add("Dodge", "Sprinter Cargo Van"));
		assertTrue(instance.add("Dodge", "SRT Viper Coupe"));
		assertTrue(instance.add("Dodge", "Stealth R/T Turbo"));
		assertTrue(instance.add("Dodge", "Stealth Coupe"));
		assertTrue(instance.add("Dodge", "Stealth Hatchback"));
		assertTrue(instance.add("Dodge", "Stratus Sedan"));
		assertTrue(instance.add("Dodge", "Stratus Coupe"));
		assertTrue(instance.add("Dodge", "Viper Convertible"));
		assertTrue(instance.add("Dodge", "Viper Coupe"));
		assertTrue(instance.add("Dodge", "Viper ACR"));
		assertTrue(instance.add("Dodge", "Viper ACR Competition"));
	}
	
	@Test
	public void Eagle() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Eagle", "Premier Sedan"));
		assertTrue(instance.add("Eagle", "Summit Wagon"));
		assertTrue(instance.add("Eagle", "Summit Coupe"));
		assertTrue(instance.add("Eagle", "Summit Sedan"));
		assertTrue(instance.add("Eagle", "Summit Hatchback"));
		assertTrue(instance.add("Eagle", "Talon Hatchback"));
		assertTrue(instance.add("Eagle", "Talon TSi"));
		assertTrue(instance.add("Eagle", "Vision Sedan"));
	}
	
	@Test
	public void Ferrari() {
		vehicle_model_mod instance = new vehicle_model_mod();

		assertTrue(instance.add("Ferrari", "360 Challenge"));
		assertTrue(instance.add("Ferrari", "360 Coupe"));
		assertTrue(instance.add("Ferrari", "360 Convertible"));
		assertTrue(instance.add("Ferrari", "430 Scuderia Coupe"));
		assertTrue(instance.add("Ferrari", "456M Coupe"));
		assertTrue(instance.add("Ferrari", "458 Italia Convertible"));
		assertTrue(instance.add("Ferrari", "458 Italia Coupe"));
		assertTrue(instance.add("Ferrari", "550 Convertible"));
		assertTrue(instance.add("Ferrari", "550 Coupe"));
		assertTrue(instance.add("Ferrari", "575M Coupe"));
		assertTrue(instance.add("Ferrari", "599 Coupe"));
		assertTrue(instance.add("Ferrari", "599 GTO"));
		assertTrue(instance.add("Ferrari", "612 Scaglietti Coupe"));
		assertTrue(instance.add("Ferrari", "California Convertible"));
		assertTrue(instance.add("Ferrari", "Enzo Coupe"));
		assertTrue(instance.add("Ferrari", "F12 Berlinetta Coupe"));
		assertTrue(instance.add("Ferrari", "F430 Convertible"));
		assertTrue(instance.add("Ferrari", "F430 Coupe"));
		assertTrue(instance.add("Ferrari", "F430 Challenge"));
		assertTrue(instance.add("Ferrari", "FF Coupe"));
		assertTrue(instance.add("Ferrari", "Superamerica Convertible"));		
	}
	
	@Test
	public void FIAT() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("FIAT", "500 Abarth"));
		assertTrue(instance.add("FIAT", "500 Hatchback"));
		assertTrue(instance.add("FIAT", "500 C Abarth"));
		assertTrue(instance.add("FIAT", "500 Convertible"));
		assertTrue(instance.add("FIAT", "500e Hatchback"));
		assertTrue(instance.add("FIAT", "500L Wagon"));
	}
	
	@Test
	public void Fisker() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Fisker", "Karma Sedan"));
	}
	
	@Test
	public void Ford() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Ford", "Aerostar Minivan"));
		assertTrue(instance.add("Ford", "Aspire Hatchback"));
		assertTrue(instance.add("Ford", "Bronco SUV"));
		assertTrue(instance.add("Ford", "Bronco II SUV"));
		assertTrue(instance.add("Ford", "C-Max Energi Wagon"));
		assertTrue(instance.add("Ford", "C-Max Hybrid Wagon"));
		assertTrue(instance.add("Ford", "Contour Sedan"));
		assertTrue(instance.add("Ford", "Contour SVT Sedan"));
		assertTrue(instance.add("Ford", "Crown Victoria Sedan"));
		assertTrue(instance.add("Ford", "Crown Victoria Natural Gas"));
		assertTrue(instance.add("Ford", "E-150 Van"));
		assertTrue(instance.add("Ford", "E-250 Van"));
		assertTrue(instance.add("Ford", "E-350 Van"));
		assertTrue(instance.add("Ford", "E-Series Van"));
		assertTrue(instance.add("Ford", "E-Series Wagon Van"));
		assertTrue(instance.add("Ford", "Econoline Cargo Van"));
		assertTrue(instance.add("Ford", "Econoline Wagon Van"));
		assertTrue(instance.add("Ford", "Edge SUV"));
		assertTrue(instance.add("Ford", "Escape SUV"));
		assertTrue(instance.add("Ford", "Escape Hybrid"));
		assertTrue(instance.add("Ford", "Escape Hybrid SUV"));
		assertTrue(instance.add("Ford", "Escort Coupe"));
		assertTrue(instance.add("Ford", "Escort Sedan"));
		assertTrue(instance.add("Ford", "Escort Wagon"));
		assertTrue(instance.add("Ford", "Escort Hatchback"));
		assertTrue(instance.add("Ford", "Excursion Diesel"));
		assertTrue(instance.add("Ford", "Excursion SUV"));
		assertTrue(instance.add("Ford", "Expedition SUV"));
		assertTrue(instance.add("Ford", "Expedition EL SUV"));
		assertTrue(instance.add("Ford", "Explorer SUV"));
		assertTrue(instance.add("Ford", "Explorer Sport SUV"));
		assertTrue(instance.add("Ford", "Explorer Sport Trac Crew Cab"));
		assertTrue(instance.add("Ford", "F-150 Crew Cab"));
		assertTrue(instance.add("Ford", "F-150 SuperCab"));
		assertTrue(instance.add("Ford", "F-150 SuperCrew"));
		assertTrue(instance.add("Ford", "F-150 SVT Raptor"));
		assertTrue(instance.add("Ford", "F-150 Regular Cab"));
		assertTrue(instance.add("Ford", "F-150 SVT Lightning"));
		assertTrue(instance.add("Ford", "F-150 Harley-Davidson"));
		assertTrue(instance.add("Ford", "F-150 Extended Cab"));
		assertTrue(instance.add("Ford", "F-150 Heritage SuperCab"));
		assertTrue(instance.add("Ford", "F-150 Heritage Regular Cab"));
		assertTrue(instance.add("Ford", "F-150 SVT Lightning Regular Cab"));
		assertTrue(instance.add("Ford", "F-250 Regular Cab"));
		assertTrue(instance.add("Ford", "F-250 Extended Cab"));
		assertTrue(instance.add("Ford", "F-250 Crew Cab"));
		assertTrue(instance.add("Ford", "F-250 Super Duty Crew Cab"));
		assertTrue(instance.add("Ford", "F-250 Super Duty SuperCab"));
		assertTrue(instance.add("Ford", "F-250 Super Duty Regular Cab"));
		assertTrue(instance.add("Ford", "F-250 Super Duty Extended Cab"));
		assertTrue(instance.add("Ford", "F-350 Regular Cab"));
		assertTrue(instance.add("Ford", "F-350 Extended Cab"));
		assertTrue(instance.add("Ford", "F-350 Crew Cab"));
		assertTrue(instance.add("Ford", "F-350 Super Duty SuperCab"));
		assertTrue(instance.add("Ford", "F-350 Super Duty Regular Cab"));
		assertTrue(instance.add("Ford", "F-350 Super Duty Crew Cab"));
		assertTrue(instance.add("Ford", "F-350 Super Duty Extended Cab"));
		assertTrue(instance.add("Ford", "F-450 Super Duty Crew Cab"));
		assertTrue(instance.add("Ford", "Festiva Hatchback"));
		assertTrue(instance.add("Ford", "Fiesta ST"));
		assertTrue(instance.add("Ford", "Fiesta Hatchback"));
		assertTrue(instance.add("Ford", "Fiesta Sedan"));
		assertTrue(instance.add("Ford", "Five Hundred Sedan"));
		assertTrue(instance.add("Ford", "Flex Wagon"));
		assertTrue(instance.add("Ford", "Focus Electric"));
		assertTrue(instance.add("Ford", "Focus Sedan"));
		assertTrue(instance.add("Ford", "Focus Hatchback"));
		assertTrue(instance.add("Ford", "Focus Coupe"));
		assertTrue(instance.add("Ford", "Focus Wagon"));
		assertTrue(instance.add("Ford", "Focus SVT"));
		assertTrue(instance.add("Ford", "Focus ST Hatchback"));
		assertTrue(instance.add("Ford", "Freestar Minivan"));
		assertTrue(instance.add("Ford", "Freestyle Wagon"));
		assertTrue(instance.add("Ford", "Fusion Sedan"));
		assertTrue(instance.add("Ford", "Fusion Hybrid"));
		assertTrue(instance.add("Ford", "Fusion Energi Sedan"));
		assertTrue(instance.add("Ford", "Fusion Hybrid Sedan"));
		assertTrue(instance.add("Ford", "GT Coupe"));
		assertTrue(instance.add("Ford", "LTD Crown Victoria Sedan"));
		assertTrue(instance.add("Ford", "LTD Crown Victoria Wagon"));
		assertTrue(instance.add("Ford", "Mustang Coupe"));
		assertTrue(instance.add("Ford", "Mustang Convertible"));
		assertTrue(instance.add("Ford", "Mustang Boss 302"));
		assertTrue(instance.add("Ford", "Mustang SVT Cobra"));
		assertTrue(instance.add("Ford", "Mustang Mach 1 Premium"));
		assertTrue(instance.add("Ford", "Mustang Mach 1 Premuim"));
		assertTrue(instance.add("Ford", "Mustang SVT Cobra 10th Anniversary"));
		assertTrue(instance.add("Ford", "Mustang Bullitt"));
		assertTrue(instance.add("Ford", "Mustang Hatchback"));
		assertTrue(instance.add("Ford", "Mustang SVT Cobra Convertible"));
		assertTrue(instance.add("Ford", "Mustang SVT Cobra Coupe"));
		assertTrue(instance.add("Ford", "Probe Hatchback"));
		assertTrue(instance.add("Ford", "Ranger SuperCab"));
		assertTrue(instance.add("Ford", "Ranger Regular Cab"));
		assertTrue(instance.add("Ford", "Ranger Extended Cab"));
		assertTrue(instance.add("Ford", "Shelby GT500 Convertible"));
		assertTrue(instance.add("Ford", "Shelby GT500 Coupe"));
		assertTrue(instance.add("Ford", "Taurus Sedan"));
		assertTrue(instance.add("Ford", "Taurus SHO"));
		assertTrue(instance.add("Ford", "Taurus Wagon"));
		assertTrue(instance.add("Ford", "Taurus X Wagon"));
		assertTrue(instance.add("Ford", "Tempo Sedan"));
		assertTrue(instance.add("Ford", "Tempo Coupe"));
		assertTrue(instance.add("Ford", "Thunderbird Convertible"));
		assertTrue(instance.add("Ford", "Thunderbird Coupe"));
		assertTrue(instance.add("Ford", "Thunderbird SC"));
		assertTrue(instance.add("Ford", "Transit Connect Minivan"));
		assertTrue(instance.add("Ford", "Windstar Minivan"));
		assertTrue(instance.add("Ford", "Windstar Cargo Minivan"));
	}
	
	@Test
	public void Geo() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Geo", "Metro Sedan"));
		assertTrue(instance.add("Geo", "Metro Hatchback"));
		assertTrue(instance.add("Geo", "Metro Convertible"));
		assertTrue(instance.add("Geo", "Prizm Sedan"));
		assertTrue(instance.add("Geo", "Prizm Hatchback"));
		assertTrue(instance.add("Geo", "Storm Hatchback"));
		assertTrue(instance.add("Geo", "Tracker SUV"));
	}
	
	@Test
	public void GMC() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("GMC", "Acadia SUV"));
		assertTrue(instance.add("GMC", "Canyon Crew Cab"));
		assertTrue(instance.add("GMC", "Canyon Regular Cab"));
		assertTrue(instance.add("GMC", "Canyon Extended Cab"));
		assertTrue(instance.add("GMC", "Envoy SUV"));
		assertTrue(instance.add("GMC", "Envoy XL SUV"));
		assertTrue(instance.add("GMC", "Envoy XUV SUV"));
		assertTrue(instance.add("GMC", "Jimmy SUV"));
		assertTrue(instance.add("GMC", "R/V 3500 Series Crew Cab"));
		assertTrue(instance.add("GMC", "Rally Wagon Van"));
		assertTrue(instance.add("GMC", "Rally Wagon Diesel"));
		assertTrue(instance.add("GMC", "S-15 Extended Cab"));
		assertTrue(instance.add("GMC", "S-15 Regular Cab"));
		assertTrue(instance.add("GMC", "S-15 Jimmy SUV"));
		assertTrue(instance.add("GMC", "Safari Minivan"));
		assertTrue(instance.add("GMC", "Safari Cargo Minivan"));
		assertTrue(instance.add("GMC", "Savana Diesel"));
		assertTrue(instance.add("GMC", "Savana Van"));
		assertTrue(instance.add("GMC", "Savana Cargo Van"));
		assertTrue(instance.add("GMC", "Savana Cargo Diesel"));
		assertTrue(instance.add("GMC", "Sierra 1500 Crew Cab"));
		assertTrue(instance.add("GMC", "Sierra 1500 Extended Cab"));
		assertTrue(instance.add("GMC", "Sierra 1500 Regular Cab"));
		assertTrue(instance.add("GMC", "Sierra 1500 Hybrid"));
		assertTrue(instance.add("GMC", "Sierra 1500 Classic Crew Cab"));
		assertTrue(instance.add("GMC", "Sierra 1500 Classic Extended Cab"));
		assertTrue(instance.add("GMC", "Sierra 1500 Classic Regular Cab"));
		assertTrue(instance.add("GMC", "Sierra 1500 Hybrid Crew Cab"));
		assertTrue(instance.add("GMC", "Sierra 1500HD Crew Cab"));
		assertTrue(instance.add("GMC", "Sierra 1500HD Classic Crew Cab"));
		assertTrue(instance.add("GMC", "Sierra 2500 Regular Cab"));
		assertTrue(instance.add("GMC", "Sierra 2500 Crew Cab"));
		assertTrue(instance.add("GMC", "Sierra 2500 Extended Cab"));
		assertTrue(instance.add("GMC", "Sierra 2500HD Crew Cab"));
		assertTrue(instance.add("GMC", "Sierra 2500HD Regular Cab"));
		assertTrue(instance.add("GMC", "Sierra 2500HD Extended Cab"));
		assertTrue(instance.add("GMC", "Sierra 2500HD Classic Regular Cab"));
		assertTrue(instance.add("GMC", "Sierra 2500HD Classic Crew Cab"));
		assertTrue(instance.add("GMC", "Sierra 2500HD Classic Extended Cab"));
		assertTrue(instance.add("GMC", "Sierra 3500 Extended Cab"));
		assertTrue(instance.add("GMC", "Sierra 3500 Crew Cab"));
		assertTrue(instance.add("GMC", "Sierra 3500 Regular Cab"));
		assertTrue(instance.add("GMC", "Sierra 3500 Diesel"));
		assertTrue(instance.add("GMC", "Sierra 3500 Classic Crew Cab"));
		assertTrue(instance.add("GMC", "Sierra 3500 Classic Regular Cab"));
		assertTrue(instance.add("GMC", "Sierra 3500 Classic Extended Cab"));
		assertTrue(instance.add("GMC", "Sierra 3500HD Extended Cab"));
		assertTrue(instance.add("GMC", "Sierra 3500HD Regular Cab"));
		assertTrue(instance.add("GMC", "Sierra 3500HD Crew Cab"));
		assertTrue(instance.add("GMC", "Sierra C3 Extended Cab"));
		assertTrue(instance.add("GMC", "Sierra Classic 1500 Extended Cab"));
		assertTrue(instance.add("GMC", "Sierra Classic 2500 Regular Cab"));
		assertTrue(instance.add("GMC", "Sierra Classic 2500 Crew Cab"));
		assertTrue(instance.add("GMC", "Sierra Classic 2500 Extended Cab"));
		assertTrue(instance.add("GMC", "Sierra Classic 3500 Regular Cab"));
		assertTrue(instance.add("GMC", "Sierra Classic 3500 Extended Cab"));
		assertTrue(instance.add("GMC", "Sierra Classic 3500 Crew Cab"));
		assertTrue(instance.add("GMC", "Sonoma Crew Cab"));
		assertTrue(instance.add("GMC", "Sonoma Extended Cab"));
		assertTrue(instance.add("GMC", "Sonoma Regular Cab"));
		assertTrue(instance.add("GMC", "Sonoma Syclone"));
		assertTrue(instance.add("GMC", "Suburban SUV"));
		assertTrue(instance.add("GMC", "Syclone Regular Cab"));
		assertTrue(instance.add("GMC", "Terrain SUV"));
		assertTrue(instance.add("GMC", "Typhoon SUV"));
		assertTrue(instance.add("GMC", "Vandura Van"));
		assertTrue(instance.add("GMC", "Yukon SUV"));
		assertTrue(instance.add("GMC", "Yukon Denali SUV"));
		assertTrue(instance.add("GMC", "Yukon Hybrid SUV"));
		assertTrue(instance.add("GMC", "Yukon XL SUV"));
	}
	
	@Test
	public void Honda() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Honda", "Accord Sedan"));
		assertTrue(instance.add("Honda", "Accord Coupe"));
		assertTrue(instance.add("Honda", "Accord Hybrid Sedan"));
		assertTrue(instance.add("Honda", "Accord Plug-In Hybrid Sedan"));
		assertTrue(instance.add("Honda", "Civic Coupe"));
		assertTrue(instance.add("Honda", "Civic Si"));
		assertTrue(instance.add("Honda", "Civic Sedan"));
		assertTrue(instance.add("Honda", "Civic Hybrid"));
		assertTrue(instance.add("Honda", "CR-V SUV"));
		assertTrue(instance.add("Honda", "CR-Z Hatchback"));
		assertTrue(instance.add("Honda", "Crosstour Hatchback"));
		assertTrue(instance.add("Honda", "Fit Hatchback"));
		assertTrue(instance.add("Honda", "Fit EV Hatchback"));
		assertTrue(instance.add("Honda", "Insight Hatchback"));
		assertTrue(instance.add("Honda", "Odyssey Minivan"));
		assertTrue(instance.add("Honda", "Pilot SUV"));
		assertTrue(instance.add("Honda", "Ridgeline Crew Cab"));	
	}
	
	@Test
	public void HUMMER() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("HUMMER", "H1 SUV"));
		assertTrue(instance.add("HUMMER", "H1 Alpha SUV"));
		assertTrue(instance.add("HUMMER", "H2 SUV"));
		assertTrue(instance.add("HUMMER", "H2 SUT Crew Cab"));
		assertTrue(instance.add("HUMMER", "H3 SUV"));
		assertTrue(instance.add("HUMMER", "H3T Crew Cab"));
	}
	
	@Test
	public void Hyundai() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Hyundai", "Accent Hatchback"));
		assertTrue(instance.add("Hyundai", "Accent Sedan"));
		assertTrue(instance.add("Hyundai", "Azera Sedan"));
		assertTrue(instance.add("Hyundai", "Elantra Sedan"));
		assertTrue(instance.add("Hyundai", "Elantra Hatchback"));
		assertTrue(instance.add("Hyundai", "Elantra Wagon"));
		assertTrue(instance.add("Hyundai", "Elantra Coupe"));
		assertTrue(instance.add("Hyundai", "Elantra GT Hatchback"));
		assertTrue(instance.add("Hyundai", "Elantra Touring Hatchback"));
		assertTrue(instance.add("Hyundai", "Entourage Minivan"));
		assertTrue(instance.add("Hyundai", "Equus Sedan"));
		assertTrue(instance.add("Hyundai", "Excel Sedan"));
		assertTrue(instance.add("Hyundai", "Excel Hatchback"));
		assertTrue(instance.add("Hyundai", "Genesis Sedan"));
		assertTrue(instance.add("Hyundai", "Genesis 5.0 R-Spec"));
		assertTrue(instance.add("Hyundai", "Genesis Coupe"));
		assertTrue(instance.add("Hyundai", "Santa Fe SUV"));
		assertTrue(instance.add("Hyundai", "Santa Fe Sport SUV"));
		assertTrue(instance.add("Hyundai", "Scoupe Coupe"));
		assertTrue(instance.add("Hyundai", "Sonata Sedan"));
		assertTrue(instance.add("Hyundai", "Sonata Hybrid Sedan"));
		assertTrue(instance.add("Hyundai", "Tiburon Hatchback"));
		assertTrue(instance.add("Hyundai", "Tucson SUV"));
		assertTrue(instance.add("Hyundai", "Veloster Hatchback"));
		assertTrue(instance.add("Hyundai", "Veracruz SUV"));
		assertTrue(instance.add("Hyundai", "XG300 Sedan"));
		assertTrue(instance.add("Hyundai", "XG350 Sedan"));
	}
	
	@Test
	public void Infiniti() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Infiniti", "EX SUV"));
		assertTrue(instance.add("Infiniti", "EX35 SUV"));
		assertTrue(instance.add("Infiniti", "FX SUV"));
		assertTrue(instance.add("Infiniti", "FX35 SUV"));
		assertTrue(instance.add("Infiniti", "FX45 SUV"));
		assertTrue(instance.add("Infiniti", "FX50 SUV"));
		assertTrue(instance.add("Infiniti", "G Convertible"));
		assertTrue(instance.add("Infiniti", "G Convertible IPL"));
		assertTrue(instance.add("Infiniti", "G Coupe IPL"));
		assertTrue(instance.add("Infiniti", "G Coupe"));
		assertTrue(instance.add("Infiniti", "G Sedan"));
		assertTrue(instance.add("Infiniti", "G20 Sedan"));
		assertTrue(instance.add("Infiniti", "G35 Sedan"));
		assertTrue(instance.add("Infiniti", "G35 Coupe"));
		assertTrue(instance.add("Infiniti", "G37 Sedan"));
		assertTrue(instance.add("Infiniti", "G37 Convertible"));
		assertTrue(instance.add("Infiniti", "G37 Coupe"));
		assertTrue(instance.add("Infiniti", "G37 Convertible"));
		assertTrue(instance.add("Infiniti", "G37 Coupe"));
		assertTrue(instance.add("Infiniti", "G37 Sedan"));
		assertTrue(instance.add("Infiniti", "I30 Sedan"));
		assertTrue(instance.add("Infiniti", "I35 Sedan"));
		assertTrue(instance.add("Infiniti", "J30 Sedan"));
		assertTrue(instance.add("Infiniti", "JX SUV"));
		assertTrue(instance.add("Infiniti", "M Sedan"));
		assertTrue(instance.add("Infiniti", "M Hybrid"));
		assertTrue(instance.add("Infiniti", "M30 Convertible"));
		assertTrue(instance.add("Infiniti", "M30 Coupe"));
		assertTrue(instance.add("Infiniti", "M35 Sedan"));
		assertTrue(instance.add("Infiniti", "M37 Sedan"));
		assertTrue(instance.add("Infiniti", "M45 Sedan"));
		assertTrue(instance.add("Infiniti", "M56 Sedan"));
		assertTrue(instance.add("Infiniti", "Q45 Sedan"));
		assertTrue(instance.add("Infiniti", "Q50 Sedan"));
		assertTrue(instance.add("Infiniti", "Q50 Hybrid"));
		assertTrue(instance.add("Infiniti", "Q60 Convertible IPL"));
		assertTrue(instance.add("Infiniti", "Q60 Convertible"));
		assertTrue(instance.add("Infiniti", "Q60 Coupe IPL"));
		assertTrue(instance.add("Infiniti", "Q60 Coupe"));
		assertTrue(instance.add("Infiniti", "QX SUV"));
		assertTrue(instance.add("Infiniti", "QX4 SUV"));
		assertTrue(instance.add("Infiniti", "QX50 SUV"));
		assertTrue(instance.add("Infiniti", "QX56 SUV"));
		assertTrue(instance.add("Infiniti", "QX60 SUV"));
		assertTrue(instance.add("Infiniti", "QX60 Hybrid"));
		assertTrue(instance.add("Infiniti", "QX70 SUV"));
		assertTrue(instance.add("Infiniti", "QX80 SUV"));
	}
	
	@Test
	public void Isuzu() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Isuzu", "Amigo SUV"));
		assertTrue(instance.add("Isuzu", "Ascender SUV"));
		assertTrue(instance.add("Isuzu", "Axiom SUV"));
		assertTrue(instance.add("Isuzu", "Hombre Regular Cab"));
		assertTrue(instance.add("Isuzu", "Hombre Extended Cab"));
		assertTrue(instance.add("Isuzu", "i-Series Crew Cab"));
		assertTrue(instance.add("Isuzu", "i-Series Extended Cab"));
		assertTrue(instance.add("Isuzu", "Impulse Hatchback"));
		assertTrue(instance.add("Isuzu", "Impulse Coupe"));
		assertTrue(instance.add("Isuzu", "Oasis Minivan"));
		assertTrue(instance.add("Isuzu", "Pickup Regular Cab"));
		assertTrue(instance.add("Isuzu", "Pickup Extended Cab"));
		assertTrue(instance.add("Isuzu", "Rodeo SUV"));
		assertTrue(instance.add("Isuzu", "Rodeo Sport SUV"));
		assertTrue(instance.add("Isuzu", "Stylus Sedan"));
		assertTrue(instance.add("Isuzu", "Trooper SUV"));
		assertTrue(instance.add("Isuzu", "VehiCROSS SUV"));
	}
	
	@Test
	public void Jaguar() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Jaguar", "F-Type Convertible"));
		assertTrue(instance.add("Jaguar", "S-Type R"));
		assertTrue(instance.add("Jaguar", "S-Type Sedan"));
		assertTrue(instance.add("Jaguar", "X-Type Wagon"));
		assertTrue(instance.add("Jaguar", "X-Type Sedan"));
		assertTrue(instance.add("Jaguar", "XF Sedan"));
		assertTrue(instance.add("Jaguar", "XF XFR"));
		assertTrue(instance.add("Jaguar", "XJ XJR"));
		assertTrue(instance.add("Jaguar", "XJ XJR LWB"));
		assertTrue(instance.add("Jaguar", "XJ Sedan"));
		assertTrue(instance.add("Jaguar", "XJ XJL Ultimate"));
		assertTrue(instance.add("Jaguar", "XJ XJL Supersport"));
		assertTrue(instance.add("Jaguar", "XJ Supersport"));
		assertTrue(instance.add("Jaguar", "XJ-Series Sedan"));
		assertTrue(instance.add("Jaguar", "XJ-Series XJR"));
		assertTrue(instance.add("Jaguar", "XJ-Series XJR 100"));
		assertTrue(instance.add("Jaguar", "XJ-Series Convertible"));
		assertTrue(instance.add("Jaguar", "XJ-Series Coupe"));
		assertTrue(instance.add("Jaguar", "XJR Sedan"));
		assertTrue(instance.add("Jaguar", "XK Coupe"));
		assertTrue(instance.add("Jaguar", "XK Convertible"));
		assertTrue(instance.add("Jaguar", "XK XKR"));
		assertTrue(instance.add("Jaguar", "XK XKR-S GT"));
		assertTrue(instance.add("Jaguar", "XK XKR-S"));
		assertTrue(instance.add("Jaguar", "XK XKR175 75th Anniversary Limited Ed."));
		assertTrue(instance.add("Jaguar", "XK-Series XKR"));
		assertTrue(instance.add("Jaguar", "XK-Series Coupe"));
		assertTrue(instance.add("Jaguar", "XK-Series Convertible"));
		assertTrue(instance.add("Jaguar", "XK-Series XKR 100"));
		assertTrue(instance.add("Jaguar", "XK-Series XKR Silverstone"));
		assertTrue(instance.add("Jaguar", "XKR Coupe"));
		assertTrue(instance.add("Jaguar", "XKR Convertible"));
		assertTrue(instance.add("Jaguar", "XQ SUV"));
		assertTrue(instance.add("Jaguar", "XS Sedan"));
	}
	
	@Test
	public void Jeep() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Jeep", "Cherokee SUV"));
		assertTrue(instance.add("Jeep", "Comanche Regular Cab"));
		assertTrue(instance.add("Jeep", "Commander SUV"));
		assertTrue(instance.add("Jeep", "Compass SUV"));
		assertTrue(instance.add("Jeep", "Grand Cherokee SRT"));
		assertTrue(instance.add("Jeep", "Grand Cherokee SUV"));
		assertTrue(instance.add("Jeep", "Grand Cherokee SRT8"));
		assertTrue(instance.add("Jeep", "Grand Cherokee SRT-8"));
		assertTrue(instance.add("Jeep", "Grand Wagoneer SUV"));
		assertTrue(instance.add("Jeep", "Liberty SUV"));
		assertTrue(instance.add("Jeep", "Patriot SUV"));
		assertTrue(instance.add("Jeep", "Wagoneer SUV"));
		assertTrue(instance.add("Jeep", "Wrangler SUV"));
	}
	
	@Test
	public void Kia() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Kia", "Amanti Sedan"));
		assertTrue(instance.add("Kia", "Borrego SUV"));
		assertTrue(instance.add("Kia", "Cadenza Sedan"));
		assertTrue(instance.add("Kia", "Forte Coupe"));
		assertTrue(instance.add("Kia", "Forte Sedan"));
		assertTrue(instance.add("Kia", "Forte Hatchback"));
		assertTrue(instance.add("Kia", "K900 Sedan"));
		assertTrue(instance.add("Kia", "Optima Sedan"));
		assertTrue(instance.add("Kia", "Optima Hybrid"));
		assertTrue(instance.add("Kia", "Rio Hatchback"));
		assertTrue(instance.add("Kia", "Rio Sedan"));
		assertTrue(instance.add("Kia", "Rio Wagon"));
		assertTrue(instance.add("Kia", "Rondo Wagon"));
		assertTrue(instance.add("Kia", "Sedona Minivan"));
		assertTrue(instance.add("Kia", "Sephia Sedan"));
		assertTrue(instance.add("Kia", "Sorento SUV"));
		assertTrue(instance.add("Kia", "Soul Wagon"));
		assertTrue(instance.add("Kia", "Spectra Sedan"));
		assertTrue(instance.add("Kia", "Spectra Wagon"));
		assertTrue(instance.add("Kia", "Spectra Hatchback"));
		assertTrue(instance.add("Kia", "Sportage SUV"));
	}
	
	@Test
	public void Lamborghini() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Lamborghini", "Aventador Coupe"));
		assertTrue(instance.add("Lamborghini", "Aventador Convertible"));
		assertTrue(instance.add("Lamborghini", "Diablo Coupe"));
		assertTrue(instance.add("Lamborghini", "Gallardo Convertible"));
		assertTrue(instance.add("Lamborghini", "Gallardo LP 570-4 Superleggera Edizione Tecnica"));
		assertTrue(instance.add("Lamborghini", "Gallardo Coupe"));
		assertTrue(instance.add("Lamborghini", "Gallardo LP 570-4 Spyder Performante Edizone Tecnica"));
		assertTrue(instance.add("Lamborghini", "Gallardo LP 570-4 Superleggera"));
		assertTrue(instance.add("Lamborghini", "Gallardo LP 570-4 Spyder Performante"));
		assertTrue(instance.add("Lamborghini", "Gallardo Superleggera"));
		assertTrue(instance.add("Lamborghini", "Murcielago Coupe"));
		assertTrue(instance.add("Lamborghini", "Murcielago Convertible"));
		assertTrue(instance.add("Lamborghini", "Reventon Coupe"));
	}
	
	@Test
	public void LandRover() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Land Rover", "Defender SUV"));
		assertTrue(instance.add("Land Rover", "Discovery SUV"));
		assertTrue(instance.add("Land Rover", "Discovery Series II SUV"));
		assertTrue(instance.add("Land Rover", "Freelander SUV"));
		assertTrue(instance.add("Land Rover", "LR2 SUV"));
		assertTrue(instance.add("Land Rover", "LR3 SUV"));
		assertTrue(instance.add("Land Rover", "LR4 SUV"));
		assertTrue(instance.add("Land Rover", "Range Rover SUV"));
		assertTrue(instance.add("Land Rover", "Range Rover Evoque SUV"));
		assertTrue(instance.add("Land Rover", "Range Rover Evoque Convertible SUV"));
		assertTrue(instance.add("Land Rover", "Range Rover Sport SUV"));
	}
	
	@Test
	public void Lexus() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Lexus", "CT 200h Hatchback"));
		assertTrue(instance.add("Lexus", "ES 250 Sedan"));
		assertTrue(instance.add("Lexus", "ES 300 Sedan"));
		assertTrue(instance.add("Lexus", "ES 300h Sedan"));
		assertTrue(instance.add("Lexus", "ES 330 Sedan"));
		assertTrue(instance.add("Lexus", "ES 350 Sedan"));
		assertTrue(instance.add("Lexus", "GS 300 Sedan"));
		assertTrue(instance.add("Lexus", "GS 350 Sedan"));
		assertTrue(instance.add("Lexus", "GS 400 Sedan"));
		assertTrue(instance.add("Lexus", "GS 430 Sedan"));
		assertTrue(instance.add("Lexus", "GS 450h Sedan"));
		assertTrue(instance.add("Lexus", "GS 460 Sedan"));
		assertTrue(instance.add("Lexus", "GX 460 SUV"));
		assertTrue(instance.add("Lexus", "GX 470 SUV"));
		assertTrue(instance.add("Lexus", "HS 250h Sedan"));
		assertTrue(instance.add("Lexus", "IS 250 Sedan"));
		assertTrue(instance.add("Lexus", "IS 250 C Convertible"));
		assertTrue(instance.add("Lexus", "IS 300 Wagon"));
		assertTrue(instance.add("Lexus", "IS 300 Sedan"));
		assertTrue(instance.add("Lexus", "IS 350 Sedan"));
		assertTrue(instance.add("Lexus", "IS 350 C Convertible"));
		assertTrue(instance.add("Lexus", "IS F Sedan"));
		assertTrue(instance.add("Lexus", "LFA Coupe"));
		assertTrue(instance.add("Lexus", "LS 400 Sedan"));
		assertTrue(instance.add("Lexus", "LS 430 Sedan"));
		assertTrue(instance.add("Lexus", "LS 460 Sedan"));
		assertTrue(instance.add("Lexus", "LS 600h L Sedan"));
		assertTrue(instance.add("Lexus", "LX 450 SUV"));
		assertTrue(instance.add("Lexus", "LX 470 SUV"));
		assertTrue(instance.add("Lexus", "LX 570 SUV"));
		assertTrue(instance.add("Lexus", "NX 200t SUV"));
		assertTrue(instance.add("Lexus", "NX 300h SUV"));
		assertTrue(instance.add("Lexus", "RC 350 Coupe"));
		assertTrue(instance.add("Lexus", "RX 300 SUV"));
		assertTrue(instance.add("Lexus", "RX 330 SUV"));
		assertTrue(instance.add("Lexus", "RX 350 SUV"));
		assertTrue(instance.add("Lexus", "RX 400h SUV"));
		assertTrue(instance.add("Lexus", "RX 450h SUV"));
		assertTrue(instance.add("Lexus", "SC 300 Coupe"));
		assertTrue(instance.add("Lexus", "SC 400 Coupe"));
		assertTrue(instance.add("Lexus", "SC 430 Convertible"));
	}
	
	@Test
	public void Lincoln() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Lincoln", "Aviator SUV"));
		assertTrue(instance.add("Lincoln", "Blackwood Crew Cab"));
		assertTrue(instance.add("Lincoln", "Continental Sedan"));
		assertTrue(instance.add("Lincoln", "LS Sedan"));
		assertTrue(instance.add("Lincoln", "Mark LT Crew Cab"));
		assertTrue(instance.add("Lincoln", "Mark VII Coupe"));
		assertTrue(instance.add("Lincoln", "Mark VIII Coupe"));
		assertTrue(instance.add("Lincoln", "MKC SUV"));
		assertTrue(instance.add("Lincoln", "MKS Sedan"));
		assertTrue(instance.add("Lincoln", "MKT Wagon"));
		assertTrue(instance.add("Lincoln", "MKX SUV"));
		assertTrue(instance.add("Lincoln", "MKZ Hybrid"));
		assertTrue(instance.add("Lincoln", "MKZ Sedan"));
		assertTrue(instance.add("Lincoln", "MKZ Hybrid Sedan"));
		assertTrue(instance.add("Lincoln", "Navigator SUV"));
		assertTrue(instance.add("Lincoln", "Navigator L SUV"));
		assertTrue(instance.add("Lincoln", "Town Car Sedan"));
		assertTrue(instance.add("Lincoln", "Zephyr Sedan"));
	}
	
	@Test
	public void Lotus() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Lotus", "Elise Convertible"));
		assertTrue(instance.add("Lotus", "Esprit Coupe"));
		assertTrue(instance.add("Lotus", "Evora Coupe"));
		assertTrue(instance.add("Lotus", "Exige Coupe"));
		assertTrue(instance.add("Lotus", "Exige S Club Racer"));
	}
	
	@Test
	public void Maserati() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Maserati", "Coupe"));
		assertTrue(instance.add("Maserati", "Ghibli Sedan"));
		assertTrue(instance.add("Maserati", "GranSport Convertible"));
		assertTrue(instance.add("Maserati", "GranSport Coupe"));
		assertTrue(instance.add("Maserati", "GranTurismo Coupe"));
		assertTrue(instance.add("Maserati", "GranTurismo MC"));
		assertTrue(instance.add("Maserati", "GranTurismo S Automatic"));
		assertTrue(instance.add("Maserati", "GranTurismo S"));
		assertTrue(instance.add("Maserati", "GranTurismo Convertible Sport"));
		assertTrue(instance.add("Maserati", "GranTurismo Convertible"));
		assertTrue(instance.add("Maserati", "Quattroporte GTS"));
		assertTrue(instance.add("Maserati", "Quattroporte Sedan"));
		assertTrue(instance.add("Maserati", "Quattroporte Sport GT S"));
		assertTrue(instance.add("Maserati", "Quattroporte S"));
		assertTrue(instance.add("Maserati", "Quattroporte Sport GT S Automatic"));
		assertTrue(instance.add("Maserati", "Spyder Convertible"));
	}
	
	@Test
	public void Maybach() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Maybach", "57 Sedan"));
		assertTrue(instance.add("Maybach", "62 Sedan"));
		assertTrue(instance.add("Maybach", "Landaulet Convertible"));
	}
	
	@Test
	public void Mazda() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Mazda", "323 Hatchback"));
		assertTrue(instance.add("Mazda", "626 Sedan"));
		assertTrue(instance.add("Mazda", "626 Hatchback"));
		assertTrue(instance.add("Mazda", "929 Sedan"));
		assertTrue(instance.add("Mazda", "B-Series Cab Plus"));
		assertTrue(instance.add("Mazda", "B-Series Regular Cab"));
		assertTrue(instance.add("Mazda", "B-Series Cab Plus 4"));
		assertTrue(instance.add("Mazda", "B-Series Pickup Regular Cab"));
		assertTrue(instance.add("Mazda", "B-Series Pickup Extended Cab"));
		assertTrue(instance.add("Mazda", "B-Series Truck Cab Plus 4"));
		assertTrue(instance.add("Mazda", "B-Series Truck Regular Cab"));
		assertTrue(instance.add("Mazda", "B-Series Truck Extended Cab"));
		assertTrue(instance.add("Mazda", "B-Series Truck Cab Plus"));
		assertTrue(instance.add("Mazda", "CX-5 SUV"));
		assertTrue(instance.add("Mazda", "CX-7 SUV"));
		assertTrue(instance.add("Mazda", "CX-9 SUV"));
		assertTrue(instance.add("Mazda", "MAZDA2 Hatchback"));
		assertTrue(instance.add("Mazda", "MAZDA3 Sedan"));
		assertTrue(instance.add("Mazda", "MAZDA3 Hatchback"));
		assertTrue(instance.add("Mazda", "MAZDA5 Minivan"));
		assertTrue(instance.add("Mazda", "MAZDA6 Sedan"));
		assertTrue(instance.add("Mazda", "MAZDA6 Hatchback"));
		assertTrue(instance.add("Mazda", "MAZDA6 Wagon"));
		assertTrue(instance.add("Mazda", "MAZDASPEED MAZDA3 Hatchback"));
		assertTrue(instance.add("Mazda", "MAZDASPEED MAZDA6 Sedan"));
		assertTrue(instance.add("Mazda", "MAZDASPEED MX-5 Miata Convertible"));
		assertTrue(instance.add("Mazda", "Mazdaspeed Protege Sedan"));
		assertTrue(instance.add("Mazda", "MAZDASPEED3 Hatchback"));
		assertTrue(instance.add("Mazda", "Millenia Sedan"));
		assertTrue(instance.add("Mazda", "MPV Minivan"));
		assertTrue(instance.add("Mazda", "MX-3 Hatchback"));
		assertTrue(instance.add("Mazda", "MX-5 Miata Convertible"));
		assertTrue(instance.add("Mazda", "MX-6 Coupe"));
		assertTrue(instance.add("Mazda", "Navajo SUV"));
		assertTrue(instance.add("Mazda", "Protege Sedan"));
		assertTrue(instance.add("Mazda", "Protege5 Wagon"));
		assertTrue(instance.add("Mazda", "RX-7 Coupe"));
		assertTrue(instance.add("Mazda", "RX-7 Hatchback"));
		assertTrue(instance.add("Mazda", "RX-7 Convertible"));
		assertTrue(instance.add("Mazda", "RX-8 Coupe"));
		assertTrue(instance.add("Mazda", "Tribute SUV"));
		assertTrue(instance.add("Mazda", "Tribute Hybrid SUV"));
		assertTrue(instance.add("Mazda", "Truck Cab Plus"));
		assertTrue(instance.add("Mazda", "Truck Regular Cab"));
		assertTrue(instance.add("Mazda", "Truck Cab Plus 4"));
	}
	
	@Test
	public void McLaren() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("McLaren", "MP4-12C Coupe"));
		assertTrue(instance.add("McLaren", "MP4-12C Spider Convertible"));
		assertTrue(instance.add("McLaren", "P1 Coupe"));
	}
	
	@Test
	public void Mercedes_Benz() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Mercedes-Benz", "190-Class Sedan"));
		assertTrue(instance.add("Mercedes-Benz", "300-Class Wagon"));
		assertTrue(instance.add("Mercedes-Benz", "300-Class Sedan"));
		assertTrue(instance.add("Mercedes-Benz", "300-Class Convertible"));
		assertTrue(instance.add("Mercedes-Benz", "300-Class Coupe"));
		assertTrue(instance.add("Mercedes-Benz", "300-Class Diesel"));
		assertTrue(instance.add("Mercedes-Benz", "350-Class Sedan"));
		assertTrue(instance.add("Mercedes-Benz", "400-Class Sedan"));
		assertTrue(instance.add("Mercedes-Benz", "420-Class Sedan"));
		assertTrue(instance.add("Mercedes-Benz", "500-Class Coupe"));
		assertTrue(instance.add("Mercedes-Benz", "500-Class Sedan"));
		assertTrue(instance.add("Mercedes-Benz", "500-Class Convertible"));
		assertTrue(instance.add("Mercedes-Benz", "560-Class Coupe"));
		assertTrue(instance.add("Mercedes-Benz", "560-Class Sedan"));
		assertTrue(instance.add("Mercedes-Benz", "600-Class Convertible"));
		assertTrue(instance.add("Mercedes-Benz", "600-Class Sedan"));
		assertTrue(instance.add("Mercedes-Benz", "600-Class Coupe"));
		assertTrue(instance.add("Mercedes-Benz", "B-Class Electric Drive Hatchback"));
		assertTrue(instance.add("Mercedes-Benz", "C-Class Sedan"));
		assertTrue(instance.add("Mercedes-Benz", "C-Class Coupe"));
		assertTrue(instance.add("Mercedes-Benz", "C-Class C63 AMG"));
		assertTrue(instance.add("Mercedes-Benz", "C-Class C63 AMG Black Series"));
		assertTrue(instance.add("Mercedes-Benz", "C-Class C55 AMG"));
		assertTrue(instance.add("Mercedes-Benz", "C-Class Hatchback"));
		assertTrue(instance.add("Mercedes-Benz", "C-Class Wagon"));
		assertTrue(instance.add("Mercedes-Benz", "C-Class C32 AMG"));
		assertTrue(instance.add("Mercedes-Benz", "C36 AMG Sedan"));
		assertTrue(instance.add("Mercedes-Benz", "C43 AMG Sedan"));
		assertTrue(instance.add("Mercedes-Benz", "CL-Class CL63 AMG"));
		assertTrue(instance.add("Mercedes-Benz", "CL-Class Coupe"));
		assertTrue(instance.add("Mercedes-Benz", "CL-Class CL65 AMG"));
		assertTrue(instance.add("Mercedes-Benz", "CL-Class CL55 AMG"));
		assertTrue(instance.add("Mercedes-Benz", "CLA-Class CLA45 AMG"));
		assertTrue(instance.add("Mercedes-Benz", "CLA-Class Sedan"));
		assertTrue(instance.add("Mercedes-Benz", "CLK-Class Coupe"));
		assertTrue(instance.add("Mercedes-Benz", "CLK-Class Convertible"));
		assertTrue(instance.add("Mercedes-Benz", "CLK-Class CLK63 AMG"));
		assertTrue(instance.add("Mercedes-Benz", "CLK-Class CLK63 AMG Black Series"));
		assertTrue(instance.add("Mercedes-Benz", "CLK-Class CLK55 AMG"));
		assertTrue(instance.add("Mercedes-Benz", "CLS-Class Sedan"));
		assertTrue(instance.add("Mercedes-Benz", "CLS-Class CLS63 AMG"));
		assertTrue(instance.add("Mercedes-Benz", "CLS-Class CLS55 AMG"));
		assertTrue(instance.add("Mercedes-Benz", "E-Class Sedan"));
		assertTrue(instance.add("Mercedes-Benz", "E-Class Convertible"));
		assertTrue(instance.add("Mercedes-Benz", "E-Class E63 AMG 4MATIC"));
		assertTrue(instance.add("Mercedes-Benz", "E-Class Hybrid"));
		assertTrue(instance.add("Mercedes-Benz", "E-Class Coupe"));
		assertTrue(instance.add("Mercedes-Benz", "E-Class Wagon"));
		assertTrue(instance.add("Mercedes-Benz", "E-Class E63 AMG 4MATIC S-Model"));
		assertTrue(instance.add("Mercedes-Benz", "E-Class Diesel"));
		assertTrue(instance.add("Mercedes-Benz", "E-Class E63 AMG"));
		assertTrue(instance.add("Mercedes-Benz", "E-Class E55 AMG"));
		assertTrue(instance.add("Mercedes-Benz", "E55 AMG Sedan"));
		assertTrue(instance.add("Mercedes-Benz", "G-Class SUV"));
		assertTrue(instance.add("Mercedes-Benz", "G-Class G63 AMG"));
		assertTrue(instance.add("Mercedes-Benz", "G-Class G55 AMG"));
		assertTrue(instance.add("Mercedes-Benz", "GL-Class Diesel"));
		assertTrue(instance.add("Mercedes-Benz", "GL-Class GL63 AMG"));
		assertTrue(instance.add("Mercedes-Benz", "GL-Class SUV"));
		assertTrue(instance.add("Mercedes-Benz", "GLA-Class SUV"));
		assertTrue(instance.add("Mercedes-Benz", "GLK-Class Diesel"));
		assertTrue(instance.add("Mercedes-Benz", "GLK-Class SUV"));
		assertTrue(instance.add("Mercedes-Benz", "M-Class ML63 AMG"));
		assertTrue(instance.add("Mercedes-Benz", "M-Class Diesel"));
		assertTrue(instance.add("Mercedes-Benz", "M-Class SUV"));
		assertTrue(instance.add("Mercedes-Benz", "M-Class Hybrid"));
		assertTrue(instance.add("Mercedes-Benz", "M-Class ML55 AMG"));
		assertTrue(instance.add("Mercedes-Benz", "ML55 AMG SUV"));
		assertTrue(instance.add("Mercedes-Benz", "R-Class Wagon"));
		assertTrue(instance.add("Mercedes-Benz", "R-Class Diesel"));
		assertTrue(instance.add("Mercedes-Benz", "R-Class R63 AMG"));
		assertTrue(instance.add("Mercedes-Benz", "S-Class Coupe"));
		assertTrue(instance.add("Mercedes-Benz", "S-Class Sedan"));
		assertTrue(instance.add("Mercedes-Benz", "S-Class S65 AMG"));
		assertTrue(instance.add("Mercedes-Benz", "S-Class Hybrid"));
		assertTrue(instance.add("Mercedes-Benz", "S-Class S63 AMG"));
		assertTrue(instance.add("Mercedes-Benz", "S-Class Diesel"));
		assertTrue(instance.add("Mercedes-Benz", "S-Class S55 AMG"));
		assertTrue(instance.add("Mercedes-Benz", "SL-Class SL65 AMG"));
		assertTrue(instance.add("Mercedes-Benz", "SL-Class Convertible"));
		assertTrue(instance.add("Mercedes-Benz", "SL-Class SL63 AMG"));
		assertTrue(instance.add("Mercedes-Benz", "SL-Class Coupe"));
		assertTrue(instance.add("Mercedes-Benz", "SL-Class SL65 AMG Black Series"));
		assertTrue(instance.add("Mercedes-Benz", "SL-Class SL55 AMG"));
		assertTrue(instance.add("Mercedes-Benz", "SLK-Class Convertible"));
		assertTrue(instance.add("Mercedes-Benz", "SLK-Class SLK55 AMG"));
		assertTrue(instance.add("Mercedes-Benz", "SLK-Class SLK32 AMG"));
		assertTrue(instance.add("Mercedes-Benz", "SLR McLaren Convertible"));
		assertTrue(instance.add("Mercedes-Benz", "SLR McLaren Coupe"));
		assertTrue(instance.add("Mercedes-Benz", "SLS AMG Convertible"));
		assertTrue(instance.add("Mercedes-Benz", "SLS AMG Coupe"));
		assertTrue(instance.add("Mercedes-Benz", "SLS AMG GT Coupe"));
		assertTrue(instance.add("Mercedes-Benz", "SLS AMG GT Convertible"));
		assertTrue(instance.add("Mercedes-Benz", "Sprinter Van"));	
	}
	
	@Test
	public void Mercury() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Mercury", "Capri Convertible"));
		assertTrue(instance.add("Mercury", "Cougar Hatchback"));
		assertTrue(instance.add("Mercury", "Cougar Coupe"));
		assertTrue(instance.add("Mercury", "Grand Marquis Sedan"));
		assertTrue(instance.add("Mercury", "Grand Marquis Wagon"));
		assertTrue(instance.add("Mercury", "Marauder Sedan"));
		assertTrue(instance.add("Mercury", "Mariner SUV"));
		assertTrue(instance.add("Mercury", "Mariner Hybrid SUV"));
		assertTrue(instance.add("Mercury", "Milan Sedan"));
		assertTrue(instance.add("Mercury", "Milan Hybrid Sedan"));
		assertTrue(instance.add("Mercury", "Montego Sedan"));
		assertTrue(instance.add("Mercury", "Monterey Minivan"));
		assertTrue(instance.add("Mercury", "Mountaineer SUV"));
		assertTrue(instance.add("Mercury", "Mystique Sedan"));
		assertTrue(instance.add("Mercury", "Sable Sedan"));
		assertTrue(instance.add("Mercury", "Sable Wagon"));
		assertTrue(instance.add("Mercury", "Topaz Coupe"));
		assertTrue(instance.add("Mercury", "Topaz Sedan"));
		assertTrue(instance.add("Mercury", "Tracer Sedan"));
		assertTrue(instance.add("Mercury", "Tracer Wagon"));
		assertTrue(instance.add("Mercury", "Villager Minivan"));
	}
	
	@Test
	public void MINI() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("MINI", "Cooper Hatchback"));
		assertTrue(instance.add("MINI", "Cooper Convertible"));
		assertTrue(instance.add("MINI", "Cooper John Cooper Works"));
		assertTrue(instance.add("MINI", "Cooper S"));
		assertTrue(instance.add("MINI", "Cooper Clubman John Cooper Works"));
		assertTrue(instance.add("MINI", "Cooper Clubman Hatchback"));
		assertTrue(instance.add("MINI", "Cooper Clubvan Wagon"));
		assertTrue(instance.add("MINI", "Cooper Countryman Wagon"));
		assertTrue(instance.add("MINI", "Cooper Countryman John Cooper Works ALL4"));
		assertTrue(instance.add("MINI", "Cooper Coupe Hatchback"));
		assertTrue(instance.add("MINI", "Cooper Coupe John Cooper Works"));
		assertTrue(instance.add("MINI", "Cooper Paceman John Cooper Works ALL4"));
		assertTrue(instance.add("MINI", "Cooper Paceman Hatchback"));
		assertTrue(instance.add("MINI", "Cooper Roadster John Cooper Works"));
		assertTrue(instance.add("MINI", "Cooper Roadster Convertible"));
	}
	
	@Test
	public void Mitsubishi() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Mitsubishi", "3000GT Hatchback"));
		assertTrue(instance.add("Mitsubishi", "3000GT VR-4"));
		assertTrue(instance.add("Mitsubishi", "3000GT Convertible"));
		assertTrue(instance.add("Mitsubishi", "3000GT Spyder VR-4"));
		assertTrue(instance.add("Mitsubishi", "Diamante Sedan"));
		assertTrue(instance.add("Mitsubishi", "Diamante Wagon"));
		assertTrue(instance.add("Mitsubishi", "Eclipse Hatchback"));
		assertTrue(instance.add("Mitsubishi", "Eclipse GS-T"));
		assertTrue(instance.add("Mitsubishi", "Eclipse GSX"));
		assertTrue(instance.add("Mitsubishi", "Eclipse Spyder Convertible"));
		assertTrue(instance.add("Mitsubishi", "Eclipse Spyder GS-T"));
		assertTrue(instance.add("Mitsubishi", "Endeavor SUV"));
		assertTrue(instance.add("Mitsubishi", "Expo Hatchback"));
		assertTrue(instance.add("Mitsubishi", "Galant Sedan"));
		assertTrue(instance.add("Mitsubishi", "Galant VR-4"));
		assertTrue(instance.add("Mitsubishi", "i-MiEV Hatchback"));
		assertTrue(instance.add("Mitsubishi", "Lancer Sedan"));
		assertTrue(instance.add("Mitsubishi", "Lancer Ralliart"));
		assertTrue(instance.add("Mitsubishi", "Lancer Evolution Sedan"));
		assertTrue(instance.add("Mitsubishi", "Lancer Sportback Hatchback"));
		assertTrue(instance.add("Mitsubishi", "Lancer Sportback Wagon"));
		assertTrue(instance.add("Mitsubishi", "Mighty Max Pickup Regular Cab"));
		assertTrue(instance.add("Mitsubishi", "Mighty Max Pickup Extended Cab"));
		assertTrue(instance.add("Mitsubishi", "Mirage Hatchback"));
		assertTrue(instance.add("Mitsubishi", "Mirage Coupe"));
		assertTrue(instance.add("Mitsubishi", "Mirage Sedan"));
		assertTrue(instance.add("Mitsubishi", "Montero SUV"));
		assertTrue(instance.add("Mitsubishi", "Montero Sport SUV"));
		assertTrue(instance.add("Mitsubishi", "Outlander SUV"));
		assertTrue(instance.add("Mitsubishi", "Outlander Hybrid"));
		assertTrue(instance.add("Mitsubishi", "Outlander Sport SUV"));
		assertTrue(instance.add("Mitsubishi", "Precis Hatchback"));
		assertTrue(instance.add("Mitsubishi", "Raider Extended Cab"));
		assertTrue(instance.add("Mitsubishi", "Raider Double Cab"));
		assertTrue(instance.add("Mitsubishi", "Sigma Sedan"));
		assertTrue(instance.add("Mitsubishi", "Vanwagon Minivan"));
	}
	
	@Test
	public void Nissan() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Nissan", "200SX Coupe"));
		assertTrue(instance.add("Nissan", "240SX Coupe"));
		assertTrue(instance.add("Nissan", "240SX Convertible"));
		assertTrue(instance.add("Nissan", "240SX Hatchback"));
		assertTrue(instance.add("Nissan", "300ZX Convertible"));
		assertTrue(instance.add("Nissan", "300ZX Coupe"));
		assertTrue(instance.add("Nissan", "300ZX Hatchback"));
		assertTrue(instance.add("Nissan", "350Z Convertible"));
		assertTrue(instance.add("Nissan", "350Z Coupe"));
		assertTrue(instance.add("Nissan", "350Z NISMO"));
		assertTrue(instance.add("Nissan", "370Z Coupe"));
		assertTrue(instance.add("Nissan", "370Z NISMO"));
		assertTrue(instance.add("Nissan", "370Z Convertible"));
		assertTrue(instance.add("Nissan", "Altima Sedan"));
		assertTrue(instance.add("Nissan", "Altima Coupe"));
		assertTrue(instance.add("Nissan", "Altima Hybrid Sedan"));
		assertTrue(instance.add("Nissan", "Armada SUV"));
		assertTrue(instance.add("Nissan", "Axxess Minivan"));
		assertTrue(instance.add("Nissan", "Cube Wagon"));
		assertTrue(instance.add("Nissan", "Frontier King Cab"));
		assertTrue(instance.add("Nissan", "Frontier Crew Cab"));
		assertTrue(instance.add("Nissan", "Frontier Regular Cab"));
		assertTrue(instance.add("Nissan", "Frontier Extended Cab"));
		assertTrue(instance.add("Nissan", "GT-R Coupe"));
		assertTrue(instance.add("Nissan", "Juke Hatchback"));
		assertTrue(instance.add("Nissan", "Juke NISMO"));
		assertTrue(instance.add("Nissan", "Leaf Hatchback"));
		assertTrue(instance.add("Nissan", "Maxima Sedan"));
		assertTrue(instance.add("Nissan", "Murano SUV"));
		assertTrue(instance.add("Nissan", "Murano CrossCabriolet SUV"));
		assertTrue(instance.add("Nissan", "NV Van"));
		assertTrue(instance.add("Nissan", "NV Passenger Van"));
		assertTrue(instance.add("Nissan", "NV200 Minivan"));
		assertTrue(instance.add("Nissan", "NX Hatchback"));
		assertTrue(instance.add("Nissan", "Pathfinder Hybrid"));
		assertTrue(instance.add("Nissan", "Pathfinder SUV"));
		assertTrue(instance.add("Nissan", "Pulsar Coupe"));
		assertTrue(instance.add("Nissan", "Quest Minivan"));
		assertTrue(instance.add("Nissan", "Rogue SUV"));
		assertTrue(instance.add("Nissan", "Sentra Sedan"));
		assertTrue(instance.add("Nissan", "Sentra SE-R Spec V"));
		assertTrue(instance.add("Nissan", "Sentra SE-R"));
		assertTrue(instance.add("Nissan", "Sentra Coupe"));
		assertTrue(instance.add("Nissan", "Sentra Hatchback"));
		assertTrue(instance.add("Nissan", "Sentra Wagon"));
		assertTrue(instance.add("Nissan", "Stanza Sedan"));
		assertTrue(instance.add("Nissan", "Titan Extended Cab"));
		assertTrue(instance.add("Nissan", "Titan Crew Cab"));
		assertTrue(instance.add("Nissan", "Titan King Cab"));
		assertTrue(instance.add("Nissan", "Truck Regular Cab"));
		assertTrue(instance.add("Nissan", "Truck Extended Cab"));
		assertTrue(instance.add("Nissan", "Van Minivan"));
		assertTrue(instance.add("Nissan", "Versa Sedan"));
		assertTrue(instance.add("Nissan", "Versa Hatchback"));
		assertTrue(instance.add("Nissan", "Versa Note Hatchback"));
		assertTrue(instance.add("Nissan", "Xterra SUV"));
	}
	
	@Test
	public void Oldsmobile() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Oldsmobile", "Achieva Sedan"));
		assertTrue(instance.add("Oldsmobile", "Achieva Coupe"));
		assertTrue(instance.add("Oldsmobile", "Alero Sedan"));
		assertTrue(instance.add("Oldsmobile", "Alero Coupe"));
		assertTrue(instance.add("Oldsmobile", "Aurora Sedan"));
		assertTrue(instance.add("Oldsmobile", "Bravada SUV"));
		assertTrue(instance.add("Oldsmobile", "Ciera Sedan"));
		assertTrue(instance.add("Oldsmobile", "Ciera Wagon"));
		assertTrue(instance.add("Oldsmobile", "Custom Cruiser Wagon"));
		assertTrue(instance.add("Oldsmobile", "Cutlass Sedan"));
		assertTrue(instance.add("Oldsmobile", "Cutlass Calais Coupe"));
		assertTrue(instance.add("Oldsmobile", "Cutlass Calais Sedan"));
		assertTrue(instance.add("Oldsmobile", "Cutlass Ciera Sedan"));
		assertTrue(instance.add("Oldsmobile", "Cutlass Ciera Wagon"));
		assertTrue(instance.add("Oldsmobile", "Cutlass Ciera Coupe"));
		assertTrue(instance.add("Oldsmobile", "Cutlass Supreme Coupe"));
		assertTrue(instance.add("Oldsmobile", "Cutlass Supreme Sedan"));
		assertTrue(instance.add("Oldsmobile", "Cutlass Supreme Convertible"));
		assertTrue(instance.add("Oldsmobile", "Eighty-Eight Sedan"));
		assertTrue(instance.add("Oldsmobile", "Eighty-Eight Royale Sedan"));
		assertTrue(instance.add("Oldsmobile", "Eighty-Eight Royale Coupe"));
		assertTrue(instance.add("Oldsmobile", "Intrigue Sedan"));
		assertTrue(instance.add("Oldsmobile", "LSS Sedan"));
		assertTrue(instance.add("Oldsmobile", "Ninety-Eight Sedan"));
		assertTrue(instance.add("Oldsmobile", "Regency Sedan"));
		assertTrue(instance.add("Oldsmobile", "Silhouette Minivan"));
		assertTrue(instance.add("Oldsmobile", "Toronado Coupe"));
	}
	
	@Test
	public void Panoz() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Panoz", "Esperante Convertible"));
		assertTrue(instance.add("Panoz", "Esperante GTLM"));
		assertTrue(instance.add("Panoz", "Esperante Coupe"));
	}
	
	@Test
	public void Plymouth() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Plymouth", "Acclaim Sedan"));
		assertTrue(instance.add("Plymouth", "Breeze Sedan"));
		assertTrue(instance.add("Plymouth", "Colt Coupe"));
		assertTrue(instance.add("Plymouth", "Colt Wagon"));
		assertTrue(instance.add("Plymouth", "Colt Sedan"));
		assertTrue(instance.add("Plymouth", "Colt Hatchback"));
		assertTrue(instance.add("Plymouth", "Grand Voyager Minivan"));
		assertTrue(instance.add("Plymouth", "Horizon Hatchback"));
		assertTrue(instance.add("Plymouth", "Laser Hatchback"));
		assertTrue(instance.add("Plymouth", "Neon Sedan"));
		assertTrue(instance.add("Plymouth", "Neon Coupe"));
		assertTrue(instance.add("Plymouth", "Prowler Convertible"));
		assertTrue(instance.add("Plymouth", "Sundance Hatchback"));
		assertTrue(instance.add("Plymouth", "Voyager Minivan"));
	}
	
	@Test
	public void Pontiac() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Pontiac", "6000 Wagon"));
		assertTrue(instance.add("Pontiac", "6000 Sedan"));
		assertTrue(instance.add("Pontiac", "Aztek SUV"));
		assertTrue(instance.add("Pontiac", "Bonneville Sedan"));
		assertTrue(instance.add("Pontiac", "Firebird Convertible"));
		assertTrue(instance.add("Pontiac", "Firebird Hatchback"));
		assertTrue(instance.add("Pontiac", "Firebird Trans Am"));
		assertTrue(instance.add("Pontiac", "Firebird Trans Am GT"));
		assertTrue(instance.add("Pontiac", "Firebird Trans Am 25th Anniversary"));
		assertTrue(instance.add("Pontiac", "Firebird Trans Am GTA"));
		assertTrue(instance.add("Pontiac", "G3 Hatchback"));
		assertTrue(instance.add("Pontiac", "G5 Coupe"));
		assertTrue(instance.add("Pontiac", "G6 Sedan"));
		assertTrue(instance.add("Pontiac", "G6 Convertible"));
		assertTrue(instance.add("Pontiac", "G6 Coupe"));
		assertTrue(instance.add("Pontiac", "G8 GXP"));
		assertTrue(instance.add("Pontiac", "G8 Sedan"));
		assertTrue(instance.add("Pontiac", "Grand Am Sedan"));
		assertTrue(instance.add("Pontiac", "Grand Am Coupe"));
		assertTrue(instance.add("Pontiac", "Grand Prix GXP"));
		assertTrue(instance.add("Pontiac", "Grand Prix Sedan"));
		assertTrue(instance.add("Pontiac", "Grand Prix Coupe"));
		assertTrue(instance.add("Pontiac", "GTO Coupe"));
		assertTrue(instance.add("Pontiac", "Le Mans Coupe"));
		assertTrue(instance.add("Pontiac", "Le Mans Sedan"));
		assertTrue(instance.add("Pontiac", "Montana Minivan"));
		assertTrue(instance.add("Pontiac", "Montana SV6 Minivan"));
		assertTrue(instance.add("Pontiac", "Solstice GXP"));
		assertTrue(instance.add("Pontiac", "Solstice Convertible"));
		assertTrue(instance.add("Pontiac", "Solstice Coupe"));
		assertTrue(instance.add("Pontiac", "Solstice SCCA T2 Champion Edition"));
		assertTrue(instance.add("Pontiac", "Sunbird Coupe"));
		assertTrue(instance.add("Pontiac", "Sunbird Sedan"));
		assertTrue(instance.add("Pontiac", "Sunbird Convertible"));
		assertTrue(instance.add("Pontiac", "Sunfire Coupe"));
		assertTrue(instance.add("Pontiac", "Sunfire Sedan"));
		assertTrue(instance.add("Pontiac", "Sunfire Convertible"));
		assertTrue(instance.add("Pontiac", "Torrent GXP"));
		assertTrue(instance.add("Pontiac", "Torrent SUV"));
		assertTrue(instance.add("Pontiac", "Trans Sport Minivan"));
		assertTrue(instance.add("Pontiac", "Vibe Hatchback"));
		assertTrue(instance.add("Pontiac", "Vibe Wagon"));
	}
	
	@Test
	public void Porsche() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Porsche", "911 Coupe"));
		assertTrue(instance.add("Porsche", "911 GT3"));
		assertTrue(instance.add("Porsche", "911 Convertible"));
		assertTrue(instance.add("Porsche", "911 GT2 RS"));
		assertTrue(instance.add("Porsche", "911 Carrera GTS"));
		assertTrue(instance.add("Porsche", "911 GT3 RS 4.0"));
		assertTrue(instance.add("Porsche", "911 Carrera 4 GTS"));
		assertTrue(instance.add("Porsche", "911 GT3 RS"));
		assertTrue(instance.add("Porsche", "911 GT2"));
		assertTrue(instance.add("Porsche", "911 Turbo S"));
		assertTrue(instance.add("Porsche", "911 RS America"));
		assertTrue(instance.add("Porsche", "918 Spyder Coupe"));
		assertTrue(instance.add("Porsche", "928 Hatchback"));
		assertTrue(instance.add("Porsche", "944 Hatchback"));
		assertTrue(instance.add("Porsche", "944 Convertible"));
		assertTrue(instance.add("Porsche", "968 Convertible"));
		assertTrue(instance.add("Porsche", "968 Coupe"));
		assertTrue(instance.add("Porsche", "Boxster Convertible"));
		assertTrue(instance.add("Porsche", "Boxster RS 60 Spyder"));
		assertTrue(instance.add("Porsche", "Carrera GT Convertible"));
		assertTrue(instance.add("Porsche", "Cayenne Diesel"));
		assertTrue(instance.add("Porsche", "Cayenne Hybrid"));
		assertTrue(instance.add("Porsche", "Cayenne SUV"));
		assertTrue(instance.add("Porsche", "Cayenne Turbo S"));
		assertTrue(instance.add("Porsche", "Cayman Coupe"));
		assertTrue(instance.add("Porsche", "Cayman S Coupe"));
		assertTrue(instance.add("Porsche", "Macan SUV"));
		assertTrue(instance.add("Porsche", "Panamera Sedan"));
		assertTrue(instance.add("Porsche", "Panamera Hybrid"));
	}
	
	@Test
	public void Ram() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Ram", "1500 Crew Cab"));
		assertTrue(instance.add("Ram", "1500 Regular Cab"));
		assertTrue(instance.add("Ram", "1500 Quad Cab"));
		assertTrue(instance.add("Ram", "2500 Crew Cab"));
		assertTrue(instance.add("Ram", "2500 Regular Cab"));
		assertTrue(instance.add("Ram", "2500 Mega Cab"));
		assertTrue(instance.add("Ram", "3500 Regular Cab"));
		assertTrue(instance.add("Ram", "3500 Mega Cab"));
		assertTrue(instance.add("Ram", "3500 Crew Cab"));
		assertTrue(instance.add("Ram", "C/V Cargo Van Minivan"));
		assertTrue(instance.add("Ram", "C/V Tradesman Minivan"));
		assertTrue(instance.add("Ram", "CV Minivan"));
		assertTrue(instance.add("Ram", "Dakota Extended Cab"));
		assertTrue(instance.add("Ram", "Dakota Crew Cab"));
		assertTrue(instance.add("Ram", "Promaster Cargo Van"));
		assertTrue(instance.add("Ram", "Promaster Window Van"));
	}
	
	@Test
	public void Rolls_Royce() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Rolls-Royce", "Corniche Convertible"));
		assertTrue(instance.add("Rolls-Royce", "Ghost Sedan"));
		assertTrue(instance.add("Rolls-Royce", "Park Ward Sedan"));
		assertTrue(instance.add("Rolls-Royce", "Phantom Sedan"));
		assertTrue(instance.add("Rolls-Royce", "Phantom Coupe"));
		assertTrue(instance.add("Rolls-Royce", "Phantom Drophead Coupe Convertible"));
		assertTrue(instance.add("Rolls-Royce", "Silver Seraph Sedan"));
		assertTrue(instance.add("Rolls-Royce", "Wraith Coupe"));
	}
	
	@Test
	public void Saab() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Saab", "9-2X Wagon"));
		assertTrue(instance.add("Saab", "9-3 Wagon"));
		assertTrue(instance.add("Saab", "9-3 Convertible"));
		assertTrue(instance.add("Saab", "9-3 Sedan"));
		assertTrue(instance.add("Saab", "9-3 Turbo X SportCombi"));
		assertTrue(instance.add("Saab", "9-3 Turbo X"));
		assertTrue(instance.add("Saab", "9-3 Viggen"));
		assertTrue(instance.add("Saab", "9-3 Hatchback"));
		assertTrue(instance.add("Saab", "9-3 Griffin Wagon"));
		assertTrue(instance.add("Saab", "9-3 Griffin Sedan"));
		assertTrue(instance.add("Saab", "9-3 Griffin Convertible"));
		assertTrue(instance.add("Saab", "9-4X SUV"));
		assertTrue(instance.add("Saab", "9-5 Sedan"));
		assertTrue(instance.add("Saab", "9-5 Wagon"));
		assertTrue(instance.add("Saab", "9-7X SUV"));
		assertTrue(instance.add("Saab", "900 Hatchback"));
		assertTrue(instance.add("Saab", "900 Convertible"));
		assertTrue(instance.add("Saab", "900 Sedan"));
		assertTrue(instance.add("Saab", "900 SPG"));
		assertTrue(instance.add("Saab", "9000 Hatchback"));
		assertTrue(instance.add("Saab", "9000 Aero"));
		assertTrue(instance.add("Saab", "9000 Sedan"));
	}
	
	@Test
	public void Saturn() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Saturn", "Astra Hatchback"));
		assertTrue(instance.add("Saturn", "Aura Sedan"));
		assertTrue(instance.add("Saturn", "Aura Hybrid"));
		assertTrue(instance.add("Saturn", "Aura Hybrid Sedan"));
		assertTrue(instance.add("Saturn", "ION Coupe"));
		assertTrue(instance.add("Saturn", "ION Red Line"));
		assertTrue(instance.add("Saturn", "ION Sedan"));
		assertTrue(instance.add("Saturn", "L-Series Sedan"));
		assertTrue(instance.add("Saturn", "L-Series Wagon"));
		assertTrue(instance.add("Saturn", "L300 Sedan"));
		assertTrue(instance.add("Saturn", "L300 Wagon"));
		assertTrue(instance.add("Saturn", "Outlook SUV"));
		assertTrue(instance.add("Saturn", "Relay Minivan"));
		assertTrue(instance.add("Saturn", "S-Series Coupe"));
		assertTrue(instance.add("Saturn", "S-Series Sedan"));
		assertTrue(instance.add("Saturn", "S-Series Wagon"));
		assertTrue(instance.add("Saturn", "Sky Red Line Hydro Blue Limited Edition"));
		assertTrue(instance.add("Saturn", "Sky Red Line"));
		assertTrue(instance.add("Saturn", "Sky Red Line Ruby Red SE"));
		assertTrue(instance.add("Saturn", "Sky Convertible"));
		assertTrue(instance.add("Saturn", "Sky Red Line Carbon Flash SE"));
		assertTrue(instance.add("Saturn", "VUE SUV"));
		assertTrue(instance.add("Saturn", "VUE Hybrid"));
		assertTrue(instance.add("Saturn", "VUE Base"));
		assertTrue(instance.add("Saturn", "VUE Hybrid SUV"));
	}
	
	@Test
	public void Scion() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Scion", "FR-S Coupe"));
		assertTrue(instance.add("Scion", "FR-S Convertible"));
		assertTrue(instance.add("Scion", "iQ Hatchback"));
		assertTrue(instance.add("Scion", "tC Hatchback"));
		assertTrue(instance.add("Scion", "xA Hatchback"));
		assertTrue(instance.add("Scion", "xB Wagon"));
		assertTrue(instance.add("Scion", "xD Hatchback"));
	}
	
	@Test
	public void Smart() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Smart", "fortwo Hatchback"));
		assertTrue(instance.add("Smart", "fortwo Convertible"));
	}
	
	@Test
	public void Spyker() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Spyker", "C8 Convertible"));
		assertTrue(instance.add("Spyker", "C8 Coupe"));
	}
	
	@Test
	public void Subaru() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Subaru", "B9 Tribeca SUV"));
		assertTrue(instance.add("Subaru", "Baja Crew Cab"));
		assertTrue(instance.add("Subaru", "BRZ Convertible"));
		assertTrue(instance.add("Subaru", "BRZ Coupe"));
		assertTrue(instance.add("Subaru", "Forester SUV"));
		assertTrue(instance.add("Subaru", "Forester Wagon"));
		assertTrue(instance.add("Subaru", "Impreza Sedan"));
		assertTrue(instance.add("Subaru", "Impreza Hatchback"));
		assertTrue(instance.add("Subaru", "Impreza WRX STI Limited"));
		assertTrue(instance.add("Subaru", "Impreza WRX STI"));
		assertTrue(instance.add("Subaru", "Impreza WRX STI Special Edition"));
		assertTrue(instance.add("Subaru", "Impreza Wagon"));
		assertTrue(instance.add("Subaru", "Impreza Coupe"));
		assertTrue(instance.add("Subaru", "Impreza RS"));
		assertTrue(instance.add("Subaru", "Impreza WRX Sedan"));
		assertTrue(instance.add("Subaru", "Impreza WRX Hatchback"));
		assertTrue(instance.add("Subaru", "Impreza WRX STI"));
		assertTrue(instance.add("Subaru", "Impreza WRX STI Limited"));
		assertTrue(instance.add("Subaru", "Justy Hatchback"));
		assertTrue(instance.add("Subaru", "Legacy Sedan"));
		assertTrue(instance.add("Subaru", "Legacy Wagon"));
		assertTrue(instance.add("Subaru", "Loyale Wagon"));
		assertTrue(instance.add("Subaru", "Loyale Sedan"));
		assertTrue(instance.add("Subaru", "Loyale Hatchback"));
		assertTrue(instance.add("Subaru", "Outback Wagon"));
		assertTrue(instance.add("Subaru", "Outback Sedan"));
		assertTrue(instance.add("Subaru", "SVX Coupe"));
		assertTrue(instance.add("Subaru", "Tribeca SUV"));
		assertTrue(instance.add("Subaru", "WRX Hatchback"));
		assertTrue(instance.add("Subaru", "WRX Sedan"));
		assertTrue(instance.add("Subaru", "XT Coupe"));
		assertTrue(instance.add("Subaru", "XV Crosstrek Hybrid"));
		assertTrue(instance.add("Subaru", "XV Crosstrek SUV"));
	}
	
	@Test
	public void Suzuki() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Suzuki", "Aerio Sedan"));
		assertTrue(instance.add("Suzuki", "Aerio Wagon"));
		assertTrue(instance.add("Suzuki", "Equator Crew Cab"));
		assertTrue(instance.add("Suzuki", "Equator Extended Cab"));
		assertTrue(instance.add("Suzuki", "Esteem Wagon"));
		assertTrue(instance.add("Suzuki", "Esteem Sedan"));
		assertTrue(instance.add("Suzuki", "Forenza Wagon"));
		assertTrue(instance.add("Suzuki", "Forenza Sedan"));
		assertTrue(instance.add("Suzuki", "Grand Vitara SUV"));
		assertTrue(instance.add("Suzuki", "Kizashi Sedan"));
		assertTrue(instance.add("Suzuki", "Reno Hatchback"));
		assertTrue(instance.add("Suzuki", "Samurai SUV"));
		assertTrue(instance.add("Suzuki", "Sidekick SUV"));
		assertTrue(instance.add("Suzuki", "Swift Hatchback"));
		assertTrue(instance.add("Suzuki", "Swift Sedan"));
		assertTrue(instance.add("Suzuki", "SX4 Hatchback"));
		assertTrue(instance.add("Suzuki", "SX4 Sedan"));
		assertTrue(instance.add("Suzuki", "Verona Sedan"));
		assertTrue(instance.add("Suzuki", "Vitara SUV"));
		assertTrue(instance.add("Suzuki", "X-90 SUV"));
		assertTrue(instance.add("Suzuki", "XL-7 SUV"));
		assertTrue(instance.add("Suzuki", "XL7 SUV"));
	}
	
	@Test
	public void Tesla() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Tesla", "Model S Sedan"));
		assertTrue(instance.add("Tesla", "Roadster Convertible"));
		assertTrue(instance.add("Tesla", "Roadster Sport 2.5"));
		assertTrue(instance.add("Tesla", "Roadster Sport"));
	}
	
	@Test
	public void Toyota() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Toyota", "4Runner SUV"));
		assertTrue(instance.add("Toyota", "Avalon Sedan"));
		assertTrue(instance.add("Toyota", "Avalon Hybrid Sedan"));
		assertTrue(instance.add("Toyota", "Camry Sedan"));
		assertTrue(instance.add("Toyota", "Camry Coupe"));
		assertTrue(instance.add("Toyota", "Camry Wagon"));
		assertTrue(instance.add("Toyota", "Camry Hybrid Sedan"));
		assertTrue(instance.add("Toyota", "Camry Solara Convertible"));
		assertTrue(instance.add("Toyota", "Camry Solara Coupe"));
		assertTrue(instance.add("Toyota", "Celica Hatchback"));
		assertTrue(instance.add("Toyota", "Celica Convertible"));
		assertTrue(instance.add("Toyota", "Celica Coupe"));
		assertTrue(instance.add("Toyota", "Corolla Sedan"));
		assertTrue(instance.add("Toyota", "Corolla Wagon"));
		assertTrue(instance.add("Toyota", "Corolla Coupe"));
		assertTrue(instance.add("Toyota", "Cressida Sedan"));
		assertTrue(instance.add("Toyota", "ECHO Sedan"));
		assertTrue(instance.add("Toyota", "ECHO Coupe"));
		assertTrue(instance.add("Toyota", "FJ Cruiser SUV"));
		assertTrue(instance.add("Toyota", "Highlander SUV"));
		assertTrue(instance.add("Toyota", "Highlander Hybrid SUV"));
		assertTrue(instance.add("Toyota", "Land Cruiser SUV"));
		assertTrue(instance.add("Toyota", "Matrix Hatchback"));
		assertTrue(instance.add("Toyota", "Matrix Wagon"));
		assertTrue(instance.add("Toyota", "MR2 Coupe"));
		assertTrue(instance.add("Toyota", "MR2 Spyder Convertible"));
		assertTrue(instance.add("Toyota", "Paseo Coupe"));
		assertTrue(instance.add("Toyota", "Paseo Convertible"));
		assertTrue(instance.add("Toyota", "Pickup Extended Cab"));
		assertTrue(instance.add("Toyota", "Pickup Regular Cab"));
		assertTrue(instance.add("Toyota", "Previa Minivan"));
		assertTrue(instance.add("Toyota", "Prius Hatchback"));
		assertTrue(instance.add("Toyota", "Prius Sedan"));
		assertTrue(instance.add("Toyota", "Prius c Hatchback"));
		assertTrue(instance.add("Toyota", "Prius Plug-in Hatchback"));
		assertTrue(instance.add("Toyota", "Prius v Wagon"));
		assertTrue(instance.add("Toyota", "RAV4 SUV"));
		assertTrue(instance.add("Toyota", "RAV4 EV SUV"));
		assertTrue(instance.add("Toyota", "Sequoia SUV"));
		assertTrue(instance.add("Toyota", "Sienna Minivan"));
		assertTrue(instance.add("Toyota", "Supra Coupe"));
		assertTrue(instance.add("Toyota", "Supra Hatchback"));
		assertTrue(instance.add("Toyota", "T100 Regular Cab"));
		assertTrue(instance.add("Toyota", "T100 Extended Cab"));
		assertTrue(instance.add("Toyota", "Tacoma Access Cab"));
		assertTrue(instance.add("Toyota", "Tacoma Regular Cab"));
		assertTrue(instance.add("Toyota", "Tacoma Double Cab"));
		assertTrue(instance.add("Toyota", "Tacoma Xtracab"));
		assertTrue(instance.add("Toyota", "Tacoma Extended Cab"));
		assertTrue(instance.add("Toyota", "Tercel Coupe"));
		assertTrue(instance.add("Toyota", "Tercel Sedan"));
		assertTrue(instance.add("Toyota", "Tercel Hatchback"));
		assertTrue(instance.add("Toyota", "Tundra CrewMax Cab"));
		assertTrue(instance.add("Toyota", "Tundra Double Cab"));
		assertTrue(instance.add("Toyota", "Tundra Regular Cab"));
		assertTrue(instance.add("Toyota", "Tundra Access Cab"));
		assertTrue(instance.add("Toyota", "Tundra Extended Cab"));
		assertTrue(instance.add("Toyota", "Venza Wagon"));
		assertTrue(instance.add("Toyota", "Yaris Hatchback"));
		assertTrue(instance.add("Toyota", "Yaris Sedan"));
	}
	
	@Test
	public void Volkswagen() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Volkswagen", "Alltrack Wagon"));
		assertTrue(instance.add("Volkswagen", "Beetle Diesel"));
		assertTrue(instance.add("Volkswagen", "Beetle Hatchback"));
		assertTrue(instance.add("Volkswagen", "Beetle Convertible Diesel"));
		assertTrue(instance.add("Volkswagen", "Beetle Convertible"));
		assertTrue(instance.add("Volkswagen", "Cabrio Convertible"));
		assertTrue(instance.add("Volkswagen", "Cabriolet Convertible"));
		assertTrue(instance.add("Volkswagen", "CC Sedan"));
		assertTrue(instance.add("Volkswagen", "Corrado Hatchback"));
		assertTrue(instance.add("Volkswagen", "Eos Convertible"));
		assertTrue(instance.add("Volkswagen", "EuroVan Minivan"));
		assertTrue(instance.add("Volkswagen", "Fox Sedan"));
		assertTrue(instance.add("Volkswagen", "Fox Coupe"));
		assertTrue(instance.add("Volkswagen", "Fox Wagon"));
		assertTrue(instance.add("Volkswagen", "GLI Sedan"));
		assertTrue(instance.add("Volkswagen", "Golf Hatchback"));
		assertTrue(instance.add("Volkswagen", "Golf Diesel"));
		assertTrue(instance.add("Volkswagen", "Golf R Hatchback"));
		assertTrue(instance.add("Volkswagen", "GTI Hatchback"));
		assertTrue(instance.add("Volkswagen", "Jetta Sedan"));
		assertTrue(instance.add("Volkswagen", "Jetta Diesel"));
		assertTrue(instance.add("Volkswagen", "Jetta Wagon"));
		assertTrue(instance.add("Volkswagen", "Jetta Coupe"));
		assertTrue(instance.add("Volkswagen", "Jetta GLI Sedan"));
		assertTrue(instance.add("Volkswagen", "Jetta Hybrid Sedan"));
		assertTrue(instance.add("Volkswagen", "Jetta SportWagen Wagon"));
		assertTrue(instance.add("Volkswagen", "Jetta SportWagen Diesel"));
		assertTrue(instance.add("Volkswagen", "New Beetle Convertible"));
		assertTrue(instance.add("Volkswagen", "New Beetle Hatchback"));
		assertTrue(instance.add("Volkswagen", "New Beetle Diesel"));
		assertTrue(instance.add("Volkswagen", "Passat Sedan"));
		assertTrue(instance.add("Volkswagen", "Passat Diesel"));
		assertTrue(instance.add("Volkswagen", "Passat Wagon"));
		assertTrue(instance.add("Volkswagen", "Phaeton Sedan"));
		assertTrue(instance.add("Volkswagen", "R32 Hatchback"));
		assertTrue(instance.add("Volkswagen", "Rabbit Hatchback"));
		assertTrue(instance.add("Volkswagen", "Routan Minivan"));
		assertTrue(instance.add("Volkswagen", "Tiguan SUV"));
		assertTrue(instance.add("Volkswagen", "Touareg SUV"));
		assertTrue(instance.add("Volkswagen", "Touareg Diesel"));
		assertTrue(instance.add("Volkswagen", "Touareg Hybrid"));
		assertTrue(instance.add("Volkswagen", "Touareg 2 Diesel"));
		assertTrue(instance.add("Volkswagen", "Touareg 2 SUV"));
		assertTrue(instance.add("Volkswagen", "Vanagon Minivan"));
	}
	
	@Test
	public void Volvo() {
		vehicle_model_mod instance = new vehicle_model_mod();
		
		assertTrue(instance.add("Volvo", "240 Sedan"));
		assertTrue(instance.add("Volvo", "240 Wagon"));
		assertTrue(instance.add("Volvo", "740 Wagon"));
		assertTrue(instance.add("Volvo", "740 Sedan"));
		assertTrue(instance.add("Volvo", "760 Wagon"));
		assertTrue(instance.add("Volvo", "760 Sedan"));
		assertTrue(instance.add("Volvo", "780 Coupe"));
		assertTrue(instance.add("Volvo", "850 Sedan"));
		assertTrue(instance.add("Volvo", "850 Wagon"));
		assertTrue(instance.add("Volvo", "850 R"));
		assertTrue(instance.add("Volvo", "850 T5R"));
		assertTrue(instance.add("Volvo", "940 Wagon"));
		assertTrue(instance.add("Volvo", "940 Sedan"));
		assertTrue(instance.add("Volvo", "960 Sedan"));
		assertTrue(instance.add("Volvo", "960 Wagon"));
		assertTrue(instance.add("Volvo", "C30 Hatchback"));
		assertTrue(instance.add("Volvo", "C70 Convertible"));
		assertTrue(instance.add("Volvo", "C70 Coupe"));
		assertTrue(instance.add("Volvo", "Coupe"));
		assertTrue(instance.add("Volvo", "S40 Sedan"));
		assertTrue(instance.add("Volvo", "S60 T6 R-Design"));
		assertTrue(instance.add("Volvo", "S60 Sedan"));
		assertTrue(instance.add("Volvo", "S60 R"));
		assertTrue(instance.add("Volvo", "S70 Sedan"));
		assertTrue(instance.add("Volvo", "S80 Sedan"));
		assertTrue(instance.add("Volvo", "S90 Sedan"));
		assertTrue(instance.add("Volvo", "V40 Wagon"));
		assertTrue(instance.add("Volvo", "V50 Wagon"));
		assertTrue(instance.add("Volvo", "V60 Wagon"));
		assertTrue(instance.add("Volvo", "V70 Wagon"));
		assertTrue(instance.add("Volvo", "V70 R"));
		assertTrue(instance.add("Volvo", "V90 Wagon"));
		assertTrue(instance.add("Volvo", "XC Wagon"));
		assertTrue(instance.add("Volvo", "XC60 SUV"));
		assertTrue(instance.add("Volvo", "XC70 Wagon"));
		assertTrue(instance.add("Volvo", "XC90 SUV"));
	}
}
