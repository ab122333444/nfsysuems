/*import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;

import net.sf.json.JSONObject;


public class Testjs {
	public static void main(String[] args) throws Exception {

		//��һ���ȶ���js�����е����ݷŵ�String��
		BufferedReader reader=new BufferedReader(new FileReader("C:\\Users\\С��\\Desktop\\load_hycode.js"));
		StringBuilder sb=new StringBuilder();
		String line=null;
		while((line=reader.readLine())!=null){
		//�ѻ��з�ȥ��
		  sb.append(line);
		}
		reader.close();
		//�ڶ��������sb�����������json�����õ�Ҳ���Ǵӵ�һ��"{"�����һ��"}"����������{};
		//���������Ҫ��
		String jsonString=sb.substring(sb.indexOf("["),sb.lastIndexOf("]")+1);
		//����������ת����json-lib���JSONObject����
		JSONObject jo=JSONObject.fromObject(jsonString);
		//��������Ҫ����Ǹ����Ծ���jo.get(String key);
		jo.get("AutoId");
		//�޸�����ʹ��jo.accumulate(String key,Object value);
	}
}*/
import net.sf.json.JSONArray;
import net.sf.json.JSONObject;

public class Testjs2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String JsonContext = new Util().ReadFile("C:\\Users\\С��\\Desktop\\load_hycode1.js");
		String jsonString=JsonContext.substring(JsonContext.indexOf("["),JsonContext.lastIndexOf("]")+1);
		JSONArray jsonArray = JSONArray.fromObject(jsonString);
		JSONArray jsonArray2;
		JSONArray jsonArray3;
		int size = jsonArray.size();
		int sum=0;
		System.out.println("Size: " + size);
		for (int i = 0; i < size; i++) {
			JSONObject jsonObject = jsonArray.getJSONObject(i);
			//System.out.println("(null,'" + jsonObject.get("CodeName") + "'),");
			jsonArray2 = JSONArray.fromObject(jsonObject.get("maxhycode"));
			for (int j = 0; j < jsonArray2.size(); j++) {
				JSONObject jsonObject2 = jsonArray2.getJSONObject(j);
				//System.out.println("(null,'" + jsonObject2.get("CodeName") + "',"+jsonObject.get("CodeValue")+"),");
				jsonArray3 = JSONArray.fromObject(jsonObject2.get("znhycdoe"));
				for (int k = 0; k < jsonArray3.size(); k++) {
					JSONObject jsonObject3 = jsonArray3.getJSONObject(k);//sum++;
					System.out.println("(null,'" + jsonObject3.get("CodeName") + "',"+jsonObject2.get("CodeValue")+"),");
				}
			}
		}//System.out.println(sum);
	}

}
