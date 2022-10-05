package pw1;

public class SneakersController {
	
	 private Sneakers model;
	   private SneakersView view;

	   public SneakersController(Sneakers model, SneakersView view){
	      this.model = model;
	      this.view = view;
	   }

	   public void setSneakersName(String name){
	      model.setName(name);		
	   }

	   public String getSneakersName(){
	      return model.getName();		
	   }

	   public void setSneakersRollNo(String rollNo){
	      model.setRollNo(rollNo);		
	   }

	   public String getSneakersRollNo(){
	      return model.getRollNo();		
	   }

	   public void updateView(){				
	      view.printSneakersDetails(model.getName(), model.getRollNo());
	   }

}
