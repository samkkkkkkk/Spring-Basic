package core.chap3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class AsianRestaurant implements Restaurant {
	
	private Chef chef;
	
	//요리 코스
	private Course course;
	
	public void setChef(Chef chef) {
		this.chef = chef;
	}
	
	public void setCourse(Course course) {
		this.course = course;
	}
	
	
	@Autowired
	public AsianRestaurant(@Qualifier("asianChef") Chef chef,@Qualifier("susi") Course course) {
		super();
		this.chef = chef;
		this.course = course;
	}

	// 요리를 주문하는 기능
	public void order() {
		System.out.println("아시안 요리를 주문합니다.");
		course.combineMenu();
		chef.cook();
	}
	
}
