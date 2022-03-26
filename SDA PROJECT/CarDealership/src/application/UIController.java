package application;
import java.beans.EventHandler;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import BusinessLogic.booking;
import javafx.animation.RotateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.shape.Circle;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import java.util.concurrent.TimeUnit;
import BusinessLogic.*;
import java.text.*;
public class UIController {

	//@Override
	//public void start(Stage primaryStage) {}
	
	@FXML
	AnchorPane ap;
	
	@FXML 
	public TextField t = new TextField();  // username
	
	
	@FXML 
	public TextField dd = new TextField(); // date
	
	@FXML 
	public TextField cc = new TextField(); //carmodel
	
	
	
	
	@FXML 
	TextField t5 = new TextField();// complaint type
	
	@FXML 
	TextArea a1 = new TextArea();// complaint type
	
	@FXML
	TextField t1 = new TextField(); //User password text fields
	@FXML 
	TextField t2 = new TextField();  //Account Number
	
	
	@FXML 
	Label lab = new Label(); //Show user ID on the main menu
	
	@FXML 
	Button b=new Button(); //Button to get the car model
	
	@FXML 
	Button b2=new Button(); //Button to get the car model
	
	@FXML 
	Button b3=new Button(); //Button to get the car model
	
	@FXML 
	Button b4=new Button(); //Button to get the car model
	
	@FXML 
	Button b5=new Button(); //Button to get the car model
	
	@FXML 
	Button b6=new Button(); //Button to get the car model

	@FXML 
	Button b7 =new Button(); //Button to get the car model
	
	
	@FXML 
	TextField t3 = new TextField(); //Car name for the inspection scheduling
	
	
	@FXML 
	TextField t4 = new TextField(); //Complain type
	
	//TextAreata;
	@FXML 
	private Circle c1;
	@FXML 
	private Circle c2;
	@FXML 
	private Circle c3;
	
	@FXML 
	Button bb = new Button();
	
	
	@FXML 
	public void animate(ActionEvent event) {
		setRotate(c1,true,360,5);
		setRotate(c2,true,180,13);
		setRotate(c3,true,145,19);
		
		
	}
	
public void setRotate(Circle c, boolean reverse, int angle, int duration) {
	
	RotateTransition rt = new RotateTransition(Duration.seconds(duration),c);
	
	rt.setAutoReverse(reverse);
	rt.setByAngle(angle);
	rt.setDelay(Duration.seconds(0));
	rt.setRate(3);
	rt.setCycleCount(18);
	rt.play();
	}


	public static String name = "";
	public static String carDetail = "";
	public static String accountNo = "";
	
	public void login(ActionEvent event) throws IOException {
		
		//ActionEvent event
		//AnchorPane p = FXMLLoader.load(getClass().getClassLoader().getResource("application/mainInterface.fxml"));
		//ap.getChildren().setAll(p);
		
		//l.setAccessibleText(t.getText());
		//l.setText(t.getText());
		
		
		name = t.getText();
		
		
//		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("application/mainInterface.fxml"));
//		//BorderPane root1 = new BorderPane();
//		//lab.setText(t.getText());
//		Scene scene = new Scene(root,725,500);
//		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//		Stage stage2 = new Stage();
//		stage2.setTitle("Car Dealership");
//		stage2.setScene(scene);
//		stage2.show();
		
		AnchorPane p = FXMLLoader.load(getClass().getClassLoader().getResource("application/mainInterface.fxml"));
		ap.getChildren().setAll(p);
	} 
	
	
	
	public void Booking(ActionEvent event) throws IOException{
		
		
		//Singleton pattern object usage
		booking instance = booking.getInstance();
		instance.startBooking();
		//booking b = new booking()
		//b.startBooking();
		//name = t.getText();
		
		System.out.println(name);
		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("application/Catalogue.fxml"));
		//BorderPane root1 = new BorderPane();
		//lab.setText(t.getText());
		Scene scene = new Scene(root,700,500);
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage stage3 = new Stage();
		stage3.setTitle("Car Dealership");
		stage3.setScene(scene);
		stage3.show();
		
	}
	
	public void selection(ActionEvent event) throws IOException{
		catalogue c = new catalogue();
		
		String name1 = b.getText();
		//carDetail = "hi";
		carDetail = "Ford Mustang";
		if(name1 == "Ford Mustang") {
			
			c.ShowCars();
			for(carinfo ci:c.Cars) {
				System.out.println(ci.carname);
				carDetail = "Ford Mustang";
			}
			//carDetail = c.Cars.get(c1.carname);
			//System.out.println(carDetail);
		}
		
		
		AnchorPane p = FXMLLoader.load(getClass().getClassLoader().getResource("application/payment.fxml"));
		ap.getChildren().setAll(p);
	}
	
	
	public void selection2(ActionEvent event) throws IOException{
		catalogue c = new catalogue();
		String name1 = b2.getText();
		carDetail = "Mclaren P1";
		
		AnchorPane p = FXMLLoader.load(getClass().getClassLoader().getResource("application/payment.fxml"));
		ap.getChildren().setAll(p);
	}
	public void selection3(ActionEvent event) throws IOException{
		catalogue c = new catalogue();
		String name1 = b3.getText();
		carDetail = "Rolls Royce Phantom";
	
		AnchorPane p = FXMLLoader.load(getClass().getClassLoader().getResource("application/payment.fxml"));
		ap.getChildren().setAll(p);

	}
	public void selection4(ActionEvent event) throws IOException{
		catalogue c = new catalogue();
		String name1 = b4.getText();
		carDetail ="Mercedes S-Class";
		
		AnchorPane p = FXMLLoader.load(getClass().getClassLoader().getResource("application/payment.fxml"));
		ap.getChildren().setAll(p);

	}
	public void selection5(ActionEvent event) throws IOException{
		catalogue c = new catalogue();
		String name1 = b5.getText();
		carDetail = "Toyota Corolla";
		
		AnchorPane p = FXMLLoader.load(getClass().getClassLoader().getResource("application/payment.fxml"));
		ap.getChildren().setAll(p);

	}
	public void selection6(ActionEvent event) throws IOException{
		catalogue c = new catalogue();
		String name1 = b6.getText();
		carDetail = "Tesla Model X";
		
		AnchorPane p = FXMLLoader.load(getClass().getClassLoader().getResource("application/payment.fxml"));
		ap.getChildren().setAll(p);

	}
	public void payment(ActionEvent event) throws IOException{
		accountNo = t2.getText();
		UserDatabase db = new UserDatabase();
		db.AddUserDetails(name, carDetail, accountNo);
		
//		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("application/confirmation.fxml"));
//		//BorderPane root1 = new BorderPane();
//		//lab.setText(t.getText());
//		Scene scene = new Scene(root,700,500);
//		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
//		Stage stage4 = new Stage();
//		stage4.setTitle("Car Dealership");
//		stage4.setScene(scene);
//		stage4.show();
		
	AnchorPane p = FXMLLoader.load(getClass().getClassLoader().getResource("application/confirmation.fxml"));
	ap.getChildren().setAll(p);
		
	}
	
	public void scheduleInspection(ActionEvent event) throws IOException{
		String date = b.getText();
		ScheduleInspection SI = new ScheduleInspection();
		boolean isuserpresent = false;
		checkuser ck = new checkuser();
		isuserpresent = ck.CheckUser(name);
		
		//isuserpresent = 
		
		if(isuserpresent == true)
		{
			String CarName = t3.getText();
			//Functionality
			SI.addInspection(name,date,CarName);
		}
	}
	public void collectVehicle(ActionEvent event) throws IOException{
		boolean isuserpresent = false;
		checkuser ck = new checkuser();
		String user = name;
		System.out.println("hasdh");
		System.out.println(user);
		isuserpresent = ck.CheckUser(user);
		
		if(isuserpresent == true)
		{
			System.out.println("hellow");
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("application/collect.fxml"));
			//BorderPane root1 = new BorderPane();
			//lab.setText(t.getText());
			Scene scene = new Scene(root,700,500);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Stage stage4 = new Stage();
			stage4.setTitle("Car Dealership");
			stage4.setScene(scene);
			stage4.show();
		}
		else {
			Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("application/collectNOT.fxml"));
			//BorderPane root1 = new BorderPane();
			//lab.setText(t.getText());
			Scene scene = new Scene(root,700,500);
			//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Stage stage4 = new Stage();
			stage4.setTitle("Car Dealership");
			stage4.setScene(scene);
			stage4.show();
		}
		
		
	}
	
	public void launchComplaint(ActionEvent event) throws IOException{
	
		
		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("application/complaint.fxml"));
		//BorderPane root1 = new BorderPane();
		//lab.setText(t.getText());
		Scene scene = new Scene(root,700,500);
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage stage4 = new Stage();
		stage4.setTitle("Car Dealership");
		stage4.setScene(scene);
		stage4.show();
		
	}
	
	public void launchComplaint1(ActionEvent event) throws IOException{
		String getcomplain = b.getText();
		complaint comp = new complaint();
		String type = t4.getText();
		comp.addcomplaint(name,type,getcomplain);
		
		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("application/complaintSuccess.fxml"));
		//BorderPane root1 = new BorderPane();
		//lab.setText(t.getText());
		Scene scene = new Scene(root,700,500);
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage stage4 = new Stage();
		stage4.setTitle("Car Dealership");
		stage4.setScene(scene);
		stage4.show();
		
		
	}
	
	public void withdraw(ActionEvent event) throws IOException{
		
		Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("application/withdraw.fxml"));
		//BorderPane root1 = new BorderPane();
		//lab.setText(t.getText());
		Scene scene = new Scene(root,700,500);
		//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
		Stage stage4 = new Stage();
		stage4.setTitle("Car Dealership");
		stage4.setScene(scene);
		stage4.show();
	}
	
public void withdraw1(ActionEvent event) throws IOException{
		
		withdrawbooking wb  = new withdrawbooking();
		wb.With_Draw_Booking(accountNo);
		
		
		AnchorPane p = FXMLLoader.load(getClass().getClassLoader().getResource("application/withdraw success.fxml"));
		ap.getChildren().setAll(p);
	}

public void testDrive(ActionEvent event) throws IOException{
	
	Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("application/tdd.fxml"));
	//BorderPane root1 = new BorderPane();
	//lab.setText(t.getText());
	Scene scene = new Scene(root,700,500);
	//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	Stage stage4 = new Stage();
	stage4.setTitle("Car Dealership");
	stage4.setScene(scene);
	stage4.show();
}

public void testDrive1(ActionEvent event) throws IOException{
	testdrive td = new testdrive();
	String date = dd.getText();
	String carname = cc.getText();
	td.addtestdrivedetails(name, date, carname);
	
	
	AnchorPane p = FXMLLoader.load(getClass().getClassLoader().getResource("application/tdc.fxml"));
	ap.getChildren().setAll(p);
}


public void bcat(ActionEvent event) throws IOException{
	
	AnchorPane p = FXMLLoader.load(getClass().getClassLoader().getResource("application/BrowseCat.fxml"));
	ap.getChildren().setAll(p);
}
public void Schedule(ActionEvent event) throws IOException{

	System.out.println(name);
	Parent root = FXMLLoader.load(getClass().getClassLoader().getResource("application/inspection.fxml"));
	//BorderPane root1 = new BorderPane();
	//lab.setText(t.getText());
	Scene scene = new Scene(root,700,500);
	//scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
	Stage stage3 = new Stage();
	stage3.setTitle("Car Dealership");
	stage3.setScene(scene);
	stage3.show();
	
}

public void Schedule1(ActionEvent event) throws IOException{
	ScheduleInspection ns = new ScheduleInspection();
	String date = dd.getText();
	String car = cc.getText();
	ns.addInspection(name, date, car);
	AnchorPane p = FXMLLoader.load(getClass().getClassLoader().getResource("application/Isuccess.fxml"));
	ap.getChildren().setAll(p);
}
}
