package Changhenge;
import java.util.Scanner;  
public class tx {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();

		str.append("汉皇重色思倾国御宇多年求不得杨家有女初长成养在深闺人未识天生丽质难自弃一朝选在君王侧回眸一笑百媚生六宫粉黛无颜色春寒赐浴华清池温泉水滑洗凝脂侍儿扶起娇无力始是新承恩泽时云鬓花颜金步摇芙蓉帐暖度春宵春宵苦短日高起从此君王不早朝承欢侍宴无闲暇春从春游夜专夜后宫佳丽三千人三千宠爱在一身金屋妆成娇侍夜玉楼宴罢醉和春姊妹弟兄皆列土可怜光彩生门户");

		String zf1 = "";
		for (int i = 0; i < str.length(); i++) 
		{                      
			if (i * 7 + 7 > str.length()) 
			{
				zf1 += str.substring(i * 7, str.length());
				break;
			}
			if ((i * 7) % 2 == 0)
			{
				zf1 += str.substring(i * 7, i * 7 + 7) + ",";
			} 
			else 
			{
				zf1 += str.substring(i * 7, i * 7 + 7) + "." + "\n";
			}
		}
		System.out.println(new StringBuilder(zf1).toString());
		
		
		       String zf2 = "";
		       {  
		        Scanner a = new Scanner(System.in);                   
		        System.out.print("搜索");  
		        zf2=a.next();    		        
		    }  
		
		 int count = count(str, zf2);
			System.out.println(zf2 +  "出现:"+ count+"次");
		}
	 
	static int count(StringBuilder zf3, String zf4)
	{
				
				int count = 0;
				int index = 0;
				try {
				while ((index = zf3.indexOf(zf4, index)) != -1)
				{
					index = index + zf4.length();
					count++;
				}
			
	 }
	    catch (Exception f) {
	    	
	}
				return count;
	}
		
}
