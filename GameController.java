package application;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.animation.TranslateTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.util.Duration;

public class GameController implements Initializable{
	
	@FXML
	private ImageView myhero;
	
	@FXML
	private ImageView greenorc1;
	
	@FXML
	private ImageView tnt1;
	
	@FXML
	private ImageView chest1;
	
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
		translate2.setNode(greenorc1);
		translate2.setDuration(Duration.millis(550));
		translate2.setCycleCount(TranslateTransition.INDEFINITE);
		translate2.setByY(-30);
		translate2.setAutoReverse(true);
		translate2.play();
		
	}
	
	public void movhero(MouseEvent e)
	{
		double x = myhero.getLayoutX();
		myhero.setLayoutX(x+=60);
	}
	
}
