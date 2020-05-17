package com.luv2code.springdemo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("thatSillyCoach")
@Component
public class TennisCoach implements Coach {
	
	@Autowired
	@Qualifier("randomFortuneService")
	private FortuneService fortuneService;
	
	@Value("${foo.email}")
	private String email;
	    
	@Value("${foo.team}")
	private String team;

	public TennisCoach() {
		super();
		System.out.println(">> TennisCoach: isnside the default constructor");
	}
	
	public String getEmail() {
		System.out.println(">> TennisCoach: reading email address value");
		return email;
	}

	public String getTeam() {
		System.out.println(">> TennisCoach: reading team value");
		return team;
	}	

//	@Autowired	
//	public TennisCoach(FortuneService fortuneService) {
//		super();
//		this.fortuneService = fortuneService;
//	}
	
//	public FortuneService getFortuneService() {
//		
//		return fortuneService;
//	
//	}

//	@Autowired
//	public void setFortuneService(FortuneService fortuneService) {
//		System.out.println(">> TennisCoach: Inside the setter method setFortuneService()");
//		this.fortuneService = fortuneService;
//	}
	
//	@Autowired
//	public void doSomeCrazyStuff(FortuneService fortuneService) {
//		
//		System.out.println(">> TennisCoach: Inside the method doSomeCrazyStuff()");
//		this.fortuneService = fortuneService;
//	
//	}	

	@Override
	public String getDailyWorkout() {

		return "Practice your backend volley";
	}

	@Override
	public String getDailyFortune() {

		return this.fortuneService.getFortune();
	}
}
