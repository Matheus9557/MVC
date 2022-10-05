package pw1;

public class MVC {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Sneakers model  = retriveSneakersFromDatabase();
		SneakersView view = new SneakersView();
		SneakersController controller = new SneakersController(model, view);
		
		controller.updateView();
		controller.setSneakersName("Air Jordan 6");
		controller.updateView();

	}
	
	private static Sneakers retriveSneakersFromDatabase(){
	      Sneakers sneakers = new Sneakers();
	      sneakers.setName("Forum 84 High");
	      sneakers.setRollNo("41");
	      return sneakers;

    }
}
