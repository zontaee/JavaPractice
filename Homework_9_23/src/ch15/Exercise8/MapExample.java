package ch15.Exercise8;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;
 
public class MapExample {
 
    public static void main(String[] args) {
        Map<String,Integer> map = new HashMap<String,Integer>();
        
        map.put("blue", 96);
        map.put("hong", 86);
        map.put("white", 92);
        
        String name = null; // �ְ� ������ ���� ���̵� ����
        int maxScore = 0;    // �ְ� ���� ����
        int totalScore = 0;    // ���� �հ� ����
        
        //�ۼ� ��ġ
        
        Set<Map.Entry<String, Integer>> EntrySet = map.entrySet();
        for (Map.Entry<String, Integer> entry : EntrySet) {
            if (entry.getValue() > maxScore) {
                name = entry.getKey();
                maxScore = entry.getValue();
            }
            totalScore += entry.getValue();
        }
        int avgScore = totalScore / map.size();
        System.out.println("��� ���� : "+ avgScore);
        System.out.println("�ְ� ���� : "+ maxScore);
        System.out.println("�ְ������� ���� ���̵� : "+ name);
    }
}
 