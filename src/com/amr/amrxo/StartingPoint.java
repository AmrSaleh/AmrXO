package com.amr.amrxo;

import com.amr.amrxo.R;

import android.os.Bundle;
import android.os.Handler;
import android.app.Activity;
import android.content.SharedPreferences;

import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class StartingPoint extends Activity {

	public static String fileName ="myData";
	Button b1, b2, b3, b4, b5, b6, b7, b8, b9, resetScore,saveScore;
	TextView turn, xWins, oWins, ties;
	int player = 1;
	int x = 0;
	int y = 0;
	int tie = 0;
	int num = 0;
	String temp;
	int xColor= -16777216,oColor= -16777216;
	SharedPreferences toSave;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_starting_point);
		b1 = (Button) findViewById(R.id.button1);
		b2 = (Button) findViewById(R.id.button2);
		b3 = (Button) findViewById(R.id.button3);
		b4 = (Button) findViewById(R.id.button4);
		b5 = (Button) findViewById(R.id.button5);
		b6 = (Button) findViewById(R.id.button6);
		b7 = (Button) findViewById(R.id.button7);
		b8 = (Button) findViewById(R.id.button8);
		b9 = (Button) findViewById(R.id.button9);

		resetScore= (Button) findViewById(R.id.bNoSave);
//		saveScore= (Button) findViewById(R.id.bSave);

		toSave = getSharedPreferences(fileName, 0);
		
		
		
	
		turn = (TextView) findViewById(R.id.textView1);
		xWins = (TextView) findViewById(R.id.textView2);
		oWins = (TextView) findViewById(R.id.textView3);
		ties = (TextView) findViewById(R.id.textView4);

		x = 0;
		y = 0;
		tie = 0;
		num = 0;
		
//		saveScore.setOnClickListener(new View.OnClickListener() {
//			
//			@Override
//			public void onClick(View v) {
//				// TODO Auto-generated method stub
//			SharedPreferences.Editor editor = toSave.edit();
//			
//			editor.putString("turn", (String) turn.getText());
//			editor.putString("xwins", (String) xWins.getText());
//			editor.putString("owins", (String) oWins.getText());
//			editor.putString("ties", (String) ties.getText());
//
//			editor.putInt("x", x);
//			editor.putInt("y", y);
//			editor.putInt("tie", tie);
//			editor.putInt("num", num);
//			editor.putInt("player", player);
//			
//			editor.putString("B1", (String) b1.getText());
//			editor.putString("B2", (String) b2.getText());
//			editor.putString("B3", (String) b3.getText());
//			editor.putString("B4", (String) b4.getText());
//			editor.putString("B5", (String) b5.getText());
//			editor.putString("B6", (String) b6.getText());
//			editor.putString("B7", (String) b7.getText());
//			editor.putString("B8", (String) b8.getText());
//			editor.putString("B9", (String) b9.getText());
//			
//			editor.commit();
//			}
//		});
		
	
		resetScore.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				x = 0;
				y = 0;
				tie = 0;
				num = 0;
				if (player == 1) {
					
					turn.setText("Player X turn");
				} else {
					
					turn.setText("Player O turn");
				}
				xWins.setText("X Wins: " + x);
				oWins.setText("O Wins: " + y);
				ties.setText("Ties: " + tie);
				
				b1.setText(" ");
				b2.setText(" ");
				b3.setText(" ");
				b4.setText(" ");
				b5.setText(" ");
				b6.setText(" ");
				b7.setText(" ");
				b8.setText(" ");
				b9.setText(" ");
				
			}
		});
		
		
		
		
		b1.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (b1.getText().equals(" ")) {
					num++;
					if (player == 1) {
						b1.setText("X");
						b1.setTextColor(xColor);
						player++;
						turn.setText("Player O turn");
					} else {
						b1.setText("O");
						b1.setTextColor(oColor);
						player--;
						turn.setText("Player X turn");
					}

					temp = check();
					if (temp.equals("X")) {
						x++;
						turn.setText("X wins");
						xWins.setText("X Wins: " + x);
						reset();

					} else if (temp.equals("O")) {
						y++;
						turn.setText("O wins");
						oWins.setText("O Wins: " + y);
						reset();
					} else if (temp.equals("tie")) {
						tie++;
						turn.setText("It's a tie");
						ties.setText("Ties: " + tie);
						reset();
					}
				}
			}
		});
		b2.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (b2.getText().equals(" ")) {
					num++;
					if (player == 1) {
						b2.setText("X");
						b2.setTextColor(xColor);
						player++;
						turn.setText("Player O turn");
					} else {
						b2.setText("O");
						b2.setTextColor(oColor);
						player--;
						turn.setText("Player X turn");
					}
					temp = check();
					if (temp.equals("X")) {
						x++;
						turn.setText("X wins");
						xWins.setText("X Wins: " + x);
						reset();

					} else if (temp.equals("O")) {
						y++;
						turn.setText("O wins");
						oWins.setText("O Wins: " + y);
						reset();
					} else if (temp.equals("tie")) {
						tie++;
						turn.setText("It's a tie");
						ties.setText("Ties: " + tie);
						reset();
					}
				}
			}
		});
		b3.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (b3.getText().equals(" ")) {
					num++;
					if (player == 1) {
						b3.setText("X");
						b3.setTextColor(xColor);
						player++;
						turn.setText("Player O turn");
					} else {
						b3.setText("O");
						b3.setTextColor(oColor);
						player--;
						turn.setText("Player X turn");
					}
					temp = check();
					if (temp.equals("X")) {
						x++;
						turn.setText("X wins");
						xWins.setText("X Wins: " + x);
						reset();

					} else if (temp.equals("O")) {
						y++;
						turn.setText("O wins");
						oWins.setText("O Wins: " + y);
						reset();
					} else if (temp.equals("tie")) {
						tie++;
						turn.setText("It's a tie");
						ties.setText("Ties: " + tie);
						reset();
					}
				}
			}
		});
		b4.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (b4.getText().equals(" ")) {
					num++;
					if (player == 1) {
						b4.setText("X");
						b4.setTextColor(xColor);
						player++;
						turn.setText("Player O turn");
					} else {
						b4.setText("O");
						b4.setTextColor(oColor);
						player--;
						turn.setText("Player X turn");
					}
					temp = check();
					if (temp.equals("X")) {
						x++;
						turn.setText("X wins");
						xWins.setText("X Wins: " + x);
						reset();

					} else if (temp.equals("O")) {
						y++;
						turn.setText("O wins");
						oWins.setText("O Wins: " + y);
						reset();
					} else if (temp.equals("tie")) {
						tie++;
						turn.setText("It's a tie");
						ties.setText("Ties: " + tie);
						reset();
					}
				}
			}
		});
		b5.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (b5.getText().equals(" ")) {
					num++;
					if (player == 1) {
						b5.setText("X");
						b5.setTextColor(xColor);
						player++;
						turn.setText("Player O turn");
					} else {
						b5.setText("O");
						b5.setTextColor(oColor);
						player--;
						turn.setText("Player X turn");
					}
					temp = check();
					if (temp.equals("X")) {
						x++;
						turn.setText("X wins");
						xWins.setText("X Wins: " + x);
						reset();

					} else if (temp.equals("O")) {
						y++;
						turn.setText("O wins");
						oWins.setText("O Wins: " + y);
						reset();
					} else if (temp.equals("tie")) {
						tie++;
						turn.setText("It's a tie");
						ties.setText("Ties: " + tie);
						reset();
					}
				}
			}
		});
		b6.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (b6.getText().equals(" ")) {
					num++;
					if (player == 1) {
						b6.setText("X");
						b6.setTextColor(xColor);
						player++;
						turn.setText("Player O turn");
					} else {
						b6.setText("O");
						b6.setTextColor(oColor);
						player--;
						turn.setText("Player X turn");
					}
					temp = check();
					if (temp.equals("X")) {
						x++;
						turn.setText("X wins");
						xWins.setText("X Wins: " + x);
						reset();

					} else if (temp.equals("O")) {
						y++;
						turn.setText("O wins");
						oWins.setText("O Wins: " + y);
						reset();
					} else if (temp.equals("tie")) {
						tie++;
						turn.setText("It's a tie");
						ties.setText("Ties: " + tie);
						reset();
					}
				}
			}
		});
		b7.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (b7.getText().equals(" ")) {
					num++;
					if (player == 1) {
						b7.setText("X");
						b7.setTextColor(xColor);
						player++;
						turn.setText("Player O turn");
					} else {
						b7.setText("O");
						b7.setTextColor(oColor);
						player--;
						turn.setText("Player X turn");
					}
					temp = check();
					if (temp.equals("X")) {
						x++;
						turn.setText("X wins");
						xWins.setText("X Wins: " + x);
						reset();

					} else if (temp.equals("O")) {
						y++;
						turn.setText("O wins");
						oWins.setText("O Wins: " + y);
						reset();
					} else if (temp.equals("tie")) {
						tie++;
						turn.setText("It's a tie");
						ties.setText("Ties: " + tie);
						reset();
					}
				}
			}
		});
		b8.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (b8.getText().equals(" ")) {
					num++;
					if (player == 1) {
						b8.setText("X");
						b8.setTextColor(xColor);
						player++;
						turn.setText("Player O turn");
					} else {
						b8.setText("O");
						b8.setTextColor(oColor);
						player--;
						turn.setText("Player X turn");
					}
					temp = check();
					if (temp.equals("X")) {
						x++;
						turn.setText("X wins");
						xWins.setText("X Wins: " + x);
						reset();

					} else if (temp.equals("O")) {
						y++;
						turn.setText("O wins");
						oWins.setText("O Wins: " + y);
						reset();
					} else if (temp.equals("tie")) {
						tie++;
						turn.setText("It's a tie");
						ties.setText("Ties: " + tie);
						reset();
					}
				}
			}
		});
		b9.setOnClickListener(new View.OnClickListener() {

			@Override
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				if (b9.getText().equals(" ")) {
					num++;
					if (player == 1) {
						b9.setText("X");
						b9.setTextColor(xColor);
						player++;
						turn.setText("Player O turn");
					} else {
						b9.setText("O");
						b9.setTextColor(oColor);
						player--;
						turn.setText("Player X turn");
					}
					temp = check();
					if (temp.equals("X")) {
						x++;
						turn.setText("X wins");
						xWins.setText("X Wins: " + x);
						reset();

					} else if (temp.equals("O")) {
						y++;
						turn.setText("O wins");
						oWins.setText("O Wins: " + y);
						reset();
					} else if (temp.equals("tie")) {
						tie++;
						turn.setText("It's a tie");
						ties.setText("Ties: " + tie);
						reset();
					}
				}
			}
		});
	}

	

	public String check() {
		if (b1.getText().equals(b2.getText())
				&& b1.getText().equals(b3.getText())
				&& !b1.getText().equals(" ")) {
			return b1.getText() + "";
		}
		if (b1.getText().equals(b4.getText())
				&& b1.getText().equals(b7.getText())
				&& !b1.getText().equals(" ")) {
			return b1.getText() + "";
		}
		if (b1.getText().equals(b5.getText())
				&& b1.getText().equals(b9.getText())
				&& !b1.getText().equals(" ")) {
			return b1.getText() + "";
		}
		if (b2.getText().equals(b5.getText())
				&& b2.getText().equals(b8.getText())
				&& !b2.getText().equals(" ")) {
			return b2.getText() + "";
		}
		if (b3.getText().equals(b6.getText())
				&& b3.getText().equals(b9.getText())
				&& !b3.getText().equals(" ")) {
			return b3.getText() + "";
		}
		if (b3.getText().equals(b5.getText())
				&& b3.getText().equals(b7.getText())
				&& !b3.getText().equals(" ")) {
			return b3.getText() + "";
		}
		if (b4.getText().equals(b5.getText())
				&& b4.getText().equals(b6.getText())
				&& !b4.getText().equals(" ")) {
			return b4.getText() + "";
		}
		if (b7.getText().equals(b8.getText())
				&& b7.getText().equals(b9.getText())
				&& !b7.getText().equals(" ")) {
			return b7.getText() + "";
		}
		if (num == 9) {
			num = 0;
			return "tie";
		}

		return "bla";
	}

	public void reset() {
		b1.setEnabled(false);
		b2.setEnabled(false);
		b3.setEnabled(false);
		b4.setEnabled(false);
		b5.setEnabled(false);
		b6.setEnabled(false);
		b7.setEnabled(false);
		b8.setEnabled(false);
		b9.setEnabled(false);

		Handler mHandler = new Handler();
		mHandler.postDelayed(new Runnable() {
			public void run() {
				b1.setText(" ");
				b2.setText(" ");
				b3.setText(" ");
				b4.setText(" ");
				b5.setText(" ");
				b6.setText(" ");
				b7.setText(" ");
				b8.setText(" ");
				b9.setText(" ");

				b1.setEnabled(true);
				b2.setEnabled(true);
				b3.setEnabled(true);
				b4.setEnabled(true);
				b5.setEnabled(true);
				b6.setEnabled(true);
				b7.setEnabled(true);
				b8.setEnabled(true);
				b9.setEnabled(true);

				num = 0;
				if (player == 1) {
					turn.setText("Player X turn");
				} else {
					turn.setText("Player O turn");
				}
			}
		}, 3000);

	}

	

	@Override
	protected void onResume() {
		// TODO Auto-generated method stub
		super.onResume();
		//Toast.makeText(StartingPoint.this, com.amr.amrxo.Menu.bc,
		//		Toast.LENGTH_SHORT).show();
		

		 if (com.amr.amrxo.Menu.bc.equals("black")) {
			b1.setBackgroundColor(-16777216);
			b2.setBackgroundColor(-16777216);
			b3.setBackgroundColor(-16777216);
			b4.setBackgroundColor(-16777216);
			b5.setBackgroundColor(-16777216);
			b6.setBackgroundColor(-16777216);
			b7.setBackgroundColor(-16777216);
			b8.setBackgroundColor(-16777216);
			b9.setBackgroundColor(-16777216);
		} else if (com.amr.amrxo.Menu.bc.equals("green")) {
			b1.setBackgroundColor(-16711936);
			b2.setBackgroundColor(-16711936);
			b3.setBackgroundColor(-16711936);
			b4.setBackgroundColor(-16711936);
			b5.setBackgroundColor(-16711936);
			b6.setBackgroundColor(-16711936);
			b7.setBackgroundColor(-16711936);
			b8.setBackgroundColor(-16711936);
			b9.setBackgroundColor(-16711936);
		} else if (com.amr.amrxo.Menu.bc.equals("white")) {
			b1.setBackgroundColor(-1);
			b2.setBackgroundColor(-1);
			b3.setBackgroundColor(-1);
			b4.setBackgroundColor(-1);
			b5.setBackgroundColor(-1);
			b6.setBackgroundColor(-1);
			b7.setBackgroundColor(-1);
			b8.setBackgroundColor(-1);
			b9.setBackgroundColor(-1);
		
		} else if (com.amr.amrxo.Menu.bc.equals("blue")) {
			b1.setBackgroundColor(-16776961);
			b2.setBackgroundColor(-16776961);
			b3.setBackgroundColor(-16776961);
			b4.setBackgroundColor(-16776961);
			b5.setBackgroundColor(-16776961);
			b6.setBackgroundColor(-16776961);
			b7.setBackgroundColor(-16776961);
			b8.setBackgroundColor(-16776961);
			b9.setBackgroundColor(-16776961);
		} else if (com.amr.amrxo.Menu.bc.equals("yellow")) {
			b1.setBackgroundColor(-256);
			b2.setBackgroundColor(-256);
			b3.setBackgroundColor(-256);
			b4.setBackgroundColor(-256);
			b5.setBackgroundColor(-256);
			b6.setBackgroundColor(-256);
			b7.setBackgroundColor(-256);
			b8.setBackgroundColor(-256);
			b9.setBackgroundColor(-256);
		} else if (com.amr.amrxo.Menu.bc.equals("red")) {
			b1.setBackgroundColor(-65536);
			b2.setBackgroundColor(-65536);
			b3.setBackgroundColor(-65536);
			b4.setBackgroundColor(-65536);
			b5.setBackgroundColor(-65536);
			b6.setBackgroundColor(-65536);
			b7.setBackgroundColor(-65536);
			b8.setBackgroundColor(-65536);
			b9.setBackgroundColor(-65536);
		}

		if (com.amr.amrxo.Menu.lc.equals("black")) {
			findViewById(R.id.view1).setBackgroundColor(-16777216);
		} else if (com.amr.amrxo.Menu.lc.equals("white")) {
			findViewById(R.id.view1).setBackgroundColor(-1);
		} else if (com.amr.amrxo.Menu.lc.equals("green")) {
			findViewById(R.id.view1).setBackgroundColor(-16711936);
		} else if (com.amr.amrxo.Menu.lc.equals("blue")) {
			findViewById(R.id.view1).setBackgroundColor(-16776961);
		} else if (com.amr.amrxo.Menu.lc.equals("yellow")) {
			findViewById(R.id.view1).setBackgroundColor(-256);
		} else if (com.amr.amrxo.Menu.lc.equals("red")) {
			findViewById(R.id.view1).setBackgroundColor(-65536);
		}
		
		if (com.amr.amrxo.Menu.xM.equals("black")) {
			 xColor=-16777216;
		} else if (com.amr.amrxo.Menu.xM.equals("white")) {
			 xColor=-1;
		} else if (com.amr.amrxo.Menu.xM.equals("green")) {
			 xColor=-16711936;
		} else if (com.amr.amrxo.Menu.xM.equals("blue")) {
			 xColor=-16776961;
		} else if (com.amr.amrxo.Menu.xM.equals("yellow")) {
			 xColor=-256;
		} else if (com.amr.amrxo.Menu.xM.equals("red")) {
			 xColor=-65536;
		}
		
		if (com.amr.amrxo.Menu.oM.equals("black")) {
			 oColor=-16777216;
		} else if (com.amr.amrxo.Menu.oM.equals("white")) {
			 oColor=-1;
		} else if (com.amr.amrxo.Menu.oM.equals("green")) {
			 oColor=-16711936;
		} else if (com.amr.amrxo.Menu.oM.equals("blue")) {
			 oColor=-16776961;
		} else if (com.amr.amrxo.Menu.oM.equals("yellow")) {
			 oColor=-256;
		} else if (com.amr.amrxo.Menu.oM.equals("red")) {
			 oColor=-65536;
		}

		
		toSave = getSharedPreferences(fileName, 0);
		turn.setText(toSave.getString("turn","Player X turn"));
		xWins.setText(toSave.getString("xwins","X Wins: 0"));
		oWins.setText(toSave.getString("owins","O Wins: 0"));
		ties.setText(toSave.getString("ties","Ties: 0"));
		
		b1.setText(toSave.getString("B1"," "));
		b2.setText(toSave.getString("B2"," "));
		b3.setText(toSave.getString("B3"," "));
		b4.setText(toSave.getString("B4"," "));
		b5.setText(toSave.getString("B5"," "));
		b6.setText(toSave.getString("B6"," "));
		b7.setText(toSave.getString("B7"," "));
		b8.setText(toSave.getString("B8"," "));
		b9.setText(toSave.getString("B9"," "));
		
		correctColor();
		
		x= toSave.getInt("x", 0);
		y= toSave.getInt("y", 0);
		tie= toSave.getInt("tie", 0);
		num= toSave.getInt("num", 0);
		player= toSave.getInt("player", 1);
		
	}

	@Override
	protected void onPause() {
		// TODO Auto-generated method stub
		super.onPause();
		SharedPreferences.Editor editor = toSave.edit();
		
		editor.putString("turn", (String) turn.getText());
		editor.putString("xwins", (String) xWins.getText());
		editor.putString("owins", (String) oWins.getText());
		editor.putString("ties", (String) ties.getText());

		editor.putInt("x", x);
		editor.putInt("y", y);
		editor.putInt("tie", tie);
		editor.putInt("num", num);
		editor.putInt("player", player);
		
		editor.putString("B1", (String) b1.getText());
		editor.putString("B2", (String) b2.getText());
		editor.putString("B3", (String) b3.getText());
		editor.putString("B4", (String) b4.getText());
		editor.putString("B5", (String) b5.getText());
		editor.putString("B6", (String) b6.getText());
		editor.putString("B7", (String) b7.getText());
		editor.putString("B8", (String) b8.getText());
		editor.putString("B9", (String) b9.getText());
		
		editor.commit();
	}
	
	public void correctColor(){
		if(b1.getText()=="X"){
			b1.setTextColor(xColor);
		}else{
			b1.setTextColor(oColor);
		}
		if(b2.getText()=="X"){
			b2.setTextColor(xColor);
		}else{
			b2.setTextColor(oColor);
		}
		if(b3.getText()=="X"){
			b3.setTextColor(xColor);
		}else{
			b3.setTextColor(oColor);
		}
		if(b4.getText()=="X"){
			b4.setTextColor(xColor);
		}else{
			b4.setTextColor(oColor);
		}
		if(b5.getText()=="X"){
			b5.setTextColor(xColor);
		}else{
			b5.setTextColor(oColor);
		}
		if(b6.getText()=="X"){
			b6.setTextColor(xColor);
		}else{
			b6.setTextColor(oColor);
		}
		if(b7.getText()=="X"){
			b7.setTextColor(xColor);
		}else{
			b7.setTextColor(oColor);
		}
		if(b8.getText()=="X"){
			b8.setTextColor(xColor);
		}else{
			b8.setTextColor(oColor);
		}
		if(b9.getText()=="X"){
			b9.setTextColor(xColor);
		}else{
			b9.setTextColor(oColor);
		}
	}

}
