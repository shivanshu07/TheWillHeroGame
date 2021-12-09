package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.util.Duration;

public class Controller implements Initializable{
	
	@FXML
	private ImageView myhero;
	
	@FXML
	private ImageView bossorc;
	
	@FXML
	private ImageView playbutton;
	
	@FXML
	private ImageView exitbutton;
	
	@FXML
	private ImageView loadbutton;
	
	@FXML
	private ImageView newgamebutton;
	
	@FXML
	private ImageView titlebutton;

	@Override
	public void initialize(URL arg0, ResourceBundle arg1) 
	{
		TranslateTransition translate = new TranslateTransition();
		translate.setNode(myhero);
		translate.setDuration(Duration.millis(500));
		translate.setCycleCount(TranslateTransition.INDEFINITE);
		translate.setByY(-60);
		translate.setAutoReverse(true);
		translate.play();
		
		TranslateTransition translate2 = new TranslateTransition();
		translate2.setNode(bossorc);
		translate2.setDuration(Duration.millis(550));
		translate2.setCycleCount(TranslateTransition.INDEFINITE);
		translate2.setByY(-20);
		translate2.setAutoReverse(true);
		translate2.play();
		
	}
	/*
	public void playgame(TouchEvent e)
	{
		playbutton.setOpacity(0);
		loadbutton.setOpacity(1);
		exitbutton.setOpacity(0);
		newgamebutton.setOpacity(1);
		titlebutton.setOpacity(0);
	}*/

}
