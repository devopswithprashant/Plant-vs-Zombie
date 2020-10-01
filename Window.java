package ap_project;

import javafx.animation.KeyFrame;
import javafx.animation.KeyValue;
import javafx.animation.Timeline;
import javafx.animation.TranslateTransition;
import javafx.application.Application;
import javafx.beans.property.IntegerProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.effect.DropShadow;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.*;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
import javafx.util.Duration;
import javafx.scene.input.MouseEvent;

import java.io.FileInputStream;
import java.io.FileNotFoundException;


public class Window extends Application{

	
	private static final Integer STARTTIME = 5;
    private Timeline timeline;
    private Label timerLabel = new Label();
    private IntegerProperty timeSeconds = new SimpleIntegerProperty(STARTTIME);

	
	public static void main(String[] args) {
		launch(args);
	}

	@Override
	public void start(Stage primaryStage) throws FileNotFoundException {
		Image image = new Image(new FileInputStream("C:\\Image\\titleScreen.png"));  
	      
	      ImageView imageView = new ImageView(image); 
	      
	      imageView.setX(50); 
	      imageView.setY(25); 
	      
	      imageView.setFitHeight(1055); 
	      imageView.setFitWidth(1000); 
	      
	      imageView.setPreserveRatio(true);  
	      
	      StackPane root = new StackPane(imageView);  
	      
	      	Button newg = new Button("New Game");
	      	newg.setTranslateX(20);
	      	newg.setTranslateY(-70);
	        newg.setStyle("-fx-font: 26 arial; -fx-base: #b6e7c9;");
	        effects(newg);
	        

	        Button loadg = new Button("Load Game");
	        loadg.setTranslateX(20);
	        loadg.setTranslateY(20);
	        loadg.setStyle("-fx-font: 26 arial; -fx-base: #b6e7c9;");
	        effects(loadg);
	        
	        Button levelch = new Button("Choose Level");
	        levelch.setTranslateX(20);
	        levelch.setTranslateY(120);
	        levelch.setStyle("-fx-font: 26 arial; -fx-base: #b6e7c9;");
	        effects(levelch);

	        Button exit = new Button("Exit");
	        exit.setTranslateX(20);
	        exit.setTranslateY(220);
	        exit.setStyle("-fx-font: 26 arial; -fx-base: #b6e7c9;");
	        effects(exit);
	        
	        newg.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
	        	@Override
	        	public void handle(MouseEvent e) {
	        		try {
						Userlogin(primaryStage);
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					}
	        		
	        	}
	        });
	        
	        loadg.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
	        	@Override
	        	public void handle(MouseEvent e) {
	        		
	        	}
	        });
	        
	        levelch.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
	        	@Override
	        	public void handle(MouseEvent e) {
	        		
	        	}
	        });
	        
	        exit.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
	            @Override
	            public void handle(MouseEvent e) {
	                System.exit(0);
	            }
	        });


	        // Added to root panel
	        root.getChildren().addAll(newg, loadg,levelch, exit);
	      
	      
	      Scene scene = new Scene(root, 1100, 750);  
	      
	      primaryStage.setTitle("Main Menu");  
	       
	      primaryStage.setScene(scene);
	 
	      primaryStage.show(); 
		
	}
	
	public void effects(Button button) {
      DropShadow shadow = new DropShadow();
      button.addEventHandler(MouseEvent.MOUSE_ENTERED, new EventHandler<MouseEvent>() {
                  @Override
                  public void handle(MouseEvent e) {
                      button.setEffect(shadow);
                  }
              });
      
      button.addEventHandler(MouseEvent.MOUSE_EXITED, new EventHandler<MouseEvent>() {
                  @Override
                  public void handle(MouseEvent e) {
                      button.setEffect(null);
                  }
              });
	}
	
	public void Userlogin(Stage primaryStage) throws FileNotFoundException {
		
		Image image2 = new Image(new FileInputStream("C:\\Image\\Pvz_logo.png"));  
	      
	      ImageView imageView2 = new ImageView(image2); 
	      
	      imageView2.setX(50); 
	      imageView2.setY(25); 
	      
	      imageView2.setFitHeight(1055); 
	      imageView2.setFitWidth(1000); 
	      
	      imageView2.setPreserveRatio(true);  
	      
	      Text text1 = new Text();      
	      text1.setText("Enter Your Email ID ");
	      text1.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 30));
	      text1.setTranslateX(10); 
	      text1.setTranslateY(-100);
	      text1.setFill(Color.WHITE); 
	      
	      Label label = new Label();
	      TextField text = new TextField();
	      text.setAlignment(Pos.CENTER);
	      text.setMaxWidth(250.0);
	      text.setMaxHeight(50.0);
	      
	      Button submit = new Button("Submit and Play");
	      submit.setTranslateX(10);
	      submit.setTranslateY(100);
	      submit.setStyle("-fx-font: 26 arial; -fx-base: #b6e7c9;");
	      effects(submit);
	      
	      Button Clear = new Button("Clear");
	      Clear.setTranslateX(10);
	      Clear.setTranslateY(200);
	      Clear.setStyle("-fx-font: 26 arial; -fx-base: #b6e7c9;");
	      effects(Clear);
	      
	      
	      submit.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
	        	@Override
	        	public void handle(MouseEvent e) {
	        		String s = text.getText();
	        		//usernames.add(s);
	        		try {
						lawnshow(primaryStage);
					} catch (FileNotFoundException e1) {
						
						e1.printStackTrace();
					}
	        	}
	        });
	      
	      Clear.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
	        	@Override
	        	public void handle(MouseEvent e) {
	        		text.clear();
	        	}
	        });
	      
	      StackPane root = new StackPane(imageView2);
	      
	      root.getChildren().addAll(submit,text1,label,text,Clear);
	     
	      
	      Scene scene = new Scene(root, 1150, 850);  
	      
	      primaryStage.setTitle("Username login");  
	      
	      primaryStage.setScene(scene);
	      
	      primaryStage.show();
	}
	
	
	
	public void lawnshow(Stage primaryStage) throws FileNotFoundException{
		Image image1 = new Image(new FileInputStream("C:\\Image\\H_background.jpg"));  
		Image image2 = new Image(new FileInputStream("C:\\Image\\lawnmower.png"));
		Image image3 = new Image(new FileInputStream("C:\\Image\\menulist.png"));
		Image image4 = new Image(new FileInputStream("C:\\Image\\menulist2.png"));
		
		
		Image image5 = new Image(new FileInputStream("C:\\Image\\card_sunflower.png"));
		Image image6 = new Image(new FileInputStream("C:\\Image\\card_peashooter.png"));
		Image image7 = new Image(new FileInputStream("C:\\Image\\card_wallnut.png"));
		Image image8 = new Image(new FileInputStream("C:\\Image\\card_freezepeashooter.png"));
		Image image9 = new Image(new FileInputStream("C:\\Image\\card_cherrybomb.png"));
		
		
		Image image10 = new Image(new FileInputStream("C:\\Image\\zombie.png"));
		
		Image image11 = new Image(new FileInputStream("C:\\Image\\sun.png"));
		
		
		
	      
	      ImageView imageView = new ImageView(image1);
	      ImageView lawnmoverimage1 = new ImageView(image2);
	      ImageView lawnmoverimage2 = new ImageView(image2);
	      ImageView lawnmoverimage3 = new ImageView(image2);
	      ImageView lawnmoverimage4 = new ImageView(image2);
	      ImageView lawnmoverimage5 = new ImageView(image2);
	      
	      
	      ImageView menulistimage = new ImageView(image3);
	      ImageView backmenuimage = new ImageView(image4);
	      
	      ImageView card_sun = new ImageView(image5);
	      ImageView card_pea = new ImageView(image6);
	      ImageView card_wall = new ImageView(image7);
	      ImageView card_fpea = new ImageView(image8);
	      ImageView card_bomb = new ImageView(image9); 
	      
	      ImageView zom = new ImageView(image10);
	      
	      ImageView sun_token = new ImageView(image11);
	      
	      
	      imageView.setX(50); 
	      imageView.setY(25); 
	      
	      imageView.setFitHeight(1000); 
	      imageView.setFitWidth(1000); 
	      
	      imageView.setPreserveRatio(true);
	      
	      
	      lawnmoverimage1.setTranslateX(-290);
	      lawnmoverimage1.setTranslateY(-165); 
	      
	      lawnmoverimage1.setFitHeight(50); 
	      lawnmoverimage1.setFitWidth(50);
	      lawnmoverimage1.setPreserveRatio(true);
	      
	      
	      lawnmoverimage2.setTranslateX(-290);
	      lawnmoverimage2.setTranslateY(-80); 
	      
	      lawnmoverimage2.setFitHeight(50); 
	      lawnmoverimage2.setFitWidth(50);
	      lawnmoverimage2.setPreserveRatio(true);
	      
	      
	      lawnmoverimage3.setTranslateX(-290);
	      lawnmoverimage3.setTranslateY(20); 
	      
	      lawnmoverimage3.setFitHeight(50); 
	      lawnmoverimage3.setFitWidth(50);
	      lawnmoverimage3.setPreserveRatio(true);
	      
	      
	      lawnmoverimage4.setTranslateX(-290);
	      lawnmoverimage4.setTranslateY(110); 
	      
	      lawnmoverimage4.setFitHeight(50); 
	      lawnmoverimage4.setFitWidth(50);
	      lawnmoverimage4.setPreserveRatio(true);
	      
	      
	      lawnmoverimage5.setTranslateX(-290);
	      lawnmoverimage5.setTranslateY(200); 
	      
	      lawnmoverimage5.setFitHeight(50); 
	      lawnmoverimage5.setFitWidth(50);
	      lawnmoverimage5.setPreserveRatio(true);
	      
	      
	      menulistimage.setTranslateX(-100);
	      menulistimage.setTranslateY(-295); 
	      
	      menulistimage.setFitHeight(100); 
	      menulistimage.setFitWidth(600);
	      menulistimage.setPreserveRatio(true);
	      
	      
	      backmenuimage.setTranslateX(400);
	      backmenuimage.setTranslateY(-260); 
	      
	      backmenuimage.setFitHeight(80); 
	      backmenuimage.setFitWidth(150);
	      backmenuimage.setPreserveRatio(true);
	      
	      
	      
	      zom.setTranslateX(500);
	      zom.setTranslateY(-180); 
	      zom.setFitHeight(50); 
	      zom.setFitWidth(50);
	      zom.setPreserveRatio(true);
		

		
	      TranslateTransition translate = new TranslateTransition();
	      translate.setByX(-780);  
	      translate.setDuration(Duration.millis(25000));  
	      translate.setCycleCount(1);    
	      translate.setAutoReverse(true);  
	      translate.setNode(zom);  
	      translate.play(); 
	      
	      TranslateTransition translate2 = new TranslateTransition();
	      translate2.setByX(980);  
	      translate2.setDelay(Duration.millis(25000));
	      translate2.setDuration(Duration.millis(3000));  
	      translate2.setCycleCount(1);    
	      translate2.setAutoReverse(true);  
	      translate2.setNode(lawnmoverimage1);  
	      translate2.play(); 
	      
	      sun_token.setTranslateX(250);
	      sun_token.setTranslateY(-300); 
	      sun_token.setFitHeight(25); 
	      sun_token.setFitWidth(25);
	      sun_token.setPreserveRatio(true);
	      
	      
	      TranslateTransition translate3 = new TranslateTransition();
	      translate3.setByY(980);  
	      translate3.setDelay(Duration.millis(5000));
	      translate3.setDuration(Duration.millis(20000));  
	      translate3.setCycleCount(1);    
	      translate3.setAutoReverse(true);  
	      translate3.setNode(sun_token);  
	      translate3.play();
	      
	        
	      
	      Button cardb1 = new Button();
	      cardb1.setGraphic(card_sun);
	      cardb1.setTranslateX(-225);
	      cardb1.setTranslateY(-295);
	      cardb1.setMaxSize(60.0, 90.0);
	      effects(cardb1);
	      
	      Button cardb2 = new Button();
	      cardb2.setGraphic(card_pea);
	      cardb2.setTranslateX(-140);
	      cardb2.setTranslateY(-295);
	      cardb2.setMaxSize(60.0, 90.0);
	      effects(cardb2);
	      
	      Button cardb3 = new Button();
	      cardb3.setGraphic(card_wall);
	      cardb3.setTranslateX(-55);
	      cardb3.setTranslateY(-295);
	      cardb3.setMaxSize(60.0, 90.0);
	      effects(cardb3);
	      
	      Button cardb4 = new Button();
	      cardb4.setGraphic(card_fpea);
	      cardb4.setTranslateX(30);
	      cardb4.setTranslateY(-295);
	      cardb4.setMaxSize(60.0, 90.0);
	      effects(cardb4);
	      
	      Button cardb5 = new Button();
	      cardb5.setGraphic(card_bomb);
	      cardb5.setTranslateX(110);
	      cardb5.setTranslateY(-295);
	      cardb5.setMaxSize(60.0, 90.0);
	      effects(cardb5);
	    
	      
	      Button back = new Button("Back Menu");
	      	back.setTranslateX(400);
	      	back.setTranslateY(-265);
	        back.setStyle("-fx-font: 14 arial; -fx-base: #b6e7c9;");
	        effects(back);
	        
	          Text text = new Text();     
		      text.setText("50");
		      text.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 20));
		      text.setTranslateX(-320); 
		      text.setTranslateY(-260);
		      text.setFill(Color.BLACK); 
	        
	     
	        back.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
	        	@Override
	        	public void handle(MouseEvent e) {
	        		try {
						BackMenu(primaryStage);
					} catch (FileNotFoundException e1) {
						
						e1.printStackTrace();
					}
	        	}
	        });
	        
	      StackPane root = new StackPane();  
	      
	      timerLabel.textProperty().bind(timeSeconds.asString());
	        timerLabel.setTextFill(Color.RED);
	        timerLabel.setStyle("-fx-font-size: 4em;");
	        timeSeconds.set(STARTTIME);
	        timeline = new Timeline();
	        timeline.getKeyFrames().add(new KeyFrame(Duration.seconds(STARTTIME+1), new KeyValue(timeSeconds, 0)));
	        timeline.playFromStart();
	        
	        VBox vb = new VBox(20);          
	        vb.getChildren().addAll(timerLabel);
	        vb.setTranslateX(1000);
	        vb.setTranslateY(90);
	      
	      root.getChildren().addAll(imageView,lawnmoverimage1,lawnmoverimage2,lawnmoverimage3,lawnmoverimage4,lawnmoverimage5,menulistimage,backmenuimage,cardb1,cardb2,cardb3,cardb4,cardb5,zom,sun_token,back,text,vb);
	      Scene scene = new Scene(root, 1100, 750);  
	      primaryStage.setTitle("Lawn");  
	      primaryStage.setScene(scene); 
	      primaryStage.show(); 
	}
	
	public void BackMenu(Stage primaryStage) throws FileNotFoundException{
		Image image = new Image(new FileInputStream("C:\\Image\\Pvz_Backmenu.png"));  
	      
	      ImageView imageView = new ImageView(image); 
	      
	      imageView.setX(50); 
	      imageView.setY(25); 
	      
	      imageView.setFitHeight(1055); 
	      imageView.setFitWidth(1000); 
	      
	      imageView.setPreserveRatio(true);  
	    
	      StackPane root = new StackPane(imageView);  
	      
	      Text text = new Text();      
	      
	      text.setText("Game Option ");
	      
	      text.setFont(Font.font("verdana", FontWeight.BOLD, FontPosture.REGULAR, 30));
	      
	      text.setX(50); 
	      text.setY(25);
	      
	      text.setFill(Color.WHITE); 
	      
	      
	      
	        
	      Button save_g = new Button("Leave Game with save");
	      	save_g.setTranslateX(30);
	      	save_g.setTranslateY(100);
	        save_g.setStyle("-fx-font: 26 arial; -fx-base: #b6e7c9;");
	        effects(save_g);
	        
	      Button res_lv_g = new Button("Restart Level");
	      res_lv_g.setTranslateX(30);
	      res_lv_g.setTranslateY(170);
	      res_lv_g.setStyle("-fx-font: 26 arial; -fx-base: #b6e7c9;");
	      effects(res_lv_g);
	        
	     
	        
	        save_g.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
	        	@Override
	        	public void handle(MouseEvent e) {
	        		Window w = new Window();
	        		try {
						w.start(primaryStage);
					} catch (FileNotFoundException e1) {
						e1.printStackTrace();
					}
	        	}
	        });
	        
	        res_lv_g.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
	        	@Override
	        	public void handle(MouseEvent e) {
	        		
	        	}
	        });
	        
	      root.getChildren().addAll(text,save_g,res_lv_g);
	      
	      Scene scene = new Scene(root, 1150, 850);  
	      
	      primaryStage.setTitle("Game Option");  
	      
	      primaryStage.setScene(scene);
	      
	      primaryStage.show(); 
	}
	
	

	
	
	
}


