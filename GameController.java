package application;

import java.io.File;
import java.net.URL;
import java.util.ResourceBundle;
import javafx.animation.TranslateTransition;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.media.Media;
import javafx.scene.media.MediaPlayer;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.util.Duration;

public class GameController implements Initializable{
	
	private TranslateTransition[] island;
	private TranslateTransition[] chest;
	private TranslateTransition[] greenorc;
	private TranslateTransition[] redorc;
	private TranslateTransition[] tnt;
	private TranslateTransition translate;
	
	private int move=0;
	private int shiftcount = 0;
	private int coincount=0;
	
	@FXML
	private Label score, coin;
	
	@FXML
	protected ImageView myhero, mypane, bossorc, gameoverbutton;
	
	@FXML
	protected ImageView greenorc1, greenorc2, greenorc3, greenorc4, greenorc5;
	
	@FXML
	protected ImageView redorc1, redorc2, redorc3, redorc4, redorc5;
	
	@FXML
	private ImageView tnt1, tnt2, tnt3, tnt4;
	
	@FXML
	private ImageView chest1, chest2, chest3;
	
	@FXML
	private ImageView land1, land2, land3, land4, land5, land6, land7, land8;
	
	@FXML
	private ImageView land9, land10, land11, land12, land13, land14, land15, land16;
	
	@FXML
	private ImageView land17, land18, land19, land20, land21, land22, land23, land24;
	
	
	@Override
	public void initialize(URL arg0, ResourceBundle arg1)
	{	
		translate = new TranslateTransition();
		translate.setNode(myhero);
		translate.setDuration(Duration.millis(500));
		translate.setCycleCount(TranslateTransition.INDEFINITE);
		translate.setByY(-60);
		translate.setAutoReverse(true);
		translate.play();
		
		TranslateTransition t = new TranslateTransition();
		t.setNode(bossorc);
		t.setDuration(Duration.millis(500));
		t.setCycleCount(TranslateTransition.INDEFINITE);
		t.setByY(-30);
		t.setAutoReverse(true);
		t.play();
		
		nameorc();
		
		jumporc();
		
		nameisland();
		
		chest = new TranslateTransition[5];
		for(int i=0;i<5;i++)
		{
			chest[i]= new TranslateTransition();
		}
		
		chest[0].setNode(chest1);
		chest[1].setNode(chest2);
		chest[2].setNode(chest3);
		
		tnt = new TranslateTransition[4];
		for(int i=0;i<4;i++)
		{
			tnt[i]= new TranslateTransition();
		}
		
		tnt[0].setNode(tnt1);
		tnt[1].setNode(tnt2);
		tnt[2].setNode(tnt3);
		tnt[3].setNode(tnt4);
		
		score.setText("0");
		coin.setText("0");
	}
	
	
	public void movhero(MouseEvent e) throws InterruptedException
	{		
     	double x = myhero.getLayoutX();
		myhero.setLayoutX(x+=40);	
		move++;
		score.setText(Integer.toString(move));
		
		play();
		getreward();
		
		if(myhero.getLayoutX()>856 && shiftcount==0)
		{
			changepos1();
			shiftcount++;
		}
		
		else if(myhero.getLayoutX()>1600 && shiftcount==1)
		{
			changepos2();
			shiftcount++;
		}
		else if(myhero.getLayoutX()>2280 && shiftcount==2)
		{
			changepos3();
			shiftcount++;
		}
		else if(myhero.getLayoutX()>3166 && shiftcount==3)
		{
			changepos4();
			shiftcount++;
		}
		else if(myhero.getLayoutX()>4100 && shiftcount==4)
		{
			changepos5();
			shiftcount++;
		}
		else if(myhero.getLayoutX()==4726)
		{
			gameoverbutton.setOpacity(1);
		}
		
	}
	
	public void changepos1()
	{
		
 			translate = new TranslateTransition();
			translate.setNode(myhero);
			translate.setDuration(Duration.millis(1200));
			translate.setCycleCount(1);
			translate.setByX(-800);
			translate.play();
			
			island[0].setDuration(Duration.millis(1200));
			island[0].setCycleCount(1);
			island[0].setByX(-400);
			island[0].play();
			island[1].setDuration(Duration.millis(1200));
			island[1].setCycleCount(1);
			island[1].setByX(-800);
			island[1].play();
			island[2].setDuration(Duration.millis(1200));
			island[2].setCycleCount(1);
			island[2].setByX(-1000);
			island[2].play();
			chest[0].setDuration(Duration.millis(1200));
			chest[0].setCycleCount(1);
			chest[0].setByX(-1000);
			chest[0].play();
			
			island[3].setDuration(Duration.millis(1200));
			island[3].setCycleCount(1);
			island[3].setByX(-1200);
			island[3].play();
			
			shiftorc();
	
			island[4].setDuration(Duration.millis(1200));
			island[4].setCycleCount(1);
			island[4].setByX(-979);
			island[4].play();
			island[5].setDuration(Duration.millis(1200));
			island[5].setCycleCount(1);
			island[5].setByX(-1039);
			island[5].play();
			
			tnt[0].setNode(tnt1);
			tnt[0].setDuration(Duration.millis(1200));
			tnt[0].setCycleCount(1);
			tnt[0].setByX(-1039);
			tnt[0].play();
			
			island[6].setDuration(Duration.millis(1200));
			island[6].setCycleCount(1);
			island[6].setByX(-1150);
			island[6].play();
			
			island[7].setDuration(Duration.millis(1200));
			island[7].setCycleCount(1);
			island[7].setByX(-1150);
			island[7].play();
		
	}
	
	public void changepos2()
	{
		    translate = new TranslateTransition();
			translate.setNode(myhero);
			translate.setDuration(Duration.millis(1200));
			translate.setCycleCount(1);
			translate.setByX(-700);
			translate.play();
			
			island[4].setDuration(Duration.millis(1200));
			island[4].setCycleCount(1);
			island[4].setByX(-400);
			island[4].play();
			island[5].setDuration(Duration.millis(1200));
			island[5].setCycleCount(1);
			island[5].setByX(-800);
			island[5].play();
			tnt[0].setNode(tnt1);
			tnt[0].setDuration(Duration.millis(1200));
			tnt[0].setCycleCount(1);
			tnt[0].setByX(-800);
			tnt[0].play();
			island[6].setDuration(Duration.millis(1200));
			island[6].setCycleCount(1);
			island[6].setByX(-1000);
			island[6].play();
			island[7].setDuration(Duration.millis(1200));
			island[7].setCycleCount(1);
			island[7].setByX(-1200);
			island[7].play();
			
			shiftorc();
			
			island[8].setDuration(Duration.millis(1200));
			island[8].setCycleCount(1);
			island[8].setByX(-2120);
			island[8].play();
			island[9].setDuration(Duration.millis(1200));
			island[9].setCycleCount(1);
			island[9].setByX(-2150);
			island[9].play();
			island[10].setDuration(Duration.millis(1200));
			island[10].setCycleCount(1);
			island[10].setByX(-2227);
			island[10].play();
			tnt[1].setDuration(Duration.millis(1200));
			tnt[1].setCycleCount(1);
			tnt[1].setByX(-2227);
			tnt[1].play();
			chest[1].setDuration(Duration.millis(1200));
			chest[1].setCycleCount(1);
			chest[1].setByX(-2223);
			chest[1].play();
			island[11].setDuration(Duration.millis(1200));
			island[11].setCycleCount(1);
			island[11].setByX(-2223);
			island[11].play();
		
	}
	
	public void changepos3()
	{
			translate = new TranslateTransition();
			translate.setNode(myhero);
			translate.setDuration(Duration.millis(1200));
			translate.setCycleCount(1);
			translate.setByX(-800);
			translate.play();
			
			island[8].setDuration(Duration.millis(1200));
			island[8].setCycleCount(1);
			island[8].setByX(-400);
			island[8].play();
			island[9].setDuration(Duration.millis(1200));
			island[9].setCycleCount(1);
			island[9].setByX(-800);
			island[9].play();
			island[10].setDuration(Duration.millis(1200));
			island[10].setCycleCount(1);
			island[10].setByX(-1000);
			island[10].play();
			tnt[1].setDuration(Duration.millis(1200));
			tnt[1].setCycleCount(1);
			tnt[1].setByX(-1000);
			tnt[1].play();
			chest[1].setDuration(Duration.millis(1200));
			chest[1].setCycleCount(1);
			chest[1].setByX(-1200);
			chest[1].play();
			island[11].setDuration(Duration.millis(1200));
			island[11].setCycleCount(1);
			island[11].setByX(-1200);
			island[11].play();
			
			shiftorc();
			
			
			island[12].setDuration(Duration.millis(1200));
			island[12].setCycleCount(1);
			island[12].setByX(-3261);
			island[12].play();
			island[13].setDuration(Duration.millis(1200));
			island[13].setCycleCount(1);
			island[13].setByX(-3295);
			island[13].play();
			island[14].setDuration(Duration.millis(1200));
			island[14].setCycleCount(1);
			island[14].setByX(-3306);
			island[14].play();	
			tnt[2].setDuration(Duration.millis(1200));
			tnt[2].setCycleCount(1);
			tnt[2].setByX(-3306);
			tnt[2].play();
			island[15].setDuration(Duration.millis(1200));
			island[15].setCycleCount(1);
			island[15].setByX(-3275);
			island[15].play();
	
	}
	
	public void changepos4()
	{
			translate = new TranslateTransition();
			translate.setNode(myhero);
			translate.setDuration(Duration.millis(1200));
			translate.setCycleCount(1);
			translate.setByX(-800);
			translate.play();
			
			island[12].setDuration(Duration.millis(1200));
			island[12].setCycleCount(1);
			island[12].setByX(-400);
			island[12].play();
			island[13].setDuration(Duration.millis(1200));
			island[13].setCycleCount(1);
			island[13].setByX(-800);
			island[13].play();
			island[14].setDuration(Duration.millis(1200));
			island[14].setCycleCount(1);
			island[14].setByX(-1000);
			island[14].play();	
			tnt[2].setDuration(Duration.millis(1200));
			tnt[2].setCycleCount(1);
			tnt[2].setByX(-1000);
			tnt[2].play();
			island[15].setDuration(Duration.millis(1200));
			island[15].setCycleCount(1);
			island[15].setByX(-1200);
			island[15].play();
			
			shiftorc();
			
			island[16].setDuration(Duration.millis(1100));
			island[16].setCycleCount(1);
			island[16].setByX(-4230);
			island[16].play();
			chest[2].setDuration(Duration.millis(1200));
			chest[2].setCycleCount(1);
			chest[2].setByX(-4230);
			chest[2].play();
			island[17].setDuration(Duration.millis(1200));
			island[17].setCycleCount(1);
			island[17].setByX(-4259);
			island[17].play();
			island[18].setDuration(Duration.millis(1200));
			island[18].setCycleCount(1);
			island[18].setByX(-4321);
			island[18].play();
			tnt[3].setDuration(Duration.millis(1200));
			tnt[3].setCycleCount(1);
			tnt[3].setByX(-4304);
			tnt[3].play();
			island[19].setDuration(Duration.millis(1200));
			island[19].setCycleCount(1);
			island[19].setByX(-4304);
			island[19].play();
		
	}
	
	public void changepos5()
	{
			translate = new TranslateTransition();
			translate.setNode(myhero);
			translate.setDuration(Duration.millis(1200));
			translate.setCycleCount(1);
			translate.setByX(-800);
			translate.play();
			
			island[16].setDuration(Duration.millis(1200));
			island[16].setCycleCount(1);
			island[16].setByX(-400);
			island[16].play();
			chest[2].setDuration(Duration.millis(1200));
			chest[2].setCycleCount(1);
			chest[2].setByX(-400);
			chest[2].play();
			island[17].setDuration(Duration.millis(1200));
			island[17].setCycleCount(1);
			island[17].setByX(-800);
			island[17].play();
			island[18].setDuration(Duration.millis(1200));
			island[18].setCycleCount(1);
			island[18].setByX(-1000);
			island[18].play();
			tnt[3].setDuration(Duration.millis(1200));
			tnt[3].setCycleCount(1);
			tnt[3].setByX(-1200);
			tnt[3].play();
			island[19].setDuration(Duration.millis(1200));
			island[19].setCycleCount(1);
			island[19].setByX(-1200);
			island[19].play();
			
			shiftorc();
			
			island[20].setDuration(Duration.millis(1100));
			island[20].setCycleCount(1);
			island[20].setByX(-5374);
			island[20].play();
			island[21].setDuration(Duration.millis(1200));
			island[21].setCycleCount(1);
			island[21].setByX(-5394);
			island[21].play();
			island[22].setDuration(Duration.millis(1200));
			island[22].setCycleCount(1);
			island[22].setByX(-5385);
			island[22].play();
			island[23].setDuration(Duration.millis(1200));
			island[23].setCycleCount(1);
			island[23].setByX(-5375);
			island[23].play();
	}
	
	public void nameisland()
	{
		island = new TranslateTransition[24];
		for(int i=0;i<24;i++)
		{
			island[i]= new TranslateTransition();
		}
		
		island[0].setNode(land1);
		island[1].setNode(land2);
		island[2].setNode(land3);
		island[3].setNode(land4);
		island[4].setNode(land5);
		island[5].setNode(land6);
		island[6].setNode(land7);
		island[7].setNode(land8);
		island[8].setNode(land9);
		island[9].setNode(land10);
		island[10].setNode(land11);
		island[11].setNode(land12);
		island[12].setNode(land13);
		island[13].setNode(land14);
		island[14].setNode(land15);
		island[15].setNode(land16);
		island[16].setNode(land17);
		island[17].setNode(land18);
		island[18].setNode(land19);
		island[19].setNode(land20);
		island[20].setNode(land21);
		island[21].setNode(land22);
		island[22].setNode(land23);
		island[23].setNode(land24);
	}
	
	public void nameorc()
	{
		greenorc = new TranslateTransition[5];
		for(int i=0;i<5;i++)
		{
			greenorc[i]= new TranslateTransition();
		}
		
		greenorc[0].setNode(greenorc1);
		greenorc[1].setNode(greenorc2);
		greenorc[2].setNode(greenorc3);
		greenorc[3].setNode(greenorc4);
		greenorc[4].setNode(greenorc5);
		
		redorc = new TranslateTransition[5];
		for(int i=0;i<5;i++)
		{
			redorc[i]= new TranslateTransition();
		}
		
		redorc[0].setNode(redorc1);
		redorc[1].setNode(redorc2);
		redorc[2].setNode(redorc3);
		redorc[3].setNode(redorc4);
		redorc[4].setNode(redorc5);
		
	}
	
	public void jumporc()
	{
		for(int i=0;i<5;i++)
		{
			greenorc[i].setDuration(Duration.millis(550));
			greenorc[i].setCycleCount(TranslateTransition.INDEFINITE);
		    greenorc[i].setByY(-20);
			greenorc[i].setAutoReverse(true);
			greenorc[i].play();
		}
		
		for(int i=0;i<5;i++)
		{
			redorc[i].setDuration(Duration.millis(550));
			redorc[i].setCycleCount(TranslateTransition.INDEFINITE);
		    redorc[i].setByY(-20);
			redorc[i].setAutoReverse(true);
			redorc[i].play();
		}
	}
	
	public void shiftorc()
	{
		if(shiftcount==0)
		{
			TranslateTransition translate2 = new TranslateTransition();
			translate2.setNode(greenorc1);
			translate2.setDuration(Duration.millis(1200));
			translate2.setCycleCount(1);
			translate2.setByX(-1200);
			translate2.play();
			/*greenorc[0].setDuration(Duration.millis(1200));
			greenorc[0].setCycleCount(1);
			greenorc[0].setByX(-1200);
			greenorc[0].play();*/
			TranslateTransition translate3 = new TranslateTransition();
			translate3.setNode(greenorc2);
			translate3.setDuration(Duration.millis(1200));
			translate3.setCycleCount(1);
			translate3.setByX(-1150);
			translate3.play();
			TranslateTransition translate4 = new TranslateTransition();
			translate4.setNode(redorc1);
			translate4.setDuration(Duration.millis(1200));
			translate4.setCycleCount(1);
			translate4.setByX(-1150);
			translate4.play();
			
		}
		else if(shiftcount==1)
		{
			TranslateTransition translate3 = new TranslateTransition();
			translate3.setNode(greenorc2);
			translate3.setDuration(Duration.millis(1200));
			translate3.setCycleCount(1);
			translate3.setByX(-1000);
			translate3.play();
			TranslateTransition translate4 = new TranslateTransition();
			translate4.setNode(redorc1);
			translate4.setDuration(Duration.millis(1200));
			translate4.setCycleCount(1);
			translate4.setByX(-1200);
			translate4.play();
			TranslateTransition translate5 = new TranslateTransition();
			translate5.setNode(redorc2);
			translate5.setDuration(Duration.millis(1200));
			translate5.setCycleCount(1);
			translate5.setByX(-2150);
			translate5.play();
			
		}
		else if(shiftcount==2)
		{
			TranslateTransition translate4 = new TranslateTransition();
			translate4.setNode(redorc2);
			translate4.setDuration(Duration.millis(1100));
			translate4.setCycleCount(1);
			translate4.setByX(-800);
			translate4.play();
			TranslateTransition translate5 = new TranslateTransition();
			translate5.setNode(redorc3);
			translate5.setDuration(Duration.millis(1200));
			translate5.setCycleCount(1);
			translate5.setByX(-3261);
			translate5.play();
			TranslateTransition translate6 = new TranslateTransition();
			translate6.setNode(greenorc3);
			translate6.setDuration(Duration.millis(1200));
			translate6.setCycleCount(1);
			translate6.setByX(-3275);
			translate6.play();
			
			
		}
		else if(shiftcount==3)
		{
			TranslateTransition translate5 = new TranslateTransition();
			translate5.setNode(redorc3);
			translate5.setDuration(Duration.millis(1200));
			translate5.setCycleCount(1);
			translate5.setByX(-400);
			translate5.play();
			TranslateTransition translate6 = new TranslateTransition();
			translate6.setNode(greenorc3);
			translate6.setDuration(Duration.millis(1200));
			translate6.setCycleCount(1);
			translate6.setByX(-1200);
			translate6.play();
			
			TranslateTransition translate7 = new TranslateTransition();
			translate7.setNode(redorc4);
			translate7.setDuration(Duration.millis(1200));
			translate7.setCycleCount(1);
			translate7.setByX(-4259);
			translate7.play();
			TranslateTransition translate8 = new TranslateTransition();
			translate8.setNode(greenorc4);
			translate8.setDuration(Duration.millis(1200));
			translate8.setCycleCount(1);
			translate8.setByX(-4262);
			translate8.play();
		}
		else if(shiftcount==4)
		{
			TranslateTransition translate7 = new TranslateTransition();
			translate7.setNode(redorc4);
			translate7.setDuration(Duration.millis(1200));
			translate7.setCycleCount(1);
			translate7.setByX(-800);
			translate7.play();
			TranslateTransition translate8 = new TranslateTransition();
			translate8.setNode(greenorc4);
			translate8.setDuration(Duration.millis(1200));
			translate8.setCycleCount(1);
			translate8.setByX(-800);
			translate8.play();
			
			TranslateTransition translate9 = new TranslateTransition();
			translate9.setNode(redorc5);
			translate9.setDuration(Duration.millis(1200));
			translate9.setCycleCount(1);
			translate9.setByX(-5394);
			translate9.play();
			TranslateTransition translate10 = new TranslateTransition();
			translate10.setNode(greenorc5);
			translate10.setDuration(Duration.millis(1200));
			translate10.setCycleCount(1);
			translate10.setByX(-5374);
			translate10.play();
			
			TranslateTransition bo = new TranslateTransition();
			bo.setNode(bossorc);
		    bo.setDuration(Duration.millis(1200));
		    bo.setCycleCount(1);
			bo.setByX(-5385);
			bo.play();
		}
	}
	
	public void play()
	{
		double x = myhero.getLayoutX();
		TranslateTransition ob = new TranslateTransition();
		if(x==806)
		{
			ob.setNode(greenorc1);
		}
		else if(x==1566)
		{
			ob.setNode(greenorc2);
		}
		else if(x==3086)
		{
			ob.setNode(greenorc3);
		}
		else if(x==3446)
		{
			ob.setNode(greenorc4);
		}
		else if(x==3486)
		{
			ob.setNode(greenorc5);
		}
		else if(x==1326)
		{
			ob.setNode(redorc1);
		}
		else if(x==1806)
		{
			ob.setNode(redorc2);
		}
		else if(x==1926)
		{
			ob.setNode(redorc3);
		}
		else if(x==3526)
		{
			ob.setNode(redorc4);
		}
		else if(x==4486)
		{
			ob.setNode(bossorc);
			ob.setDuration(Duration.millis(1500));
			ob.setCycleCount(1);
			ob.setByX(100);
			ob.play();
			return;
			
		}
		else if(x==4606)
		{
			ob.setNode(bossorc);
			ob.setDuration(Duration.millis(2000));
			ob.setCycleCount(1);
			ob.setByX(1000);
			ob.play();
			return;
		}
			
		ob.setDuration(Duration.millis(2500));
		ob.setCycleCount(1);
		ob.setByX(6150);
		ob.play();
	}
	
	public void getreward()
	{
		double x=myhero.getLayoutX();
		if(x==526 || x==2246)
		{
			coincount++;
			coin.setText(Integer.toString(coincount));
		}
	}
	
}
