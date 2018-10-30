import java.util.ArrayList;
import java.util.List;

public class Search {
	private static final int COUNT=1000000;//一百万次
	private static ArrayList<Object>arrayList = new ArrayList<Object>();
	
	public static void main(String[] args) {
	    //TODO Auto-generated method stub
		System.out.println("......开始插入数据......");
		//插入数据测试
		insertData(arrayList,"ArrayList");
		
		System.out.println("......开始读取数据......");
		//读取数据测试
		readAccessData(arrayList,"ArrayList");
		
		System.out.println("......开始删除数据......");
		//删除数据测试
		deleteData(arrayList,"ArrayList");
		
	}

	
	/***插入数据，并统计插入时间***/
	private static void insertData(List<Object>list,String name) {
        long startTime = System.currentTimeMillis();
        
        //向list的0位置开始起插入COUNT个数
        for(int i=0;i<COUNT;i++)
        {
        	list.add(0,i);
        }
        
        long endTime = System.currentTimeMillis();
        long inteval = endTime - startTime;
        System.out.println(name + ": 插入" + COUNT + "个元素，使用的时间是：" + inteval + "ms");
	}
	
	
    /***读取数据，并统计读取时间***/
	private static void readAccessData(List<Object>list,String name) {
        long startTime = System.currentTimeMillis();
		
		//读取list数据
		for(int i = 0;i<COUNT;i++)
		{
			list.get(i);
		}
		long endTime = System.currentTimeMillis();
		long inteval = endTime - startTime;
		
		System.out.println(name + ": 读取" + COUNT + "个元素，需要的时间是：" + inteval + "ms");
		
	}
	
	/***删除数据，并统计删除时间***/
	private static void deleteData(List<Object>list,String name) {
		long startTime = System.currentTimeMillis();
		
		//读取list数据
		for(int i = 0;i<COUNT;i++)
		{
			list.remove(0);
		}
		long endTime = System.currentTimeMillis();
		long inteval = endTime - startTime;
		
		System.out.println(name + ": 删除" + COUNT + "个元素，需要的时间是：" + inteval + "ms");
	}
	
	
}

/**......开始插入数据......
*ArrayList: 插入1000000个元素，使用的时间是：106102ms
......开始读取数据......
ArrayList: 读取1000000个元素，需要的时间是：5ms
......开始删除数据......
ArrayList: 删除1000000个元素，需要的时间是：130307ms*
**/