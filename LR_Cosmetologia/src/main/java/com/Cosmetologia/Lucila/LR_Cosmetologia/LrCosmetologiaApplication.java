package com.Cosmetologia.Lucila.LR_Cosmetologia;

import com.Cosmetologia.Lucila.LR_Cosmetologia.Services.ClienteService;
import com.Cosmetologia.Lucila.LR_Cosmetologia.Services.CobroService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class LrCosmetologiaApplication {
    private static ClienteService clienteService;
    private static CobroService cobroService;
    
    
    @Autowired
    public LrCosmetologiaApplication(ClienteService clienteService,CobroService cobroService){
    this.clienteService = clienteService;
    this.cobroService = cobroService;
    }
    

	public static void main(String[] args) {
		SpringApplication.run(LrCosmetologiaApplication.class, args);
	}

}
