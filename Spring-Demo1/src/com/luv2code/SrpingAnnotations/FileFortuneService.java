package com.luv2code.SrpingAnnotations;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;
@Component
public class FileFortuneService implements FortuneService {

	@Value("${file.location}")
	private String fortuneFileLocation;
	private Random random ;
	private List<String> randomFortune;
	private int index;
	
	
	@PostConstruct
	public void  init () throws FileNotFoundException 
	{
		random = new Random();
		//Used getAbsolutePath to get the file Path
		 File directory = new File(fortuneFileLocation);
		   System.out.println(directory.getAbsolutePath());
		try 
		{
			randomFortune = Files.lines(Paths.get(fortuneFileLocation))
					.collect(Collectors.toList());
		}
		catch(IOException e) 
		{
			e.printStackTrace();
		}
	}
	
	
	@Override
	public String getFortune() {
		index = random.nextInt(randomFortune.size());
		return randomFortune.get(index);
	}

}
