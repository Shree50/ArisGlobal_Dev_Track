package com.example.crud.controller;

import java.io.IOException;
import com.example.crud.controller.UserData;

public interface TrainService 
{

	String generatePNR(UserData users) throws IOException;
	
}
