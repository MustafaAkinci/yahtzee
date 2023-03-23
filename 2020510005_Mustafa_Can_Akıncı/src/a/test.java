package a;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Random;
import java.util.Scanner;

public class test {

	public static void main(String[] args) throws FileNotFoundException {
		SingleLinkedList p1=new SingleLinkedList();
		SingleLinkedList p2=new SingleLinkedList();
		
		
		int p1score=0;
		int p2score=0;
		Random random = new Random(); 
		int gameround=0;
		while(gameround<=10) {
			
			for(int i=1;i<4;i++) {
				int rnd1 = random.nextInt(6)+1;
				p1.add(rnd1);
				}
			//p1.display();
				if(p1.orderednumber()) {
					
						p1.delete(1);
						p1.delete(2);
						p1.delete(3);
						p1.delete(4);
						p1.delete(5);
						p1.delete(6);
						p1score=p1score+30;
						
				}
				if(p1.countnumber(1)>=4) {
					p1.delete(1);
					p1.delete(1);
					p1.delete(1);
					p1.delete(1);
					p1score=p1score+10;
				}
				if(p1.countnumber(2)>=4){
					p1.delete(2);
					p1.delete(2);
					p1.delete(2);
					p1.delete(2);
					p1score=p1score+10;
				}
				if(p1.countnumber(3)>=4) {
					p1.delete(3);
					p1.delete(3);
					p1.delete(3);
					p1.delete(3);
					p1score=p1score+10;
				}
				if(p1.countnumber(4)>=4){
					p1.delete(4);
					p1.delete(4);
					p1.delete(4);
					p1.delete(4);
					p1score=p1score+10;
				}
				if(p1.countnumber(5)>=4) {
					p1.delete(5);
					p1.delete(5);
					p1.delete(5);
					p1.delete(5);
					p1score=p1score+10;
				}
				else if(p1.countnumber(6)>=4){
					p1.delete(6);
					p1.delete(6);
					p1.delete(6);
					p1.delete(6);
					p1score=p1score+10;
				}
				//System.out.print(p1score);
				System.out.println();
				System.out.println("player1 ---------------------------------------              "+p1score);
			p1.display();
			System.out.println();
			for(int i=1;i<4;i++) {
				int rnd2 = random.nextInt(6)+1;
				p2.add(rnd2);
			}
			if(p2.orderednumber()) {
				
				p2.delete(1);
				p2.delete(2);
				p2.delete(3);
				p2.delete(4);
				p2.delete(5);
				p2.delete(6);
				p2score=p2score+30;
				
		}
		if(p2.countnumber(1)>=4) {
			p2.delete(1);
			p2.delete(1);
			p2.delete(1);
			p2.delete(1);
			p2score=p2score+10;
		}
		if(p2.countnumber(2)>=4){
			p2.delete(2);
			p2.delete(2);
			p2.delete(2);
			p2.delete(2);
			p2score=p2score+10;
		}
		if(p2.countnumber(3)>=4) {
			p2.delete(3);
			p2.delete(3);
			p2.delete(3);
			p2.delete(3);
			p2score=p2score+10;
		}
		if(p2.countnumber(4)>=4){
			p2.delete(4);
			p2.delete(4);
			p2.delete(4);
			p2.delete(4);
			p2score=p1score+10;
		}
		if(p2.countnumber(5)>=4) {
			p2.delete(5);
			p2.delete(5);
			p2.delete(5);
			p2.delete(5);
			p2score=p2score+10;
		}
		else if(p2.countnumber(6)>=4){
			p2.delete(6);
			p2.delete(6);
			p2.delete(6);
			p2.delete(6);
			p2score=p2score+10;
		}
		System.out.println();
		System.out.println("player2 ---------------------------------------              "+p2score);
	p2.display();
	System.out.println();
			gameround++;
		}
		System.out.println();
		System.out.println("player1 score :"+p1score);
		System.out.println("player2 score :"+p2score);
		if(p1score>p2score) {
			System.out.println("the winner is player 1");
		}
		else if(p1score<p2score) {
			System.out.println("the winner is player 2");
		}
		else {
			System.out.println("players have same score");
		}
		
		SingleLinkedList scoretablee=new SingleLinkedList();
		File file = new File("highscoretable.txt");
		Scanner sc = new Scanner(file);
		
		while(sc.hasNextLine()) {
			scoretablee.addsorted(sc.nextLine());
			
		}
		//scoretablee=scoretablee.split(" ");
		scoretablee.addsorted("player1 "+p1score);
		scoretablee.display();
		
		
		
			  
		

	}

}
