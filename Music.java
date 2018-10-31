package com.music.player;

/**
 * @author LEONADA
 * @version MUSIC 0.9 
 * @rule player点歌并播放
 */

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

//歌曲类
public class Music {
	private String songName;//歌曲名
	private String Singer;//歌手
	private double Time;//歌曲时间
	public Music(String songname,String singer,double time) {
	       songName = songname;
	       Singer = singer;
	       Time = time;
	}

	public String toString()
	{
		StringBuffer stringBuffer = new StringBuffer("");
		//StringBuffer和String一样，但是可以变化
		stringBuffer.append("歌曲名："+songName+"\n");
		stringBuffer.append("歌手："+Singer+"\n");
		stringBuffer.append("歌曲时间："+Time+" min");
		//返回重写的字符串
		return stringBuffer.toString();
	}
	
	public static void main(String[] args) {
		//点歌启动入口
		SongDrive songDrive = new SongDrive();
		songDrive.player.addSong();
		songDrive.master.play();
		
	}
}


//点歌类
class Player{
	public boolean addSong() {
		Scanner in = new Scanner(System.in);
		
		//输入点歌信息
		System.out.println("输入歌曲名：");
		String songName = in.nextLine();
		System.out.println("输入歌手名：");
		String singer = in.nextLine();
		System.out.println("输入歌曲时长：");
		double songTime = in.nextDouble();
		in.close();//回收Scanner对象
		
		Music music = new Music(songName,singer,songTime);
		Master.listSong.add(music);//将点的歌曲添加至歌曲列表
		return true;
	}
}

//主持人类
class Master{
	static List<Music> listSong;//歌曲列表
	public Master() { //初始化歌曲列表
		listSong = new ArrayList <Music>();
	}
	public boolean play() {
		//打印即将播放的歌曲信息
		System.out.println(listSong.get(0).toString());
		return true;
	}
}

//歌曲播放类
class SongDrive{
	public Master master;
	public Player player;
	
	public SongDrive() {
		master = new Master();
		player = new Player();
	}
}


/**
*输入歌曲名：
Ali
输入歌手名：
Jack Ma
输入歌曲时长：
8
歌曲名：Ali
歌手：Jack Ma
歌曲时间：8.0 min*
**/