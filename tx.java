package Changhenge;
import java.util.Scanner;  
public class tx {
	public static void main(String[] args) {
		StringBuilder str = new StringBuilder();

		str.append("������ɫ˼�����������󲻵������Ů���������������δʶ��������������һ��ѡ�ھ��������һЦ������������������ɫ������ԡ�������Ȫˮ��ϴ��֬�̶���������ʼ���³ж���ʱ���޻��ս�ҡܽ����ů�ȴ�����������ո���Ӵ˾������糯�л���������Ͼ���Ӵ���ҹרҹ�󹬼�����ǧ����ǧ�谮��һ�����ױ�ɽ���ҹ��¥�����ʹ���õ��ֽ���������������Ż�");

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
		        System.out.print("����");  
		        zf2=a.next();    		        
		    }  
		
		 int count = count(str, zf2);
			System.out.println(zf2 +  "����:"+ count+"��");
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
