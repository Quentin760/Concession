package config;

import java.util.Arrays;

import org.mockito.Mockito;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.annotation.Primary;


import repositories.VehiculeRepository;
import véhicule.Vehicule;


@Configuration
@ImportResource("classpath:dispatcher-context.xml")
public class UnitTestConfig {
	
	@Bean
	@Primary
	public VehiculeRepository getMockVehiculeRepository() {
		VehiculeRepository vr = Mockito.mock(VehiculeRepository.class);
		Mockito.when(vr.findAll()).thenReturn(Arrays.asList(getVehicule1(), getVehicule2()));
		return vr;
		}
	
	@Bean("v1")
    public Vehicule getVehicule1() {
    	Vehicule v = new Vehicule();
    	v.setAnnée(2010);
    	v.setNom("Focus");
        return v;
    }
	@Bean("v1")
    public Vehicule getVehicule2() {
    	Vehicule v = new Vehicule();
    	v.setAnnée(2006);
    	v.setNom("Fiesta");
        return v;
    }
	
    
}
